package test;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import static com.projekt2.DRoot.digital_root;

public class DRootTest {
    @Test
    public void tests() {
        assertEquals("Nope!", 7, digital_root(16));
        assertEquals("Nope!", 6, digital_root(456));
    }
}
