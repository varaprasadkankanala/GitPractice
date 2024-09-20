//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;
 class Main {
    public static void main(String[] args ){

        Scanner s = new Scanner(System.in);
        System.out.println("enter the marks");
        int marks = s.nextInt();
        if (marks >= 35&& marks <100)

        {
            System.out.println("pass");
         }
        else {
            System.out.println("fail");

             }



    }
}