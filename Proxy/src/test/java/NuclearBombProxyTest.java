import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NuclearBombProxyTest {
    @Test
    public void ifPresident_thenCanDetonate() {
        NuclearBombInterface bomb = new NuclearBombProxy(NuclearBombRole.PRESIDENT);

        assertThat(bomb.detonate()).isEqualTo("Everyone at 0,0 is dead.");
    }

    @Test
    public void ifPresident_thenCanSetTarget() {
        NuclearBombInterface bomb = new NuclearBombProxy(NuclearBombRole.PRESIDENT);

        assertThat(bomb.setTarget(2, 5)).isEqualTo("Bomb target has been set to 2,5.");
        assertThat(bomb.setTarget(3, 8)).isEqualTo("Bomb target has been set to 3,8.");
        assertThat(bomb.setTarget(0, 0)).isEqualTo("Bomb target has been set to 0,0.");
    }

    @Test
    public void ifPresident_thenCannotRepair() {
        NuclearBombInterface bomb = new NuclearBombProxy(NuclearBombRole.PRESIDENT);

        assertThat(bomb.repairAndUpgrade()).isEqualTo(NuclearBombInterface.PRESIDENT_CANNOT_DO_MAINTAIN);
    }

    @Test
    public void ifDeveloper_thenCannotDetonate() {
        NuclearBombInterface bomb = new NuclearBombProxy(NuclearBombRole.DEVELOPER);

        assertThat(bomb.detonate()).isEqualTo(NuclearBombInterface.DEVELOPER_CANNOT_DETONATE);
    }

    @Test
    public void ifDeveloper_thenCannotSetTarget() {
        NuclearBombInterface bomb = new NuclearBombProxy(NuclearBombRole.DEVELOPER);

        assertThat(bomb.setTarget(2, 5)).isEqualTo(NuclearBombInterface.DEVELOPER_CANNOT_SET_LOCATION);
    }

    @Test
    public void ifDeveloper_thenCanRepair() {
        NuclearBombInterface bomb = new NuclearBombProxy(NuclearBombRole.DEVELOPER);

        assertThat(bomb.repairAndUpgrade()).isEqualTo(NuclearBombInterface.MAINTENANCE);
    }
}
