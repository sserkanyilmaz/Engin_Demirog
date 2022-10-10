package DataAccess;

import Entities.Educator;

public class JdbcEducatorDao implements EducatorDao{
    @Override
    public void add(Educator educator) {
        System.out.println("Hybernate ile VeriTanına loglandı : "+ educator.getName());
    }
}
