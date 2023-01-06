import static org.junit.Assert.*;

public class LC1695Test {

    @org.junit.Test
    public void maxScore() {
        int actual1 = LC1695.maxScore(new int[] {4,2,4,5,6});
        int actual2 = LC1695.maxScore(new int[] {5,2,1,2,5,2,1,2,5});

        assertEquals(17, actual1);
        assertEquals(8, actual2);
    }
}