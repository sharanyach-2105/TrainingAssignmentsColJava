
public class Customer {

	int custid;
	String custname;

	Customer(int cid,String cname){
		custid=cid;
		custname=cname;
	}
	void printmethod() {
		System.out.println(custid + "\n" + custname);
	}


	public static void main(String[] args) {
		Customer customer=new Customer(10,"sharanya");
		customer.printmethod();

		
	}

}	