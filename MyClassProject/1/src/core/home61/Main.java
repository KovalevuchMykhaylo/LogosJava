package core.home61;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Faculty[] faculty = Faculty.values();
		for (int i = 0; i < faculty.length; i++) {
			System.out.println(faculty[i]);
		}
		Unicercitys[] unicercitys = Unicercitys.values();
		for (int j = 0; j < unicercitys.length; j++) {
			System.out.println(unicercitys[j]);
		}

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter 1 to show faculties");
			System.out.println("Enter 2 to show count of Students");
			System.out.println("Enter 3 to show Type");
			System.out.println("Enter 4 to show RecruitmentOfStudents");
			System.out.println("Enter 5 to show HighestLevel");
			switch (sc.next()) {
			case "1":
				System.out.println("Enter name of Univercity");
				String nameOfUnivercity	= sc.next().toUpperCase();
				if(exist(Univercity.values(), nameOfUnivercity)){
					Univercity univercity = Univercity.valueOf(nameOfUnivercity);
					for (int i = 0; i < faculty.length; i++) {
						if(faculty[i].getUnivercity()==univercity){
							System.out.println(faculty[i]);
						}
					}
				}else{
					System.out.println("Not correct!!!");
				}
				break;
			case "2":
				System.out.println("Enter count of students");
				int count = sc.nextInt();
				for (int i = 0; i < faculty.length; i++) {
					if(faculty[i].getStudents()==count){
						System.out.println(faculty[i]);
					}
				}
				break;
			case "3":
				System.out.println("Enter free or privat");
				String nameOfType	= sc.next().toUpperCase();
				if(exist1(Type.values(), nameOfType)){
					Type type = Type.valueOf(nameOfType);
					for (int i = 0; i < faculty.length; i++) {
						if(faculty[i].getType()==type){
							System.out.println(faculty[i]);
						}
					}
				}
				break;
			case "4":
				System.out.println("Enter recruitment of students");
				String nameOfRecruitmentOfStudents	= sc.next().toUpperCase();
				if(exist2(RecruitmentOfStudents.values(), nameOfRecruitmentOfStudents)){
					RecruitmentOfStudents recruitmentOfStudents = RecruitmentOfStudents.valueOf(nameOfRecruitmentOfStudents);
					for (int i = 0; i < faculty.length; i++) {
						if(faculty[i].getRecruitmentOfStudents()==recruitmentOfStudents){
							System.out.println(faculty[i]);
						}
					}
				}
				break;
			case "5":
				System.out.println("Enter the highest level of education");
				String nameOfHighestLevel	= sc.next().toUpperCase();
				if(exist3(HighestLevel.values(), nameOfHighestLevel)){
					HighestLevel highestLevel = HighestLevel.valueOf(nameOfHighestLevel);
					for (int i = 0; i < faculty.length; i++) {
						if(faculty[i].getHighestLevel()==highestLevel){
							System.out.println(faculty[i]);
						}
					}
				}
//			case "6":
//				System.out.println("Enter the name of faculty");
//				String nameOfFaculty = sc.next().toUpperCase();
//				if(exist4(Faculty.values(), nameOfFaculty)){
//					Faculty faculty = Faculty.valueOf(nameOfFaculty);
//					for (int i = 0; i < unicercitys.length; i++) {
//						if(unicercitys[i].getFaculty()==faculty){
//							System.out.println(unicercitys[i]);
//						}
//					}
//				}
				break;
			default:
				sc.close();
				return;
				
			}
		}
		
	}
	
	static boolean exist(Enum<? extends Univercity>[] enums, String name){
		for (int i = 0; i < enums.length; i++) {
			if(enums[i].name().equals(name)){
				return true;
			}
		}
		return false;
	}
	static boolean exist1(Enum<? extends Type>[] enums, String name){
		for (int i = 0; i < enums.length; i++) {
			if(enums[i].name().equals(name)){
				return true;
			}
		}
		return false;
	}
	static boolean exist2(Enum<? extends RecruitmentOfStudents>[] enums, String name){
		for (int i = 0; i < enums.length; i++) {
			if(enums[i].name().equals(name)){
				return true;
			}
		}
		return false;
	}
	static boolean exist3(Enum<? extends HighestLevel>[] enums, String name){
		for (int i = 0; i < enums.length; i++) {
			if(enums[i].name().equals(name)){
				return true;
			}
		}
		return false;
	}
	static boolean exist4(Enum<? extends Faculty>[] enums, String name){
		for (int i = 0; i < enums.length; i++) {
			if(enums[i].name().equals(name)){
				return true;
			}
		}
		return false;
	}
}