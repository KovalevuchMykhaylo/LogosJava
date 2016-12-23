package core.home6;

import static core.home6.TyteOfStudy.*;

public enum AnObject {
	
SOSIAL(50, FREE), ENGINEERS(20, NOTFREE);

private final int students;

private final TyteOfStudy tyteOfStudy;

private AnObject(int students, TyteOfStudy tyteOfStudy) {
	this.students = students;
	this.tyteOfStudy = tyteOfStudy;
}

public int getStudents() {
	return students;
}

public TyteOfStudy getTyteOfStudy() {
	return tyteOfStudy;
}
}
