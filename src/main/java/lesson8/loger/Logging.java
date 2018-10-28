package lesson8.loger;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Logging {


    public static Logger LOGGER = Logger.getLogger(Logging.class.getName());

    static {
        LogManager logManager = LogManager.getLogManager();

        try {

            logManager.readConfiguration(new FileInputStream(Paths.get("src/main/java/lesson8/loggging.properties").toFile()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
