package powerpackage;


import org.junit.Test;

public class PowerTest {
    
    @Test
    public void one_raised_to_one_is_one() {
        assert PowerFinder.of(1,1) == 1;
    }

    @Test
    public void twoRaised_to_one_is_two() {
        assert PowerFinder.of(2,1) == 2;
    }

    @Test
    public void two_power_two_is_four() {
        assert PowerFinder.of(2, 2) == 4;
    }

    @Test
    public void power_of_two_and_three_is_six() {
        assert PowerFinder.of(3, 2) == 3*3;
    }
}
