package simple.immutable;

import java.util.Objects;

class Name {

	private static final int MAX_NAME_LENGTH = 5;
	private final String name;

	public Name(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Name name1 = (Name)o;
		return Objects.equals(name, name1.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public String toString() {
		return "Name{" +
			"name='" + name + '\'' +
			'}';
	}
}
