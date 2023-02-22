package onboarding;


import java.util.Stack;

public class Problem2 {
    public static String solution(String cryptogram) {
        /**
         * push의 리턴값은 <E> 이고, add의 리턴값은 boolean이다.
         * stack 사용시 List에서 제공하는 add를 사용할수도있지만,
         * stack을 사용해서 코드를 작성하고 있다면 push를 사용하자.
         */

        Stack<Character> result = new Stack<>();

        /**
         * 제한사항에 따라 cryptogram은 길이가 1 이상 1000 이하인 문자열 검증,
         * 알파벳 소문자로만 이루어져 있는지 검증.
         */
        inputCheck(cryptogram);

        for (int i = 0; i < cryptogram.length(); i++) {
            // 초기 스택은 비어 있음으로, 값을 하나 담는다.
            if (result.isEmpty()) {
                result.add(cryptogram.charAt(i));
            } else {
                // 스택에 채웠던 맨위의 값이 cryptogram의 다음 값과 같다면 pop()을 해준다.
                if (result.peek() == cryptogram.charAt(i)) {
                    result.pop();
                } else {
                    result.push(cryptogram.charAt(i));
                }
            }
        }
        /**
         * 알파벳 소문자가 아니라면 제거
         */
        return String.valueOf(result).replaceAll("[^a-z]", "");

    }


    private static boolean inputCheck(String cryptogram) {

        if (!(cryptogram.length() >= 1 && cryptogram.length() <= 1000)) {
            return false;
        }

        for (int i = 0; i < cryptogram.length(); i++) {
            if(Character.isUpperCase(cryptogram.charAt(i))){
                return false;
            }
        }

        return true;
    }
}