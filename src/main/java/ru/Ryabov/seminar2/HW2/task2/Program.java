package ru.Ryabov.seminar2.HW2.task2;

//Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.logging.*;

public class Program {
    public static int[] randomArr() {
        int[] arr = new int[15];
        System.out.println("\nИсходный массив");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(1, 11);
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        return arr;
    }

    public static int[] sortArr(int arr[]) {

        int tmp;
        System.out.println();
        System.out.print("Отсортированный массив\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.print(arr[i] + " ");
        }
        try (FileWriter f = new FileWriter("log.txt")){
            f.write(Arrays.toString(arr));
            f.write("\n");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("");
        return arr;
        }

    public static void main(String[] args) throws IOException {
        sortArr(randomArr());
    }
}


