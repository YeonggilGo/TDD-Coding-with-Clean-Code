package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class StringTest {
    //  테스트 잘 되는지 확인
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    //   요구 사항 1. split
    @Test
    void split() {
        String[] actual = "1,2".split(",");
        String[] actual2 = "1".split(",");
        assertThat(actual).contains("1");
        assertThat(actual).contains("2");
        assertThat(actual2).containsExactly("1");
//        아래 코드는 false
//        assertThat(actual).containsExactly("1");
    }

    //    요구 사항 2. substring
    @Test
    void substring() {
        String actual = "(1,2)".substring(1, 4);
        assertThat(actual).isEqualTo("1,2");
    }

    //    요구사항 3. charAt & exception
    @Test
    @DisplayName("Test charAt method and IndexOutOfBountsException")
    void charAt() {
        String actual = "abc";
        assertThat(actual.charAt(0)).isEqualTo('a');
        int i = 3;
        assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() -> {
            assertThat(actual.charAt(i)).isEqualTo('a');
        })
                .withMessage("String index out of range: %d", i);

    }
}
