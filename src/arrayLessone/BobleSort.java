package arrayLessone;

import java.util.Arrays;

public class BobleSort {
    public static void main(String[] args){
        int [] numbers = {-1,-2,-3,3,2,1};
        System.out.println(Arrays.toString(numbers));
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length-1;j++){
                if(numbers[j]>numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j]= numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));

//        int [] numbers = {-1,-2,-3,3,2,1};
//        System.out.println(Arrays.toString(numbers));
//        Arrays.sort(numbers);
//        List<Integer> integerList = new ArrayList<>();
//        Arrays.stream(numbers).forEach(e->{
//            integerList.add(e);
//        });
//        Collections.reverse(integerList);
//        System.out.println(integerList);

    }
}
