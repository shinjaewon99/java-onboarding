package onboarding;


import java.util.Stack;

public class Problem2 {
    public static String solution(String cryptogram) {
        /**
         * push의 리턴값은 <E> 이고, add의 리턴값은 boolean이다.
         * stack 사용시 List에서 제공하는 add를 사용할수도있지만,
         * stack을 사용해서 코드를 작성하고 있다면 push를 사용하자.
         */
        String answer = "";

        Stack<Character> password = new Stack<>();

        char[] cryptogramChar = cryptogram.toCharArray();

        for (int i = 1; i < cryptogramChar.length; i++) {
            if(password.isEmpty()){
                password.push(cryptogramChar[0]);
            } else if (!password.contains(cryptogramChar[i])) {
                password.push(cryptogramChar[i]);
            }
        }

        for (Character character : password) {
            answer = String.valueOf(character);
        }

        return answer;

    }
}