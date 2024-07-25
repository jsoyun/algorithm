package 리트코드;

public class ParkingSystem {

    private int[] answer;
    private int[] parkingSpace;


    public ParkingSystem(int big, int medium, int small) {
        parkingSpace = new int[4];
        parkingSpace[1] = big;  //1
        parkingSpace[2] = medium; //1
        parkingSpace[3] = small; //0


    }

    public boolean addCar(int carType) { // 3 2 1 1


        if (parkingSpace[carType] == 0) {
            return false;
        } else {
            parkingSpace[carType]--;
            return true;
        }


    }


}

class test {
    public static void main(String[] args) {

        String[] input1 = {"ParkingSystem", "addCar", "addCar", "addCar", "addCar"};
        int[][] intput2 = {{1, 1, 0}, {1}, {2}, {3}, {1}};

        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        boolean b = parkingSystem.addCar(3);
        boolean b1 = parkingSystem.addCar(2);
        boolean b2 = parkingSystem.addCar(1);
        boolean b3 = parkingSystem.addCar(1);

        System.out.println("parkingSystem = " + parkingSystem);
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);


    }

}

