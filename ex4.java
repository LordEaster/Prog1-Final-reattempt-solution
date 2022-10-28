import java.util.Scanner;

public class ex4 {
    public static int board[][] = { {1,0,-1,0,1},
                                    {0,2,3,2,0},
                                    {1,-3,5,-3,1},
                                    {0,2,3,2,0},
                                    {1,0,-1,0,1}  };

    public static int cal_score(int axis[][]) {
        int score = 0;

        for (int i = 0; i < axis.length; i++) {
            if (axis[i][0] < board.length && axis[i][1] < board[i].length && axis[i][0] >= 0 && axis[i][1] >= 0)  {
                score += board[axis[i][0]][axis[i][1]];
            } else {
                score -= 5;
            }
        }

        return score;
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();

        int axis[][] = new int[n][2];

        for (int i = 0; i < axis.length; i++) {
            for (int j = 0; j < axis[i].length; j++) {
                axis[i][j] = console.nextInt();
            }
        }

        System.out.println(cal_score(axis));
    }
}
