// Tower of Hanoi problem
import java.io.*;
import java.util.*;
class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            Hanoi obj = new Hanoi();
            int N;
            N = sc.nextInt();
            obj.moves = 0;
            obj.toh(N, 1, 3, 2);

            System.out.println(obj.moves);
        }
    }
}





// } Driver Code Ends


class Hanoi {
    public static long moves;

    public static void toh(int n, int from, int to, int aux) {
        if(n==1)
        {
            System.out.println("move disk 1 from rod "+from+ " to rod "+to);
            moves++;
            return;
        }
        toh(n-1,from,aux,to);
        System.out.println("move disk "+ n+ " from rod "+ from+ " to rod "+to);
        moves++;
        toh(n-1,aux,to,from);
    }
}
