package application;

import boardgame.Board;

public class Program {

	public static void main(String[] args) {
		System.out.println("Hello Word!");
		
		Board brd = new Board(3, 5);
		
		System.out.println(brd);
	}

}
