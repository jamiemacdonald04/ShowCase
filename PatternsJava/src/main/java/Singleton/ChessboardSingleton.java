package Singleton;

public final class ChessboardSingleton {
    private static ChessboardSingleton singleInstance;
    public String Name;
    //run in private only once throughout an applications' life cycle.
    private ChessboardSingleton(String name) {
        this.Name = name;
    }

    // is it already created then return it else start a new one.  See test for more of an explanation
    public static ChessboardSingleton GetBoard(String name) {
        if (singleInstance == null) {
            singleInstance = new ChessboardSingleton(name);
        }
        return singleInstance;
    }

}
