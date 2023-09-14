import org.example.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student();
    }

    @Test
    void testGettersAndSetters() {
        // Set values using setters
        student.setId(1);
        student.setAge(20);
        student.setName("John");

        // Check if getters return the correct values
        assertEquals(1, student.getId());
        assertEquals(20, student.getAge());
        assertEquals("John", student.getName());
    }

    @Test
    void testGetInfoMethod() {
        // Test the getInfo method
        student.getInfo(2, 25, "Alice");

        // Check if the getInfo method correctly sets the values
        assertEquals(2, student.getId());
        assertEquals(25, student.getAge());
        assertEquals("Alice", student.getName());
    }

    @Test
    void testInvalidAge() {
        // Test setting an invalid age (negative age)
        student.setAge(-5);

        // Check that the age remains unchanged (should be non-negative)
        assertEquals(0, student.getAge());
    }

    @Test
    void testNullName() {
        // Test setting a null name
        student.setName(null);

        // Check that the name remains unchanged (should not be null)
        assertNull(student.getName());
    }

    @Test
    void testNegativeId() {
        // Test setting a negative ID
        student.setId(-1);

        // Check that the ID remains unchanged (should not be negative)
        assertEquals(0, student.getId());
    }
}
