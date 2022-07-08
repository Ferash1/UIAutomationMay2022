package javaBasics.justBasics;

public class ClassN_ForCallingMethod {
    public static void main(String[] args) {
        ClassF_IfElse1 classFIfElse1 = new ClassF_IfElse1();
        System.out.println(classFIfElse1.DisplayMonthName(9));
        System.out.println(classFIfElse1.DisplayMonthName(8));

        System.out.println(EnumForCars.RANGEROVER);
        System.out.println(EnumForCars.MERCEDEZBENZ);
        System.out.println(EnumForCars.BMW);
    }
}
