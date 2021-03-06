package Dao;

import model.Assets;
import java.util.UUID;

public interface AssetsDao {

    int insertAsset(UUID id, Assets asset);

    // insert Asset without ID which is Implicitly generated.
    default int insertAssert(Assets asset){
        UUID id=UUID.randomUUID();
        return insertAsset(id,asset);
    };

}
