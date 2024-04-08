# PROPÓSITO
Define una interfaz para la creación de un objeto, sin embargo, son las subclases quienes deciden que clase instanciar.
Es decir, permite que una clase delegue en sus subclases la creación de objetos.

# ¿CUÁNDO USUARLO?
1. Cuando una clase no puede anticipar la clase de objetos que quiere crear.
2. Cuando se quiere que sean las subclases sean quienes definan los objetos a crear.
3. Cuando se delega una responsabilidad a una clase auxiliar y es necesario localizar dicha responsabilidad. 
