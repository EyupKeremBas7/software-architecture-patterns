interface Sword{
    void hit();
}

class BasicSword implements Sword{
    public void hit(){
	System.out.print(" +10 Attack Point ");
    }
}

abstract class Enchant implements Sword{
    protected Sword sword;
    public Enchant(Sword sword){ this.sword = sword; }

    public void hit(){
	sword.hit();
    }

}

class Posion extends Enchant{
    public Posion(Sword sword){ super(sword); }
    public void hit(){
   	 super.hit();
        System.out.print(" +20 Attack Point ");
    }
}

class Fire extends Enchant{
    public Fire(Sword sword){ super(sword); } 
    public void hit(){
	super.hit();
	System.out.print(" +5 Attack Point ");
    }
}

