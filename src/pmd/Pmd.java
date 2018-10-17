package pmd;

public class Pmd {

	public static void main(String args[]) {
	    Pmd.CALL_METHOD("hello");
	    Pmd.CallHello();
	  }

	  public static void CALL_METHOD(String INPUT_PARAMETER) {
	    System.out.println(INPUT_PARAMETER);
	  }

	  public static void CallHello() {
	    System.out.println("Hello PMD World!");
	  }
}
