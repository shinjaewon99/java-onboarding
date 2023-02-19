package onboarding;

import java.util.List;

class Problem1 {

    static int sumLeft(List<Integer> inputList) {
        int leftPage = inputList.get(0);
        int sum = 0;

        while (leftPage != 0) {
            // inputList.get(0); 로 변수를 사용하지 않는 이유는 파라미터로 들어오기때문에 값이 계속 초기화되서 들어온다.
            sum += leftPage % 10;
            leftPage/=10;
        }
        return sum;
    }
    static int sumRight(List<Integer> inputList) {
        int rightPage = inputList.get(1);
        int sum = 0;
        while (rightPage != 0) {
            sum += rightPage % 10;
            rightPage/=10;
        }
        return sum;
    }


    static int multiLeft(List<Integer> inputList) {
        int leftMulti = inputList.get(0);
        int multi = 1;
        while(leftMulti != 0) {
            int var;
            var = leftMulti % 10;
            multi *= var;
            leftMulti /= 10;
        }

        return multi;


    }
    static int multiRight(List<Integer> inputList){
        int leftMulti = inputList.get(1);
        int multi = 1;
        while(leftMulti != 0) {
            int var;
            var = leftMulti % 10;
            multi *= var;
            leftMulti /= 10;
        }

        return multi;
    }

    public static int solution(List<Integer> pobi, List<Integer> crong) {

        int leftPobiMax = Math.max(sumLeft(pobi), multiLeft(pobi));
        int rightPobiMax = Math.max(sumRight(pobi), multiRight(pobi) );


        int totalpobi = Math.max(leftPobiMax, rightPobiMax);



        int leftCrongMax = Math.max(sumLeft(crong), multiLeft(crong));
        int rightCrongMax = Math.max(sumRight(crong), multiRight(crong));

        int totalcrong = Math.max(leftCrongMax, rightCrongMax);

        if(!validate(pobi) || !validate(crong)){
            return -1;
        }

        return findWinner(totalpobi, totalcrong);
    }

    private static boolean validate(List<Integer> inputPages) {

        // 페이지가 순서대로 입력되었는지 검증
        if(inputPages.get(1) - inputPages.get(0) != 1){
            return false;
        }
        // 왼쪽 페이지는 홀수, 오른쪽 페이지는 짝수 인지 검증
        if(inputPages.get(0) % 2 == 0 || inputPages.get(1) % 2 !=0){
            return false;
        }

        if(inputPages.size() !=2){
            return false;
        }
        return true;
    }

    private static int findWinner(int pobiMax, int crongMax) {
        if (pobiMax > crongMax) {
            return 1;
        }

        if (pobiMax < crongMax) {
            return 2;
        }
        return 0;

    }

}