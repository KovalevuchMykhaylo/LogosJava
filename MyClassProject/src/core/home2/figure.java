package core.home2;

public class figure {
int widht;
	
	int hight;
	int area = widht*hight;
	int perimeter = (widht+hight)*2;
	
		
	figure(int widht, int hight){
		this.widht=widht;
		this.hight=hight;
		this.area = widht*hight;
		this.perimeter = (widht+hight)*2;
	}
	void plosh(){
		this.area = widht*hight;
		System.out.println(area);
	}
	void pir(){
		this.perimeter = (widht+hight)*2;
		System.out.println(perimeter);
	}
}