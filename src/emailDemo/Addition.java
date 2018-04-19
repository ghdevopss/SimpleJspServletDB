package emailDemo;

public class Addition {
	int a,b;
	String q,w;
    
	
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	
	public int addition()
	{
		return a+b;
	}
	

	public static void main(String[] args) {
		Addition sum = new Addition(2,3);
		System.out.println("output of addition "+sum.addition());
	

	}
		
	
	}
