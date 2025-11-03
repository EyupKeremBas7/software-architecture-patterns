public class Note8Factory implements TelephoneFactory{
    
    @Override
    public Telephone getTelephone(String model,String battery,int widht,int height){
        return new Note8(model,battery,widht,height);
    }
}