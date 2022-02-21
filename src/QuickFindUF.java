import edu.princeton.cs.algs4.StdOut;

public class QuickFindUF {
    private static int [] ids;
    public QuickFindUF(int num){
        ids=new int[num];
        for(int i=0;i<num;i++){
            ids[i]=i;
        }
    }

    public boolean connected(int p,int q){
        return ids[p]==ids[q];
    }

    public void union (int p,int q){
        int pid=ids[p];
        int qid=ids[q];
        for(int i=0;i<ids.length;i++){
            if(ids[i]==pid){
                ids[i]=qid;
            }
        }
    }


    public static void main(String[] args) {
        QuickFindUF qf=new QuickFindUF(5);
        qf.union(0,1);
        qf.union(1,4);
        StdOut.println(qf.connected(0,3));

    }
}
