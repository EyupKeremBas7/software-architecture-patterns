public class App{
    public static void main(String[] args) {
        ChickenDoner chickenDoner = new ChickenDoner.Builder()
                                        .setSauce("Barbecue")
                                        .build();

        System.out.println(chickenDoner.toString());
    }
}