import java.util.Arrays;

public class QuickFind {

    private final int[] id;

    public QuickFind(int N){
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q){
        return id[p] == id[q];
    }

    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        System.out.println("================================START======================================");
        System.out.println("ID Array : "+Arrays.toString(id));
        for (int i = 0; i < id.length; i++) {
            if(id[i] == pid) id[i] = qid;
        }
        System.out.println("ID Array : "+Arrays.toString(id));
        System.out.println("================================END======================================\n");
    }

}
