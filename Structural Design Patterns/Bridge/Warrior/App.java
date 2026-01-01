public class App{
    public static void main(String[] args){
	Characters warrior = new Warrior(new Xbox());
	warrior.useWeapon();
	Characters magician = new Magician(new Windows());
	magician.useWeapon();
    }
}
