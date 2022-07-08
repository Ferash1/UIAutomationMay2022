package javaBasics.justBasics;

public class ClassR_PrimeNumbers {
    public static void main(String[] args) {
        int i;
        int num;
        //Empty String
        StringBuilder primeNumbers = new StringBuilder();

        for (i = 1; i <= 20; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                //Appended the Prime number to the String
                primeNumbers.append(i).append(" ");
            }
        }
        System.out.println("Prime numbers between 1 to 20 are :");
        System.out.println(primeNumbers);
    }
}



