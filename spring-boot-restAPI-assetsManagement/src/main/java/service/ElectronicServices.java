package service;

import Dao.ElectronicsDao;
import model.Electronic;

public class ElectronicServices {

    private ElectronicsDao electronicsdao;

    public ElectronicServices(ElectronicsDao electronicsDao ){
        this.electronicsdao=electronicsDao;
    }

    public int addElectronic(Electronic electronic){
        return electronicsdao.insertProduct(electronic);
    }

}
