class Son extends Father{
	private String name = "an";
	public String firstName = "";
	public int age = 25;
	public String job = "engineer";

	Son(){
		super("drinking");//父类初始化
		this.firstName = super.firstName;
	}

	public void walk(){
		super.walk();
		System.out.println("I can walk and run.");
	}  

	private void walk(String k){
		System.out.println("I can walk and run." + k);
	}  

	private void working(){
		System.out.println("I can design building.");
	} 

	public void sayName(){
		System.out.println("My name is " + this.firstName + "" + this.name);
	}

	public static void main(String[] arr){
		Son s = new Son();
		s.sayName();
		s.walk();
		s.walk("....");
	}
}