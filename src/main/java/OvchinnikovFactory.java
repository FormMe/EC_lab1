import org.uncommons.watchmaker.framework.factories.AbstractCandidateFactory;

import java.util.Random;

public class OvchinnikovFactory extends AbstractCandidateFactory<double[]> {

    private int dimension;

    public OvchinnikovFactory(int dimension) {
        this.dimension = dimension;
    }

    public double[] generateRandomCandidate(Random random) {
        double[] solution = new double[dimension];
        for (int i = 0; i < dimension; i++){
            solution[i] = 10.0 * random.nextDouble() - 5.0;
        }

        return solution;
    }
}
