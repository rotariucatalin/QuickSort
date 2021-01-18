package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Main main = new Main();

        int[] arr = {24, 2, 56, 75, 86, 10, 13, 12};

        main.quickSort(arr, 0, arr.length - 1);

        for(int z = 0; z < arr.length; z++) {
            System.out.println("Zzzzzz ===>" + arr[z]);
        }
    }

    private void quickSort(int[] arr, int begin, int end) {

        if(begin < end) {

            int pivot = partition(arr, begin, end);

            quickSort(arr, begin, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }

    }

    private int partition(int[] arr, int begin, int end) {

        int pivot = arr[end]; //Taking the last element as pivot element
        int i = (begin - 1); //Index of the smaller element

        for(int j = begin; j < end; j++) {

            //If the current element is smaller then the pivot
            if(arr[j] < pivot) {
                i++; //Increment the left index to go to the next element

                swap(arr, i, j);
            }

        }

        //Swap the current left element with the highest(pivot) element
        swap(arr, i + 1, end);

        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {

        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
