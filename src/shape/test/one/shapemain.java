package shape.test.one;

import java.util.ArrayList;
import java.util.List;

public class shapemain {
    public static void main(String[] args) {
        List<shape> sqr = shapebytapr(shape.shapes, "사각형");
        System.out.print("squares : ");
        System.out.println(sqr);
        List<shape> redNSmallShapes = colorarea(shape.shapes, "빨간색", 12.0);
        System.out.print("red figure(면적<=12.0) : ");
        System.out.println(redNSmallShapes);
    }

    static List<shape> shapebytapr(List<shape> shapes, String type) {
        List<shape> result = new ArrayList<>();

        for (shape my_figure : shapes) {
            if (my_figure.getType().equals(type))
                result.add(my_figure);
        }
        return result;
    }

    static List<shape> colorarea(List<shape> shapes, String color, Double area) {
        List<shape> result = new ArrayList<>();

        for (shape s : shapes) {
            if (s.getColor().equals(color) && s.getArea() <= area)
                result.add(s);
        }
        return result;
    }
}
