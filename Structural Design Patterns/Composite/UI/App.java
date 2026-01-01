

public class App {
    public static void main(String[] args) {
        UI button = new Button("Submit Button");
        UI text = new Text("Description Text");
        
        
        Div mainDiv = new Div("Main Container");
        Div innerDiv = new Div("Inner Container"); 
        
        innerDiv.addElement(text);
        innerDiv.addElement(button);

        mainDiv.addElement(text);
        mainDiv.addElement(button);
        mainDiv.addElement(innerDiv); 

        mainDiv.print();
    }
}
