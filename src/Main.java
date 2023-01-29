public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayCounter initArray=new ArrayCounter(3,2,4,1,0,2,3,1);
        int[] counter=initArray.arrCounter();
        int[] finalArray=convertCounterToNewSortedArray(counter);
        System.out.println(print(finalArray));
    }
    public static int[] convertCounterToNewSortedArray(int[] arr){
        int sum=arrSum(arr);
        int[] result=new int[sum];
        int insertIndex=0;
        for (int i = 0; i < arr.length; i++) {
            while(arr[i]>0){
                arr[i]--;
                result[insertIndex]=i;
                insertIndex++;
            }
        }
        return result;
    }
    public static int arrSum(int[] arr) {
        int result=0;
        for (int num : arr) {
            result+=num;
        }
        return result;
    }
    public static String print(int[] arr){
        String result="";
        for (int num:arr) {
            result+=num+" ";
        }
        return result;
    }
}