package pacman.main;

import pacman.Executor;
import pacman.controllers.GhostController;
import pacman.controllers.GhostsRandom;
import pacman.controllers.HumanController;
import pacman.controllers.KeyBoardInput;
import pacman.controllers.MsPacManRandom;
import pacman.controllers.PacmanController;

//Luis Jaramillo
public class ExecutorTest {
	public static void main(String[] args) {
		Executor executor = new Executor.Builder().setTickLimit(4000).setVisual(true).setScaleFactor(2.0).build();

		PacmanController pacMan = new MsPacManRandom();
		//PacmanController pacMan = new HumanController(new KeyBoardInput());
		
		GhostController ghosts = new GhostsRandom();
		//GhostController ghosts = new GhostsRandom();

		System.out.println(executor.runGame(pacMan, ghosts, 50));
	}
}


