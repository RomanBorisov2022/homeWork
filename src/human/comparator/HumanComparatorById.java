package human.comparator;

import human.Human;

import java.util.Comparator;

public class HumanComparatorById implements Comparator<Human>{
    @Override
    public int compare(Human o1, Human o2) {
        return Integer.compare(o1.getId(), o2.getId());
//        return o1.getId() - o2.getId();  --- то же самое
    }
}
