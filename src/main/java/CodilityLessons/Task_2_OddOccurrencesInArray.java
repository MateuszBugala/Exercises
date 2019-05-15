package main.java.CodilityLessons;

import java.util.Arrays;

public class Task_2_OddOccurrencesInArray {

    public static void main(String[] args) {
//        int[] array = {9,3,9,3,9,7,9};    /*should be 7*/
        int[] array = {9,3,9,3,9,7,9,10,10,100,100,7,2,2,2}; /*should be 2*/
//        int[] array = {3,3,3,4,4,2,2,2,2}; /*should be 3*/
        System.out.println(solution(array));
    }

//    test 4 - 100%
    public static int solution(int[] A) {
        Arrays.sort(A);
        int unique = 0;
        boolean pair=false;
        for (int i = 0; i < A.length ; i++) {
            if (i==A.length-1) {
                unique = A[i];
                break;
            } else if (A[i] == A[i+1] || pair == true) {
                pair = (!pair);
                continue;
            } else {
                unique = A[i];
                break;
            }
        }
        return unique;
    }


    //      test 3 - 66%
//    public static int solution(int[] A) {
//        Arrays.sort(A);
//        int[] B = A.clone();
//        int unique = 0;
//        for (int i = 0; i < B.length ; i++) {
//            if (i==0 && B.length>1) {
//                if ((B[i] == B[i+1])) {
//                    continue;
//                } else {
//                    unique = B[i];
//                    break;
//                }
//            } else if (i==B.length-1) {
//                unique = B[i];
//                break;
//            } else if (B[i] == B[i-1] || B[i] == B[i+1]) {
//                continue;
//            } else {
//                unique = B[i];
//                break;
//            }
//        }
//        return unique;
//    }



    //      test 2 - 55%
//    public static int solution(int[] A) {
//        Arrays.sort(A);
//        int unique = 0;
//        for (int i = 0; i < A.length ; i++) {
//            if (i==0) {
//                if ((A[i] == A[i+1])) {
//                    continue;
//                } else {
//                    unique = A[i];
//                    break;
//                }
//            } else if (i==A.length-1) {
//                unique = A[i];
//                break;
//            } else if (A[i] == A[i-1] || A[i] == A[i+1]) {
//                continue;
//            } else {
//                unique = A[i];
//                break;
//            }
//        }
//        return unique;
//    }


//      test 1 - 55%
//    public static int solution(int[] A) {
//        int counter = 0;
//        int odd = 0;
//        for (int i = 0; i < A.length; i++) {
//            for (int j = 0; j < A.length ; j++) {
//                if ((A[i] == A[j])){
//                    continue;
//                } else {
//                    counter++;
//                }
//            }
//            if (counter == A.length-1) {
//                odd = A[i];
//                break;
//            }
//            counter = 0;
//        }
//        return odd;
//    }
}




//    A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.
//
//        For example, in array A such that:
//        A[0] = 9  A[1] = 3  A[2] = 9
//        A[3] = 3  A[4] = 9  A[5] = 7
//        A[6] = 9
//
//        the elements at indexes 0 and 2 have value 9,
//        the elements at indexes 1 and 3 have value 3,
//        the elements at indexes 4 and 6 have value 9,
//        the element at index 5 has value 7 and is unpaired.
//
//        Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.
//
//        For example, given array A such that:
//        A[0] = 9  A[1] = 3  A[2] = 9
//        A[3] = 3  A[4] = 9  A[5] = 7
//        A[6] = 9
//
//        the function should return 7, as explained in the example above.
//
//        Write an efficient algorithm for the following assumptions:
//
//        N is an odd integer within the range [1..1,000,000];
//        each element of array A is an integer within the range [1..1,000,000,000];
//        all but one of the values in A occur an even number of times.


