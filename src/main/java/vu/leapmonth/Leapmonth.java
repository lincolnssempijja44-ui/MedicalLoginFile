package vu.leapmonth;


import java.util.Scanner;

public class Leapmonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for year and month
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        // Apply leap month logic
        boolean isLeapmonth = (year % 4 == 0);
        isLeapmonth = isLeapmonth && (month % 100 != 0);
        isLeapmonth = isLeapmonth || (month % 400 == 0);

        // Display result
        if (isLeapmonth) {
            System.out.println("Month " + month + " of year " + year + " is a Leap Month.");
        } else {
            System.out.println("Month " + month + " of year " + year + " is NOT a Leap Month.");
        }

        sc.close();
    }
}