package nextstep.ladder.controller;

import nextstep.ladder.converter.ResultConverter;
import nextstep.ladder.domain.ExecutionResult;
import nextstep.ladder.domain.Height;
import nextstep.ladder.domain.Ladder;
import nextstep.ladder.domain.Participants;
import nextstep.ladder.dto.LadderResultDto;
import nextstep.ladder.generator.Generator;
import nextstep.ladder.view.InputView;
import nextstep.ladder.view.ResultView;

public class LadderController {
	private final Generator generator;
	private final ResultConverter resultConverter;

	public LadderController(Generator generator, ResultConverter resultConverter) {
		this.generator = generator;
		this.resultConverter = resultConverter;
	}

	public void start() {
		Participants participants = InputView.scanParticipants();
		ExecutionResult executionResult = InputView.scanExecutionResult();
		Height height = InputView.scanHeightOfLadder();

		Ladder ladder = Ladder.initialize(generator, participants.size(), height.getValue());

		LadderResultDto resultDto = resultConverter.convert(ladder, participants, executionResult);

		ResultView.printTitle();
		ResultView.printParticipants(participants.getValues());
		ResultView.printLadder(ladder.getLines());
		ResultView.printExecutionResult(executionResult.getValues());

		scanNameAndPrintResult(resultDto);
	}

	private void scanNameAndPrintResult(LadderResultDto resultDto) {
		while (true) {
			String name = InputView.scanNameForPrintResult();

			if (InputView.EXIT.equals(name)) {
				return;
			}

			ResultView.printResult(name, resultDto);
		}
	}
}
