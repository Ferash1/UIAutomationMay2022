package javaBasics.justBasics;

public class ClassI_IfElseDaysOfWeek {
    //    private String displayWeek(int week) {
//
//    }

    public static void main(String[] args) {
        System.out.println("what is today?");
        int weekNumber = 7;

        if (weekNumber == 1) {
            System.out.println("Monday");

        } else if (weekNumber == 2) {
            System.out.println("Tuesday");


        } else if (weekNumber == 3) {
            System.out.println("Wednesday");


        } else if (weekNumber == 4) {
            System.out.println("Thursday");


        } else if (weekNumber == 5) {
            System.out.println("Friday");


        } else if (weekNumber == 6) {
            System.out.println("Saturday");


        } else if (weekNumber == 7) {
            System.out.println("Sunday");
        }
        else {
            System.out.println("Enter value between 1 and 7");
        }


    }
}