package timeComplexity;
import java.util.Arrays;
import java.util.Scanner;
public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 수의 개수 N 입력
        int N = scanner.nextInt();
        // N개의 수를 저장할 배열 생성
        int[] numbers = new int[N];
        // N개의 수 입력
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }
        // 배열 정렬
        // Arrays.sort는 기본적으로 배열을 오름차순으로 정렬하지만, 다른 정렬 기준을 사용할 수도 있습니다
        Arrays.sort(numbers);
        // 정렬된 수 출력
        for (int i = 0; i < N; i++) {
            System.out.println(numbers[i]);
        }
    }
}
