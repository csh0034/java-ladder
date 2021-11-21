package nextstep.ladder.generator;

import java.util.Random;

public class RandomBooleanGenerator implements RandomGenerator {
	private static final Random RANDOM = new Random();

	@Override
	public boolean generate() {
		return RANDOM.nextBoolean();
	}
}
