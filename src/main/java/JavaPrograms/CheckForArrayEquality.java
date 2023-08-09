package JavaPrograms;
import java.security.cert.TrustAnchor;
import java.util.Arrays;
public class CheckForArrayEquality {

    public static void main(String[] args){

        int[] array1={50,34,44,67};
        int[] array2={50,34,44,67};
        System.out.println("array1 "+array1.length);
        System.out.println("array2 "+array2.length);
        boolean isEqual= true;
        if(array1.length==array2.length){
            /*if(Arrays.equals(array1, array2)){
                System.out.println("Both arrays are same");
            }else{
                System.out.println("Both arrays are not same");
            }*/

            for(int i=1;i<array1.length;i++) {

                if (array1[i] != array2[i]) {
                    isEqual = false;
                    break;
                }
            }
        }else
            isEqual = false;


        if(isEqual)
                System.out.println("Both arrays are same");
        else
            System.out.println("Both arrays are not same");


    }

}
