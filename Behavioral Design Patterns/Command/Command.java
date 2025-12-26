interface Command{
    void execute();
}

class Television {
    public void on(){
        System.out.println("The television is on");
    }

    public void off(){
        System.out.println("The television is off");
    }

}

class TurnOnTheTelevision implements Command{
    private Television television;

    public TurnOnTheTelevision(Television television) {
        this.television = television;
    }

    public void execute(){
        television.on();    
    }    
}

class TurnOffTheTelevision implements Command{
    private Television television;

    public TurnOffTheTelevision(Television television) {
        this.television = television;
    }

    public void execute(){
        television.off();
    }
}


class Remote{
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        if(command != null){
            command.execute();
        }
    }


}