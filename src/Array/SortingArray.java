package Array;

import java.util.Arrays;

public class SortingArray{
    public static void main(String[] args){
         int [] sort = {4,6,8,9,3,2,5};
        Arrays.sort(sort);
        System.out.println(Arrays.toString(sort));
        for(int i =0; i <sort.length;  i++){
            for(int j = i+ 1; j <sort.length; j++){
                int all ;
                if(sort[i]  > sort  [j]){
                all = sort[i];
                sort[i] = sort[j];
                sort[j] = all;

                }
            }
                    System.out.println(sort[i]);
        }

    }
}
