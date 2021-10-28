import java.util.*;
// list should be sorted. if not sort the array using Arrays.sort();
// binary searching.
/*
element is 7 is present in array index position 3;
*/
public class Main {
    public static void main(String[] args) {
      int arr[]= {2,5,6,7,8,9,13,0,14,16,17,24,29};
      Arrays.sort(arr);
      for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println();
      
      int search=7;
      int lowerIndex =0;
      int HigherIndex= arr.length-1;
      int middleIndex=(lowerIndex+HigherIndex)/2;
      
      while(lowerIndex<=HigherIndex){
      if(arr[middleIndex]==search){
        System.out.print("element is IndexPosition: "+middleIndex);
        break;
      }else if(arr[middleIndex]<search){
        lowerIndex=middleIndex+1;
      }else{
        HigherIndex=middleIndex-1;
      }
      middleIndex=(lowerIndex+HigherIndex)/2;
      }
      if(lowerIndex>HigherIndex){
        System.out.print("element not found");
      }
    }
}