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

        for (int i = 0; i < result.size(); i++) {
            assertFalse(result.subList(i+1, result.size()).contains(result.get(i)));
        }
    }

}