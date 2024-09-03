public class Main {
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("Size: " + map.size());
        System.out.println("Value for 'One': " + map.get("One"));
        System.out.println("Value for 'Two': " + map.get("Two"));

        map.remove("Two");
        System.out.println("Size after removing 'Two': " + map.size());

        map.clear();
        System.out.println("Size after clearing: " + map.size());
    }
}
