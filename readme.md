# Patrón builder

Crea una aplcación que crea objeto de una clase que tiene un constructor con muchisimos parametros.

Es decir, la clase tendrá muchos atributos que hay que inicializar al crear el objeto.

La clase que usará el main será: "Pizzas"

Esta clase tendrá muchos atributos, por ejemplo:

- masa (String) normal, integral, fina, masa pan, etc...
- relleno (boolean)
- tipo (int) familiar(1), mediana(2), pequeña(3)
- salsa (boolean)
- tipo salsa (String) barbacoa, solo tomate, salsa sin gluten
- cebolla (boolean)
- sinGluten (boolean)
- extraQueso (boolean)
- piña (boolean)
- champiñones (boolean)
- jamon (boolean)

Utilizar el toString para mostrar la pizza realizada.

Realizar varias pizzas en el programa principal.

Crea una rama nueva que se llame 'builder'

Luego con este repositorio como ejemplo, crear tu propio builder y cambia el main en esta nueva rama, para crear la pizza con el builder.

## Respuestas examen:

- ¿Cual es la función de este patrón?

  Se utiliza para crear objetos complejos paso a paso, permitiendo la creación de diferentes representaciones de un objeto utilizando el mismo código de construcción.

  La función principal del patrón Builder es separar la construcción de un objeto complejo de su representación y permitir la creación de diferentes representaciones del mismo objeto utilizando un mismo proceso de construcción.
  
  Un ejemplo de este patron de diseño se podria aplicar a la construccion de un tipo de coche. Tendriamos un coche base con los complementos estandar y a partir de ahi el cliente podria decidir si elije por ejemplo el modelo deportivo con todo lo que este incluye o si lo personaliza caracteristica a caracteristica combinando por ejemplo caracteristicas de un coche deportico con caracteristicas de un coche todoterreno.

- ¿Como es su Diagrama de clases? Realiza en el readme el diagrama

![image-20230329122959376](C:\Users\Bule\AppData\Roaming\Typora\typora-user-images\image-20230329122959376.png)

- ¿Podríamos combinarlo con el patrón Factory? Explícalo con algo de código como lo harías.

Teniendo el Builder para la generación de coches creado, añadiriamos un Factory que, en base a X parametros que reciba en el Main, llame al builder del Builder y genere el coche que buscamos:

--Ejemplo de la clase Factory--

    public class CocheFactory {
    public static Coche createCoche(String tipo) {

        CocheBuilder builder = new CocheBuilderImpl(); //implementa la interfaz CocheBuilder

        if (tipo.equals("Deportivo")) {
            builder.deportivo();
        } else if (tipo.equals("Todoterrreno")) {
            builder.todoterreno();
        } else if (tipo.equals("Familiar")) {
            builder.familiar();
        }

        return builder.getCoche();
    }
}