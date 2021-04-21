
public class TestProduct1 {

	public static void main(String[] args) {
		Product1 product=new Product1();
		product.setProductCode("111");
		product.setProductName("Dell Laptop");
		product.setProducPrice(45000.0);

			System.out.println("ProductCode  :" +  product.getproductcode());
			System.out.println("ProductName  :" +  product.getproductname());
			System.out.println("ProductPrice :" + product.getproductprice());


 }
	
}
