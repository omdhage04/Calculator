import java.util.Scanner;

public class Calculator implements Features {
    @Override
    public void add (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st element to add ");
        int a = sc.nextInt();
        System.out.println("Enter the 1st element to add ");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("addition of "+a+" and "+b+" is "+c);
        sc.close();
    }
      @Override
    public void sub (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st element to add ");

        int a = sc.nextInt();
        System.out.println("Enter the 1st element to add ");

        int b = sc.nextInt();
        int c = a-b;
        System.out.println("Substraction of "+a+" and "+b+" is "+c);
        sc.close();
    }
      @Override
    public void mul (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st element to add ");

        int a = sc.nextInt();
        System.out.println("Enter the 1st element to add ");

        int b = sc.nextInt();
        int c = a*b;
        System.out.println("Multiplication  of "+a+" and "+b+" is "+c);
        sc.close();
    }
      @Override
    public void div (){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the 1st element to add ");
        int a = sc.nextInt();
        System.out.println("Enter the 1st element to add ");

        int b = sc.nextInt();
        int c = a/b;
        System.out.println("Division of "+a+" and "+b+" is "+c);
        sc.close();
    }
}
