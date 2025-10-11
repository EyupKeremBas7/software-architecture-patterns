public class S8 implements Telephone{
    private String model;
    private String battery;
    private int width;
    private int height;
    public S8(String model,String battery,int width,int height){
        this.model = model;
        this.battery = battery;
        this.width = width;
        this.height = height;
    }

    @Override
    public String getModel() {
        return model;
    }
    @Override
    public String getBattery() {
        return battery;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public String toString(){
        return """
            Note8: {
            \tModel: %s
            \tBattery: %s
            \tWidth: %d
            \tHeight: %d
            }
            """.formatted(model, battery, width, height);
    }
    

}