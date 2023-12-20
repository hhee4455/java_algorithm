package java_DS.sliding;

import java.util.Scanner;

public class Test_12891 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // DNA 문자열의 길이(N) 및 비밀번호 부분문자열의 길이(M)를 입력받습니다.
        int N = sc.nextInt();
        int M = sc.nextInt();

        // DNA 문자열을 입력받습니다.
        String inputString = sc.next();
        char[] charArray = inputString.toCharArray();

        // DNA 문자열을 저장할 배열을 초기화합니다.
        char[] resultArray = new char[N];
        for (int i = 0; i < N; i++) {
            resultArray[i] = charArray[i];
        }

        // 각 문자(A, C, G, T)의 최소 등장 횟수를 입력받습니다.
        int[] minOccurrences = new int[4];
        minOccurrences[0] = sc.nextInt(); // A
        minOccurrences[1] = sc.nextInt(); // C
        minOccurrences[2] = sc.nextInt(); // G
        minOccurrences[3] = sc.nextInt(); // T

        // 가능한 비밀번호의 개수를 계산하고 결과를 출력합니다.
        int passwordCount = countPossiblePasswords(resultArray, M, minOccurrences);
        System.out.println(passwordCount);
    }

    // 가능한 비밀번호의 개수를 계산하는 함수
    private static int countPossiblePasswords(char[] resultArray, int M, int[] minOccurrences) {
        int[] occurrences = new int[4];
        int passwordCount = 0;

        // 처음 윈도우에 대한 등장 횟수를 초기화합니다.
        for (int i = 0; i < M; i++) {
            char ch = resultArray[i];
            occurrences[getIndex(ch)]++;
        }

        // 첫 번째 윈도우가 조건을 만족하는지 확인합니다.
        if (checkOccurrences(occurrences, minOccurrences)) {
            passwordCount++;
        }

        // 슬라이딩 윈도우 기법을 사용하여 나머지 윈도우를 처리합니다.
        for (int i = M; i < resultArray.length; i++) {
            char outChar = resultArray[i - M];
            char inChar = resultArray[i];

            // 슬라이딩 윈도우를 업데이트하여 문자의 등장 횟수를 갱신합니다.
            occurrences[getIndex(outChar)]--;
            occurrences[getIndex(inChar)]++;

            // 현재 윈도우가 조건을 만족하는지 확인합니다.
            if (checkOccurrences(occurrences, minOccurrences)) {
                passwordCount++;
            }
        }

        return passwordCount;
    }

    // 문자에 대한 인덱스를 반환하는 함수
    private static int getIndex(char ch) {
        switch (ch) {
            case 'A':
                return 0;
            case 'C':
                return 1;
            case 'G':
                return 2;
            case 'T':
                return 3;
            default:
                return -1;
        }
    }

    // 문자의 등장 횟수가 주어진 최소 등장 횟수 이상인지 확인하는 함수
    private static boolean checkOccurrences(int[] occurrences, int[] minOccurrences) {
        for (int i = 0; i < 4; i++) {
            if (occurrences[i] < minOccurrences[i]) {
                return false;
            }
        }
        return true;
    }
}
