package onboarding;

public class Problem4 {

    public static String solution(String word) {

        String answer = "";
        if (wordLengthCheck(word) == true) {
            for (int i = 0; i < word.length(); i++) {
                answer += replaceWord(word.charAt(i));
            }
        }


        return answer;
    }

    private static boolean wordLengthCheck(String word) {
        char[] chars = word.toCharArray();
        if (!(chars.length >= 1 && chars.length <= 1000)) {
            return false;
        }
        return true;
    }

    private static boolean wordUpperCheck(char word) {

        /**
         * word의 값이 대문자 인지 판단
         */

        if (word >= 'A' && word <= 'Z') {
            return true;
        }
        return false;
    }

    private static char replaceWord(char word) {

        /**
         * 파라미터로 넘어온 값이 대문자일 경우
         */
        if (wordUpperCheck(word)) {
            return (char) ('Z' - (word - 'A'));
        }
        /**
         * 파라미터로 넘어온 값이 공백일 경우
         */
        else if (word == ' ') {
            return ' ';
        }
        /**
         * 파라미터로 넘어온 값이 소문자일 경우
         */
        else {
            return (char) ('z' - (word - 'a'));
        }

    }

}