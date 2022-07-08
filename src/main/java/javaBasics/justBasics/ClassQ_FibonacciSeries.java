package javaBasics.justBasics;

public class ClassQ_FibonacciSeries {
    public static void main(String[] args)
    {
        int n1=1,n2=2,n3,i,count=9;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;

        }

    }}






