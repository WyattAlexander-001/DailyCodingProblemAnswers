package easy;

/*
Problem #1831
This problem was asked by Amazon.
Given a sorted array, find the smallest positive integer that is not the sum of a subset of the array.
For example, for the input [1, 2, 3, 10], you should return 7.
Do this in O(N) time.

*/
public class SmallestPositiveIntThatIsNotSum {

    private int [] arr;
    public static int smallestPosInt(int [] arr){
        int sum = 1;
        for(int i=0;i<arr.length;i++){
            if(i > sum){
                break;
            }
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] jim = {1,2,3,10}; //Answer should be 7
        System.out.println(smallestPosInt(jim));
    }

}
