interface HeroState{
    void getMushroom(Hero hero);
    void takeDamage(Hero hero);
}

class SmallState implements HeroState{
    
    @Override
    public void getMushroom(Hero hero){
        System.out.println("Büyüdün! Artık taş kırabilirsin.");
        hero.setState(new SuperState());
    }
    
    @Override
    public void takeDamage(Hero hero){
        System.out.println("Öldün. Game Over.!");
        hero.setState(new DeadState());
    }
}

class SuperState implements HeroState{
    
    @Override
    public void getMushroom(Hero hero){
        System.out.println("Zaten süpersin, +1000 puan kazandın!");
    }

    @Override
    public void takeDamage(Hero hero){
        System.out.println("Gücünü kaybettin, küçüldün");
        hero.setState(new SmallState());
        
    }
    
}

class DeadState implements HeroState{
    @Override
    public void getMushroom(Hero hero){
        System.out.println("Ölüler yemek yiyemez...");
    }

    @Override
    public void takeDamage(Hero hero){
        System.out.println("Cesedi tekmeleme..."    );
    }
}

class Hero {
    private String name;
    private HeroState state;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public HeroState getState() {
        return state;
    }
    public void setState(HeroState state) {
        this.state = state;
    }
    public void getMushroom(){
        state.getMushroom(this);
    }
    public void takeDamage(){
        state.takeDamage(this);
    }
    public Hero(String name, HeroState state) {
        this.name = name;
        this.state = state;
    }
    
}