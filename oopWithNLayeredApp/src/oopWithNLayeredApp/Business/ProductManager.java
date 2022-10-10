package oopWithNLayeredApp.Business;

import oopWithNLayeredApp.Core.Logging.Logger.Logger;
import oopWithNLayeredApp.DataAccess.HibernateProductDao;
import oopWithNLayeredApp.DataAccess.JdbcProductDao;
import oopWithNLayeredApp.DataAccess.ProductDao;
import oopWithNLayeredApp.Entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;
    public ProductManager(ProductDao productDao,Logger[] loggers){
        this.productDao=productDao;
        this.loggers=loggers;
    }
    public  void Add(Product product) throws Exception {
        if(product.getUnitPrice()<10)
        {
            throw new Exception("Urun fiyatı 10dan küçük olamaz");
        }
        //ProductDao productDao = new HibernateProductDao();
        productDao.add(product);
        for (Logger logger: loggers) {
            logger.log(product.getName());
        }

    }
}
