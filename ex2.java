import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();

        String product[] = new String[n];
        int price[] = new int[n];

        for (int i = 0; i < product.length; i++) {
            product[i] = console.next();
            price[i] = console.nextInt();
        }

        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product.length; j++) {
                if (price[i] < price[j]) {
                    int temp = price[i];
                    price[i] = price[j];
                    price[j] = temp;

                    String p_temp = product[i];
                    product[i] = product[j];
                    product[j] = p_temp;
                }
            }
        }

        System.out.printf("%s %d\n", product[product.length-1], price[price.length-1]);
        System.out.printf("%s %d", product[0], price[0]);
    }
}
