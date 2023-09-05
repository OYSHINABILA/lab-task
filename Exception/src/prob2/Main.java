package prob2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a= new int[1000];
        for (int i=0;i<1000;i++){
            a[i]= (int)(Math.random()*1000);

        }

        Scanner sc=new Scanner(System.in);
        int ab = sc.nextInt();
        int f=0;
        try {
            if(ab>=1000){
                throw new OutOfBound("Error");
            }
        }catch (OutOfBound o){
            System.out.println(o.getMessage());


        }
    }
}
