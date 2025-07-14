package creational.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.puzre.creational.singleton.SingleThreadSingleton;
import org.puzre.creational.singleton.ThreadSafeSingleton;

import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {

    @Test
    @DisplayName("Single Thread Singleton Test")
    public void singleThreadSingletonTest() {

        SingleThreadSingleton firstSingleton = SingleThreadSingleton.getInstance("LOTUS");
        SingleThreadSingleton secondSingleton = SingleThreadSingleton.getInstance("SUNFLOWER");

        System.out.println(firstSingleton.getValue());
        System.out.println(secondSingleton.getValue());

        String expectedValue = "LOTUS";
        String actualValue = secondSingleton.getValue();

        assertEquals(expectedValue, actualValue);

    }

    @Test
    @DisplayName("Thread Safe Singleton")
    public void threadSafeSingletonTest() throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<ThreadSafeSingleton> createFirstSingleton = () -> ThreadSafeSingleton.getInstance("LOTUS");
        Callable<ThreadSafeSingleton> createSecondSingleton = () -> ThreadSafeSingleton.getInstance("SUNFLOWER");

        Future<ThreadSafeSingleton> firstSingletonFuture = executorService.submit(createFirstSingleton);
        Future<ThreadSafeSingleton> secondSingletonFuture = executorService.submit(createSecondSingleton);

        ThreadSafeSingleton firstSingleton = firstSingletonFuture.get();
        ThreadSafeSingleton secondSingleton = secondSingletonFuture.get();

        System.out.println(firstSingleton.getValue());
        System.out.println(secondSingleton.getValue());

        assertSame(firstSingleton, secondSingleton);

        executorService.close();

    }

}
