import edu.princeton.cs.algs4.StdOut;

public class QuickUnionUF {
    private static int[] ids;
    private static int[] sz;
    public QuickUnionUF(int num){
        ids=new int[num];
        sz=new int[num];
        for (int i=0;i<num;i++){
            ids[i]=i;
            sz[i]=1;
        }
    }
    public int root (int node){
        while(node!=ids[node]){
            node=ids[node];
        }
        return node;
    }
    public boolean isConnected(int p,int q){
        return root(p)==root(q);
    }
    public void union(int p,int q){
        int i=root(p);
        int j=root(q);
        if(i==j) return;
        if(sz[i]<sz[j]){
            {
                ids[i]=j;
            }
        }
        else{
            ids[j]=i;
        }

    }
    public static void main(String[] args) {
        QuickUnionUF uf=new QuickUnionUF(5);
        uf.union(0,1);
        uf.union(1,4);
        StdOut.println(uf.isConnected(0,2));

    }
}
