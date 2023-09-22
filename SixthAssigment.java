import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SixthAssigment {
    public static void main(String[] args) {
        SimpleDataStructure<Integer> dataStructure = new SimpleDataStructure<>();

        dataStructure.insert(1);
        dataStructure.insert(2);
        dataStructure.insert(3);

        System.out.println("Contains 2: " + dataStructure.contains(2));
        System.out.println("Contains 4: " + dataStructure.contains(4));

        dataStructure.delete(2);
        System.out.println("Contains 2 after deletion: " + dataStructure.contains(2));

        System.out.println("Size: " + dataStructure.size());
    }


    public static class SimpleDataStructure<T> {
        private List<T> items;
        private Set<T> itemSet;

        public SimpleDataStructure() {
            items = new ArrayList<>();
            itemSet = new HashSet<>();
        }

        public void insert(T item) {
            if (!itemSet.contains(item)) {
                items.add(item);
                itemSet.add(item);
            }
        }

        public void delete(T item) {
            if (itemSet.contains(item)) {
                items.remove(item);
                itemSet.remove(item);
            }
        }

        public boolean contains(T item) {
            return itemSet.contains(item);
        }

        public int size() {
            return items.size();
        }
    }

}

