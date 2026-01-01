public class Adaptee{
    // This pattern is used when we can't change this class but we need to adapt it to another interface.
    public void log(int id){
        System.out.println("Id: " + id);
    }
}