public class Hello { 
	//数组定义和初始化
	public int[] a = new int[]{1,3};

	public static void main(String[] args)
	{          
		int[] a = new int[]{5,6};

		System.out.println(a[0]); 
		//类定义 和 new
		Hello b = new Hello();
		//this 用法         
		System.out.println(b.a[0]);          
	}  
} 
