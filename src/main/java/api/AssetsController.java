package api;

import model.Electronic;
import org.springframework.beans.factory.annotation.Autowired;
import service.AssetsServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class AssetsController {

    private final AssetsServices assetsServices;

    @Autowired
    public AssetsController(AssetsServices assetsServices) {
        this.assetsServices = assetsServices;
    }
    
    @PostMapping
    public void addAsset(Electronic electronic){assetsServices.addAsset(electronic);}
}
