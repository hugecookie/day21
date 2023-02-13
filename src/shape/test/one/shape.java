package shape.test.one;
import java.util.Arrays;
import java.util.List;

public class shape {
    private String type;
    private String color;
    private Double area;

    public shape(String type, String color, Double area) {
        this.type = type;
        this.color = color;
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public Double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return String.format("%s(%s, %.1f)", type, color, area);
    }

    public static List<shape> shapes = Arrays.asList(
            new shape("삼각형", "빨간색", 10.5),
            new shape("사각형", "파란색", 11.2),
            new shape("원", "파란색", 16.5),
            new shape("원", "빨간색", 5.3),
            new shape("원", "노란색", 8.1),
            new shape("사각형", "파란색", 20.7),
            new shape("삼각형", "파란색", 3.4),
            new shape("사각형", "빨간색", 12.6)
    );
}
