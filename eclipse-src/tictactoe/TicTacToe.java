package tictactoe;

import java.util.Arrays;

public class TicTacToe {
	Player p1,p2;

	TicTacToe() {
		this.p1=new Player();
		this.p2=new Player();
	}

	
	public void display() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}