package Baseball;

public enum BallStatus {
    BALL, STRIKE, NOTHING;

    public static boolean isNotNothing(BallStatus ballStatus) {
        return ballStatus != NOTHING;
    }
}
