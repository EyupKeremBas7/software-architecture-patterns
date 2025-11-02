public class ChickenDoner{

    private String meat;
    private String bread;
    private String sauce;

    private ChickenDoner(Builder build){
        this.meat = build.meat;
        this.bread = build.bread;
        this.sauce = build.sauce;
    }

    public static class Builder{

        private String meat;
        private String bread;
        private String sauce;
        public Builder()
        {
            this.meat = "Chicken";
            this.bread = "Pita";
        }
        public Builder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public ChickenDoner build() {
            return new ChickenDoner(this);
        }
    }

    @Override
    public String toString() {
        return "ChickenDoner{" +
                "meat='" + meat + '\'' +
                ", bread='" + bread + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }
}
