import java.util.Arrays;


public class Dynamic_sArray {
    public static void main(String[] args) {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();

        dynamicArray.add(2);
        dynamicArray.add(2);
        dynamicArray.add(5);
        dynamicArray.printElements();
        System.out.println(dynamicArray.get(2));
    }


    public static class DynamicArray<T>{
        int CAPACITY = 10;
        Object[] elementData;
        int size;//при каждой операции вставки увеличивается


        public DynamicArray(){
            elementData = new Object[CAPACITY];
            size = 0;
        }


        public void add(T el){
            if(size == CAPACITY - 1){
                elementData = Arrays.copyOf(elementData, elementData.length * 2);
            }
            elementData[size] = el;
            size++;

        }

        public void remove(int index){
            if (index < 0 || index > size) {
                throw new ArrayIndexOutOfBoundsException();
            }
            Object[] newArray = new Object[CAPACITY];
            int j = 0;
            for ( int i = 0; i < CAPACITY; i++) {
                if (i == index) {
                    continue;
                }
                newArray[j] = elementData[i];
                j++;
            }
            size--;
            elementData = newArray;

        }

        public T get(int index){
            if (index < 0 || index > size) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return (T)elementData[index];
        }

        public void printElements() {
            System.out.println("elements in array are :" + Arrays.toString(elementData));
        }


    }
}
