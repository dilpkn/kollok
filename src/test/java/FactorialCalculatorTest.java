import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {

    @Test
    void testValidInput() {
        assertEquals(List.of(1L), FactorialCalculator.calculateFactorials(1));
        assertEquals(List.of(1L, 1L, 2L, 6L, 24L, 120L, 720L, 5040L, 40320L, 362880L,
                        3628800L, 39916800L, 479001600L, 6227020800L,
                        87178291200L, 1307674368000L),
                FactorialCalculator.calculateFactorials(16));
    }

    @Test
    void testInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.calculateFactorials(0));
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.calculateFactorials(-5));
    }
}
