import GET.And;
import GET.body;
import PET.Given;
import PET.Then;
import POST.Scenario;
import POST.Store;

import javax.xml.catalog.CatalogFeatures;
import javax.xml.catalog.CatalogFeatures.Feature;
import java.awt.*;
import java.net.URL;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}

        Feature: Validar funcion de almacenar API "PetStore"

        Scenario: Crear un nuevo pedido usando POST

        Given url "https://petstore.swagger.io/v2/store" del servicio
        When envío una solicitud POST a "/order" con la siguiente carga:
        | "id"     | "petId | quantity | status  | complete" |
        | "<id>   | <petId> | <quantity> | <status> | <complete>" |
        Then código de estado de respuesta debe ser 200
        And cuerpo de la respuesta debe;
        | "id     | <ID>"      |
        | "petId  | <petId>"   |
        | "quantity | <quantity>" |
        | "status  | <status>"  |
        | "complete | <complete>" |

        "Ejemplo:
        | "id  | petId | quantity | status   | complete" |
        | "1   | 100   | 2        | placed  | true"     |
        | "2   | 101   | 1        | shipped | false"    |

        Scenario: Recuperar una orden usando GET /"store/order/{orderId}"
        Given existe un pedido con ID <id>
        When envío una solicitud GET a "/order/<id>"
        Then el codigo de estado de respuesta debe ser 200
        And el cuerpo de la respuesta debe contener:
        | "id     | <id>"     |
        | "petId  | <petId>"  |
        | "quantity | <quantity>" |
        | "status  | <status>" |
        | "complete | <complete>" |

        "Ejemplo":
        | "id  | petId | quantity | status   | complete" |
        | "1   | 100   | 2        | placed  | true"     |
        | "2   | 101   | 1        | shipped | false"    |

        private class response {
        }

        private class When {
        }

        private class Validate {
        }

        private class endpoint {
        }

        private class Create {
        }

        private class Order {
        }

        private class following {
        }

        private class send {
        }

        private class code {
        }

        private class Retrieve {
        }

        private class order {
        }

        private class id {
        }

        private class ID<T> {
        }

        private class enpoint {
        }

        private class API {
        }

        private class del {
        }

        private class una {
        }

        private class con {
        }

        private class siguiente {
        }

        private class de {
        }

        private class debe {
        }

        private class Recuperar {
        }

        private class orden {
        }

        private class un {
        }

        private class código {
        }

        private class estado {
        }

        private class respuesta {
        }

        private class codigo {
        }

        private class cuerpo {
        }

        private class la {
        }

        private class Validar {
        }

        private class funcionalidad {
        }

        private class almacenar {
        }

        private class Crear {
        }

        private class nuevo {
        }

        private class usando {
        }

        public void main() {
        }

