import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Введите размер фигуры: ");
        int n = kb.nextInt();


        //РОМБ
       /* for (int i = 0; i < n; i++)
        {

            for (int j = i; j < n; j++)
                System.out.print(" ");
                System.out.print("/");

            for (int j = 0; j < i*2 ; j++)
            System.out.print(" ");
                System.out.print("\\");
                 System.out.println();
        }

        for (int i = 0; i < n; i++)
        {

            for (int j = 0; j <= i; j++)
                System.out.print(" ");
                System.out.print("\\");
            for (int j = 0; j < (n-1-i)*2; j++)

            System.out.print(" ");
                System.out.print("/");

            System.out.println();
        }*/


        // ЗЕРКАЛЬНЫЕ ТРЕУГОЛЬНИКИ
        /*for (int i = n; i > 0; i--) {
            for (int j = n; j > i; --j)
                System.out.print(" ");
            for (int j = 0; j < i; j++)  {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i <= n; ++i){

            for (int j = n; j > i; --j)
                System.out.print(" ");

            for (int j = 0; j < i ; ++j)
                System.out.print("*");

            System.out.println();
        }*/


        //ПЕРЕВЕРНУТАЯ ПОЛОВИНА ТРЕУГОЛЬНИКА
        /*for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++)  {
                System.out.print("* ");
            }
            System.out.println();
        }*/


        // ПОЛОВИНА ТРЕУгОЛЬНИКА
        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/


        //КВАДРАТ

        for (int m = 0; m < n; m++) {
            if (m % 2 == 0) ;


            for (int k = 0; k < n; k++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if ((i + j) % 2 == 0) System.out.print("  ");
                        else System.out.print("  ");
                    }
                    for (int j = 0; j < n; j++) {
                        if ((i + j) % 2 == 0) System.out.print("+ ");
                        else System.out.print("- ");
                    }
                }

                System.out.println();

            }

        }
    }
}