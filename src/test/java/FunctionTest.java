import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
public class FunctionTest {
    Function function;
    @BeforeAll
   public void createObject() {
    function = new Function(1);
    }
    @Test
    public void functionResult(){
        Assertions.assertEquals(10.0, Function.func(),0.5);
    }

    @Test
    public void nCheck(){
        boolean check = Function.getX() > 0;
        Assertions.assertEquals(true, check);
    }
}