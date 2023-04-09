package Array;
public class Accessing{
    public static void main(String[] args){

// Accessing element of an array
        int [] slay = {1,23,4,5,6,6};
      //  System.out.printf("Accessing %d:",slay[4]);



        //Searching in array
        for(int i : slay){
           // System.out.println(i);
        }

        // Looping through multidimensional array

int [][]first = {{1,2,3,4,5,6}, {2,3,4,5,7,8}};
        for(int i =0; i < first.length; i++){
            for(int j =0; j < first.length; i++){

            System.out.println( first[i][j]);
            }
        }

    }
}
