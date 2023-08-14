package Algorithms;

public class Search {

    public static int linearSearch(int[] dats, int target){
        for(int i=0;i<dats.length;i++){
            if(dats[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] tests, int target,int start,int end){

        int middle= (int) Math.floor(((start+end)/2));
        int value=tests[middle];

        if(target>value){
            return binarySearch(tests,target,middle+1,end);
        }else if(target<value){
            return binarySearch(tests,target,start,middle-1);
        }
        return middle;
    }

}
