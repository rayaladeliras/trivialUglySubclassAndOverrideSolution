package com.adaptionsoft.games.trivia;

import com.adaptionsoft.games.trivia.runner.GameRunner;

import java.util.Random;

public class GameRunnerForTests extends GameRunner {
    @Override
    protected Random getRandom() {
        return new Random(4);
    }
}
