package service;

import Dao.AssetsDao;
import model.Electronic;

public class AssetsServices {
    private AssetsDao assetsDao;

    public AssetsServices(AssetsDao assetsDao) {
        this.assetsDao = assetsDao;
    }

    public int addAsset(Electronic electronic){
        return assetsDao.insertAssert(electronic);
    }
}
