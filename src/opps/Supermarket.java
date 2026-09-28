package opps;

public class Supermarket {
	public static void main(String [] args) {
		System.out.println("***```!!!======Nandhini Super Market=====!!!```***");
		Encapsulation sm = new Encapsulation();
		Encapsulation s1 = new Encapsulation(101,"rice","grocery",650,2);
		System.out.println();
		double total =s1.getPrice()*s1.getQuantity();
		System.out.println("productID:"+s1.getProductId());
		System.out.println("productname:"+s1.getProductName());
		System.out.println("categories:"+s1.getCategory());
		System.out.println("price:"+s1.getPrice());
		System.out.println("quatity:"+s1.getQuantity());
		System.out.println("bill:"+total);
		System.out.println("=======================================================");
		
		Encapsulation s2 = new Encapsulation(102, "Sugar", "Grocery", 50, 3);
		double total1 = (s2.getPrice()*s2.getQuantity());
		System.out.println("productID:"+s2.getProductId());
		System.out.println("productname:"+s2.getProductName());
		System.out.println("categories:"+s2.getCategory());
		System.out.println("price:"+s2.getPrice());
		System.out.println("quatity:"+s2.getQuantity());
		System.out.println("bill:"+total1);
		System.out.println("==========================================================");
		
		Encapsulation s3 = new Encapsulation(103, "Milk", "Dairy", 30, 5);
		double total2=(s3.getPrice()*s3.getQuantity());
		System.out.println("productID:"+s3.getProductId());
		System.out.println("productname:"+s3.getProductName());
		System.out.println("categories:"+s3.getCategory());
		System.out.println("price:"+s3.getPrice());
		System.out.println("quatity:"+s3.getQuantity());
		System.out.println("bill:"+total2);
		System.out.println("========================================================");
		
		Encapsulation s4 = new Encapsulation(104, "Soap", "Personal Care", 45, 4);
		double total3=(s4.getPrice()*s4.getQuantity());
		System.out.println("productID:"+s4.getProductId());
		System.out.println("productname:"+s4.getProductName());
		System.out.println("categories:"+s4.getCategory());
		System.out.println("price:"+s4.getPrice());
		System.out.println("quatity:"+s4.getQuantity());
		System.out.println("bill:"+total3);
		System.out.println("========================================================");
		
		Encapsulation s5 = new Encapsulation(105, "Biscuit", "Snacks", 25, 6);
		double total4=(s5.getPrice()*s5.getQuantity());
		System.out.println("productID:"+s5.getProductId());
		System.out.println("productname:"+s5.getProductName());
		System.out.println("categories:"+s5.getCategory());
		System.out.println("price:"+s5.getPrice());
		System.out.println("quatity:"+s5.getQuantity());
		System.out.println("bill:"+total4);
		System.out.println("=========================================================");
		 
		double grant_total =(total+total1+total2+total3+total4);
		System.out.println("Grant_Total:"+grant_total);
		
		
		
	}

}
