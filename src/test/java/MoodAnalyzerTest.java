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


}
