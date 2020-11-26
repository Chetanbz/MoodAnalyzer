public class MoodAnalyzer {
    String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message){
        this.message = message;
    }


    // MoodAnalyzer has method which takes string argument and return some message
    public String analyseMethod(String message) throws MoodAnalyzeException {
        this.message = message;
        return analyseMethod();
    }


    public String analyseMethod() throws MoodAnalyzeException {
        try {
            if (message.length()==0){
                throw new MoodAnalyzeException(MoodAnalyzeException.ExceptionType.ENTERED_EMPTY,"ExceptionEmpty");
            }
            if (message.contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }
        catch (NullPointerException e){  // if null pointer exception ocured throw below exception with message
            throw new MoodAnalyzeException(MoodAnalyzeException.ExceptionType.ENTERED_NULL,"ExceptionNull");
        }
    }
}
