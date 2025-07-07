public abstract class LogProcessor {
    public static int INFO =1;
    public  static int DEBUG = 2;
    public static int ERROR = 3;

    LogProcessor nextLoggerProcessor;
    LogProcessor(LogProcessor logProcessor){
        this.nextLoggerProcessor = logProcessor;
    }

    public void log(int loglevl, String message){
        if(nextLoggerProcessor != null){
            nextLoggerProcessor.log(loglevl, message);
        }
    }
}
