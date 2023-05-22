package abstraction;

public class Circle extends GraphicObject{
    @Override
   public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing a circle");
    }
}
