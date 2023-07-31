package objectoriented;

public class Worktest {

	public static void main(String[] args) {
		Worker w1 = new Worker();
		w1.setname("Tasnim");
		System.out.println("name:" + w1.getname());
		w1.setage(23);
		System.out.println("age:" + w1.getage());
		w1.setphnnumber(1234);
		System.out.println("phone:" + w1.getphnnumber());
		w1.sethourlypay(1000);
        System.out.println("hourly pay:" + w1.gethourlypay());
	
	
	    Worker w2 = new Worker();
	    w2.setname("Sunny");
	    System.out.println("name:" + w2.getname());
	    w2.setage(30);
	    System.out.println("age:" + w2.getage());
	    w2.setphnnumber(1290);
	    System.out.println("number:" + w2.getphnnumber());
	    w2.sethourlypay(2000);
	    System.out.println("pay:" + w2.gethourlypay());
	    
	    Worker w3 =new Worker();
	    w3.setname("Ohid");
	    System.out.println("name:" + w3.getname());
	    w3.setage(26);
	    System.out.println("age:" + w3.getage());
	    w3.setphnnumber(1235);
	    System.out.println("phone number:" + w3.getphnnumber());
	    w3.sethourlypay(3000);
	    System.out.println("hourly pay:" + w3.gethourlypay());

	
	
	
	
	
	
	}
}
