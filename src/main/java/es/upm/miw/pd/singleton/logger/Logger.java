package es.upm.miw.pd.singleton.logger;

import java.util.Date;

public final class Logger{
    private String logs;
    
    private static final Logger LOGGER = new Logger();

    public Logger() {
        this.clear();
    }

    public String getLogs() {
        return logs;
    }
    
    public static Logger getLogger() {
        return LOGGER;
    }

    public void addLog(String log) {
        this.logs = this.logs + ">>> " + log + "\n";
    }

    public void clear() {
        this.logs = new Date().toString() + "\n";
    }
}
