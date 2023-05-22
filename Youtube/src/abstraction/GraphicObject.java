package abstraction;

public abstract class GraphicObject {
    // hide details out-side of the user (
    // Abstract classes cannot be instantiated, but they can be subclassed.
    //hides all but the relevant data about an object in order to reduce complexity and increase efficiency.
    //https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
    int x, y;
    void moveTo(int newX, int newY) {
    }
    abstract void draw();//NO IMPLEMENTATION. YOU SHOULD HAVE AT LEAST ONE ABSTRACT METHOD
    abstract void resize();
}
