package main.java.CodilityLessons;


public class Task_2_CyclicRotation {

    public static void main(String[] args) {
//        int[] array = {3,8,9,7,6};
//        int[] resultArray = solution(array,3);    /*should return [9, 7, 6, 3, 8]*/
//        int[] array = {0,0,0};
//        int[] resultArray = solution(array,1);  /*should return [0, 0, 0]*/
//        int[] array = {1,2,3,4};
//        int[] resultArray = solution(array,4);  /*should return [1,2,3,4]*/
        int[] array = {};
        int[] resultArray = solution(array,4);  /*should return []*/

        for (int el : resultArray) {
            System.out.print(el + ",");
        }
    }

    //    test2 100%
    public static int[] solution(int[] A, int K) {
        int length = A.length;
        if (length == 0){
            return A;
        } else {
            int[] result = new int[length];
            int shift = K % length;

            if (shift == 0) {
                return A;
            } else if (shift > 0) {
                int counter =0;
                for (int i = 0; i < length; i++) {
                    if (counter < shift){
                        result[i] = A[length- shift + i];
                        counter++;
                    } else {
                        result[i] = A[i - shift];
                    }
                }
                return result;
            } else {
                return A;
            }
        }
    }


//    test1 87%
//    public static int[] solution(int[] A, int K) {
//        int length = A.length;
//        int[] result = new int[length];
//
//        int shift = K % length;
//
//        if (shift == 0) {
//            return A;
//        } else if (shift > 0) {
//            int counter =0;
//            for (int i = 0; i < length; i++) {
//                if (counter < shift){
//                    result[i] = A[length- shift + i];
//                    counter++;
//                } else {
//                    result[i] = A[i - shift];
//                }
//            }
//            return result;
//        } else {
//            return A;
//        }
//    }

}




//    An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).
//
//        The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
//
//        Write a function:
//
//class Solution { public int[] solution(int[] A, int K); }
//
//that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.
//
//        For example, given
//        A = [3, 8, 9, 7, 6]
//        K = 3
//
//        the function should return [9, 7, 6, 3, 8]. Three rotations were made:
//        [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
//        [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
//        [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
//
//        For another example, given
//        A = [0, 0, 0]
//        K = 1
//
//        the function should return [0, 0, 0]
//
//        Given
//        A = [1, 2, 3, 4]
//        K = 4
//
//        the function should return [1, 2, 3, 4]
//
//        Assume that:
//
//        N and K are integers within the range [0..100];
//        each element of array A is an integer within the range [−1,000..1,000].
//
//        In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.

