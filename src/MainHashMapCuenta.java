import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainHashMapCuenta {

    public static void main(String[] args) {

        // Uso List y ArrayList
        List<String> palabras = new ArrayList<>();
        palabras.add("java");
        palabras.add("python");
        palabras.add("c++");
        palabras.add("java");
        palabras.add("python");
        palabras.add("javaScript");
        palabras.add("java");

        // HashMap para contar palabras
        HashMap<String, Integer> contador = new HashMap<>();

        // Recorro la lista con for
        for (String palabra : palabras) {
            // Si la palabra ya existe en el HashMap
            if (contador.containsKey(palabra)) { // containsKey(Object clave) -> Verifica si existe una clave

                // Se incrementa el contador
                contador.put(palabra, contador.get(palabra) + 1);
                /* put(K clave, V valor) -> Añade un par clave-valor o actualiza el valor de una clave existente.*/

            } else {
                // Si no existe, se añade con valor 1
                contador.put(palabra, 1);
            }
        }

        /* Muestro el contenido del HashMap usando "entrySet()"
           Devuelve un conjunto de objetos Map.Entry, útiles para recorrer clave-valor. */
        for (Map.Entry<String, Integer> entrada : contador.entrySet()) {
            System.out.println(
                    entrada.getKey() + " -> " + entrada.getValue()
            );
        }
    }
}