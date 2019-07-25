package com.cegeka.bmwtemplate;

import org.junit.Test;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static org.assertj.core.api.Assertions.assertThat;

public class BmwTemplateIntegrationTest {

    protected static final String MOTORCYCLE_CONSTRUCTION = BmwTemplate.ASSEMBLING_ENGINE_AND_CHASSIS + " " + BmwMotorcycle.ADDING_TWO_WHEELS + " " + BmwMotorcycle.ADDING_MOTORCYCLE_BODY + " " + BmwTemplate.CLEANING_VEHICLE;
    protected static final String CAR_CONSTRUCTION = BmwTemplate.ASSEMBLING_ENGINE_AND_CHASSIS + " " + BmwCar.ADDING_FOUR_WHEELS + " " + BmwCar.ADDING_CAR_BODY + " " + BmwTemplate.CLEANING_VEHICLE;
    protected static final String MOTORCYCLE_CONSTRUCTION_WITH_SEXY_HORN = BmwTemplate.ASSEMBLING_ENGINE_AND_CHASSIS + " " + BmwTemplate.WITH_SEXY_HORN + " " + BmwMotorcycle.ADDING_TWO_WHEELS + " " + BmwMotorcycle.ADDING_MOTORCYCLE_BODY + " " + BmwTemplate.CLEANING_VEHICLE;
    protected static final String CAR_CONSTRUCTION_WITH_SEXY_HORN = BmwTemplate.ASSEMBLING_ENGINE_AND_CHASSIS + " " + BmwTemplate.WITH_SEXY_HORN + " " + BmwCar.ADDING_FOUR_WHEELS + " " + BmwCar.ADDING_CAR_BODY + " " + BmwTemplate.CLEANING_VEHICLE;

    @Test
    public void constructVehicle_whenMotorcycle_thenConstructMotorcycle() {
        BmwMotorcycle motorcycle = new BmwMotorcycle();

        String actual = motorcycle.constructVehicle();

        assertThat(actual).isEqualTo(MOTORCYCLE_CONSTRUCTION);
    }

    @Test
    public void constructVehicle_whenCar_thenConstructCar() {
        BmwCar car = new BmwCar();

        String actual = car.constructVehicle();

        assertThat(actual).isEqualTo(CAR_CONSTRUCTION);
    }

    @Test
    public void constructVehicle_whenMultipleVehicles_thenConstructCorrectly() {
        List<BmwTemplate> bmws = newArrayList(
                new BmwCar(),
                new BmwMotorcycle()
        );

        assertThat(bmws)
                .extracting(BmwTemplate::constructVehicle)
                .containsOnlyOnce(CAR_CONSTRUCTION, MOTORCYCLE_CONSTRUCTION);
    }

    @Test
    public void constructVehicle_whenMotorcycleWithSexyHorn_thenConstructMotorcycleWithSexyHorn() {
        BmwMotorcycle motorcycle = new BmwMotorcycle(true);

        String actual = motorcycle.constructVehicle();

        assertThat(actual).isEqualTo(MOTORCYCLE_CONSTRUCTION_WITH_SEXY_HORN);
    }

    @Test
    public void constructVehicle_whenCarWithSexyHorn_thenConstructCarWithSexyHorn() {
        BmwCar car = new BmwCar(true);

        String actual = car.constructVehicle();

        assertThat(actual).isEqualTo(CAR_CONSTRUCTION_WITH_SEXY_HORN);
    }

    @Test
    public void constructVehicle_whenMultipleVehiclesWithSexyHorns_thenConstructCorrectly() {
        List<BmwTemplate> bmws = newArrayList(
                new BmwCar(true),
                new BmwMotorcycle(true)
        );

        assertThat(bmws)
                .extracting(BmwTemplate::constructVehicle)
                .containsOnlyOnce(CAR_CONSTRUCTION_WITH_SEXY_HORN, MOTORCYCLE_CONSTRUCTION_WITH_SEXY_HORN);
    }
}
