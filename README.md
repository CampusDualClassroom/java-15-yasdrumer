# Ejercicio 15 - Clases y métodos abstractos
## Descripción del ejercicio
Se deberá completar una clase proporcionada que extiende de otra clase abstracta dada. La clase hija deberá implementar el método o métodos 
de la clase abstracta que sean necesarios.

### Objetivos
* Dada la clase ``FreshMerchandise`` y la clase abstracta ``Merchandise`` de la que hereda, implementar en la clase ``FreshMerchadise`` el 
  método ``getSpecificData()`` de la clase abstracta para que devuelva un *String* con los datos de una mercancía.
* Crear un método llamado ``printSpecificData()`` que invoque al método ``getSpecificData()`` e imprima por pantalla el *String* que 
  devuelve.
  

### Métodos a implementar
El método ``getSpecificData()`` devuelve un *String* compuesto por elementos que deben mostrar la siguiente información:
* La localización, y un texto previo que indique que se mostrará tal dato
* La caducidad, correctamente formateada, y un texto previo que indique que se mostrará ese dato

Para crear el *String* se puede usar una composición básica *"texto" + elemento + "texto" ...* o bien se puede investigar el uso de la 
  clase [StringBuilder](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html) y su método ``append()`` (*observar 
 el método ``getLocation()`` de la clase ``Merchandise``*).

Es importante que la propiedad de la fecha de caducidad ``expirationDate`` de la clase ``FreshMerchadise`` sea de tipo Date. Y que 
al ser mostrada por pantalla se utilice el formato *dd-MM-yyyy*. Para ello será necesario la utilización de un formateador, como por 
ejemplo la clase [SimpleDateFormat](https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html) y su método ``format()``

### Requisitos
* No se pueden modificar en absoluto las clases de test.

### Test

```
mvn test
```
