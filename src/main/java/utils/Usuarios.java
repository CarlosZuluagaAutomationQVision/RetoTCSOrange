package utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Usuarios {

    CARLOS("Admin", "admin123");

    private final String usuario;
    private final String clave;
}
