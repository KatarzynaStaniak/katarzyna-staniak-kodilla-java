package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    public static final String BUN_WITH_SESAME = "BUN WITH SESAME";
    public static final String SIMPLE_BUN = "SIMPLE BUN";
    public static final String STANDARD_SAUCE = "STANDARD SAUCE";
    public static final String THOUSAND_ISLAND_SAUCE = "THOUSAND ISLAND SAUCE";
    public static final String BARBECUE_SAUCE = "BARBECUE SAUCE";
    public static final String LETTUCE = "LETTUCE";
    public static final String ONION = "ONION";
    public static final String BACON = "BACON";
    public static final String CUCUMBER = "CUCUMBER";
    public static final String CHILI = "CHILI";
    public static final String MUSHROOMS = "MUSHROOMS";
    public static final String SHRIMP = "SHRIMP";
    public static final String CHEESE = "CHEESE";


    final private String bun;
    final private int burgers;
    final private String sauce;
    private List<String> ingredients;

    private Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        private static List<String> createListOfIngredients() {
            List<String> listOfIngredients = new ArrayList<>();
            listOfIngredients.add(LETTUCE);
            listOfIngredients.add(ONION);
            listOfIngredients.add(BACON);
            listOfIngredients.add(CUCUMBER);
            listOfIngredients.add(CHILI);
            listOfIngredients.add(MUSHROOMS);
            listOfIngredients.add(SHRIMP);
            listOfIngredients.add(CHEESE);

            return listOfIngredients;
        }

        public BigmacBuilder bun(String bun) {
            if (!(bun.equals(BUN_WITH_SESAME) || bun.equals(SIMPLE_BUN))) {
                throw new IllegalStateException("Choose bun with sesame or simple bun");
            } else {
                this.bun = bun;
                return this;
            }
        }

        public BigmacBuilder burgers(int numberOfBurgers) {
            if (numberOfBurgers > 3) {
                throw new IllegalStateException("Too many burgers");
            }
            this.burgers = numberOfBurgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            if (!(sauce.equals(STANDARD_SAUCE) || sauce.equals(THOUSAND_ISLAND_SAUCE) || sauce.equals(BARBECUE_SAUCE))) {
                throw new IllegalStateException("Choose sauce from list");
            } else {
                this.sauce = sauce;
                return this;
            }
        }

        public BigmacBuilder ingredient(String ingredient) {
            if (createListOfIngredients().contains(ingredient)) {
                this.ingredients.add(ingredient);
                return this;
            } else {
                throw new IllegalStateException("Choose ingredient from list");
            }
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
