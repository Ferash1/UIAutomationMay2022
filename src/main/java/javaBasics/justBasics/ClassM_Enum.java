package javaBasics.justBasics;

public class ClassM_Enum {
    enum PhoneType {
        IPHONE,
        SAMSUNG,
        HTC,
        NOKIA;
    }

    public static void main(String[] args) {
        System.out.println(PhoneType.IPHONE); //This will printout "IPHONE"}
        System.out.println(PhoneType.HTC);
        System.out.println(PhoneType.SAMSUNG);
        System.out.println(PhoneType.NOKIA);
    }

    }

