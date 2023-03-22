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

## Reflexiona:

- ¿Cual es la función de este patrón?

  Se utiliza para crear objetos complejos paso a paso, permitiendo la creación de diferentes representaciones de un objeto utilizando el mismo código de construcción.

  La función principal del patrón Builder es separar la construcción de un objeto complejo de su representación y permitir la creación de diferentes representaciones del mismo objeto utilizando un mismo proceso de construcción.

- ¿Como es su Diagrama de clases? Realiza en el readme el diagrama

  ![image-20230322130956054](C:\Users\Bule\AppData\Roaming\Typora\typora-user-images\image-20230322130956054.png)

  