public class ArrayTest {
    public static void main(String[] args) {
        int[] firstArray = {1,2,3};
        int[] secondArray = {3,4,6,6,7};
        int[] thirdArray = {8,9,10,12,5,6};

        Array array = new Array(firstArray, secondArray, thirdArray);

        System.out.println(array.getUniqueArrays());
    }
}
