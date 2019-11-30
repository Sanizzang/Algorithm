import java.util.*;
import java.io.*;

class H_1939{
        private int next, weight;

        H_1939(int next, int weight){
                this.next = next;
                this.weight = weight;
        }

        public int getNext() { return this.next; }
        public int getWeight() { return this.weight; }

}

class Main{
        private static int N, M;
        private static int start, dest;

        public static boolean dfs(int now, int limit, List<H_1939>[] map, boolean[] visited){
                if(now == dest) return true;    
                if(visited[now]) return false;
                visited[now] = true;
            
                for(H_1939 pair : map[now]){
                        int next = pair.getNext();
                        int weight = pair.getWeight();

                        if(weight >= limit && dfs(next, limit, map, visited))
                                return true;
                }

                return false;
        }

        public static void main(String[] args) throws Exception{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

                StringTokenizer st = new StringTokenizer(br.readLine());

                N = Integer.parseInt(st.nextToken());
                M = Integer.parseInt(st.nextToken());

                List<H_1939>[] map = new ArrayList[N+1];
                for(int i = 1 ; i <= N ; i++){
                        map[i] = new ArrayList<>();
                }

                int maxCost = 0;
                for(int i = 1 ; i <= M ; i++){
                        st = new StringTokenizer(br.readLine());
                        int a = Integer.parseInt(st.nextToken());
                        int b = Integer.parseInt(st.nextToken());
                        int c = Integer.parseInt(st.nextToken());

                        map[a].add(new H_1939(b, c));
                        map[b].add(new H_1939(a, c));
                        maxCost = Math.max(maxCost, c);
                }

                st = new StringTokenizer(br.readLine());

                start = Integer.parseInt(st.nextToken());
                dest = Integer.parseInt(st.nextToken());

                int left = 1, right = maxCost;
                while(left <= right){
                        int mid = (left + right) / 2;

                        if(dfs(start, mid, map, new boolean[N+1]))
                                left = mid + 1;
                        else
                                right = mid - 1;

                }

                bw.write(right + "\n");

                bw.flush();

                br.close();
                bw.close();
        }

}

