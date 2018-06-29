class Father{
	private String name = "si";
	public String firstName = "li";
	public int age = 50;
	public String job = "farmer";
	public String hobby = "";

	//非空构造函数
	Father(String hobby){
		this.hobby = hobby;
	}

	public void walk(){
		System.out.println("I can walk.");
	}  

	private void working(){
		System.out.println("I can plant.");
	} 

	
	
}