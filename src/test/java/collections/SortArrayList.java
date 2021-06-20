package collections;

import java.util.*;

public class SortArrayList {
    private String customProperty;

    public SortArrayList(String property) {
        this.customProperty = property;
    }

    public String getCustomProperty() {
        return this.customProperty;
    }

    public static void main(String[] args) {

        ArrayList<SortArrayList> list = new ArrayList<>();
        list.add(new SortArrayList("Z"));
        list.add(new SortArrayList("A"));
        list.add(new SortArrayList("B"));
        list.add(new SortArrayList("X"));
        list.add(new SortArrayList("Aa"));

        list.sort((o1, o2) -> o1.getCustomProperty().compareTo(o2.getCustomProperty()));

        for (SortArrayList obj : list) {
            System.out.println(obj.getCustomProperty());
        }
    }
}
