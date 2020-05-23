package testNd4j;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class testNd4j_05 {
    public static void main(String[] args) {
        INDArray t1= Nd4j.eye(4);
        System.out.println(t1);

        INDArray t2= Nd4j
                .linspace(0,100,9)
        //        .reshape(new int []{3,3});
                .reshape(3,3);

        System.out.println("linspace \t -------T2---------");
        System.out.println(t2);


    }
}
