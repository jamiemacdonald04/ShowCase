package Singleton;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestSingleton {
    @Test
    public void justCreatedOnce() {
        String boardName = "The Duck And Horse";
        String storedBoardName = this.createBoard(boardName);
        assertEquals(boardName, storedBoardName);
    }

    @Test
    public void justCreatedThreeTimes() {
        String firstBoardName = "The Duck And Horse";
        String storedBoardName = this.createBoard(firstBoardName);
        String secondBoardName = "The Dug And Pony";
        String hasTextChanged= this.createBoard(secondBoardName);

        assertNotEquals(firstBoardName,secondBoardName);
        assertEquals(hasTextChanged, storedBoardName);
    }

    private String createBoard(String NameBoardThis){
        return ChessboardSingleton.GetBoard(NameBoardThis).Name;
    }
}
