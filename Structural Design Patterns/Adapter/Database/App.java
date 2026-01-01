

public class App {
    public static void main(String[] args) {
        
        Database oracle = new Oracle();
        oracle.saveRow("row");
        Database mongo = new MongoAdapter();
        mongo.saveRow("row");
    }      
}
