import java.util.*;

public class Main {
    public static int minCostToReachEnd(String S, int A, int B, int C, int Y) {
        int N = S.length();
        int MOD = 1000000007;

        // Initialize dp array with infinity
        long[] dp = new long[N + 1];
        for (int i = 0; i <= N; i++) {
            dp[i] = Long.MAX_VALUE;
        }
        dp[0] = 0;

        // Define the cost dictionary
        int[] cost = new int[3];
        cost['a' - 'a'] = A;
        cost['b' - 'b'] = B;
        cost['c' - 'c'] = C;

        for (int i = 0; i < N; i++) {
            // First operation: move to i + 1
            if (i + 1 <= N) {
                dp[i + 1] = Math.min(dp[i + 1], dp[i] + cost[S.charAt(i) - 'a']);
            }

            // Second operation: move to i + 3
            if (i + 3 <= N) {
                dp[i + 3] = Math.min(dp[i + 3], dp[i] + Y);
            }
        }

        return (int) (dp[N] % MOD);
    }

    public static void main(String[] args) {
        String S = "abab";
        int A = 4;
        int B = 3;
        int C = 3;
        int Y = 6;

        System.out.println(minCostToReachEnd(S, A, B, C, Y)); // Output: 6
    }
}


//import java.util.*;
//import static java.util.stream.Collectors.toList;
//
//public class Main {
//    public static int get_ans(int N, int M, int three, List<List<Integer>> E) {
//        // Graph representation
//        Graph graph = new Graph(N);
//        List<Edge> edges = new ArrayList<>();
//
//        for (List<Integer> edgeData : E) {
//            int u = edgeData.get(0);
//            int v = edgeData.get(1);
//            int w = edgeData.get(2);
//            graph.addEdge(u, v, w);
//            edges.add(new Edge(u, v, w));
//        }
//
//        int minLongestPath = Integer.MAX_VALUE;
//
//        for (Edge edge : edges) {
//            graph.removeEdge(edge.src, edge.dest, edge.weight);
//            for (Edge newEdge : edges) {
//                if (newEdge.src != edge.src || newEdge.dest != edge.dest || newEdge.weight != edge.weight) {
//                    graph.addEdge(newEdge.src, newEdge.dest, newEdge.weight);
//                    int longestPath = 0;
//                    for (int i = 0; i < N; i++) {
//                        for (int j = i + 1; j < N; j++) {
//                            int pathLength = graph.dijkstra(i, j);
//                            if (pathLength > longestPath) {
//                                longestPath = pathLength;
//                            }
//                        }
//                    }
//                    if (longestPath < minLongestPath) {
//                        minLongestPath = longestPath;
//                    }
//                    graph.removeEdge(newEdge.src, newEdge.dest, newEdge.weight);
//                }
//            }
//            graph.addEdgeBack(edge.src, edge.dest, edge.weight);
//        }
//
//        return minLongestPath;
//    }
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        int N = Integer.parseInt(scan.nextLine().trim());
//        int M = Integer.parseInt(scan.nextLine().trim());
//        int three = Integer.parseInt(scan.nextLine().trim());
//
//        List<List<Integer>> E = new ArrayList<>(M);
//        for(int i = 0; i < M; i++) {
//            E.add(
//                    Arrays.asList(scan.nextLine().trim().split(" "))
//                            .stream().map(s -> Integer.parseInt(s)).collect(toList())
//            );
//        }
//
//        int result = get_ans(N, M, three, E);
//
//        System.out.println(result);
//    }
//
//    static class Edge {
//        int src, dest, weight;
//
//        Edge(int src, int dest, int weight) {
//            this.src = src;
//            this.dest = dest;
//            this.weight = weight;
//        }
//    }
//
//    static class Graph {
//        int V;
//        LinkedList<Edge>[] adjList;
//
//        Graph(int V) {
//            this.V = V;
//            adjList = new LinkedList[V];
//            for (int i = 0; i < V; i++) {
//                adjList[i] = new LinkedList<>();
//            }
//        }
//
//        void addEdge(int src, int dest, int weight) {
//            Edge edge = new Edge(src, dest, weight);
//            adjList[src].add(edge);
//            edge = new Edge(dest, src, weight);
//            adjList[dest].add(edge);
//        }
//
//        int dijkstra(int src, int dest) {
//            PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));
//            int[] dist = new int[V];
//            Arrays.fill(dist, Integer.MAX_VALUE);
//            pq.add(new Edge(src, -1, 0));
//            dist[src] = 0;
//
//            while (!pq.isEmpty()) {
//                Edge edge = pq.poll();
//                int u = edge.src;
//
//                for (Edge e : adjList[u]) {
//                    int v = e.dest;
//                    int weight = e.weight;
//                    if (dist[u] + weight < dist[v]) {
//                        dist[v] = dist[u] + weight;
//                        pq.add(new Edge(v, -1, dist[v]));
//                    }
//                }
//            }
//            return dist[dest];
//        }
//
//        void removeEdge(int src, int dest, int weight) {
//            adjList[src].removeIf(edge -> edge.dest == dest && edge.weight == weight);
//            adjList[dest].removeIf(edge -> edge.src == src && edge.weight == weight);
//        }
//
//        void addEdgeBack(int src, int dest, int weight) {
//            addEdge(src, dest, weight);
//        }
//    }
//}

