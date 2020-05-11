package exercises.technology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {

    @Test
    public void bootsUpCorrectly(){
        Computer testComputer = new Computer("testy","Tandy","T-1000","MS-DOS");
        testComputer.bootUp();
        assertEquals(true, testComputer.isOnline() && testComputer.isPowered());
    }

    @Test
    public void shutsDownCorrectly(){
        Computer testComputer = new Computer("testy","Tandy","T-1000","MS-DOS");
        testComputer.shutDown();
        assertEquals(true, !testComputer.isOnline() && !testComputer.isPowered());
    }

}
