import java.util.Scanner;

public class Result extends Calculator{
    public static void main(String [] rgs){
        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1 add");
        System.out.println("2 sub");
        System.out.println("3 mul");
        System.out.println("4 div");
        int choise = sc.nextInt();

        if(choise == 1){
            c.add();
        }
        if(choise == 2){
            c.sub();
        }
        if(choise == 3){
            c.mul();
        }
        if(choise == 4){
            c.div();
        }

    }
}