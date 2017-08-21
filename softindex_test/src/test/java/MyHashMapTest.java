import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Neo on 21.08.2017.
 */
public class MyHashMapTest {
    @Test
    public void firstTest() throws Exception {
        MyHashMap map = new MyHashMap();
        for (int i = 0; i < 3; i++) {
            map.put(i,0.32+i);

        }

        //Test for size
        assertEquals(3,map.getSize());
        //Tests for put and get
        assertEquals(1.32,map.get(1), 1);
        assertEquals(2.32,map.get(2), 1);

        // Test for updating value
        map.put(1,2.32);
        assertEquals(2.32,map.get(1), 1);

    }

    @Test
    public void sizeTest(){
        //Test for map with capacity
        MyHashMap map = new MyHashMap(3000);
        for (int i = 0; i < 2999; i++) {
            map.put(i,0.32+i);

        }

        //Test for size
        assertEquals(2999,map.getSize());

        //Tests for put and get
        assertEquals(1.32,map.get(1), 1);
        assertEquals(2.32,map.get(2), 1);

        // Test for updating value
        map.put(1,2.32);
        assertEquals(2.32,map.get(1), 1);
    }

}