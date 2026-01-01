public class App{
    public static void main(String[] args){
    	Sword sword = new Posion(new Fire(new BasicSword())); 
    	sword.hit();
	System.out.println();
	sword = new Fire(new BasicSword());
	sword.hit();
	System.out.println();
	sword = new BasicSword();
	sword.hit();
    }
}
