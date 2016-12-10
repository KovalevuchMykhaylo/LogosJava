package core.home6;

import java.util.Scanner;

import core.less6.Season;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter 1 to show months by season");
			System.out.println("Enter 2 to show months by count of days");
			switch (sc.next()) {
			case "1":
				System.out.println("Enter name of season");
				String nameOfSeason	= sc.next().toUpperCase();
				if(exist(Season.values(), nameOfSeason)){
					Season season = Season.valueOf(nameOfSeason);//вытягивает значение эмана
					for (int i = 0; i < months.length; i++) {
						if(months[i].getSeason()==season){
							System.out.println(months[i]);
						}
					}
				}else{
					System.out.println("Not correct!!!");
				}
				break;
			case "2":
				System.out.println("Enter count of days");
				int count = sc.nextInt();
				for (int i = 0; i < months.length; i++) {
					if(months[i].getDays()==count){
						System.out.println(months[i]);
					}
				}
				break;
			default:
				sc.close();
				return;
			}
		}

	}
	
	static boolean exist(Enum<? extends Season>[] enums, String name){//Проверяет или в масиве энамов сть совпадение с именем веденым пользовалелям
		for (int i = 0; i < enums.length; i++) {
			if(enums[i].name().equals(name)){
				return true;
			}
		}
		return false;
	}
		
}