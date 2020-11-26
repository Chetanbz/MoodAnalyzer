public class MoodAnalyzeException extends Exception{
    ExceptionType type;

    enum ExceptionType {
        ENTERED_NULL , ENTERED_EMPTY ;
    }

    public MoodAnalyzeException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
