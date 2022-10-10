package oopWithNLayeredApp;

import oopWithNLayeredApp.Business.ProductManager;
import oopWithNLayeredApp.Core.Logging.Logger.Logger;
import oopWithNLayeredApp.DataAccess.JdbcProductDao;
import oopWithNLayeredApp.DataAccess.ProductDao;
import oopWithNLayeredApp.Entities.Product;

import java.util.List;

public class Main {

    public static void main(String[] args)throws  Exception {
        Product product1 = new Product(1,"Iphone Xr" , 91);
        Logger[] loggers = {};

        ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);
        productManager.Add(product1);
    }
}
