public class LinearSearch {
   public static void main(String args[]){
      int array[] = {67,45,33,17,87,99};
      int size = array.length;
      int value = 17;

      for (int i=0 ;i< size-1; i++){
         if(array[i]==value){
            System.out.println("Element found index is :"+ i);
         }else{
            System.out.println("Element not found");
         }
      }
   }
}