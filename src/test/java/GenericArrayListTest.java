import org.junit.Assert;
import org.junit.Test;

public class GenericArrayListTest {
    @Test(expected=IndexOutOfBoundsException.class)
    public void testEmptyConstructor() throws Exception {
        GenericArrayList gal = new GenericArrayList();
        Assert.assertEquals(gal.size(), 0);
        gal.get(0);
    }

    @Test(expected=IndexOutOfBoundsException.class)
    public void testItemConstructor() throws Exception {
        Object obj0 = new Object();

        GenericArrayList gal = new GenericArrayList(obj0);

        Assert.assertEquals(obj0, gal.get(0));
        Assert.assertEquals(gal.size(), 1);

        gal.get(2);
    }

    @Test(expected=IndexOutOfBoundsException.class)
    public void testArrayConstructor() throws Exception {
        Object obj0 = new Object();
        Object obj1 = new Object();
        Object obj2 = new Object();

        Object[] objects = {obj0, obj1, obj2};

        GenericArrayList gal = new GenericArrayList(objects);

        Assert.assertEquals(obj0, gal.get(0));
        Assert.assertEquals(obj1, gal.get(1));
        Assert.assertEquals(obj2, gal.get(2));
        Assert.assertEquals(gal.size(), 3);
        gal.get(3);
    }

    @Test
    public void testAdd() throws Exception {
        Object obj0 = new Object();
        Object obj1 = new Object();

        GenericArrayList gal = new GenericArrayList();

        Assert.assertEquals(gal.size(), 0);

        gal.add(obj0);

        Assert.assertEquals(gal.size(), 1);
        Assert.assertEquals(gal.get(0), obj0);

        gal.add(obj1);

        Assert.assertEquals(gal.size(), 2);
        Assert.assertEquals(gal.get(0), obj0);
        Assert.assertEquals(gal.get(1), obj1);
    }
}