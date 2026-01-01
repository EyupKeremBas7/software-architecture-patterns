

interface Database{
    void saveRow(String row);
}

class Oracle implements Database{
    @Override
    public void saveRow(String row) {
        System.out.println("Saved row: " + row);

    }
    public String getRow(){
        System.out.println("Get Data");
        return "LOTS OF DATA";
    }
}

class MongoDB{
    public void insertDocument(String jsonData){
        System.out.println("Saved json data: " + jsonData);
    }

}

class MongoAdapter implements Database {
    private MongoDB mongoDB;
    public MongoAdapter(){
        this.mongoDB = new MongoDB();
    }
    
    @Override
    public void saveRow(String row) {
        mongoDB.insertDocument(row);
    }
}
