abstract class Characters{
    protected DrawingAPI drawingAPI;
    public abstract void useWeapon();
    public Characters(DrawingAPI drawingAPI){ this.drawingAPI = drawingAPI; }
}

class Warrior extends Characters{ 
    public Warrior(DrawingAPI drawingAPI){ super(drawingAPI); }
    public void useWeapon(){
	drawingAPI.drawTheGraphics();
	System.out.println("The Warior swing his sword for justice");
    }
}

class Magician extends Characters{
    public Magician(DrawingAPI drawingAPI){ super(drawingAPI); }
    public void useWeapon(){
	drawingAPI.drawTheGraphics();
	System.out.println("The Magician spell his magic");
    }
}

interface DrawingAPI{
    void drawTheGraphics();
}

class Windows implements DrawingAPI{
    public void drawTheGraphics(){
	System.out.print("Windows ");
    }
}

class Playstation implements DrawingAPI{
    public void drawTheGraphics(){
	System.out.print("Playstation ");
    }
}

class Xbox implements DrawingAPI{
    public void drawTheGraphics(){
	System.out.print("XBOX ");
    }
}
