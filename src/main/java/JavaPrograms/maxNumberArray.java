package JavaPrograms;

public class maxNumberArray {

    public static void main(String[] args){
        int[] array1={54,145,78,99};
        int max=array1[0];
        for(int i=1;i<array1.length;i++) {

            if(array1[i]>max)
                max=array1[i];


        }
        System.out.println("The maximum value is "+max);
    }

    }



