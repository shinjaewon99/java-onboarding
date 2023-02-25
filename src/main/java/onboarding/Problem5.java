package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem5 {

    private static final int 오만원 = 50000;
    private static final int 만원 = 10000;
    private static final int 오천원 = 5000;
    private static final int 천원 = 1000;
    private static final int 오백원 = 500;
    private static final int 백원 = 100;
    private static final int 오십원 = 50;
    private static final int 십원 = 10;
    private static final int 일원 = 1;

    public static List<Integer> solution(int money) {

        int[] moneyList = {오만원, 만원, 오천원, 천원, 오백원, 백원, 오십원, 십원, 일원};

        List<Integer> result = new ArrayList<>();

        // 검증
        if (moneyCheck(money)) {
            result = moneyWallet(money, moneyList);
        }

        return result;

    }

    private static List<Integer> moneyWallet(int money, int [] moneyList){

        List<Integer> wallet = new ArrayList<>();

        for (int i = 0; i < moneyList.length; i++) {
            // 각 money가 사용된 갯수를 세어준다.
            int moneyCount = money/moneyList[i];

            // 위에서 계산하고 남은 잔돈을 담아준다.
            money %= moneyList[i];
            wallet.add(moneyCount);
        }
        return wallet;
    }

    private static boolean moneyCheck(int money){
        if(!(money >= 1 && money <=1000000)){
            return false;
        }
        return true;
    }

   /* public enum Money{
        오만원(50000),
        만원(10000),
        오천원(5000),
        천원(1000),
        오백원(500),
        백원(100),
        오십원(50),
        십원(10),
        일원(1);

        private int money;

        Money(int money) {
            this.money = money;
        }
    }*/

}