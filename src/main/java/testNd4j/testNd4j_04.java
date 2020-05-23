package testNd4j;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class testNd4j_04 {
    public static void main(String[] args) {
        INDArray t1= Nd4j.ones(2,2);
        // PadMode
        INDArray t2= Nd4j.pad(t1,new int[]{3,3},Nd4j.PadMode.CONSTANT);
        System.out.println("\t -------T1---------");
        System.out.println(t2.toString());


    }
}
