//largest number in the array

import javax.swing.plaf.synth.SynthSeparatorUI;

public class array4 {
    public static int largest(int array[]){
        int largest = array[0];
        for(int i = 0; i < array.length; i++){
            if(largest < array[i]){
                largest = array[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int array[] = {43, 55, 76, 32, 86, 54,99};
        int result = largest(array);
        System.out.println("the largest number in the array is " + result);
  
    }
    
}
