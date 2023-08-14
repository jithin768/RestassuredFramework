package Algorithms;

public class Demo {
    public static void main(String args[]){
        int[] numbers={12,345,45,65,77,89};
        int[] datas={2,4,6,7,99,190,345};

        int pos=Algorithms.Search.linearSearch(numbers,46);
        System.out.println("The element position is : "+pos);


        int index=Algorithms.Search.binarySearch(datas,7,0,numbers.length-1);
        System.out.println("Found at index "+index);

    }


}
