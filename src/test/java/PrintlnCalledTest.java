import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.io.PrintStream;
import static org.mockito.Mockito.*;


public class PrintlnCalledTest {

    @Mock
    PrintStream mockedSystemOut;

   // @InjectMocks
    PrintlnCalled printlnCalled = new PrintlnCalled();

    final private PrintStream systemOut = System.out;

    @Before
    public void setUp() throws Exception {
        mockedSystemOut = mock(System.out.getClass());
        //把输出流设为MOCK的对象
        System.setOut(mockedSystemOut);
    }

    @Test
    public void testPrintlnTimes() {
        int[] arr = {1,2,3,4,5};
        printlnCalled.printArrayElement(arr);
        //验证MOCK对象的println()方法被调用的次数，此处用了Argument matchers : anyString()
        verify(mockedSystemOut, times(5)).println(anyString());
    }

    @After
    public void tearDown() throws Exception {
        //测试结束，恢复输出流的默认值
        System.setOut(systemOut);
    }
}
