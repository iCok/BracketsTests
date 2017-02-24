package nikita;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Cok on 22.02.2017.
 */
public class Brackets {
    public static boolean isCorrect(String str) {

        Deque<Integer> typesStack = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                typesStack.addFirst(getType(ch));
            } else {

                if (typesStack.isEmpty()) return false;

                if (!typesStack.pop().equals(getType(ch))) {
                    return false;
                }
            }
        }

        return typesStack.isEmpty();
    }

    private static Integer getType(char ch) {
        return ch == '(' || ch == ')' ? 1 : ch == '[' || ch == ']' ? 2 : ch == '{' || ch == '}' ? 3 : -1;

    }
}
