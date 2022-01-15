package day02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    @Test
    void testNormalElevationPattern() {
        Hiking hiking = new Hiking();
        List<GPS> gps = new ArrayList<>();
        gps.add(new GPS(0.0, 1.0, 10.0));
        gps.add(new GPS(0.0, 1.0, 20.0));
        gps.add(new GPS(0.0, 2.0, 15.0));
        gps.add(new GPS(0.0, 2.0, 18.0));

        assertEquals(13, hiking.getPlusElevation(gps));
    }

    @Test
    void testDescendingPattern() {
        Hiking hiking = new Hiking();
        List<GPS> gps = new ArrayList<>();
        gps.add(new GPS(0.0, 1.0, 100.0));
        gps.add(new GPS(0.0, 1.0, 20.0));
        gps.add(new GPS(0.0, 2.0, 15.0));
        gps.add(new GPS(0.0, 2.0, 8.0));

        assertEquals(0, hiking.getPlusElevation(gps));
    }

}