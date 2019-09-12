class MyArrays {

    public int myArrayAmount(int[] inputArray) {

        int result = 0;
        for (int e : inputArray) {
            result += e;
        }
        return result;
    }

    public int[] myArraySort(int[] inputArray) {

        int even = 0;
        int odd = 0;

        int evenCounter = 0;
        int oddCounter = 0;

        for (int value : inputArray) {
            if (value % 2 == 0) even++;
            else odd++;
        }

        int[] arrEven = new int[even];
        int[] arrOdd = new int[odd];

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 0) {
                arrEven[evenCounter] = inputArray[i];
                evenCounter++;
            } else {
                arrOdd[oddCounter] = inputArray[i];
                oddCounter++;
            }
        }

        evenCounter = 0;
        oddCounter = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (i < arrEven.length) {
                inputArray[i] = arrEven[evenCounter];
                evenCounter++;
            } else {
                inputArray[i] = arrOdd[oddCounter];
                oddCounter++;
            }
        }
        return inputArray;
    }
}