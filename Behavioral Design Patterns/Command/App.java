public class App{
    public static void main(String[] args) {
        Television television = new Television();
        Remote remote = new Remote();
        remote.setCommand(new TurnOnTheTelevision(television));
        remote.pressButton();

        remote.setCommand(new TurnOffTheTelevision(television));
        remote.pressButton();
    }
}