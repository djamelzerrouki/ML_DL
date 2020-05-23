package testNd4j;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class testNd4j_02 {
    public static void main(String[] args) {

        INDArray t3=Nd4j.create(new double[]{6,9,4,0,5,12},new int []{2,3});
        INDArray t4=Nd4j.create(new double[][]{{1,2,3},{3,4,5},{1,2,3}});
        INDArray t5=t3.mmul(t4);

        System.out.println("\t -------T3---------");
        System.out.println(t3);
        System.out.println("\t -------T4---------");
        System.out.println(t4);
        System.out.println("\t -------T5---------");
        System.out.println(t5);
    }
}
