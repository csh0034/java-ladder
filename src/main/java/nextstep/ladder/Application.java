package nextstep.ladder;

import nextstep.ladder.controller.LadderController;

public class Application {
	public static void main(String[] args) {
		LadderController ladderController = new LadderController();
		ladderController.start();
	}
}
