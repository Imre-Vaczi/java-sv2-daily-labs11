package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    private int range;
    private int draws;

    public Lottery(int range, int draws) {
        this.range = range;
        this.draws = draws;
    }

    public int getRange() {
        return range;
    }

    public int getDraws() {
        return draws;
    }

    public List<Integer> startLottery() {
        Random random = new Random();
        List<Integer> result = new ArrayList<>();

        while (result.size() < draws) {
            Integer pick = random.nextInt(1,range+1);
            if (!result.contains(pick)) {
                result.add(pick);
            }
        }
        return result;
    }
}
