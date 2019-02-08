public class ArrayFunHouseTwoRunner_Everitt {
    public static void main(String[] args) {
        int[] one = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] two = {1, 2, 3, 9, 11, 20, 30};
        int[] three = {9, 8, 7, 6, 5, 4, 3, 2, 0, -2};
        int[] four = {3, 6, 9, 12, 15, 18, 21, 23, 19, 17, 15, 13, 11, 10, 9, 6, 3, 2, 1, 0};
        System.out.println("is going Up? " + ArrayFunHouseTwo_Everitt.goingUp(one));
        System.out.println("is going Up? " + ArrayFunHouseTwo_Everitt.goingUp(two));
        System.out.println("is going Up? " + ArrayFunHouseTwo_Everitt.goingUp(three));
        System.out.println("is going Up? " + ArrayFunHouseTwo_Everitt.goingUp(four));

        System.out.println("\n");

        System.out.println("\n");
        System.out.println("is going Down? " + ArrayFunHouseTwo_Everitt.goingDown(one));
        System.out.println("is going Down? " + ArrayFunHouseTwo_Everitt.goingDown(two));
        System.out.println("is going Down? " + ArrayFunHouseTwo_Everitt.goingDown(three));
        System.out.println("is going Down? " + ArrayFunHouseTwo_Everitt.goingDown(four));
    }
}
