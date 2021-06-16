package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    //    요구사항 1. size
    @Test
    void size() {
        assertThat(numbers.size()).isEqualTo(3);
    }

    //    요구사항 2. contains
    //    반복되는 코드가 나올때는 ParameterizedTest를 사용하여 단순화 할 수 있다.
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void contains(int number) {
        assertTrue(numbers.contains(number));
    }

    //    요구 사항 3. ParameterizedTest 심화
    @ParameterizedTest
    @CsvSource(value = {"1,1", "2,2", "3,3"})
    void contains2(int key, int value) {
        assertThat(numbers.contains(value)).isTrue();
    }
}
