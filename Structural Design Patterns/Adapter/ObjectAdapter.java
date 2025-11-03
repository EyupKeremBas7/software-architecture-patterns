public class ObjectAdapter implements Target{
    @Override
    public void log(String text){
        Adaptee adaptee = new Adaptee();
        adaptee.log(10);
    }
}