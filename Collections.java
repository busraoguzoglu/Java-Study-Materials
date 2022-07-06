import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class Collections {

    public static void main(String[] args){

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Cow");
        System.out.println("LinkedList: " + linkedList);

        linkedList.add(1, "Horse");
        System.out.println("Updated LinkedList: " + linkedList);

        linkedList.set(2, "Van Cat");
        System.out.println("Updated LinkedList: " + linkedList);

        linkedList.remove(3);
        linkedList.remove("Horse");
        System.out.println("Updated LinkedList: " + linkedList);

        Stack<String> stack = new Stack<String>();
        stack.push("1");
        stack.push("2");

        System.out.println("Stack: " + stack);

        HashSet<String> set = new HashSet<String>();
        set.add("string 1");
        set.add("string 2");

        System.out.println("Set: " + set);

    }

}
