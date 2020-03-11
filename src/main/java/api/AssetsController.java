package api;

import model.Electronic;
import org.springframework.beans.factory.annotation.Autowired;
import service.AssetsServices;
import service.ElectronicServices;

public class AssetsController {

    private final AssetsServices assetsServices;

    @Autowired
    public AssetsController(AssetsServices assetsServices) {
        this.assetsServices = assetsServices;
    }

    public void addAsset(Electronic electronic){assetsServices.addAsset(electronic);}
}
