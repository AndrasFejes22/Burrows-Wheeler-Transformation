package burrowsWheleer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BurrowsWheelerTest {

    @Test
    void shiftTest() {
        assertEquals("rbananaba", BurrowsWheeler.shift("bananabar"));
        assertEquals("arbananab", BurrowsWheeler.shift("rbananaba"));
    }

    @Test
    public void encodeTests() {
        assertEquals(new BWT("nnbbraaaa", 4),     BurrowsWheeler.encode("bananabar"));
        assertEquals(new BWT("e emnllbduuHB", 2), BurrowsWheeler.encode("Humble Bundle"));
        assertEquals(new BWT("ww MYeelllloo", 1), BurrowsWheeler.encode("Mellow Yellow"));
    }
}