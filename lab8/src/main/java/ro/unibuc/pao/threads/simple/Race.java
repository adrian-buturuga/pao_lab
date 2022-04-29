package ro.unibuc.pao.threads.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class Race {

    private Map<Integer, Integer> positions = new HashMap<>();
    private int raceLength = 200;
    private boolean finished = false;

    public boolean advance(Integer horse, int distance) {
        int newPosition;
        if (positions.containsKey(horse)) {
            Integer currentPosition = positions.get(horse);
            newPosition = Math.min(raceLength, currentPosition + distance);
        } else {
            newPosition = Math.min(raceLength, distance);
        }
        positions.put(horse, newPosition);
        log.info("Horse {} advanced to {}", horse, newPosition);
        if (!finished && newPosition == raceLength) {
            log.info("Horse {} is the winner!", horse);
            finished = true;
        }
        return (newPosition == raceLength);
    }

}
