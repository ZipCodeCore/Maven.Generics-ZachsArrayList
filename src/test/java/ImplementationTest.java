import org.junit.Assert;
import org.junit.Test;

public class ImplementationTest {

    /**
     * Make this test pass by adding up all the items in the GenericArrayList.
     * @throws Exception
     */
    @Test
    public void sumIntegers() throws Exception {
        Integer[] intArr = {1, 2, 3};
        GenericArrayList gal = new GenericArrayList(intArr);
        gal.add(4);
        int sum = 0;
        /**
         * Here's where you need to sum up all the items in the Array.
         */
        Assert.assertEquals(10, sum);
    }

    /**
     * Make this test pass by concatenating all the strings and making them uppercase.
     * NOTE: Uppercase the strings before adding them to `outstring`.
     * @throws Exception
     */
    @Test
    public void stringConcatenation() throws Exception {
        GenericArrayList gal = new GenericArrayList();
        gal.add("hello");
        gal.add(", ");
        gal.add("world!");
        String outString = "";
        /**
         * Here's where you need to upper case each of the items in the GenericArrayList and then cat them together.
         */
        Assert.assertEquals("HELLO, WORLD!", outString);
    }

    /**
     * Make sure that JUnit is expecting an exception.  Remember, this will still compile no problem.  Why?
     * @throws Exception
     */
    @Test
    public void testWithMixed() throws Exception {
        GenericArrayList gal = new GenericArrayList();
        gal.add(1);
        gal.add(0);
        gal.add(1.2);
        gal.add("foobar");
        int sum = 0;
        for(int i = 0; i < gal.size(); i++) {
            sum += (Integer)gal.get(i);
        }
    }
}
