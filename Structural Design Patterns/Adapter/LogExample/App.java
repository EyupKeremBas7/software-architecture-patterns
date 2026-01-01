public class App{
    public static void main(String[] args) {
        Target objectAdapter = new ObjectAdapter();
        objectAdapter.log("Object");

        Target classAdapter = new ClassAdapter();
        classAdapter.log("Class");

    }
}