package h04;

public interface RepetitiveRobot {

    /**
     * Move defined times
     * @param x defines Reps
     */
    void move(int x);

    /**
     * turnLeft defines times
     * @param x defines Reps
     */
    void turnLeft(int x);

    /**
     * putCoins defines times
     * @param x defined Reps
     */
    void putCoin(int x);

    /**
     * @return total Reps of move
     */
    int getMoveRepetitions();

    /**
     * @return total Reps of turnLeft
     */
    int getTurnLeftRepititions();

    /**
     * @return total Reps of putCoin
     */
    int getPutCoinRepetitions();

    /**
     * @return total Reps of pickCoin
     */
    int getPickCoinRepetitions();
}
