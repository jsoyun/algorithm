package 리트코드;

public class MaximunProfitOfOperatingACentennialWheel1599 {

    //회전이 한바퀴가 아니라 움직임임

    public int minOperationMaxProfit(int[] customers, int boardingCost, int runningCost) {

        int n = customers.length;
        //최대 이익 추적하기 위한 변수
        int maxProfit = -1;
        // 최대 이익을 내는 최적의 회전 수를 추적하기 위한 변수
        int bestRotation = -1;
        // 현재 대기 중인 고객 수
        int currentCustomers = 0;
        int currentProfit = 0;
        int totalRotation = 0;


        //고객 배열 순회하며 각 회전마다의 이익을 계산
        for (int i = 0; i < n; i++) {
            //현재 대기 중인 고객 수에 새로운 고객을 추가
            currentCustomers += customers[i];
            totalRotation = i + 1; //현재 회전수
            int customersBoarded = Math.min(4, currentCustomers);
            //탑승한 고객 수를 대기 고객에서 차감
            currentCustomers -= customersBoarded;
            //현재 이익 계산
            currentProfit += customersBoarded * boardingCost - runningCost;

            //최대 이익을 갱신하고 최적의 회전 수를 저장
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
                bestRotation = totalRotation;
            }

        }

        //고객 배열을 모두 순회한 후 추가 회전을 고려하기 위한 변수 = 다음 회전 수란 뜻
        int remainingRotations = n + 1;
        //대기 중인 고객이 있는 동안 계속 회전하며 이익을 계산
        while (currentCustomers > 0) {
            totalRotation = remainingRotations; //추가 회전수
            //currentCustomers 이 달라지니까 다시 계산해야함
            int customersBoarded = Math.min(4, currentCustomers); //탑승 가능한 최대 고객 수는 4명
            currentCustomers -= customersBoarded; //탑승한 고객 수를 대기 고객 수에서 차감
            currentProfit += customersBoarded * boardingCost - runningCost; //현재 이익 계산

            //최대 이익을 갱신하고 최적의 회전 수를 저장
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
                bestRotation = totalRotation;
            }

            remainingRotations++; //다음 추가 회전을 고려

            //양수 이익을 낼 수 있는 경우 최적의 회전 수를 반환, 그렇지 않으면 -1을 반환


        }
        return maxProfit > 0 ? bestRotation : -1;


    }

    public static void main(String[] args) {
        MaximunProfitOfOperatingACentennialWheel1599 cw = new MaximunProfitOfOperatingACentennialWheel1599();


        int[] customerscage = {8, 3}; // 예시 고객 배열
        int boardingCostcase = 5; // 탑승 비용
        int runningCostcase = 6; // 회전 비용

        // 결과 출력
        System.out.println(cw.minOperationMaxProfit(customerscage, boardingCostcase, runningCostcase));
    }

}
