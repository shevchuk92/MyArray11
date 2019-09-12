import static org.junit.Assert.*;

public class MyArraysTest {

    MyArrays myArrays = new MyArrays();

    @org.junit.Test
    public void myArrayAmount() {
        int actual = myArrays.myArrayAmount(Main.arr);
        int expected = 51;
        assertEquals(actual,expected);
    }

    @org.junit.Test
    public void myArraySort() {
        int[] actual = myArrays.myArraySort(Main.arr);
        int[] expected = {10, 2, 4, 5, 11, 7, 9, 3};
        assertArrayEquals(actual,expected);
    }


}