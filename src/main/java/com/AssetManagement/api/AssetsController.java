package com.AssetManagement.api;

import com.AssetManagement.model.Electronic;
import com.AssetManagement.service.AssetsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class AssetsController {

    private final AssetsServices assetsServices;


    public AssetsController(AssetsServices assetsServices) {
        this.assetsServices = assetsServices;
    }
    

    public void addAsset(Electronic electronic){assetsServices.addAsset(electronic);}
}
