import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String txt = console.nextLine();
        boolean havelove[] = {false, false, false, false};
        char checker[] = {'l', 'o', 'v', 'e'};

        for (int i = 0; i < checker.length; i++) {
            for (int j = 0; j < txt.length(); j++) {
                if (txt.charAt(j) == checker[i]) {
                    havelove[i] = true;
                    break;
                }
            }
        }

        boolean cc = true;
        for (int i = 0; i < havelove.length; i++) {
            if (havelove[i] == false) {
                cc = false;
                break;
            }
        }

        if (cc) {
            System.out.println("LOVE");
        } else {
            System.out.println("NO");
        }
    }
}
