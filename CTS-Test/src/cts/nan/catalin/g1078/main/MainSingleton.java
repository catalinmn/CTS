package cts.nan.catalin.g1078.main;

import cts.nan.catalin.g1078.pattern.singleton.Robot;

public class MainSingleton {

	public static void main(String[] args) {
		
		Robot robot1 = Robot.getInstanta(1);
		Robot robot2 = Robot.getInstanta(1);

		//robot1.prelucrareCerere("cerere1");
		System.out.println(robot1.getInformatii("/numarCereri"));
		robot1.trimiteCerere("cerere1");
		System.out.println(robot1.getInformatii("/numarCereri"));
		robot1.prelucrareCerere("cerere1");
		
		System.out.println(robot1.getIdRobot());
		System.out.println(robot2.getIdRobot());
	}

}
