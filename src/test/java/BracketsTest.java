import org.junit.Test;

import nikita.Brackets;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Cok on 14.02.2017.
 */
public class BracketsTest {
    @Test
    public void oneBracketShouldReturnTrue() throws Exception {
        boolean isCorrect = Brackets.isCorrect("()");
        assertTrue(isCorrect);
    }

    @Test
    public void threeBracketsShouldReturnTrue() throws Exception {
        boolean isCorrect = Brackets.isCorrect("((()))");
        assertTrue(isCorrect);
    }

    @Test
    public void oneByOneBracketsShouldReturnTrue() throws Exception {
        boolean isCorrect = Brackets.isCorrect("()()()");
        assertTrue(isCorrect);
    }

    @Test
    public void whenSecondBracketIsNotClosedShouldReturnFalse() throws Exception {
        boolean isCorrect = Brackets.isCorrect("(()");
        assertFalse(isCorrect);
    }

    @Test
    public void whenSecondBracketIsNotOpenedShouldReturnFalse() throws Exception {
        boolean isCorrect = Brackets.isCorrect("())");
        assertFalse(isCorrect);
    }

    @Test
    public void whenSevereralDiffBracketsOneByOneShouldReturnTrue() throws Exception {
        boolean isCorrect = Brackets.isCorrect("()[]{}");
        assertTrue(isCorrect);
    }

    @Test
    public void whenSevereralDiffBracketsInsideEachOtherShouldReturnTrue() throws Exception {
        boolean isCorrect = Brackets.isCorrect("([{}])");
        assertTrue(isCorrect);
    }

    @Test
    public void whenSevereralDiffBracketsInsideInDiffOrderShouldReturnFalse() throws Exception {
        boolean isCorrect = Brackets.isCorrect("({[})]");
        assertFalse(isCorrect);
    }

    @Test
    public void whenDiffClosedBracketsShouldReturnFalse() throws Exception {
        boolean isCorrect = Brackets.isCorrect("([{}))");
        assertFalse(isCorrect);
    }

    @Test
    public void diffOrderClosedShouldReturnFalse() throws Exception {
        boolean isCorrect = Brackets.isCorrect("([{]})");
        assertFalse(isCorrect);
    }

    @Test
    public void normalOrderShouldReturnTrue() throws Exception {
        boolean isCorrect = Brackets.isCorrect("(){}[]{[]()}");
        assertTrue(isCorrect);
    }

    @Test
    public void noOpenBracketShouldReturnFalse() throws Exception {
        boolean isCorrect = Brackets.isCorrect(")))");
        assertFalse(isCorrect);
    }
}
