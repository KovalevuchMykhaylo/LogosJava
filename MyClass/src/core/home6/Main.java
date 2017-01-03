package core.home6;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	Course[] course = Course.values();
	for (int i = 0; i < course.length; i++) {
		System.out.println(course[i]);
	}

	Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter 1 to show months by season");
			System.out.println("Enter 2 to show months by count of days");
		switch (sc.next()) {
		case "1":
			System.out.println("Enter name of season");
			String nameOfFaculty = sc.next().toUpperCase();
				if(exist(Faculty.values(), nameOfFaculty)){
					Faculty faculty = Faculty.valueOf(nameOfFaculty);//вытягивает значение эмана
					for (int i = 0; i < course.length; i++) {
						if(course[i].valueOf(nameOfFaculty).equals(faculty)){
							System.out.println(course[i]);
				}
			}
		}else{
			System.out.println("Not correct!!!");
		}
		break;}}}
//		case "2":
//			System.out.println("Enter count of days");
//			int count = sc.nextInt();
//			for (int i = 0; i < months.length; i++) {
//				if(months[i].getDays()==count){
//					System.out.println(months[i]);
//				}
//			}
//			break;
//		default:
//			sc.close();
//			return;
//		}
//		}
//	
//	}
	
	static boolean exist(Enum<? extends Faculty>[] enums, String name){//Проверяет или в масиве энамов сть совпадение с именем веденым пользовалелям
		for (int i = 0; i < enums.length; i++) {
			if(enums[i].name().equals(name)){
				return true;
			}
		}
		return false;
	}

}