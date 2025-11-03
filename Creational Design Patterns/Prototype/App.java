public class App {
    public static void main(String[] args) {
        System.out.println("Prototype Pattern Example");
        ShallowCloneTroopers trooper1 = new ShallowCloneTroopers();
        ShallowCloneTroopers trooper2 = trooper1.clone();
        System.out.println(trooper1);
        System.out.println(trooper2);

        DeepCloneTroopers deepTrooper1 = new DeepCloneTroopers(1, "Trooper One", null);
        DeepCloneTroopers deepTrooper2 = deepTrooper1.clone();
        System.out.println(deepTrooper1);
        System.out.println(deepTrooper2);
    }
}