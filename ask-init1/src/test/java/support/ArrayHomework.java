package support;

public class ArrayHomework {
    public String myname;
    public int array2;
    public boolean lesson;
    public static void main(String[] args) {
        String[] myname = {"Tetiana", "Hnatiuk"};
        System.out.println(myname[0]);

        int[] array2 = new int[3];
        array2[0] = 5;
        array2[1] = 3;
        array2[2] = 8;
        System.out.println(array2[2]);

        boolean[] lesson = new boolean[10];
       for ( int i = 0; i < lesson.length; i++) {
           System.out.println(lesson [i]);
       }




    }
    }

