package core.home6;

import static core.home6.AnObject.ENGINEERS;
import static core.home6.AnObject.SOSIAL;
import static core.home6.Course.FIRST;
import static core.home6.Course.SECOND;
import static core.home6.Faculty.*;

public enum University {
	TECNIC(FORINI2), SOSIAL(FORINI1), MATH(FORINS2), IT(FORINS1), THEONE(FORINI2);
	private Faculty faculty;

	private University(Faculty faculty) {
		this.faculty = faculty;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
}
