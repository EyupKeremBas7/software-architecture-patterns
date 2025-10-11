public class Singleton{

    private static Singleton singleton;
    private static int counter = 0;

    private Singleton(){
        System.out.println("Constructor");
    }
    
    
    public static Singleton getSingleton(){

        // Lazy loading && Double Checked Locking
        if(singleton==null){    
            synchronized (Singleton.class) {
                if(singleton==null){    
                    singleton = new Singleton();    
                }
            }
        }
        counter++;
        System.out.println(counter);
        return singleton;
    }

}