import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s1, s2, s3;
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        try {
            if (s1 + s2 < s3) {
                throw new IlligalTriangleException("Error");

            } else if (s1 + s3 < s2) {
                throw new IlligalTriangleException("Error");
            } else if (s2 + s3 < s1) {
                throw new IlligalTriangleException("Error");

            }
        } catch (IlligalTriangleException s) {
            System.out.println(s.getMessage());

        }


    }
}
