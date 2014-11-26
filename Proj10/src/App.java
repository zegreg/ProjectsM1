
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Evaluation test1 = new Simple("First Test", 12);
		Evaluation test2 = new Simple("Second Test", 16);
		System.out.println(test1);
		System.out.println("------");
		test2.list("->");
		
		
		Complex allTests = new Average("Test Grades", 2);
		allTests.add(test1);
		allTests.add(test2);
		System.out.println(allTests);
		System.out.println("------");
		allTests.list("-> ");
		
		
	}

}
