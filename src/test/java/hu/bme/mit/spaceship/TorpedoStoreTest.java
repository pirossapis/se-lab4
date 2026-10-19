package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

    @Test
    void fire_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(true, result);
    }
    @Test
    void fire_successDecreasesCount() {
        TorpedoStore store = new TorpedoStore(3, 0.0);
 
        assertTrue(store.fire(1));
        assertEquals(2, store.getTorpedoCount());
    }
 
    @Test
    void fire_allTorpedoesEmptiesStore() {
        TorpedoStore store = new TorpedoStore(2, 0.0);
 
        assertTrue(store.fire(2));
        assertEquals(0, store.getTorpedoCount());
        assertTrue(store.isEmpty());
    }
    @Test
    void isEmpty_trueWhenNegativeInitialCount() {
        TorpedoStore store = new TorpedoStore(-1, 0.0);
 
        assertTrue(store.isEmpty());
    }
}
