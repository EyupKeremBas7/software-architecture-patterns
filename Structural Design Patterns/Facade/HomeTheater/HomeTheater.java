package HomeTheater;

class Television{ 
    public void On(){
        System.out.println("TV on HDMI 1");
    }
    public void Off(){
        System.out.println("TV off");
    }
}

class AudioSystem{
    public void On(){
        System.out.println("Audio System on Cinema Mode");
    }
}

class MediaPlayer{
    public void On(){
        System.out.println("AppleTv on Netflix on");
    }
}

class SmartLight{
    public void On(){
        System.out.println("Sitting Room lights %20");
    }
}

class Curtain{
    public void Off(){
        System.out.println("Smart Curtain off");
    }
}

class HomeTheater{
    private Television television;
    private AudioSystem audioSystem;
    private MediaPlayer mediaPlayer;
    private SmartLight smartLight;
    private Curtain curtain;
    public HomeTheater() {
        this.television = new Television();
        this.audioSystem = new AudioSystem();
        this.mediaPlayer = new MediaPlayer();
        this.smartLight = new SmartLight();
        this.curtain = new Curtain();
    }
    public void HomeTheaterMode(){
        television.On();
        audioSystem.On();
        mediaPlayer.On();
        smartLight.On();
        curtain.Off();
    }
}
