import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyzerTest {
    @Test
    public void given_SadMessage_ReturnSAD_() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = null;
        try{
            mood = moodAnalyzer.analyseMethod("I am in sad mood");
            Assert.assertEquals(mood,"SAD");

        } catch (MoodAnalyzeException e) {
        }

    }
    @Test
    public void given_HappyMessage_ReturnHappy_() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = null;
        try{
            mood = moodAnalyzer.analyseMethod("I am in Happy mood");
            Assert.assertEquals(mood,"HAPPY");

        } catch (MoodAnalyzeException e) {
        }

    }

    @Test
    public void givenNullMessage_Return_Exception(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = null;
        try {// Error line is we have invoked constructor having null value, now string is set is set to null now string message is null
            mood = moodAnalyzer.analyseMethod();
        }
        catch (MoodAnalyzeException e) {
            Assert.assertEquals(MoodAnalyzeException.ExceptionType.ENTERED_NULL,e.type);
        }

    }
    @Test
    public void givenEmptyMessage_Return_Exception(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
        String mood = null;
        try {// Error line is we have invoked constructor having null value, now string is set is set to null now string message is null
            mood = moodAnalyzer.analyseMethod();
        }
        catch (MoodAnalyzeException e) {
            Assert.assertEquals(MoodAnalyzeException.ExceptionType.ENTERED_EMPTY,e.type);
        }

    }

}
