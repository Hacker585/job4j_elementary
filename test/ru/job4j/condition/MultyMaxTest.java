package ru.job4j.condition;


    import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

    public class MultyMaxTest {
        @Test
        public void whenSecondMax() {
            int result = MultyMax.max(1, 4, 2);
            assertThat(result, is(4));
        }
    }

