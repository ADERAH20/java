package aderah;
import java.util.Scanner;

public class aderahwork {
public static void main(String[]args) {
	Scanner adera = new Scanner(System.in);
	int fnum, snum, ans;
	System.out.println("Enter First number: ");
	fnum = adera.nextInt();
	System.out.println("Enter Second number: ");
	snum = adera.nextInt();
	ans = fnum + snum;
	System.out.println(fnum + " + " + snum + " is equal to: " + ans);
	
}
}
