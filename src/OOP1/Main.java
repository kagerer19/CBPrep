package OOP1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Pen> pens = new ArrayList<>();
        Pen bicPen = new Pen();
        Pen bicPen2 = new Pen("Point", "Red");

        System.out.println(bicPen2.GetColor());
        System.out.println(bicPen2.GetType());
        pens.add(CreateAPen("bic", "Black", "Ballpoint"));

        System.out.println(pens);
        System.out.println(bicPen2);


    }
    public static Pen CreateAPen(String penBrand, String penColor, String penType){
        Pen pen = new Pen();
        return pen;
    }
}
