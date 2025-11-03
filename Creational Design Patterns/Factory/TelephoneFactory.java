
public class TelephoneFactory{

    public static Telephone getTelephone(String model,String battery,int width,int height) {
        Telephone telephone;
        if("s8".equalsIgnoreCase(model)){
            telephone = new S8(model,battery,width,height);
        } else if ("note8".equalsIgnoreCase(model)){
            telephone = new Note8(model,battery,width,height);
        } else {
            throw new RuntimeException("Wrong phone model");
        }
        return telephone;
    }

}