package ru.parsentev.task_008;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Primes {
    private static final Logger log = getLogger(Primes.class);

    private final int limit;

    public Primes(final int limit) {
        this.limit = limit + 1;
    }

    public List<Integer> calc() {
        List<Integer> result = new ArrayList<>();
        for (int value=1;value!=limit;value++) {
            if (this.isPrime(value)) {
                result.add(value);
            }
        }
        return result;
    }

    private boolean isPrime(int value) {
        boolean result = true;
        for (int index=2;index<value;++index) {
            if (value % index == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
