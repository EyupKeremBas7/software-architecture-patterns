public class App{
    public static void main(String[] argv){
        Follower eyup =  new Follower("Eyup");
        Follower sefa = new Follower("Sefa");
        eyup.addObserver(eyup);
        eyup.addObserver(sefa);
        eyup.setName("Özgürlük");
        

    }
}