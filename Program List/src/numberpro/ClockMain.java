package numberpro;

import java.util.Scanner;

public class ClockMain {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Hour and Minute");
		int hr = scn.nextInt();// 9
		int min = scn.nextInt();// 35
		scn.close();
		double hAngle = hr * 30 + min * 0.5;// 287.5
		double mAngle = min * 6;// 210
		double angle = 0.0;
		if (hAngle > mAngle)
			angle = hAngle - mAngle;// 77.5
		else
			angle = mAngle - hAngle;
		if (angle > 180)
			angle = 360 - angle;

		System.out.println("least angle between the " + hr + " and " + min + " is " + angle);

	}
}
