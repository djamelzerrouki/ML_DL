package testNd4j;

import org.nd4j.linalg.api.iter.NdIndexIterator;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class testNd4j_06 {
    public static void main(String[] args) {
         INDArray t1= Nd4j.zeros(3,4).add(10);
        INDArray t2= Nd4j.ones(3,4).add(10);
        INDArray t3= t2.div(2);
        INDArray t4=t1.addi(20);

        System.out.println(t1);
        System.out.println("-----------");
        System.out.println(t1);
        System.out.println("-----------");
        System.out.println(t3);
        System.out.println("-----------");
        System.out.println(t4);
    }
}
