package com.adaptionsoft.games.trivia;

import com.adaptionsoft.games.trivia.runner.GameRunner;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class GameRunnerTests {

    @Test
    public void testRuuner(){
        ByteArrayOutputStream stream = getConsoleOutput();
        GameRunner gameRunner = new GameRunnerForTests();
        gameRunner.run();

        assertEquals("Chet was added\r\n" +
                "They are player number 1\r\n" +
                "Pat was added\r\n" +
                "They are player number 2\r\n" +
                "Sue was added\r\n" +
                "They are player number 3\r\n" +
                "Chet is the current player\r\n" +
                "They have rolled a 3\r\n" +
                "Chet's new location is 3\r\n" +
                "The category is Rock\r\n" +
                "Rock Question 0\r\n" +
                "Question was incorrectly answered\r\n" +
                "Chet was sent to the penalty box\r\n" +
                "Pat is the current player\r\n" +
                "They have rolled a 4\r\n" +
                "Pat's new location is 4\r\n" +
                "The category is Pop\r\n" +
                "Pop Question 0\r\n" +
                "Answer was corrent!!!!\r\n" +
                "Pat now has 1 Gold Coins.\r\n" +
                "Sue is the current player\r\n" +
                "They have rolled a 3\r\n" +
                "Sue's new location is 3\r\n" +
                "The category is Rock\r\n" +
                "Rock Question 1\r\n" +
                "Answer was corrent!!!!\r\n" +
                "Sue now has 1 Gold Coins.\r\n" +
                "Chet is the current player\r\n" +
                "They have rolled a 2\r\n" +
                "Chet is not getting out of the penalty box\r\n" +
                "Pat is the current player\r\n" +
                "They have rolled a 3\r\n" +
                "Pat's new location is 7\r\n" +
                "The category is Rock\r\n" +
                "Rock Question 2\r\n" +
                "Answer was corrent!!!!\r\n" +
                "Pat now has 2 Gold Coins.\r\n" +
                "Sue is the current player\r\n" +
                "They have rolled a 3\r\n" +
                "Sue's new location is 6\r\n" +
                "The category is Sports\r\n" +
                "Sports Question 0\r\n" +
                "Answer was corrent!!!!\r\n" +
                "Sue now has 2 Gold Coins.\r\n" +
                "Chet is the current player\r\n" +
                "They have rolled a 3\r\n" +
                "Chet is getting out of the penalty box\r\n" +
                "Chet's new location is 6\r\n" +
                "The category is Sports\r\n" +
                "Sports Question 1\r\n" +
                "Answer was correct!!!!\r\n" +
                "Chet now has 1 Gold Coins.\r\n" +
                "Pat is the current player\r\n" +
                "They have rolled a 3\r\n" +
                "Pat's new location is 10\r\n" +
                "The category is Sports\r\n" +
                "Sports Question 2\r\n" +
                "Answer was corrent!!!!\r\n" +
                "Pat now has 3 Gold Coins.\r\n" +
                "Sue is the current player\r\n" +
                "They have rolled a 5\r\n" +
                "Sue's new location is 11\r\n" +
                "The category is Rock\r\n" +
                "Rock Question 3\r\n" +
                "Answer was corrent!!!!\r\n" +
                "Sue now has 3 Gold Coins.\r\n" +
                "Chet is the current player\r\n" +
                "They have rolled a 3\r\n" +
                "Chet is getting out of the penalty box\r\n" +
                "Chet's new location is 9\r\n" +
                "The category is Science\r\n" +
                "Science Question 0\r\n" +
                "Answer was correct!!!!\r\n" +
                "Chet now has 2 Gold Coins.\r\n" +
                "Pat is the current player\r\n" +
                "They have rolled a 1\r\n" +
                "Pat's new location is 11\r\n" +
                "The category is Rock\r\n" +
                "Rock Question 4\r\n" +
                "Answer was corrent!!!!\r\n" +
                "Pat now has 4 Gold Coins.\r\n" +
                "Sue is the current player\r\n" +
                "They have rolled a 3\r\n" +
                "Sue's new location is 2\r\n" +
                "The category is Sports\r\n" +
                "Sports Question 3\r\n" +
                "Answer was corrent!!!!\r\n" +
                "Sue now has 4 Gold Coins.\r\n" +
                "Chet is the current player\r\n" +
                "They have rolled a 5\r\n" +
                "Chet is getting out of the penalty box\r\n" +
                "Chet's new location is 2\r\n" +
                "The category is Sports\r\n" +
                "Sports Question 4\r\n" +
                "Answer was correct!!!!\r\n" +
                "Chet now has 3 Gold Coins.\r\n" +
                "Pat is the current player\r\n" +
                "They have rolled a 4\r\n" +
                "Pat's new location is 3\r\n" +
                "The category is Rock\r\n" +
                "Rock Question 5\r\n" +
                "Answer was corrent!!!!\r\n" +
                "Pat now has 5 Gold Coins.\r\n" +
                "Sue is the current player\r\n" +
                "They have rolled a 5\r\n" +
                "Sue's new location is 7\r\n" +
                "The category is Rock\r\n" +
                "Rock Question 6\r\n" +
                "Answer was corrent!!!!\r\n" +
                "Sue now has 5 Gold Coins.\r\n" +
                "Chet is the current player\r\n" +
                "They have rolled a 3\r\n" +
                "Chet is getting out of the penalty box\r\n" +
                "Chet's new location is 5\r\n" +
                "The category is Science\r\n" +
                "Science Question 1\r\n" +
                "Answer was correct!!!!\r\n" +
                "Chet now has 4 Gold Coins.\r\n" +
                "Pat is the current player\r\n" +
                "They have rolled a 5\r\n" +
                "Pat's new location is 8\r\n" +
                "The category is Pop\r\n" +
                "Pop Question 1\r\n" +
                "Answer was corrent!!!!\r\n" +
                "Pat now has 6 Gold Coins.\r\n",stream.toString());
    }

    private ByteArrayOutputStream getConsoleOutput (){
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(stream);
        System.setOut(printStream);
        return stream;
    }
}
