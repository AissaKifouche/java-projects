public class LogLine {
    private LogLevel logLevel;
    private String message;
    public LogLine(String logLine) {
        String log = logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]"));
        switch (log){
            case "TRC" -> this.logLevel = LogLevel.TRACE;
            case "DBG" -> this.logLevel = LogLevel.DEBUG;
            case "INF" -> this.logLevel = LogLevel.INFO;
            case "WRN" -> this.logLevel = LogLevel.WARNING;
            case "ERR" -> this.logLevel = LogLevel.ERROR;
            case "FTL" -> this.logLevel = LogLevel.FATAL;
            default -> this.logLevel = LogLevel.UNKNOWN;
        }
        this.message = logLine.substring(logLine.indexOf(":") + 1).trim();
    }

    public LogLevel getLogLevel() {
        return this.logLevel;
    }

    public String getOutputForShortLog() {
        return String.format(this.logLevel.getCode() + ":" + this.message);
    }
}
