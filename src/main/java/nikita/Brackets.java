package nikita;

import java.util.Stack;

/**
 * Created by Cok on 22.02.2017.
 */
public class Brackets {
    public static boolean isCorrect(String str) {
        Integer left = 0;
        Integer right = 0;

        Integer type;
        Stack<Integer> typesStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                type = getType(ch);
                left++;
                typesStack.add(type);
            } else {

                right++;

                if (right > left) {
                    return false;
                }

                if (!typesStack.pop().equals(getType(ch))) {
                    return false;
                }
            }
        }

        return left.equals(right);
    }

    private static Integer getType(char ch) {
        return ch == '(' || ch == ')' ? 1 : ch == '[' || ch == ']' ? 2 : ch == '{' || ch == '}' ? 3 : -1;

    }
}
