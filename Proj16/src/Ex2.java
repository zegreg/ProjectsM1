
public class Ex2 {

	private static final int MAX = 1000000;

	// forma iterativa não optimizada

	//	static boolean containsIter (String arg, String sub){
	//		
	//		if (sub.length() == 0) {
	//			return false;
	//		}
	//		
	//		
	//		for (int idxArg = 0; idxArg <= arg.length()- sub.length(); idxArg++) {
	//			int idxSub;
	//			for (idxSub = 0; idxSub < sub.length(); idxSub++) {
	//				if (arg.charAt(idxArg+idxSub) != sub.charAt(idxSub) ) {
	//					break;
	//				}
	//			}
	//			
	//			if (idxSub ==sub.length()) {
	//				return true;
	//			}
	//		}
	//		return false;
	//	}


	// forma optimizada optimizadaint
	static boolean containsIterative (String arg, String sub){

		int subLen = sub.length();
		if (subLen == 0) {
			return false;
		}

		int argLen = arg.length();


		for (int idxArg = 0; idxArg <= argLen-subLen; idxArg++) {
			int idxSub;
			for (idxSub = 0; idxSub < subLen; idxSub++) {
				if (arg.charAt(idxArg+idxSub) != sub.charAt(idxSub) ) {
					break;
				}
			}

			if (idxSub == subLen) {
				return true;
			}
		}
		return false;
	}










	// forma recursiva
	static boolean containsRecursive(String arg, String sub){
		if (sub.length() == 0) {
			return false;
		}

		if (arg.length() < sub.length()) {
			return false;
		}

		return contains(arg, 0, sub);


	}



	private static boolean contains(String arg, int idxStart, String sub){

		if (arg.length() - idxStart < sub.length()) {
			return false;
		}



		//		if (arg.charAt(0) == sub.charAt(0)) {
		//			if(startsWith(arg.substring(1), sub.substring(1))){
		//				return true;
		//			}
		//		}
		if (startsWith(arg, idxStart, sub, 0) ==  true) {
			return true;

		}


		return contains(arg, idxStart +1, sub);
	}


	static private boolean startsWith(String substring, int idxStartStr1, String substring2, int idxStartStr2) {
		if(substring2.length() == idxStartStr2){
			return true;
		}
		if (substring.charAt(idxStartStr1) != substring2.charAt(idxStartStr2)) {
			return false;
		}
		return startsWith(substring, idxStartStr1+1, substring2, idxStartStr2+1);
	}



	//	static private boolean startsWith(String substring, String substring2) {
	//		if(substring2.length() == 0){
	//			return true;
	//		}
	//		if (substring.charAt(0) != substring2.charAt(0)) {
	//			return false;
	//		}
	//		return startsWith(substring.substring(1), substring2.substring(1));
	//	}




	private static void testContainsPerformance(Executor containsExecutor) {

		long start = System.currentTimeMillis();

		for (int i = 0; i < MAX; i++) {
			containsExecutor.execute("abcdef", "");
			containsExecutor.execute("abc", "abcdef");
			containsExecutor.execute("abcdef", "f");
			containsExecutor.execute("abcdef", "abe");
			containsExecutor.execute("", "a");
		}

		long end = System.currentTimeMillis();


		System.out.println("Elapsed "+ (end-start) + "miliseconds");
	}

	public interface Executor  {
		void execute(String str1, String str2);
	}
	
	
	

	public static class ExecutorContainsIteractive implements Executor{

		@Override
		public void execute(String str1, String str2) {
			containsRecursive(str1, str2);

		}

	}
	
	
	public static class ExecutorContainsRecursive implements Executor{

		@Override
		public void execute(String str1, String str2) {
			containsRecursive(str1, str2);

		}

	}



	public static void main(String[] args) {

		testContainsPerformance(new ExecutorContainsIteractive());
		testContainsPerformance(new ExecutorContainsRecursive());

	}











}
