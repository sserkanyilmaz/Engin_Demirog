package classesWithAttributes;

public class main {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Asus Laptop",5000,3);
		/*
		product.name="Laptop";
		product.id=1;
		product.description="Asus Laptop";
		product.price=5000;
		product.stockAmount=3;
		*/
		System.out.println(product.getName());
		ProductManager productManager = new ProductManager();
		productManager.add(product);
	}

}
