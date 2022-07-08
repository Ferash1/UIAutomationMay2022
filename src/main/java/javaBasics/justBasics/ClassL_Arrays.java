package javaBasics.justBasics;

public class ClassL_Arrays {
    public static void main(String[] args) {
        String[] languages = {"Spanish", "English", "Russian", "Polish", "Portuguese", "Nigeria"};
        System.out.println(languages[0]);
        System.out.println(languages[5]);
//        System.out.println(languages[6]);

        //Using traditional for loop to get all the arrays
        for (int i = 0; i < 6; i++) {
            System.out.println(languages[i]);
        }

       //Using for-each
        for (String t : languages) {
            System.out.println(t);
        }

        System.out.println(languages.length);

       //Array of integers

        int[] myNumber = {5, 10, 15, 20, 25} ;
        for (int a: myNumber) {
            System.out.println(a);
        }
    }
}

