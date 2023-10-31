package midtermDA;
import static org.junit.Assert.*;
import org.junit.Test;
import demopackage.Person;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PersonTest {
    
    @Test
    public void testCorrectInput() {
        Person person = new Person();
        String result = person.validatePerson("ram", 3025);
        assertEquals("Correct Input", result);
    }
    
    @Test
    public void testIncorrectInput() {
        Person person = new Person();
        String result = person.validatePerson("xyz", 1234);
        assertEquals("Incorrect Input", result);
    }
}
