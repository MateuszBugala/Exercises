package main.java.CodilityLessons;


public class Task_4_FrogRiverOne {

    public static void main(String[] args) {
//        int[] array = {1,3,1,4,2,3,5,4};    /*should return 6*/
        int[] array = {1,3,1,4,2,3,1,4};    /*should return -1*/
        System.out.println(solution(5,array));
    }

    //    test5 - 100% (correctness 100; performance 100)
    public static int solution(int X, int[] A) {
        int[] array = new int[X];
        int counter =0;
        for (int i = 0; i < A.length; i++) {
            if (array[A[i]-1] == 0) {
                array[A[i]-1] = 1;
                counter++;
            }
            if (counter == X) {
                return i;
            }
        }
        return -1;
    }


    //    test4 - 54% (correctness 100; performance 0)
//    public static int solution(int X, int[] A) {
//        ArrayList<Integer> list=new ArrayList<Integer>(Collections.nCopies(X, 0));
//        for (int i = 0; i < A.length; i++) {
//            list.set(A[i]-1,1);
//            if (!list.contains(0)) {
//                return i;
//            }
//        }
//        return -1;
//    }


    //    test3 - 54% (correctness 100; performance 0)
//    public static int solution(int X, int[] A) {
//        int sum = 0;
//
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] == 0) {
//                continue;
//            }
//            for (int j = A.length-1; j > i; j--) {
//                if (A[j] == 0) {
//                    continue;
//                }
//                if (A[i] == A[j]) {
//                    A[j] = 0;
//                }
//            }
//            sum++;
//            if (sum == X) {
//                return i;
//            }
//        }
//        return -1;
//    }


    //    test2 - 9% (correctness 16; performance 0)
//    public static int solution(int X, int[] A) {
//        int sum = 0;
//
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] == 0) {
//                continue;
//            }
//            for (int j = A.length-1; j > i; j--) {
//                if (A[j] == 0) {
//                    continue;
//                }
//                if (A[i] == A[j]) {
//                    A[j] = 0;
//                }
//            }
//            sum++;
//            if (sum == 5) {       /*na sztywno wpisane 5 !*/
//                return i;
//            }
//        }
//        return -1;
//    }



//    test1 - 54% (correctness 100; performance 0)
//    public static int solution(int X, int[] A) {
//        int sum = 0;
//        int expectedSum = 0;
//        for (int i = 1; i <= X; i++) {
//            expectedSum += i;
//        }
//
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] == 0) {
//               continue;
//            }
//            for (int j = A.length-1; j > i; j--) {
//                if (A[i] == A[j]) {
//                    A[j] = 0;
//                }
//            }
//            sum+=A[i];
//            if (sum == expectedSum) {
//                return i;
//            }
//        }
//        return -1;
//    }

}


//    A small frog wants to get to the other side of a river. The frog is initially located on one bank of the river (position 0) and wants to get to the opposite bank (position X+1). Leaves fall from a tree onto the surface of the river.
//
//        You are given an array A consisting of N integers representing the falling leaves. A[K] represents the position where one leaf falls at time K, measured in seconds.
//
//        The goal is to find the earliest time when the frog can jump to the other side of the river. The frog can cross only when leaves appear at every position across the river from 1 to X (that is, we want to find the earliest moment when all the positions from 1 to X are covered by leaves). You may assume that the speed of the current in the river is negligibly small, i.e. the leaves do not change their positions once they fall in the river.
//
//        For example, you are given integer X = 5 and array A such that:
//        A[0] = 1
//        A[1] = 3
//        A[2] = 1
//        A[3] = 4
//        A[4] = 2
//        A[5] = 3
//        A[6] = 5
//        A[7] = 4
//
//        In second 6, a leaf falls into position 5. This is the earliest time when leaves appear in every position across the river.
//
//        Write a function:
//
//class Solution { public int solution(int X, int[] A); }
//
//that, given a non-empty array A consisting of N integers and integer X, returns the earliest time when the frog can jump to the other side of the river.
//
//        If the frog is never able to jump to the other side of the river, the function should return −1.
//
//        For example, given X = 5 and array A such that:
//        A[0] = 1
//        A[1] = 3
//        A[2] = 1
//        A[3] = 4
//        A[4] = 2
//        A[5] = 3
//        A[6] = 5
//        A[7] = 4
//
//        the function should return 6, as explained above.
//
//        Write an efficient algorithm for the following assumptions:
//
//        N and X are integers within the range [1..100,000];
//        each element of array A is an integer within the range [1..X].


