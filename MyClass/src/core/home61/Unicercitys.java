package core.home61;

import static core.home61.Faculty.*;


public enum Unicercitys {
	
	TECNIC(ECOLOGY, GEOLOGY, BUSINESS),
	SOSIAL(MECHANICS, PHYSICS, CHEMICAL),
	MATH(LEGAL, PHILOLOGY, SPORT),
	GLOBAL(ENGINEERING, MEDICINE, IT);
		
		private final Faculty faculty1;
		private final Faculty faculty2;
		private final Faculty faculty3;
		private Unicercitys(Faculty faculty1, Faculty faculty2, Faculty faculty3) {
			this.faculty1 = faculty1;
			this.faculty2 = faculty2;
			this.faculty3 = faculty3;
		}
		public Faculty getFaculty1() {
			return faculty1;
		}
		public Faculty getFaculty2() {
			return faculty2;
		}
		public Faculty getFaculty3() {
			return faculty3;
		}
}