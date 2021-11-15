package nextstep.ladder.domain;

import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Persons {
	private static final String EMPTY_MESSAGE = "Person 리스트가 비어있습니다.";

	private final List<Person> values;

	private Persons(List<Person> values) {
		validateSize(values);
		this.values = new ArrayList<>(values);
	}

	private void validateSize(List<Person> values) {
		if (isEmpty(values)) {
			throw new IllegalArgumentException(EMPTY_MESSAGE);
		}
	}

	private boolean isEmpty(List<Person> values) {
		return values == null || values.size() == 0;
	}

	public static Persons create(List<Person> values) {
		return new Persons(values);
	}

	public static Persons create(String[] names) {
		List<Person> values = Arrays.stream(names)
			.map(Person::create)
			.collect(toList());
		return Persons.create(values);
	}

	public int size() {
		return values.size();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Persons persons = (Persons)obj;

		return Objects.equals(values, persons.values);
	}

	@Override
	public int hashCode() {
		return Objects.hash(values);
	}
}
