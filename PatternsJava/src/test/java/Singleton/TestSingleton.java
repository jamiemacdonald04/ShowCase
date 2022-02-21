package Singleton;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class TestSingleton {
    @Test
    void justCreatedOnce() {
        String boardName = "The Duck And Horse";
        String storedBoardName = this.createBoard(boardName);
        assertEquals(boardName, storedBoardName);
    }

    @Test
    void justCreatedThreeTimes() {
        String firstBoardName = "The Duck And Horse";
        String storedBoardName = this.createBoard(firstBoardName);
        String secondBoardName = "The Dug And Pony";
        String hasTextChanged= this.createBoard(secondBoardName);

        assertNotEquals(firstBoardName,secondBoardName);
        assertEquals(hasTextChanged, storedBoardName);
    }

    private String createBoard(String NameBoardThis){
        var boardName = NameBoardThis;
        var board = ChessboardSingleton.GetBoard(boardName);
        return board.Name;
    }
}
