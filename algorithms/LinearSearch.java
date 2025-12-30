 package algorithms;

public class LinearSearch {


public static int linearSearch(int[]arr,int target){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
       return i;
        }
      
    }
    return -1;
}
    
public static void main(String[] args) {
    int[]numbers={76};
    int target=76;

int result= linearSearch(numbers, target);

if(result!=-1){
    System.out.println("Found at index: "+result);
}else if(numbers.length==0){
    System.out.println("The array is empty");
    
} 
else{
    System.out.println("The element does not exist in the array");
}
}
}