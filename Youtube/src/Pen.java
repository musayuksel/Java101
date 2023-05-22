public class Pen {//you should implement the printInfo method
   String type = "ballpoint";
    String color = "blue";
    int point = 10;
    static boolean isClicked = false;

    public static void click() {
         isClicked = true;
    }
    public static  void unClick() {
         isClicked = false;
    }

}
