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
        assertEquals(new BurrowsWheeler.BWT2("nnbbraaaa", 4),     BurrowsWheeler.encode("bananabar"));
        assertEquals(new BurrowsWheeler.BWT2("e emnllbduuHB", 2), BurrowsWheeler.encode("Humble Bundle"));
        assertEquals(new BurrowsWheeler.BWT2("ww MYeelllloo", 1), BurrowsWheeler.encode("Mellow Yellow"));
        assertEquals(new BurrowsWheeler.BWT2("ww MYeelllloo", 1), BurrowsWheeler.encode("Mellow Yellow"));
    }

    @Test
    public void decodeTests() {
        assertEquals("bananabar",     BurrowsWheeler.decode("nnbbraaaa", 4));
        assertEquals("",     BurrowsWheeler.decode("", -1));
        assertEquals("",     BurrowsWheeler.decode("", 1));
        assertEquals("Humble Bundle", BurrowsWheeler.decode("e emnllbduuHB", 2));
        assertEquals("Mellow Yellow", BurrowsWheeler.decode("ww MYeelllloo", 1));
    }
}