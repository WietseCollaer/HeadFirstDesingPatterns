package mechs;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MechIntegrationTest {

    public static final int ROCKETBOOSTERS_MODIFIER = 20;
    public static final int GATLINGGUN_MODIFIER = 10;
    public static final int SHIELD_MODIFIER = 5;

    @Test
    public void mechTest() {
        Mech myMech = new BigMech();
        int initialSpeed = myMech.getSpeed();
        int initialStrength = myMech.getStrength();
        int initialDefense = myMech.getDefense();

        myMech = new RocketBoosters(myMech);
        myMech = new GatlingGun(myMech);
        myMech = new GatlingGun(myMech);
        myMech = new Shield(myMech);

        assertThat(myMech.getLoadout()).containsExactly("Big Mech", "Rocket Boosters", "Gatling Gun", "Gatling Gun", "Shield");
        assertThat(myMech.getSpeed()).isEqualTo(initialSpeed + ROCKETBOOSTERS_MODIFIER);
        assertThat(myMech.getStrength()).isEqualTo(initialStrength + (2 * GATLINGGUN_MODIFIER));
        assertThat(myMech.getDefense()).isEqualTo(initialDefense + SHIELD_MODIFIER);
    }
}