package com.cegeka.caffeinebeverage;

import org.junit.Test;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static org.assertj.core.api.Assertions.assertThat;

public class CaffeineBeverageIntegrationTest {

    private static final String TEA_RECIPE = Tea.BOILING_WATER + " " + Tea.STEEPING_TEA_BAG + " " + Tea.POUR_IN_CUP + " " + Tea.ADDING_LEMON;
    private static final String COFFEE_RECIPE = Coffee.BOILING_WATER + " " + Coffee.BREWING_COFFEE_BEANS + " " + Coffee.POUR_IN_CUP + " " + Coffee.ADDING_MILK_AND_SUGAR;

    @Test
    public void prepareRecipe_whenBeverageIsTea_thenPrepareTea() {
            Tea tea = new Tea();

            String actual = tea.prepareRecipe();

            assertThat(actual).isEqualTo(TEA_RECIPE);
    }

    @Test
    public void prepareRecipe_whenBeverageIsCoffee_thenPrepareCoffee() {
        Coffee coffee = new Coffee();

        String actual = coffee.prepareRecipe();

        assertThat(actual).isEqualTo(COFFEE_RECIPE);
    }

    @Test
    public void prepareRecipe_whenMultipleBeverages_thenEachBeverageHasItsOwnRecipe() {
        List<CaffeineBeverage> beverages = newArrayList(
                new Tea(),
                new Coffee()
        );

        assertThat(beverages)
                .extracting(CaffeineBeverage::prepareRecipe)
                .containsExactly(TEA_RECIPE, COFFEE_RECIPE);
    }
}
