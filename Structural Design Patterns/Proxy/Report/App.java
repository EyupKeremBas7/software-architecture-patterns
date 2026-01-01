public class App {
    public static void main(String[] args) {
        User admin = new User("Ali", true);
        User user = new User("Veli", false);

        Report reportProxy = new LargeReportProxy();

        reportProxy.display(admin); 
        reportProxy.display(user);  
        reportProxy.display(admin); 
    }
}
