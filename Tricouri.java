import java.util.*;

public class Tricouri {

    static private Map<String, String> listaProduse = new HashMap<String, String>();

    public static void main(String[] args){
        listaProduse.put("1S01", "Tricou Albastru");
        listaProduse.put("1S02", "Tricou Negru");
        listaProduse.put("1M01", "Tricou Rosu");

        List<String> listaCoduri = new ArrayList<String>();

        listaCoduri.add("1S01");
        listaCoduri.add("1S01");
        listaCoduri.add("1S02");
        listaCoduri.add("1M01");
        listaCoduri.add("1M01");

        Map<String, Integer> cantitateProdus = new TreeMap<String, Integer>();
        for(String s : listaCoduri){
            if(!cantitateProdus.containsKey(listaProduse.get(s))){
                cantitateProdus.put(listaProduse.get(s), 1);
            }
            else {
                cantitateProdus.put(listaProduse.get(s), cantitateProdus.get(listaProduse.get(s)) + 1);
            }
        }

        System.out.println(cantitateProdus);
    }
}
