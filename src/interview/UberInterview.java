package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class UberInterview {

    class ValueIndex {
        private int value;
        private int index;

        public int getIndex() {
            return index;
        }

        public int getValue() {

            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public ValueIndex(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    Map<Integer, ValueIndex> hashMap = new HashMap<>();
    List<Integer> array = new ArrayList<>();
    int length = 0;

    public void insert(Integer key, Integer value) {
        int index = length;
        hashMap.put(key, new ValueIndex(value, index));
        array.add(key);
    }

    public Integer get(Integer key) {
        return hashMap.get(key).getValue();
    }

    public void delete(Integer key) {
        int index = hashMap.get(key).getIndex();
        swap(array, index, length - 1);
        length--;
        hashMap.remove(key);
        hashMap.get(array.get(index)).setIndex(index);
    }

    private void swap(List<Integer> array, Integer integer1, Integer integer2) {
        int temp = array.get(integer1);
        array.set(integer1, array.get(integer2));
        array.set(integer2, temp);
    }

    public int random() {
        Random random = new Random();
        int r = random.nextInt(length);
        return array.get(r);
    }
}

