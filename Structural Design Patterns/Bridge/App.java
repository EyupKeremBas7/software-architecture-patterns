public class App {
    public static void main(String[] args) {
        
        new InstallmentPayment(new Iyzico()).pay(1000);
        
        new InstallmentPayment(new Paypal()).pay(1000);
        
        new UpfrontPayment(new Iyzico()).pay(1000);
    
        new UpfrontPayment(new Paypal()).pay(1000);

    }
}