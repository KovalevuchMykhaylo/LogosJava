package core.home3;

public class Main {

	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.work();
		Robot coffeRobot = new CoffeRobot();
		coffeRobot.work();
		Robot robotCoocker = new RobotCoocker();
		robotCoocker.work();
		Robot robotDancer = new RobotDancer();
		robotDancer.work();
	}
}