import org.deeplearning4j.api.storage.StatsStorage;
import org.deeplearning4j.ui.api.UIServer;
import org.deeplearning4j.ui.storage.FileStatsStorage;

import java.io.File;

public class App {
    public static void main(String[] args) {
        File statsFile = new File(args[0]);
        StatsStorage statsStorage = new FileStatsStorage(statsFile);
        UIServer uiServer = UIServer.getInstance();
        uiServer.attach(statsStorage);
    }
}
