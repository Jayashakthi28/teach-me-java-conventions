package powerpackage;


import org.junit.Test;

public class PowerTest {

    PowerFinder powerfinder=new PowerFinder();
    @Test
    public void one_raised_to_one_is_one() {
        assert powerfinder.OF(1,1) == 1;
    }

    @Test
    public void twoRaised_to_one_is_two() {
        assert powerfinder.OF(2,1) == 2;
    }

    @Test
    public void two_power_two_is_four() {
        assert powerfinder.OF(2, 2) == 4;
    }

    @Test
    public void power_of_two_and_three_is_six() {
        assert powerfinder.OF(3, 2) == 3*3;
    }
}
