package Graph;

public class test {

    static int[][] adj=new int[4][4];
    test() {

        for (int i = 0; i <= 3; i++) {
            for(int j=0;j<=3;j++){
                adj[i][j]=0;
            }
        }
    }

    public void addEdge(int u,int v){
        adj[u][v]=1;
    }

    public static void main(String[] args){

        test t=new test();
        t.addEdge(0,1);
        t.addEdge(0,2);
        t.addEdge(1,2);
        t.addEdge(2,3);

        for (int i = 0; i <= 3; i++) {
            for(int j=0;j<=3;j++){
                System.out.print(adj[i][j]+"");
            }
            System.out.println();
        }
    }
}
