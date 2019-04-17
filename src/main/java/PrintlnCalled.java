public class PrintlnCalled {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        new PrintlnCalled().printArrayElement(arr);
    }

    public void printArrayElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第"+ i + "个数："+ arr[i]);
        }
    }
}
