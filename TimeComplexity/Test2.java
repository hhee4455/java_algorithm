package TimeComplexity;

public class Test2 {
    public static void main(String[] args) {
        int N = 100000;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("연산회수 : " + cnt++);
        }
        for (int i = 0; i < N; i++) {
            System.out.println("연산회수 : " + cnt++);
        }
        for (int i = 0; i < N; i++) {
            System.out.println("연산회수 : " + cnt++);
        }
    }
}
