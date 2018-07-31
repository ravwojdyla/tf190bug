package sh.rav;

import org.tensorflow.Tensor;
import org.tensorflow.Tensors;
import org.tensorflow.example.Example;

public class SynchronizedTF {

    static Tensor<?> createTensor(){
        Example e = Example.newBuilder().build();
        return Tensors.create(e.toByteArray());
    }

    public static void main( String[] args ) {
        for (int i = 0; i < 10; i++) {
            createTensor().close();
        }
    }
}
