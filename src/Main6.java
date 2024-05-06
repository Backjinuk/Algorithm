import java.util.*;

public class Main6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().toUpperCase().split("");

        Map<String, Integer> map = new HashMap<>();

        for (char c = 'A'; c <= 'Z'; c++ ){
            map.put(String.valueOf(c), 0);
        };

        for (int i = 0; i < array.length; i++) {
            if(map.containsKey(array[i])){
                map.put(array[i], (map.get(array[i]) + 1));
            }
        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        if(entryList.get(0).getValue() == entryList.get(1).getValue()){
            System.out.println("?");
        }else{
            System.out.println(entryList.get(0).getKey());
        }
    }
}
