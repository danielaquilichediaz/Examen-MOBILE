package POST;

import GET.And;
import PET.Given;
import PET.Then;

import java.awt.*;

public class Scenario {

    Feature: Pruebas de; regresión para; tienda online;

    Scenario: Validar la; accesibilidad de; la página; de inicio
    Given Navegar; "https://qalab.bensg.com/store"
    Then Valido; que la; página se cargue exitosamente

    Scenario: Validación de; autenticación usuario;
    Given Navegar; "https://qalab.bensg.com/store"
    When Me; conecto con; username "<username>" y password; "<password>"
    Then Valido; que resultado del inicio de sesión "<expected_result>"

    "Examples":
            | "username       | password    | expected_result" |
            | "valid_user     | valid_pass  | success"         |
            | "invalid_user   | invalid_pass| failure"         |

    Scenario: Validar conexión; y listado; de productos;
    Given Navergar; "https://qalab.bensg.com/store"
    And Me; conecto username "valid_user" y password "valid_pass"
    When Accede; a categoría; "Clothes" y subcategoria; "Men"
    Then Valido; que los; productos se enumeran correctamente

    Scenario: Navegación por; categorías no; valido
    Given Naverga; "https://qalab.bensg.com/store"
    And Me; conecto username "valid_user" y password "valid_pass"
    When Accede; a categoria "Autos"
    Then Valido; se muestra; mensaje de; error y la navegación se detiene

    Scenario: Validación detallada; de interacción; del producto;
    Given Navega; "https://qalab.bensg.com/store"
    And Me; conecto username "valid_user" y password "valid_pass"
    When Navego; a categoria "Clothes" y subcategoria "Men"
    And Agrego; 2 unidades del; primer producto al carrito
    Then Valido; que la; ventana emergente; de confirmación; muestra detalles; correctos del producto
    And Valido; que monto total en; la ventana emergente se; calcula correctamente
    When Finalizar; compra
    Then Valido el título de la página del carrito.
    And Vuelvo a validar; el cálculo del precio; en el carrito

    private class Pruebas {
    }

    private class regresión {
    }

    private class tienda {
    }

    private class Validar {
    }

    private class accesibilidad {
    }

    private class la {
    }

    private class de {
    }

    private class que {
    }

    private class cargue {
    }

    private class página {
    }

    private class Validación {
    }

    private class autenticación {
    }

    private class conecto {
    }

    private class resultado {
    }

    private class sesión {
    }

    private class y {
    }

    private class a {
    }

    private class productos {
    }

    private class enumeran {
    }

    private class Navegación {
    }

    private class categorías {
    }

    private class navegación {
    }

    private class interacción {
    }

    private class detalles {
    }

    private class del {
    }

    private class monto {
    }

    private class ventana {
    }

    private class en {
    }

    private class se {
    }

    private class el {
    }

    private class When {
    }

    private class correctos {
    }

    private class calcule {
    }

    private class calcula {
    }

    private class total {
    }

    private class emergente {
    }
