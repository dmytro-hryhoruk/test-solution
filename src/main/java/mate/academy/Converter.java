package mate.academy;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

public class Converter {
    private static final Logger LOGGER = Logger.getLogger(Converter.class);

    public List<String> convertFileIntoList(File file) {
        try {
            return Files.lines(Paths.get(file.getAbsolutePath()))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            LOGGER.error("No such file", e);
            return Collections.emptyList();
        }
    }
}
