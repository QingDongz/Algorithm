package time;

import org.junit.Test;

import static org.junit.Assert.*;

public class DongTest {

    @Test
    public void getDong() {
        Dong.setDong("1234");

    }

    @Test
    public void setDong() {
        System.out.println(Dong.getDong());

    }
}