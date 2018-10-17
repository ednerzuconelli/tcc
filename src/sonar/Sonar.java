package sonar;

public class Sonar {
	public static void main(String[] args) {
		String[] names = {"Sonar", "Cube"};
		Sonar sonar = new Sonar("Sonar Lin", names);
		System.out.println("Hello1, " +sonar.getName());
		System.out.println("Hello2, " +sonar.getName());
	}
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sonar(String name) {
		super();
		this.name = name;
	}

	public Sonar(String string, String[] names) {
		// TODO Auto-generated constructor stub
	}
	

	
	
}
