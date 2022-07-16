package assignment;

public class Primenumber {
	public static void main(String[] args) {
		int a=13;
		boolean flag = false;
		int b=a/2;
		for(int i = 2;i<=b;i++) {
			if(a%i==0)
			{
				flag = true;
				break;
				
			}
		}
		if(flag==false)
		{System.out.println("Prime");
			}
		else {
			System.out.println("Not Prime");
		}

		}
	

}
