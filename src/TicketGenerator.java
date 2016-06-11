/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Waka
 */
public class TicketGenerator {

    
    public void quickSort(int[] arr, int left, int right) {

        int index = partition(arr, left, right);

        if(left < index - 1)
            quickSort(arr, left, index - 1);

        if(index < right)
            quickSort(arr, index, right);
    }

    private static int partition(int[] arr, int left, int right) {

        int pivot = arr[(left + right) / 2];
        
        while(left <= right) {
            
                while(arr[left] < pivot) left++;
                while(arr[right] > pivot) right--;

                if(left <= right) {
                    int tmp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = tmp;

                    left++;
                    right--;
                }
        }
        
        return left;
    }
}