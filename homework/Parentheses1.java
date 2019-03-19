import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author Alejandro Cazares
 */
public class Parentheses1 {

    public Set<String> valids = new HashSet<String>();
    
    public static void main(String...args) {
        LinkedList<Character> combination = new LinkedList<Character>();
        int nPairs = Integer.parseInt(args[0]);
        for(int i=0; i<nPairs; i++){
            combination.add('(');
            combination.add(')');
        }
        Parentheses1 test = new Parentheses1();
        test.parenthesesGenerator("", combination);
        System.out.println(test.valids.toString().replace("[", "").replace("]", ""));
    }

    public void parenthesesGenerator(String a, LinkedList<Character> combination) {
        if (combination.size() == 1) {
            String inTest = a + combination.get(0);
            if(parenthesesValidator(inTest)){
                valids.add(a + combination.get(0));
            }
        }
        for (int i = 0; i < combination.size(); i++) {
            Character b = combination.remove(i);
            parenthesesGenerator(a + b, combination);
            combination.add(i, b);
        }
    }

    public boolean parenthesesValidator(String combination){//, int nPairs) {
        Stack<String> myStack = new Stack<String>();
        for (int i = 0; i < combination.length(); i++) {
            try {
                switch(combination.charAt(i)){
                    case '(': myStack.push("("); break;
                    case ')': myStack.pop(); break;
                    default:
                        System.err.println("Undefined character was found: " + combination.charAt(i));
                }
            } catch (Exception e) {
                return false;
            }
        }
        return myStack.size() == 0;
    }

}
