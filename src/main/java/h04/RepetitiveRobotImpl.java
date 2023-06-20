package h04;

import fopbot.Direction;
import fopbot.Robot;

public class RepetitiveRobotImpl extends Robot implements WithNaturalCoordinates, RepetitiveRobot {

    private int moveRepetitions = 0;
    private int turnLeftRepitions = 0;
    private int pickCoinRepetitions = 0;
    private int putCoinRepetitions = 0;

    /**
     * Constructor of the class RepetitiveRobotImpl
     * @param x amound of Reps
     */
    public RepetitiveRobotImpl(int x) {
        super(0, 0, Direction.UP, 100);
        putCoin(x);
    }

    @Override
    public void move(int x) {
        if (x < 0) {
            crash();
        }
        for (int i = 0; i < x; i++) {
            move();
        }
        moveRepetitions += x;
    }

    @Override
    public void turnLeft(int x) {
        if (x < 0) {
            crash();
        }
        for (int i = 0; i < x; i++) {
            turnLeft();
        }
        turnLeftRepitions += x;
    }

    @Override
    public void putCoin(int x) {
        if (x < 0) {
            crash();
        }
        for (int i = 0; i < x; i++) {
            putCoin();
        }
        putCoinRepetitions += x;
    }

    @Override
    public int getMoveRepetitions() {
        return moveRepetitions;
    }

    @Override
    public int getTurnLeftRepititions() {
        return turnLeftRepitions;
    }

    @Override
    public int getPutCoinRepetitions() {
        return putCoinRepetitions;
    }

    @Override
    public int getPickCoinRepetitions() {
        return pickCoinRepetitions;
    }

    @Override
    public void setX(int x) {
        super.setX(x > 0 ? x : -x);
    }

    @Override
    public void setY(int y) {
        super.setY(y < 0 ? -y : y);
    }
}
