package OOP1;

public class Pen {
    private String type = "Gel";
    private String color = "Blue";
    private int point = 10;

    private static boolean click;

    Pen(){

    }

    Pen(String type, String color){

    }

    public String GetColor(){
        return color;
    }

    public String GetType(){
        return type;
    }

    public static void click() {
        click = true;
        System.out.println("Ready to use");

    }

    @Override
    public String toString() {
        return ("Type: " + type + "\n" +
                "color: " + color);
    }
    public static void unClick() {
        click = false;
        System.out.println("Not is use");
    }

}
