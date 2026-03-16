//Start heapsort project
//CSC211 Practical 16
//Heap Construction and Heap Sort

//This program builds a heap using two different methods:
//1. Bottom-up heap construction
//2. Top-down heap construction using insert()

//The heaps are then used to perform heap sort and the
//execution time for each method is compared.

//I consulted ChatGPT to help understand heap algorithms,
//but the code was written and adapted by me for this practical.

// Name: Mbuso
//Student Number:4577545
//Date: 18 March 2026
import java .io.*;
import java .util.*;
public class tryheapsort
  public static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void heapifyDown(String[] heap, int size, int i) {

        while (true) {

            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int smallest = i;
