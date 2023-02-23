package onboarding;

public class Problem3 {
    public static int solution(int number) {

        // 검증
        validation(number);
        return threeSixNine(number);
    }

    private static int threeSixNine(int number) {
        int count = 0;
        for (int i = 0; i <= number; i++) {
            int check = i % 10;
            int threeSixNine = i / 10;
            if (threeSixNine == 3 || threeSixNine == 6 || threeSixNine == 9) {
                count++;
            }
            if (check == 3 || check == 6 || check == 9) {
                count++;
            }
        }
        return count;
    }

    private static Boolean validation(int number) {
        /**
         * 제한 사항에 따라 number의 숫자 범위를 지정해주었다.
         */
        if(!(number >=1 && number <=10000)){
            return false;
        }
        return true;
    }
}
