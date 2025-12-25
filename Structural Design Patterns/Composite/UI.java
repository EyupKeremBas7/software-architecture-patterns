package Composite;
import java.util.List;
import java.util.ArrayList;

abstract class UI {
    private String text;
    
    public UI(String text){
        this.text = text;
    }

    abstract void print();

    public String getText(){
        return this.text;
    }
}

class Button extends UI{
    public Button(String text){
        super(text);
    }
    
    @Override
    public void print(){
        System.out.println("Button: " + super.getText());
    }
}

class Text extends UI{
    public Text(String text){
        super(text);
    }
    
    @Override
    public void print(){
        System.out.println("Text: " + super.getText());
    }
}

class Div extends UI{
    private List<UI> elements;
    
    public Div(String text){
        super(text);
        elements = new ArrayList<>();
    }

    public void addElement(UI element){
        elements.add(element);
    }

    public void removeElement(UI element){
        elements.remove(element);
    }

    @Override
    public void print() {
        for (UI element : elements) {
            element.print();
        }

        System.out.println("End of Div: " + super.getText());
    }

    public List<UI> getElements(){
        return elements;
    }
}