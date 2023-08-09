package JavaPrograms;

public class FindDuplicateElementInArray {

    public static void main(String args[]){

        int array1[]={2,3,6,3,6};
        for(int i=0;i<array1.length;i++){
            for(int j=i+1;j<array1.length;j++){
                if(array1[i]==array1[j]){
                    System.out.println("The Duplicate elemenmt is " +array1[i]);
                }
            }
        }


    }




}
