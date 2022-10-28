import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();

        int score[] = new int[n];
        int max = 0;

        for (int i = 0; i < score.length; i++) {
            score[i] = console.nextInt();

            if (i == 0) {
                max = score[i];
            } else if (score[i] > max) {
                max = score[i];
            }
        }

        int max_count = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] == max) {
                max_count++;
            }
        }

        System.out.printf("%d\n%d",max,max_count);
    }
}