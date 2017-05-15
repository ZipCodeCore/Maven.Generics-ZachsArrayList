import java.util.Arrays;

public class GenericArrayList {
    private Object[] elementData;
    private int size;

    public GenericArrayList() {
        elementData = new Object[0];
        size = 0;
    }

    public GenericArrayList(Object o) {
        elementData = new Object[1];
        elementData[0] = o;
        size = 1;
    }

    public GenericArrayList(Object[] os) {
        elementData = os;
        size = os.length;
    }

    public Object get(int i) {
        if(i < 0 || i >= elementData.length) {
            throw new IndexOutOfBoundsException(i + " is not a valid index.");
        } else {
            return elementData[i];
        }
    }

    public void add(Object o) {
        elementData = Arrays.copyOf(elementData, ++size);
        elementData[size - 1] = o;
    }

    public int size() {
        return size;
    }
}
