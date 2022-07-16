package assignment;

public class MyMobile {
	
	int num = 123456789;

	public void makeCall() {
		System.out.println("Make Call");
		
		}
	public void sendMsg() {
		System.out.println("Send MSG");
		
	}
	private void payBills() {
		System.out.println("Pay Bills");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMobile mob = new MyMobile();
		mob.makeCall();
		mob.sendMsg();
		mob.payBills();
		System.out.println(mob.num);

	}

}
