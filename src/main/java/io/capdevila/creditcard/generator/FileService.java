package io.capdevila.creditcard.generator;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 * @author Xavier Capdevila Estevez on 6/6/21.
 */
@Service
public class FileService {

  public Path write(Set<String> elements, String filename) throws IOException {
    return Files.write(
        Paths.get(filename),
        elements,
        CREATE, APPEND);
  }

}
