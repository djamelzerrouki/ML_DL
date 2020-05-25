package testNd4j;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

import java.io.IOException;

public class testNd4j_07 {
    public static void main(String[] args) throws IOException {

        INDArray t1=Nd4j.create(new double[]{6,9,4,0,5,12},new int []{2,3});
        System.out.println(t1);
        Nd4j.writeTxt(t1,"data.txt");
        System.out.println("file created !");
        INDArray t2=Nd4j.readTxt("data.txt");
        System.out.println(t2);
        System.out.println("###########");
       INDArray t3= Nd4j.readNumpy("myData.txt",",");
        System.out.println(t3);

    }
}
