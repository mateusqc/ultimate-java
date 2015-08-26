package util;

/**
 * Represents the four primary edges are represented, along with NONE.
 *
 * The grid referenced has x positive to the right and y positive downwards on
 * screen.
 *
 * @author Eben Howard - http://squidpony.com - howard@squidpony.com
 */
public enum DirectionCardinal {

    UP(0, -1, '^'), DOWN(0, 1, 'v'), LEFT(-1, 0, '<'), RIGHT(1, 0, '>'), NONE(0, 0, '-');
    /**
     * An array which holds only the four cardinal directions.
     */
    public static final DirectionCardinal[] CARDINALS = {UP, DOWN, LEFT, RIGHT};
    /**
     * The x coordinate difference for this direction.
     */
    public final int deltaX;
    /**
     * The y coordinate difference for this direction.
     */
    public final int deltaY;

    public final char symbol;

    /**
     * Returns the direction that most closely matches the input.
     *
     * @param x
     * @param y
     * @return
     */
    static public DirectionCardinal getDirection(int x, int y) {
        if (x == 0 && y == 0) {
            return NONE;
        }

        double angle = Math.atan2(y, x);
        double degree = Math.toDegrees(angle);
        degree += 90 + 360;//rotate to all positive and 0 is up
        degree %= 360;//normalize
        if (degree < 45) {
            return UP;
        } else if (degree < 135) {
            return RIGHT;
        } else if (degree < 225) {
            return DOWN;
        } else if (degree < 315) {
            return LEFT;
        } else {
            return UP;
        }
    }

    /**
     * Gets the direction associated with the passed in character. If there is
     * no direction associated then null is returned.
     *
     * @param c
     * @return
     */
    static public DirectionCardinal getDirection(char c) {
        for (DirectionCardinal d : values()) {
            if (d.symbol == c) {
                return d;
            }
        }
        return null;
    }

    /**
     * Returns the Direction one step clockwise.
     *
     * @return
     */
    public DirectionCardinal clockwise() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            case NONE:
            default:
                return NONE;
        }
    }

    /**
     * Returns the Direction one step counterclockwise.
     *
     * @return
     */
    public DirectionCardinal counterClockwise() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            case NONE:
            default:
                return NONE;
        }
    }

    /**
     * Returns the direction directly opposite of this one.
     *
     * @return
     */
    public DirectionCardinal opposite() {
        switch (this) {
            case UP:
                return DOWN;
            case DOWN:
                return UP;
            case LEFT:
                return RIGHT;
            case RIGHT:
                return LEFT;
            case NONE:
            default:
                return NONE;
        }
    }

    private DirectionCardinal(int x, int y, char symbol) {
        this.deltaX = x;
        this.deltaY = y;
        this.symbol = symbol;
    }
}
