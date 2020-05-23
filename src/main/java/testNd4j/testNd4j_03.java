package testNd4j;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class testNd4j_03 {
    public static void main(String[] args) {
        INDArray t1= Nd4j.ones(3,4);
        INDArray t2= Nd4j.zeros(3,4);
        // hstack
        INDArray t3=Nd4j.hstack(t1,t2);
       // vstack
       INDArray t4=Nd4j.vstack(t1,t2);
       // concat
        INDArray t5=Nd4j.concat(0,t1,t2);
        INDArray t6=Nd4j.concat(1,t1,t2);




        System.out.println("\t -------T1---------");
        System.out.println(t1.toString());
        System.out.println("\t -------T2---------");
        System.out.println(t2.toString());


        System.out.println("Shape Info of t1:");
        System.out.println(t1.shapeInfoToString());
        System.out.println("Shape Info of t2:");
        System.out.println(t2.shapeInfoToString());

        System.out.println("T3 \t hstack ------- t1 & t2 ---------");
        System.out.println(t3);
        System.out.println("T4 \t vstack-------- t1 & t2 --------");
        System.out.println(t4);
        System.out.println("T5 \t concat with dimension 0 ------- t1 & t2 ---------");
        System.out.println(t5);
        System.out.println("T6 \t concat with dimension 1 ------- t1 & t2 ---------");
        System.out.println(t6);
    }
}
