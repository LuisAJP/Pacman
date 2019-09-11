package pacman.controllers;

import java.util.Random;

import pacman.game.Constants.MOVE;
import pacman.game.Game;

public class MsPacManRandom extends PacmanController {
	private Random rnd = new Random();
	private MOVE[] allMoves = MOVE.values();

	@Override
	public MOVE getMove(Game game, long timeDue) {
		return allMoves[rnd.nextInt(allMoves.length)];
	}
}
