package service;

import dao.ElectronicsDao;
import model.Electronic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ElectronicServices {

    @Autowired
    private ElectronicsDao electronicsdao;

    public ElectronicServices(@Qualifier("fakeData") ElectronicsDao electronicsDao ){
        this.electronicsdao=electronicsDao;
    }

    public int addElectronic(Electronic electronic){
        return electronicsdao.insertProduct(electronic);
    }

}
