import model.Electronic;
import java.util.UUID;
public class MAIN {
    public static void main(String[] args) {
        final UUID id=UUID.randomUUID();
        Electronic elect=new Electronic( UUID.randomUUID(),"1wS1453HB1V1Y7647","SAMA","electronic",true,"");
        System.out.println(elect.getManufacturer());
        System.out.println(elect.getId());
    }
}
