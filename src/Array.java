public class Array {
    private final int[] firstArray;
    private final int[] secondArray;
    private final int[] thirdArray;

    public Array(int[] firstArray, int[] secondArray, int[] thirdArray) {
        this.firstArray = firstArray;
        this.secondArray = secondArray;
        this.thirdArray = thirdArray;
    }

    public int getUniqueArrays() {
        int firstDupeCounter;
        int secondDupeCounter;
        int thirdDupeCounter;
        firstDupeCounter = duplicateChecker(firstArray);
        secondDupeCounter = duplicateChecker(secondArray);
        thirdDupeCounter = duplicateChecker(thirdArray);
        return (firstArray.length-firstDupeCounter/2)*(secondArray.length-secondDupeCounter/2)*(thirdArray.length-thirdDupeCounter/2);
    }

    private int duplicateChecker(int[] Array) {
        int counter=0;
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++) {
                if(i!=j) {
                    if (Array[i] == Array[j]) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }
}
