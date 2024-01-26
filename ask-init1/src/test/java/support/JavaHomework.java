package support;
import java.util.Scanner;
class Homework {
 public static void main (String [] args) {
     String title = "My Homework";
     System.out.println(title);
     String month = "Today is January:  ";
     System.out.println(month);
     int date = 18;
     System.out.println(date);
 }
}
class Homework2{
    public static void main(String[]args){
        int a = 10;
        int b = 25;
        int c = a + b;
        System.out.println(c);
        int d = 5;
        int i = c - d;
        System.out.println(i);
        int f = c * i;
        System.out.println(f);
        if (f != 1050){
            System.out.println("result is false");}
        else {
                System.out.println("result is true");
            }
        }
    }
 class homework3 {
    public static void main(String[]args){
        System.out.println("Give me number from 1 to 10");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        boolean name = true; if(num1 < 10 && num1 > 1) {
            System.out.println(" You gave me the right number:" + num1);
        }
        else {
            System.out.println("You entered the wrong number!");
        }
    }
 }
class homework4 {
    public static void main(String[]args){
        for (int i = 5; i <= 10; i++){
            System.out.println(i + " ");
        }
    }
}
class homework5 {
    public static void main(String[]args){
        for (int i = 5; i <= 30; i+=3){
            System.out.println(i + " ");
        }
    }
}
class homework6 {
    public static void main(String[]args){
        System.out.println("Give me number 1");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println("Give me number 2");
        Scanner scan2 = new Scanner(System.in);
        int num2 = scan2.nextInt();
        for (int a = num1+num2; a < 100; a+=5){
            System.out.println(a + " ");
        }
    }
}