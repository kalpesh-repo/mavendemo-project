class Dog implements Comparable<Dog> {
	String color;
	int size;
	//comment
	Dog(String c, int s) {
		color = c;
		size = s;
	}

	public String toString() {
		return color + " dog";
	}

	public boolean equals(Object o) {
		return ((Dog) o).color == this.color;
	}

	public int hashCode() {
		return color.length();
	}

	@Override
	public int compareTo(Dog o) {
		return o.size - this.size;
	}
}
