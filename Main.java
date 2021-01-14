import java.util.*;
import java.util.concurrent.DelayQueue;

public class Main {

    static public <T>void printArray(T[] elements){
        for(T t : elements){
            System.out.println(t + " ");
        }
    }

    static public Double sum(List<? extends Number> elements){
        double suma = 0.0;

        for(Number number : elements){
            suma += number.doubleValue();
        }

        return suma;
    }

    static public void printArray2(List<? super Integer> elements){
        for(Object element : elements) {
            System.out.println(element + " ");
        }
    }

    static public <T>void search(List<?> elements, T object){

        if(elements.contains(object)){
            System.out.println("Obiectul exista in lista");
        }
        else{
            System.out.println("Obiectul nu exista in lista");
        }
    }

    static public <T, S extends T>S max(S[] coll, Comparator<? super T> comp){
        S maxValue = coll[0];

        for(int index = 1; index<coll.length; ++index){
            if(comp.compare(maxValue, coll[index]) == -1){
                maxValue = coll[index];
            }
        }

        return maxValue;
    }

    public static void main(String[] args){
        Generic<Integer> obiect1 = new Generic<Integer>();
        Generic<String> obiect2 = new Generic<String>();

        obiect1.setObject(2);
        obiect2.setObject("Doi");
        System.out.println(obiect1.getObject() + " " + obiect2.getObject());
        System.out.println();

        String[] elements = new String[]{"Unu", "Doi", "Trei", "Patru", "Cinci"};
        printArray(elements);
        System.out.println();

        List<Integer> doubles = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Suma este: " + sum(doubles));
        System.out.println();

        List<Number> list = Arrays.asList(1, 3.5, 9.4, 12);
        printArray2(list);
        System.out.println();

        List<String> stringList = Arrays.asList("Unu", "Doi", "Trei", "Patru", "Cinci");
        search(stringList, 2);
        System.out.println();

        MultiGeneric<Integer, String> testMultiGen = new MultiGeneric<Integer, String>(1, "Luni");
        MultiGeneric<Integer, Double> testMultiGen2 = new MultiGeneric<Integer, Double>(4, Math.sqrt(4));
        System.out.println(testMultiGen.getLeft() + " " + testMultiGen.getRight());
        System.out.println(testMultiGen2.getLeft() + " " + testMultiGen2.getRight());
        System.out.println();

        GenericArray<Integer> myArray = new GenericArray<Integer>(10);
        myArray.addElem(2);
        myArray.addElem(6);
        myArray.print();
        System.out.println();

        System.out.println(max(elements, new StringComparator()));
        System.out.println();

        Queue<String> priorityQueue = new PriorityQueue<String>();
        priorityQueue.add("Trei");
        priorityQueue.add("Cinci");
        priorityQueue.add("Doi");

        while(!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
        System.out.println();

        Deque<Integer> myQueue = new ArrayDeque<Integer>();
        myQueue.add(10);
        myQueue.add(5);
        myQueue.add(23);
        System.out.println(myQueue.peekFirst() + " " + myQueue.peekLast());

        while(!myQueue.isEmpty()){
            System.out.println(myQueue.pollLast());
        }
        System.out.println();

        Stack<Integer> myStack = new Stack<Integer>();
        myStack.push(3);
        myStack.push(7);
        myStack.push(5);
        myStack.push(2);
        myStack.push(11);
        System.out.println(myStack.peek());
        while(!myStack.empty()){
            System.out.println(myStack.pop());
        }
        System.out.println();

        Set<Integer> mySet = new HashSet<Integer>();
        mySet.add(2);
        mySet.add(7);
        mySet.add(88);
        mySet.add(42);
        mySet.add(null);

        mySet.remove(88);

        for(Integer indexInt : mySet)
        {
            System.out.println(indexInt);
        }
        System.out.println();

        Map<Integer, String> myMap = new HashMap<Integer, String>();
        myMap.put(3, "Trei");
        myMap.put(6, "Sase");
        myMap.put(9, "Noua");
        myMap.put(10, "Zece");
        myMap.remove(9);
        System.out.println(myMap);
        Set<Map.Entry<Integer, String>> mapSet = myMap.entrySet();
        for(Map.Entry<Integer, String> m_index : mapSet){
            System.out.println(m_index.getKey() + " " + m_index.getValue());
        }
        System.out.println(myMap.keySet());
        System.out.println(myMap.values());
        System.out.println(myMap.get(10));
        System.out.println(myMap.containsKey(3));
        System.out.println();

        TreeMap<String, Integer> myTreeMap = new TreeMap<String, Integer>();
        myTreeMap.put("Unu", 1);
        myTreeMap.put("Doi", 2);
        myTreeMap.put("Trei", 3);
        System.out.println(myTreeMap);
        System.out.println(myTreeMap.headMap("Trei"));
        System.out.println(myTreeMap.tailMap("Trei"));
        System.out.println(myTreeMap.descendingKeySet());
        System.out.println(myTreeMap.descendingMap());
        while(!myTreeMap.isEmpty()){
            System.out.println(myTreeMap.pollFirstEntry());
        }
        System.out.println();







    }
}
