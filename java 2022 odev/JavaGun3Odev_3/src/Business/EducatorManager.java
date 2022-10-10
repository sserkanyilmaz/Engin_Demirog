package Business;

import DataAccess.EducatorDao;
import Entities.Educator;
import Logger.Logger;

import java.util.List;

public class EducatorManager {
    private EducatorDao educatorDao;
    private Logger[]  loggers;

    public EducatorManager(EducatorDao educatorDao, Logger[]  loggers) {
        this.educatorDao = educatorDao;
        this.loggers = loggers;
    }
    public void add(Educator educator){
        educatorDao.add(educator);
    }
}
