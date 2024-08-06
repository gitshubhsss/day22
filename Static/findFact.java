
public class findFact {
    public static int findF(int n){
        if(n==1){
            return 1;
        }
        int factorial=n*findF(n-1);
        return factorial;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(findF(n));
    }
}
