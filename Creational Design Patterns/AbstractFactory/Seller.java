public class Seller{
    public static void main(String[] args) {
        S8Factory s8Factory = new S8Factory();
        Telephone s8 = s8Factory.getTelephone("s8", "3000mah", 4, 6);
        System.out.println(s8);

        Note8Factory note8Factory = new Note8Factory();
        Telephone note8 = note8Factory.getTelephone("note8", "3000mah", 4, 6);
        System.out.println(note8);
        
    }
}