public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) { // The method takes two indices, i and j, as its second and third parameters, respectively. 
    // It returns the length of the shortest path from vertex i to vertex j. 
    // If no such path exists, the method returns -1. 
    // A length of a path is the number of edges it contains. 
        if (i == j){
            return 0;
        }
        int n = m.length;
        int[] dist = new int[n];
        for (int k = 0; k < n; k++) {
            dist[k] = -1; // Initialize distances to -1 (unreachable)
        }
        int[] queue = new int[n];
        int head = 0; // head index for the queue
        int tail = 0; // tail index for the queue
        queue[tail++] = i;
        dist[i] = 0;
        while (head < tail) { // While there are vertices to process
            int current = queue[head++]; 
            for( int neighbor = 0; neighbor<n;neighbor++){ 
                if (m[current][neighbor] == 1 && dist[neighbor] == -1){ // If there's an edge and the neighbor hasn't been visited
                    dist[neighbor] = dist[current] + 1; 
                    queue[tail++] = neighbor;
                    if (neighbor == j){
                        return dist[neighbor]; 
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}