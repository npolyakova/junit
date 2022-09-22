import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CatTest extends Assertions {

    private Cat cat;

    @BeforeEach
    public void createCat() {
        cat = new Cat();
    }

    @Test
    public void shouldGetHungryTest() {
        assertTrue(cat.getHungry());
    }

    @Test
    public void shouldSetNotHungryTest() {
        cat.setNotHungry();
        assertFalse(cat.getHungry());
    }

    @Test
    @Disabled
    public void shouldMeowTest() {
        cat.meow(2); //FIXME добавить проверку
    }

}
