package onboarding;

import java.util.*;

public class Problem6 {

    public static List<String> solution(List<List<String>> forms) {
        Map<String, String> store = new HashMap<>();


        return forms.get(0);

    }

    private static boolean check(String firstName, String compareName){

        for (int i = 0; i < firstName.length(); i++) {
            for (int j = 0; j < compareName.length(); j++) {
                /**
                 * subString(int n, int m) 인덱스를 기준으로, n에서 m까지 반환한다.
                 * 예 : string s = "shin";
                 * s.subString(1,3) = "hi" 가 반환
                 */
                if(firstName.substring(i, i+2).equals(compareName.substring(j, j+2))){
                    return true;
                }
            }
        }
        /**
         * 중복되는 닉네임이 없어, 반환하지 않아도됨.
         */
        return false;

    }
}