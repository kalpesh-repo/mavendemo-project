import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class TestTreeMap {
	public static void main(String[] args) throws CloneNotSupportedException {
		Dog d1 = new Dog("red", 30);
		Dog d2 = new Dog("black", 20);
		Dog d3 = new Dog("white", 10);
		Dog d4 = new Dog("white", 10);
		TreeMap<Dog, Integer> treeMap = new TreeMap<>();
		treeMap.put(d1, 10);
		treeMap.put(d2, 15);
		treeMap.put(d3, 5);
		treeMap.put(d4, 20);
		for (Entry<Dog, Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		System.out.println("//////////////////////////////////////////");
		HashMap<Dog, Integer> hashMap = new HashMap<>();
		hashMap.put(d1, 10);
		hashMap.put(d2, 15);
		hashMap.put(d3, 5);
		hashMap.put(d4, 20);

		
		Map<String, Integer> map = new ConcurrentHashMap<>();
		map.put("", 10);
		for (Entry<Dog, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
		Employee e1 = new Employee();
		Employee e3 = new Employee();
		
		Employee e2 = (Employee) e1.clone();
		
		e1.setName("dfdf");
		e3.setName("dfdf");
		System.out.println(e1.getName());
		System.out.println(e2.getName());
		
		String s1 = new String();
		String s2 = new String();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(e1.hashCode());
		System.out.println(e3.hashCode());
		System.out.println("Is Equal = "+e1.equals(e3));
		
	}
}