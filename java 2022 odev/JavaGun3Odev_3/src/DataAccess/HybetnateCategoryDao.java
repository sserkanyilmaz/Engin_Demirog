package DataAccess;

import Entities.Category;

public class HybetnateCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Hybernate ile VeriTabanına loglandı : "+category.getName());
    }
}
