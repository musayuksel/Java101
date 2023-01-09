import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String myName = "Musa";
//        int myNumber = 5;// 4 byte
//        System.out.println("Hello, my name is " + myName +  " and my lucky number is: " + myNumber);
//        byte smallNumber = 127;//1 byte
//        short middeNumber = 32_000;// 2 byte
//        long veryBigNum = 3_000_000_000L;//don't forget the add L- 8 byte
//        float smallDecimal = 3.14F;//don't' forget the F - 4 byte
//        double veryBigDecimal = 3.14; // 8 byte
//        char oneChar= 'a';//single quote // 2 byte
//        boolean isTrue = false; // 1 byte
//
//
////        Reference types
//        Date today = new Date();
//        System.out.println("today is " + today);
//        Date tomorrow = today;
//        System.out.println("tomorrow is "+ tomorrow);//both of them are the same object
//
//        String string1 = new String("musa");//redundant
//        String betterOne = "I started a new project ${today}";//template literal
////        One D ARRAYS
//        int[] oneDArray = new int[5];//size of array
//        //java has fix length
//        String readableArray = Arrays.toString(oneDArray);
//        System.out.println(readableArray);//all default values are 0, or empty
//        int[] anotherWay = {1,2,3,4,5};
//        String readableArray2 = Arrays.toString(anotherWay);
//        System.out.println(readableArray2);
////        Multi Dimensional ARRAYS
//        int[][] twoDArray = new int[2][3];// 2 rows, 3 column
//        int[][] another2D = {{1},{3}};
//        int[][][] multiD = new int[2][3][4];
//        System.out.println(Arrays.deepToString(multiD));//use deepToString
//
////        CONSTANTS
//        final float PI = 3.14F;
//
////        Arithmetic Expressions
//         double result  = (double)10/ (double) PI;
//        System.out.println(result);
//
//        int number1 = 1;
//        System.out.println(number1++);//first console 1 and increase
//        System.out.println(++number1);//first increase then console
//        System.out.println(number1+=5);// console 8
//        //Implicit casting
//        short shortNum = 1;
//        double biggerNum = shortNum + 4; // it will convert shortNum to double
//        //byte > short > int > long > float > double
//        System.out.println(biggerNum);
//        //explicit casting
//        int latestResult = (int)biggerNum +4;

//        READING INPUT
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Type your input: ");
//        String newInput = scanner.nextLine().trim();//take all line not one token///
//        System.out.println("Your input is : "+newInput);
////        MINI PROJECT
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.print("Principal:");
//        int principal = (scanner1.nextInt());
//
//
//        System.out.print("Annual Interest Rate:");
//        float annualInterest = scanner1.nextFloat();
//        final byte MONTH_IN_YEAR =12;
//        final byte PERCENT =100;
//        float monthlyInterest = annualInterest/MONTH_IN_YEAR/PERCENT;
//
//
//        System.out.print("Period (Years):");
//        byte year = scanner1.nextByte();
//        int months = year*MONTH_IN_YEAR;
//
//
//
//        double mortgage = principal *(
//                (monthlyInterest * Math.pow((1 + monthlyInterest), months))
//                 /(Math.pow((1+monthlyInterest),months)-1)
//        );
//        String monthlyPayment = NumberFormat.getCurrencyInstance().format(mortgage);
//
//        System.out.println("Mortgage: "+ monthlyPayment);

//        TERNARY OPERATOR & Conditional
        int income = 120_000;
        boolean isHighIncome = income > 100_000;//same as JS
        String className = isHighIncome ? "First" : "Economy";//Same as js

//        SWITCH
        String role = "admin";
        switch(role){
            case "admin":
                System.out.println("welcome admin...");
                break;
            case "moderator":
                System.out.println("welcome moderator...");
                break;
            default:
                System.out.println("welcome guest");

        }


    }

}