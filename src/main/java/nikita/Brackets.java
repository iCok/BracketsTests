package nikita;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cok on 22.02.2017.
 */
public class Brackets {
    public static boolean isCorrect(String str) {
        Integer left = 0;
        Integer right = 0;

        Integer type;
        List<Integer> types = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                type = getType(ch);
                left++;
                types.add(type);
            } else {

                right++;

                if (right > left) {
                    return false;
                }

                if (!types.get(types.size() - 1).equals(getType(ch))) {
                    return false;
                } else {
                    types.remove(types.size() - 1);
                }
            }
        }

        return left.equals(right);
    }

    private static Integer getType(char ch) {
        return ch == '(' || ch == ')' ? 1 : ch == '[' || ch == ']' ? 2 : ch == '{' || ch == '}' ? 3 : -1;

    }
}
