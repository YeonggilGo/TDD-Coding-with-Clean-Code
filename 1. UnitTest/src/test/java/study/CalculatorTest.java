package study;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator cal;

    @BeforeEach
    void setUp() {
        cal = new Calculator();
    }

    @Test
    void calculate() {
        assertThat(cal.calulate()).isEqualTo(10);
//        JUnitTest 에서 System.in을 어떻게 받지... 그냥 직접 줄까
    }

    @AfterEach
    void tearDown() {
        cal = null;
    }
}