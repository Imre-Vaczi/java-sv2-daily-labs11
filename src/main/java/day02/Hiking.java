package day02;

import java.util.List;

public class Hiking {

    public long getPlusElevation(List<GPS> positions) {
        long result = 0;
        for (int n = 0; n < positions.size()-1; n++) {
            result += Math.max(positions.get(n+1).getZ() - positions.get(n).getZ(), 0);
        }
        return result;
    }
}
