
public class Seller{
    public static void main(String[] args) {
        
        Telephone s8 = TelephoneFactory.getTelephone("S8", "3000mah", 4, 6);
        System.out.println(s8);

        Telephone note8 = TelephoneFactory.getTelephone("note8", "3000mah", 4, 6);
        System.out.println(note8);

        // Telephone exception = TelephoneFactory.getTelephone("exception", "3000mah", 4, 6);
        // System.out.println(exception);

    }
}