import java.util.*;
class Main{
  public static int Binary_Search(int arr[], int L, int R, int a){
    if(R>=L){
      int mid = L+(R-L)/2;

      //if the element is present at the middle
      if(arr[mid]==a){
        return mid;
      }
      //if the element is less than the mid then it should be present in sub-array
      if (arr[mid] > a){
        return Binary_Search(arr, L, mid - 1, a);
      }
      //if the element is greater than the mid then it should be present in right sub-array
      return Binary_Search(arr, mid + 1, R, a);
    }
    return -1;
  }
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    Main Obj = new Main();
    int n = scan.nextInt();
    int a = scan.nextInt();
    int arr[] = new int[n];
    for(int i = 0;i<n;i++){
      arr[i] = scan.nextInt();
    }
    if(Obj.Binary_Search(arr, 0, n - 1, a)!=-1){
      System.out.println("Element is present at the index "+Obj.Binary_Search(arr, 0, n - 1, a));
    }
    else{
      System.out.println("Element is not found in the array");
    }
    scan.close();
  }
}
