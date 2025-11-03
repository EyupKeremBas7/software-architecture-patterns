public class ClassAdapter extends Adaptee implements Target{
    @Override
    public void log(String text){
        log(10);
    }
}