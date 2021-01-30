package lesson1.task_3;

public class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Рисуем круг");
    }

    @Override
    public void myName() {
        System.out.println("Это круг");
    }
}
