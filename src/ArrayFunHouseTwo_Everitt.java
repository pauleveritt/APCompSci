class ArrayFunHouseTwo_Everitt {
    static boolean goingUp(int[] numArray) {
        for (int upper = numArray.length - 1; upper > 0; upper--) {
            if (numArray[upper - 1] > numArray[upper]) {
                return false;
            }
        }
        return true;
    }

    static boolean goingDown(int[] numArray) {
        for (int i = numArray.length - 1; i > 0; i--) {
            int current = numArray[i];
            int next = numArray[i - 1];
            if (current >= next) {
                return false;
            }
        }
        return true;
    }

}
