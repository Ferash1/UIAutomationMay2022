package javaBasics.justBasics;

public class ClassJ_SwitchDaysOfWeek {
    public static void main(String[] args) {
        System.out.println("what is today?");
        int weekNumber = 7;
        switch (weekNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("please enter value between 1 and 7");
        }
    }
}
