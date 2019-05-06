package edu.dmacc.codedsm;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameLogicTest {
    private GameLogic gameLogicJTest;
    private GameRunnerImpl runner;

    @Before
    public void setUp() throws Exception {
        this.gameLogicJTest = new GameLogic(runner);
    }

    @Test
    public void testRunGame() {
        GameResult TestResult = new GameResult();
        gameLogicJTest = new GameLogic(new GameRunnerImpl());
        TestResult.setPlayer("nate");
        assertEquals(TestResult.getPlayer(), gameLogicJTest.runGame("nate").getPlayer());
    }

    @Test
    public void testBuildResult() {
        GameResult TestResult = new GameResult();
        gameLogicJTest = new GameLogic(new GameRunnerImpl());
        TestResult.setScore(400);
        assertEquals(TestResult.getScore(),gameLogicJTest.buildResult("nate",400).getScore());
    }
}