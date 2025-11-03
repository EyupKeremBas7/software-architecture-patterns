
import java.util.List;

public class DeepCloneTroopers implements Prototype<DeepCloneTroopers>{
    private int id;
    private String name;
    private List<Equipment> equipment;

    public DeepCloneTroopers(int id, String name, List<Equipment> equipment){
        this.id = id;
        this.name = name;
        this.equipment = equipment;
    }

    @Override
    public DeepCloneTroopers clone(){
        return  new DeepCloneTroopers(this.id, this.name, this.equipment);
    }
}   