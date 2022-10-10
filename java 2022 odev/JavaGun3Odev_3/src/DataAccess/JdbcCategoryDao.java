package DataAccess;

import Entities.Category;

public class JdbcCategoryDao implements CategoryDao{

    @Override
    public void add(Category category) {
        System.out.println("Jdbc ile VeriTabanına loglandı " + category.getName());
    }
}
