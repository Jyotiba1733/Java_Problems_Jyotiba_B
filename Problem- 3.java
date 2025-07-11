import java.util.Scanner;

public class ConditionalOddSeries
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (a): ");
        int a = scanner.nextInt();

        int n = (a % 2 == 0) ? a - 1 : a;

        System.out.print("Output: ");
        for (int i = 0; i < n; i++) 
        {
            int odd = 2 * i + 1;
            System.out.print(odd);
            if (i < n - 1) 
            {
                System.out.print(", ");
            }
        }
    }
}
