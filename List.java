import java.util.ArrayList;
public class List {

    private ArrayList<String> data;

    public List() {
        data = new ArrayList<>();
    }
    public void add(String element) {
        data.add(element);
    }
    public void add(int index, String element) {
        if (index < 0 || index > data.size()) {
            System.out.println("невірний індекс");
            return;
        }
        data.add(index, element);
    }
    public void remove(int index) {
        if (index < 0 || index >= data.size()) {
            System.out.println("невірний індекс");
            return;
        }
        data.remove(index);
    }
    public String get(int index) {
        if (index < 0 || index >= data.size()) {
            return "невірний індекс";
        }
        return data.get(index);
    }
    public int getSize() {
        return data.size();
    }
    public int getCapacity() {
        return data.size();
    }
}