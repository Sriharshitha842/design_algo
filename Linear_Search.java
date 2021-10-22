import java.util.*;
class Main{
  public static int Linear_Search(int arr[], int a){
    int n = arr.length;
    for(int i=0;i<n;i++){
      if(arr[i]==a){
        return i;
      }
    }
    return -1;
  }
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int a = scan.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=scan.nextInt();
    }
    if(Linear_Search(arr,a)!=-1){
      System.out.println("The element is present at the index :"+Linear_Search(arr,a));
    }
    else{
      System.out.println("Element is not present in the array");
    }
    scan.close();
  }
}
