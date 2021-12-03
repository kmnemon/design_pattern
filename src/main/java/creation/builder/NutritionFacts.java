package creation.builder;

public class NutritionFacts {
    private final int servingSize;
    private final int calories;
    private final int fat;
    private final int carbohydrate;

    public static class Builder{
        //Required parameters
        private final int servingSize;
        private final int calories;

        //Optional parameters - initialized to default values
        private int fat = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int calories){
            this.servingSize = servingSize;
            this.calories = calories;
        }

        public Builder fat(int val){
            fat = val;
            return this;
        }
        public Builder carbohydrate(int val){
            carbohydrate = val;
            return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder){
        servingSize = builder.servingSize;
        calories = builder.calories;
        fat = builder.fat;
        carbohydrate = builder.carbohydrate;
    }
}
