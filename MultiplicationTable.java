public class MultiplicationTable {

    public static void main(String[] args) {

        System.out.println("Multiplication Table");

        System.out.print("    ");

        for (int j = 1; j <= 9; j++)
            System.out.print("   " + j);

        System.out.println("\n — — — — — — — — — — — — — — — —— — — — — — — — — — — — —");

        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

    }

}


/* Alignment:
printf("%4d\n", 1);
printf("%4d\n", 12);
printf("%4d\n", 123);
printf("%4d\n", 1234);

Will give you:
___1
__12
_123
1234
(with spaces instead of underscores)
 */