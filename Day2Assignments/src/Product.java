
public class Product {
	private String productcode;
	private String productname;
	private double productprice;
	Product(String ppcode,String pname,double pprice)
	{
		productcode=ppcode;
		productname=pname;
		productprice=pprice;
	}
	public void displayProductDetails() {
		System.out.println("productcode:" + productcode + "\n" +"productname:" + productname + "\n" +"productprice:" + productprice);

	}
}