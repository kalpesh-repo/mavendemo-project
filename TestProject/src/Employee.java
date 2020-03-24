
public class Employee implements Cloneable{
	private String name;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
