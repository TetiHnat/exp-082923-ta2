package support;

public class ConditionalJava {
    public static void main(String[]args){
        int x= 5;
        int y = 8;
        int c = 10;

        if (x == 5 ){
        } else
            if (x > 1){
                System.out.println("x > 1");
            }else {
                System.out.println("No matches");
            }
            switch (y){
                case  3:
                    System.out.println("y=4");
                    break;
                case 7:
                    System.out.println("y=7");
                    break;
                default:
                    System.out.println("No matches");
            }
            String[] array0fStrings = new String[3];
            System.out.println(array0fStrings.length);

            for (int i=0;i<array0fStrings.length;i++){
                System.out.println("array0fString[i]");
            }
            System.out.println("---------");
    }
}
