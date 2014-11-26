import java.util.List;


public class Ex3 {

	
	
	public static String[] spliIterative(String text,String delemeter){
	    java.util.List<String> parts = new java.util.ArrayList<String>();
	   
	    for (int i = text.indexOf(delemeter), j=0; i != -1; i = text.indexOf(delemeter,j)) {
	        parts.add(text.substring(j,i));
	       
				j=i+delemeter.length();
		
	        
	    }


	    return parts.toArray(new String[0]);
	}
	
	
	public static String[] splitRecursive(String text,String delemeter){
		java.util.List<String> parts = new java.util.ArrayList<String>();
		
		int indexOfDelemeter = text.indexOf(delemeter);
		
		return splitRecursive(parts, text, delemeter, 0, indexOfDelemeter);
		
		
	}
	
	public static String[] splitRecursive(List<String> parts, String text,String delemeter, int indexOfString, int indexOfDelemeter){
		
		
		
		
		if(indexOfDelemeter != -1){
			
			parts.add(text.substring(indexOfString, indexOfDelemeter));
			splitRecursive(parts, text, delemeter, indexOfDelemeter +
					delemeter.length(), text.substring(indexOfDelemeter, text.length()-1).indexOf(delemeter));
		}
		
				
		
		return parts.toArray(new String[0]);
	
		
		
	}



		
	
	

	public static void main(String[] args) {
	    String str="012ab567ab0123ab";
	    String delemeter="ab";
	    String result1[]=spliIterative(str,delemeter);
	    String result[]=splitRecursive(str,delemeter);
	    for(String s:result)
	        System.out.println(s);
	}

	
	}
	
		
	
	
	

