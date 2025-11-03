
import java.util.List;

public class ShallowCloneTroopers implements Prototype<ShallowCloneTroopers>{
    private int id;
    private String name;
    private List<Equipment> equipment;

    @Override
    public ShallowCloneTroopers clone(){
        ShallowCloneTroopers trooper = new ShallowCloneTroopers();
        trooper.id = this.id;
        trooper.name = this.name;
        trooper.equipment = this.equipment;
        return trooper;
    }
}