import java.util.Scanner;

public class Minitest01 {


    public static boolean primeNumberCheck(int prime)
    {
        if (prime < 2) return false;
        if (prime == 2) return true;

        for (int i = 2; i <= prime/2; i++)
        {
            if (prime % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = input.nextInt();

        String str = "";

        for (int i = 2; i < n;i++)
        {
            if (primeNumberCheck(i))
            {
                str += i + " ";
            }
        }
        System.out.println("Các số nguyên tố nhỏ hơn "+n+" : " + str);

    }
}
