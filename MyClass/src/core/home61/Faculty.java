package core.home61;

import static core.home61.Univercity.*;
import static core.home61.Type.*;
import static core.home61.HighestLevel.*;
import static core.home61.RecruitmentOfStudents.*;

public enum Faculty {

	ECOLOGY(31, TECNIC, BACHELIR, FREE, UNRESTRICTED), GEOLOGY(28, TECNIC, MASTER, FREE, LIMITED),
	MECHANICS(31, SOSIAL, MASTER, FREE, UNRESTRICTED), PHYSICS(30, SOSIAL, BACHELIR, FREE, LIMITED),
	CHEMICAL(31, SOSIAL, MASTER, PRIVAT, UNRESTRICTED), LEGAL(30, MATH, BACHELIR, PRIVAT, LIMITED),
	PHILOLOGY(31, MATH, MASTER, PRIVAT, UNRESTRICTED), SPORT(31, MATH, BACHELIR, PRIVAT, LIMITED),
	IT(30, GLOBAL, MASTER, FREE, UNRESTRICTED), MEDICINE(31, GLOBAL, MASTER, PRIVAT, LIMITED),
	ENGINEERING(30, GLOBAL, MASTER, PRIVAT, UNRESTRICTED), BUSINESS(31, TECNIC, BACHELIR, PRIVAT, LIMITED);
	
	private final int students;
	
	private final Univercity univercity;
	
	private final HighestLevel highestLevel;
	
	private final Type type;
	
	private final RecruitmentOfStudents recruitmentOfStudents;

	private Faculty(int students, Univercity univercity,
			HighestLevel highestLevel, Type type,
			RecruitmentOfStudents recruitmentOfStudents) {
		this.students = students;
		this.univercity = univercity;
		this.highestLevel = highestLevel;
		this.type = type;
		this.recruitmentOfStudents = recruitmentOfStudents;
	}

	public int getStudents() {
		return students;
	}

	public Univercity getUnivercity() {
		return univercity;
	}

	public HighestLevel getHighestLevel() {
		return highestLevel;
	}

	public Type getType() {
		return type;
	}

	public RecruitmentOfStudents getRecruitmentOfStudents() {
		return recruitmentOfStudents;
	}

	
	
}