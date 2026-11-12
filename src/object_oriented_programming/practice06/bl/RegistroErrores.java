package object_oriented_programming.practice06.bl;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

public final class RegistroErrores {

    private RegistroErrores() {
    }

    public static void registrar(Exception e) throws IOException {
        FileWriter archivo = new FileWriter("errores.log", StandardCharsets.UTF_8, true);
        try {
            archivo.write("[" + LocalDateTime.now() + "] "
                    + e.getClass().getSimpleName() + " - " + e.getMessage()
                    + System.lineSeparator());
        } finally {
            archivo.close();
        }
    }
}
