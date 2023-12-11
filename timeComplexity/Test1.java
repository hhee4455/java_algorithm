package timeComplexity;

public class Test1 {
    public static void main(String[] args) {
        int N = 1000000;
        int cnt = 0;
        for ( int i = 0 ; i < N ; i++){
            System.out.println("연산횟수 : " + cnt++);
        }
    }
}
