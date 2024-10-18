package org.example.MementoPattern;

public class Main {
    public int binarySearch(int list[],int item){
        int low = 0, high = list.length - 1;
        int i = 0;
        while(low <= high){
            i++;
            System.out.println(i);
            int mid = (low+high)/2;

            if(list[mid] == item){
                return mid;
            }

            if(list[mid] < item){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = new int[100];

        // Заполнение массива числами от 1 до 100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        Main m = new Main();
        int n = m.binarySearch(numbers,57);
        System.out.println(n);
    }
}
