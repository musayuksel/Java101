package abstraction;

public class Rectangle extends GraphicObject {

    @Override
   public void draw() {
        System.out.println("Drawing a rectangle...");
    }

    @Override
    public void resize() {
        System.out.println("Resizing a rectangle...");
    }
}
