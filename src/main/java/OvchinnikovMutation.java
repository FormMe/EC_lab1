import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class OvchinnikovMutation implements EvolutionaryOperator<double[]> {
    public List<double[]> apply(List<double[]> population, Random random) {
        double mutation_rate = 0.05;
        double gene_rate = 0.05;
        for (int i = 0; i < population.size(); i++){
            if (random.nextDouble() <= mutation_rate){
                for (int j = 0; j < population.get(0).length; j++){
                    if (random.nextDouble() <= gene_rate){
                        population.get(i)[j] += random.nextGaussian();
                    }
                }
            }
        }
        return population;
    }
}
