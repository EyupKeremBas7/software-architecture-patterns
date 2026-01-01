public class App{
    public static void main(String[] args){
	Soldier private0 = new Private();
	Soldier private1 = new Private();
	Soldier private2 = new Private();
	Lieutenant lieutenant = new Lieutenant();
    
	lieutenant.addSoldier(private0);
	lieutenant.addSoldier(private1);
	lieutenant.addSoldier(private2);
	lieutenant.attack();
    }
}