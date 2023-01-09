import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String myName = "Musa";
        int myNumber = 5;// 4 byte
        System.out.println("Hello, my name is " + myName +  " and my lucky number is: " + myNumber);
        byte smallNumber = 127;//1 byte
        short middeNumber = 32_000;// 2 byte
        long veryBigNum = 3_000_000_000L;//don't forget the add L- 8 byte
        float smallDecimal = 3.14F;//don't' forget the F - 4 byte
        double veryBigDecimal = 3.14; // 8 byte
        char oneChar= 'a';//single quote // 2 byte
        boolean isTrue = false; // 1 byte


//        Reference types
        Date today = new Date();
        System.out.println("today is " + today);
        Date tomorrow = today;
        System.out.println("tomorrow is "+ tomorrow);//both of them are the same object

        String string1 = new String("musa");//redundant
        String betterOne = "I started a new project ${today}";//template literal
//        One D ARRAYS
        int[] oneDArray = new int[5];//size of array
        //java has fix length
        String readableArray = Arrays.toString(oneDArray);
        System.out.println(readableArray);//all default values are 0, or empty
        int[] anotherWay = {1,2,3,4,5};
        String readableArray2 = Arrays.toString(anotherWay);
        System.out.println(readableArray2);
//        Multi Dimensional ARRAYS
        int[][] twoDArray = new int[2][3];// 2 rows, 3 column
        int[][] another2D = {{1},{3}};
        int[][][] multiD = new int[2][3][4];
        System.out.println(Arrays.deepToString(multiD));//use deepToString

    }

}