import java.security.SecureRandom;
import java.util.*;

public class HomeWork5 {
    public static void main(String[] args) {
        // Создать словарь HashMap. Обобщение <Integer, String>.
        HashMap<Integer, String> hashMap = new HashMap<>();
        // Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
        hashMap.put(1, "RED");
        hashMap.put(2, "BLUE");
        hashMap.put(3, "GREEN");
        //Изменить значения дописав восклицательные знаки.
        hashMap.put(1, "RED" + "!");
        hashMap.put(2, "BLUE" + "!");
        hashMap.put(3, "GREEN" + "!");

        // Создать TreeMap
        TreeMap<Integer, String> tree = new TreeMap<>();
        //ИЗаполнить тремя ключами (индекс, цвет).
        tree.put(1, "RED" + "!");
        tree.put(2, "BLUE" + "!");
        tree.put(3, "GREEN" + "!");
        //Увеличить количество элементов до 1000 случайными ключами и общей строкой
        for (int i = 1; i < 1001; i++) {
            tree.put(i, Integer.toString(i));

        }
        //Время последовательного
        long begin_1 = System.currentTimeMillis();
        Iterator<Map.Entry<Integer, String>> itr = tree.entrySet().iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
        System.out.println(System.currentTimeMillis() - begin_1 + "ms");

        //случайного перебора тысячи элементов словарей
        long begin_2 = System.currentTimeMillis();
        var random = new SecureRandom();
        var list = new ArrayList<>(tree.keySet());
        for (int i = 0; i < list.size(); i++) {
            int randomIndex = random.nextInt(list.size());
            var randomElement = list.get(randomIndex);
            list.remove(randomIndex);
        }
        System.out.println(System.currentTimeMillis() - begin_2 + "ms");
    }
}
