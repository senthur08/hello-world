package tictactoe;
import java.util.Scanner;

public class Player {
	String name;
	char piece;
	
	Player(){
	Scanner in = new Scanner(System.in);
	System.out.println("enter Player name");
	this.name = in.next();
	System.out.println("enter choice of piece x or o");
	this.piece=in.next().charAt(0);
	}

}
