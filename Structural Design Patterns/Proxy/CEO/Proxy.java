interface Meeting{
    void setMeeting();
}

class CEO implements Meeting{
    public void setMeeting(){
        System.out.println("CEO meeting");
    }
}

class Assistant implements Meeting{
    private CEO ceo;
    public Assistant(){ this.ceo = new CEO(); }
    public void setMeeting(){
	System.out.println("Assistant meeting");
	ceo.setMeeting();
    }
}

