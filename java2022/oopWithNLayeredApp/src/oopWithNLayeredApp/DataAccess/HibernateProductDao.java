package oopWithNLayeredApp.DataAccess;

import oopWithNLayeredApp.Entities.Product;

public class HibernateProductDao implements ProductDao{

    public void add(Product product){
        //sadece ve sadece db erişim kodları buraya yazılır... SQL
        System.out.println(product.getName()+" ürünü Hinernate ile veri tabanına eklendi");
    }
}
