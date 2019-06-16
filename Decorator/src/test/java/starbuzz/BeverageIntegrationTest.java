package starbuzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BeverageIntegrationTest {

    private static final double INITIAL_DARKROAST_COST = 1.00;
    private static final double INITIAL_HOUSEBLEND_COST = 0.89;
    private static final double MOCHA_COST = 0.20;
    private static final double SOY_COST = 0.30;
    private static final double WHIP_COST = 0.50;

    @Test
    public void beverageTest() {
        Beverage espresso = new Espresso();
        assertThat(espresso.cost()).isEqualTo(1.99);
    }

    @Test
    public void darkRoast_withDoubleMochaAndWhip() {
        Beverage darkRoast = new DarkRoast();

        assertThat(darkRoast.cost()).isEqualTo(INITIAL_DARKROAST_COST);

        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);

        assertThat(darkRoast.getDescription()).contains("Mocha", "Mocha", "Whip");
        assertThat(darkRoast.cost()).isEqualTo(INITIAL_DARKROAST_COST + MOCHA_COST + MOCHA_COST + WHIP_COST);
    }

    @Test
    public void houseBlend_withEverything() {
        Beverage houseBlend = new HouseBlend();

        assertThat(houseBlend.cost()).isEqualTo(INITIAL_HOUSEBLEND_COST);

        /*houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);*/
        houseBlend = new Whip(new Mocha(new Soy(houseBlend)));

        assertThat(houseBlend.getDescription()).contains("Soy", "Mocha", "Whip");
        assertThat(houseBlend.cost()).isEqualTo(INITIAL_HOUSEBLEND_COST + SOY_COST + MOCHA_COST + WHIP_COST);
    }
}
