package core.less5;

public class Main2 {

//	public static void main(String[] args) {
//		Header header = new IndexHeader();
//		Body body = new IndexBody();
//		Footer footer = new IndexFooter();
//		Engine engine = new Engine(header, body, footer);
//		engine.printpage();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		Body leftside = new LeftSideBarBody();
//		Engine engine1 = new Engine(header, leftside, footer);
//		engine1.printpage();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		Body rightSide = new RightSideBarBody();
//		Engine engine11 = new Engine(header, rightSide, footer);
//		engine11.printpage();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		Engine rightWithoutFooter = new Engine(header, rightSide, null);
//		rightWithoutFooter.printpage();
		
		public static void main(String[] args) {
			
			Engine engine = new Engine(new IndexHeader(), new IndexBody(), new IndexFooter());
			engine.printpage();
			System.out.println();
			System.out.println();
			System.out.println();
			Engine left = new Engine(engine, new LeftSideBarBody(), engine);
			left.printpage();
			System.out.println();
			System.out.println();
			System.out.println();
			Engine right = new Engine(engine, new RightSideBarBody(), engine);
			right.printpage();
			System.out.println();
			System.out.println();
			System.out.println();
			Engine rightWithoutFooter = new Engine(engine, right, null);
			rightWithoutFooter.printpage();
		
	}

}
