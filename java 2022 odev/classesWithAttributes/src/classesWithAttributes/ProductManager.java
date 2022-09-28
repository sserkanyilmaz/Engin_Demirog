package classesWithAttributes;

public class ProductManager {
	public void add(Product product) {
		System.out.println("Urun eklendi : " + product.name);
	}

	public void add2(int id, String name, String description, int stockAmount, int price) {
		System.out.println("");
	}
}
