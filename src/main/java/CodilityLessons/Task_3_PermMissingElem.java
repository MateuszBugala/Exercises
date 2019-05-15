package main.java.CodilityLessons;

import java.util.Arrays;

public class Task_3_PermMissingElem {
    public static void main(String[] args) {
//        int[] array = {2,3,1,5};    /*should return 4*/

//        empty array:
//        int[] array = {};    /*should return 1*/

//        first and last element is missing:
//        int[] array = {2,3,4,5};    /*should return 1*/
//        int[] array = {2,3,4,1};    /*should return 5*/

//        single element:
        int[] array = {2};    /*should return 1*/

//        two elements:
//        int[] array = {2,1};    /*should return 3*/

        System.out.println(solution(array));
    }

//    test 2 - 100%
    public static int solution(int[] A) {
        Arrays.sort(A);
        int result = 1;

        if (A.length > 0 && A[0] == 1) {
            for (int i = 0; i < A.length; i++) {
                if (i == A.length-1) {
                    result = A[i] + 1;
                    break;
                } else if (A[i] + 1 == A[i+1]) {
                    continue;
                } else {
                    result = A[i] + 1;
                    break;
                }
            }
        }
        return result;
    }

}



//    An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
//
//        Your goal is to find that missing element.
//
//        Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A, returns the value of the missing element.
//
//        For example, given array A such that:
//        A[0] = 2
//        A[1] = 3
//        A[2] = 1
//        A[3] = 5
//
//        the function should return 4, as it is the missing element.
//
//        Write an efficient algorithm for the following assumptions:
//
//        N is an integer within the range [0..100,000];
//        the elements of A are all distinct;
//        each element of array A is an integer within the range [1..(N + 1)].


