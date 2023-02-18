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
            sum += inputList.get(1) % 10;
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
        int leftPobiSum = sumLeft(pobi);
        int leftCrongSum = sumLeft(crong);
        int leftSumMax = Math.max(leftPobiSum, leftCrongSum);

        int leftPobiMulti = multiLeft(pobi);
        int leftCrongMulti = multiLeft(crong);
        int leftMultiMax = Math.max(leftPobiMulti, leftCrongMulti);

        int totalLeftMax = Math.max(leftSumMax, leftMultiMax);

        return leftPobiSum;


    }
}