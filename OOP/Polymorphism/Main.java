package OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {
        drawUIControl(new TextBox());
        
        UIControl UIC = new CheckBox();
        UIC.draw();

    }

    public static void drawUIControl(UIControl control) {
        control.draw();
    }
}