import java.util.Scanner;
public class lab2inf {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numb = in.nextInt();// BigDecimal
        final int a[] = new int [7];
        for (int i = 0; i < 7; ++i){
            a[i] = numb % 10;
            numb /= 10;
        }
        int s1 = (a[0] + a[2] + a[4] + a[6]) % 2;
        int s2 = (a[0] + a[1] + a[4] + a[5]) % 2;
        int s3 = (a[0] + a[1] + a[2] + a[3]) % 2;
        System.out.printf("s1 = %d\ns2 = %d\ns3 = %d\n",s1,s2,s3);
        int sumFinal = s1 * 100 + s2 * 10 + s3;
        if (sumFinal == 0) System.out.println("Error not found");
        else if(sumFinal == 1) System.out.println("Error: r3");
        else if(sumFinal == 10) System.out.println("Error: r2");
        else if(sumFinal == 11) System.out.println("Error: i3");
        else if(sumFinal == 100) System.out.println("Error: r1");
        else if (sumFinal == 101) System.out.println("Error: i2");
        else if (sumFinal == 110) System.out.println("Error: i1");
        else System.out.println("Error: i4");

    }
}
