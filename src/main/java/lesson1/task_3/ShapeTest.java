package lesson1.task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {

        List<Shape> listShape = new ArrayList(Arrays.asList(new Circle(), new Triangle(), new Square()));
        for (Shape s:listShape) {
            s.myName();
            s.draw();
        }

    }
}
