/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alext
 */
public class BoardTest {
    
    private Board board;
    
    public BoardTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    
    
    /**
     * Test of Board method, of class Board.
     */
    @org.junit.jupiter.api.Test
    public void testDefaultConstructoe() {
        System.out.println("test default constructor");
        Board instance = new Board();
        for(int i = 0; i<Board.SIZE;++i){
            assertEquals(instance.getCellContent(i),Board.CELL_NONE);
        }
        assertEquals(instance.getNextMark(),Board.CELL_X);
    }
    
    /**
     * Test of Board copy method, of class Board.
     */
    @org.junit.jupiter.api.Test
    public void testCopyConstructoe() {
        System.out.println("test copy constructor");
        Board board = new Board();
        board.applyMove(0);
        board.applyMove(1);
        board.applyMove(4);
        Board copy = new Board(board);
        for(int i = 0; i<Board.SIZE;++i){
            assertEquals(board.getCellContent(i),copy.getCellContent(i));
        }
        assertEquals(board.getNextMark(),copy.getNextMark());
    }

    /**
     * Test of getNextMark method, of class Board.
     */
    @org.junit.jupiter.api.Test
    public void testGetNextMark() {
        System.out.println("test getNextMark");
        Board board = new Board();
        board.applyMove(0);
        board.applyMove(1);
        board.applyMove(4);
        
        assertEquals(board.getNextMark(),Board.CELL_O);
         
    }
    
    /**
     * Test of getNextMark method, of class Board.
     */
    @org.junit.jupiter.api.Test
    public void testGetNextMark2() {
        System.out.println("test getNextMark");
        Board board = new Board();
        board.applyMove(0);
        board.applyMove(1);
        board.applyMove(4);
        board.applyMove(8);
        
        assertEquals(board.getNextMark(),Board.CELL_X);
         
    }

    /**
     * Test of getCellContent method, of class Board.
     */
    @org.junit.jupiter.api.Test
    public void testGetCellContent() {
        System.out.println("getCellContent");
        int position = 0;
        Board instance = new Board();
        int expResult = 0;
        int result = instance.getCellContent(position);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidMove method, of class Board.
     */
    @org.junit.jupiter.api.Test
    public void testIsValidMove() {
        System.out.println("isValidMove");
        int move = 0;
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.isValidMove(move);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of applyMove method, of class Board.
     */
    @org.junit.jupiter.api.Test
    public void testApplyMove() {
        System.out.println("applyMove");
        int move = 0;
        Board instance = new Board();
        instance.applyMove(move);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEnded method, of class Board.
     */
    @org.junit.jupiter.api.Test
    public void testIsEnded() {
        System.out.println("isEnded");
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.isEnded();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWinner method, of class Board.
     */
    @org.junit.jupiter.api.Test
    public void testGetWinner() {
        System.out.println("getWinner");
        Board instance = new Board();
        int expResult = 0;
        int result = instance.getWinner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOpponentMark method, of class Board.
     */
    @org.junit.jupiter.api.Test
    public void testGetOpponentMark() {
        System.out.println("getOpponentMark");
        int mark = 0;
        int expResult = 0;
        int result = Board.getOpponentMark(mark);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
