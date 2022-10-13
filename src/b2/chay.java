package b2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
public class chay {
    public static int binarySearchA(int[]array, int left, int right, int value) {

        if(right>=left){
            int mid = (left + right )/2;
            if(array[mid]== value)
                return mid;
            if (array[mid]<value)
                return binarySearchA(array, mid + 1, right, value);
            return binarySearchA(array, left, mid - 1, value);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng : ");
        int n = Integer.parseInt(sc.nextLine());
        int[] listNum = new int[n];
        System.out.println("Nhập các phần tử của mảng :");
        for (int i = 0; i < n ; i++) {
            listNum[i]=Integer.parseInt(sc.nextLine());
        }
        sortASC(listNum);
        int size = listNum.length;
        int result;
        result = binarySearchA(listNum, 0, size-1,6);
        if (result == -1){
            System.out.println("Khong co trong mang");
        }else {
            System.out.println("Vi tri : " + result);
        }
    }// END MAIN !
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        LinkedList<Integer> listNum = new LinkedList<>();
//        int inputNum;
//        do {
//            inputNum = Integer.parseInt(sc.nextLine());
//            arrayList.add(inputNum);
//
//            if (inputNum==0){
//                break;
//            }
//        }
//        while (true);
//
//
////        for (int i = 0; i < listNum.size(); i++) {
////
////        }
//        System.out.println("listNum : ");
//        System.out.print(array.length);

    public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }



}
