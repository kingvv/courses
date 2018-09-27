package lesson8.loger;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.logging.*;

public class Logging {

//
//    public Logging() {
//
//        ConsoleHandler consoleHandler = new ConsoleHandler();
//        XMLFormatter xmlFormatter = new XMLFormatter();
//
//        StreamHandler streamHandler = new StreamHandler(System.out,xmlFormatter);
//        consoleHandler.setFormatter(new FormatLog());
//        consoleHandler.setFilter(new FilterLog());
//
//        LOGGER.setUseParentHandlers(false);
//        consoleHandler.setLevel(Level.WARNING);
//
//        LOGGER.addHandler(consoleHandler);
//
//        LOGGER.addHandler(streamHandler);
//
//    }


    public Logging()  {


        LogManager logManager = LogManager.getLogManager();
        try {
            logManager.readConfiguration(new FileInputStream(Paths.get("src/main/java/lesson8/loggging.properties").toFile()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    public Logger LOGGER = Logger.getLogger(Logging.class.getName());





}
