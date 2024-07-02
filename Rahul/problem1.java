
// Problem1

// package Rahul;


import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        // length of a and b
        System.out.println(a.length() + " " +b.length());

        // whole string
        System.out.println(a+b);
        
        if (a.length() > 0 && b.length() >0) {
            String aSwap = b.charAt(0)+a.substring(1); //string b ka 1st char + remaing a
            String bSwap = a.charAt(0)+b.substring(1); //string a ka 1st char + remaing b           
            
            System.out.println(aSwap+ " "+bSwap);
        }else {
            System.out.println(a+" "+b); 
            // if use gives 0value then input value print
            //agar if statement nahi lagaya to thread aaiga
        }
        return;
    }
    
}
