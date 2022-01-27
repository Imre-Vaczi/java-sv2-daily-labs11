package day05;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    @Test
    void testStartLottery() {
        Lottery lottery = new Lottery(10, 3);

        List<Integer> result = lottery.startLottery();

        assertEquals(Arrays.asList(1,4,9), result);
    }

}