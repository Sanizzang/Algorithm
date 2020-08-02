/*
 * Date: 2020.08.02
 * Writer: Sanizzang
 */
import java.util.*;

public class Main{
    static int min = 10000;
    static int[] visited;
    static void makeOne(int N, int cnt){
        if(N == 1){
            min = Math.min(cnt, min);
            return;
        }
        if((N % 3 == 0) && (visited[N / 3] > cnt || visited[N / 3] == 0)){
            N /= 3;
            visited[N] = cnt + 1;
            makeOne(N, cnt + 1);
            N *= 3;
        }
        if((N % 2 == 0) && (visited[N / 2] > cnt || visited[N / 2] == 0)){
            N /= 2;
            visited[N] = cnt + 1;
            makeOne(N, cnt + 1);
            N *= 2;
        }
        if(visited[N - 1] > cnt || visited[N - 1] == 0){
            N -= 1;
            visited[N] = cnt;
            makeOne(N, cnt + 1);
        }
       
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int cnt = 0;
        visited = new int[N + 1];
        makeOne(N, cnt);
        System.out.println(min);
    }
}
/*
 * Description:
 *
 * First, I made visited array.
 * This array stores the number of times I divided the values.
 * If value is into function, Check this value whether divided three or two.
 * If the number of times you divided the value now is less than the value you divided before, replace it with a smaller number. 
 * Through this process, you will get the minimum value.
 *
 * By: Sanizzang
 */
