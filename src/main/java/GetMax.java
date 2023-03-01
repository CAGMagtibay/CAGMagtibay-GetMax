public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
        int maxVal = arr[0];                        // initialize max value variable to first value of arr

        for (int i = 0; i < arr.length; i++) {      // iterate through each arr element
            if (arr[i] > maxVal) {                  // if arr element is bigger than current maxVal,
                maxVal = arr[i];                    // replace maxVal with larger value
            }
        }

        return maxVal;
    }
}
