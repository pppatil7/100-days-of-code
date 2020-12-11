package com.learn.dsa;

import java.util.Scanner;

public class Solution {

	int hours;
	int minutes;
	int seconds;

	public static int conversion(int hours, int minutes, int seconds) {
		int secHr = hours * 60 * 60;
		int secMin = minutes * 60;
		int secTotal = secHr + secMin + seconds;
		return secTotal;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter hours1");
		int hours1 = sc.nextInt();
		System.out.println("enter minutes1");
		int minutes1 = sc.nextInt();
		System.out.println("enter seconds1");
		int seconds1 = sc.nextInt();
		int firstSecondsTotal = Solution.conversion(hours1, minutes1, seconds1);
		System.out.println("enter hours2");
		int hours2 = sc.nextInt();
		System.out.println("enter minutes2");
		int minutes2 = sc.nextInt();
		System.out.println("enter seconds2");
		int seconds2 = sc.nextInt();
		int secondSecondsTotal = Solution.conversion(hours2, minutes2, seconds2);
		int difference = firstSecondsTotal - secondSecondsTotal;

		System.out.println("final");
		if (difference >= 0) {
			int diffHours = difference / 3600;
			int diffMinutes = difference % 3600;
			int diffMin = diffMinutes / 60;
			int diffSec = diffMinutes % 60;
			System.out.println(diffHours + " " + diffMin + " " + diffSec);
		}

		else {
			difference = -difference;
			int diffHours = difference / 3600;
			int diffMinutes = difference % 3600;
			int diffMin = diffMinutes / 60;
			int diffSec = diffMinutes % 60;
			System.out.println(diffHours + " " + diffMin + " " + diffSec);
		}

	}

}