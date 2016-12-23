package core.home6; 

	import static core.home6.Course.*; 
	
	import static core.home6.AnObject.*; 
	
	public enum Faculty { 
	
		FORINS1(FIRST, 50, SOSIAL), FORINS2(SECOND, 50, SOSIAL),
		FORINI1(FIRST, 20, ENGINEERS), FORINI2(SECOND, 20, ENGINEERS); 
		
		private Course course; 
		
		private int students; 
		
		private AnObject anObject;

		private Faculty(Course course, int students, AnObject anObject) {
			this.course = course;
			this.students = students;
			this.anObject = anObject;
		}

		public Course getCourse() {
			return course;
		}

		public void setCourse(Course course) {
			this.course = course;
		}

		public int getStudents() {
			return students;
		}

		public void setStudents(int students) {
			this.students = students;
		}

		public AnObject getAnObject() {
			return anObject;
		}

		public void setAnObject(AnObject anObject) {
			this.anObject = anObject;
		} 
		
		
}