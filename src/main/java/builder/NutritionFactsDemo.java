package creation.builder;

public class NutritionFactsDemo {
    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240,8).fat(3).carbohydrate(6).build();
    }
}
