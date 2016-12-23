package core.home6;

import static core.home6.Grup.*;

public enum Course {
	
FIRST(25, ONE), SECOND(22, TWO);

private final int students;

private final Grup grup;

private Course(int students, Grup grup) {
	this.students = students;
	this.grup = grup;
}

public int getStudents() {
	return students;
}

public Grup getGrup() {
	return grup;
}

}
