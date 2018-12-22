import org.uncommons.watchmaker.framework.operators.AbstractCrossover;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OvchinnikovCrossover extends AbstractCrossover<double[]> {
    protected OvchinnikovCrossover() {
        super(1);
    }

    protected List<double[]> mate(double[] p1, double[] p2, int i, Random random) {
        ArrayList children = new ArrayList();
        double alpha = 0.5;
        int len = p1.length;
        double[] c1 = new double[len];
        double[] c2 = new double[len];
        for (i = 0; i < len; i++){
            if (random.nextDouble() < alpha){
                c1[i] = p1[i];
                c2[i] = p2[i];
            }
            else{
                c1[i] = p2[i];
                c2[i] = p1[i];
            }
        }
        children.add(c1);
        children.add(c2);
        return children;
    }
}
