package vize;

public class BinarySearch {
    public static void main(String[] args) {

        int [] arr = {-5,-1,0,1,2,3,4,5,6,7,8,9,10};
        int target = -5;
        int ans = binarySearch(arr , target);
        System.out.println("the answer is " + ans);

    }

    static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){

            int mid =  start + (end - start) / 2;

            if(target<arr[mid]){
                end = mid -1;
            }
            else if ( target > arr[mid] ){
                start= mid + 1 ;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}