public class S8Factory implements TelephoneFactory{
    
    @Override
    public Telephone getTelephone(String model,String battery,int widht,int height){
        return new S8(model,battery,widht,height);
    }
}