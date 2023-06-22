package Array_Questions_to_be_Solve;

import java.util.Arrays;

public class Nlargest 
{
  public static int KthLargestElement(int arr[], int n, int N) {
    Arrays.sort(arr); // sorting the array
    return arr[n - N]; // return kth largest element
  }

  public static void main(String[] args) {
    int arr[] = { 2, 1, 4, 6, 3, 9, 7 };
    int n = arr.length;
    int k = 2;
    int x = KthLargestElement(arr, n, k);
    System.out.print("Kth largest element is " + x);
  }
}

