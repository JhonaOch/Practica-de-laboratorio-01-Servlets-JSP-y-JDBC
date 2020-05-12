# Practica-de-laboratorio-01-Servlets-JSP-y-JDBC
OBJETIVO GENERAL
---------------------
• Diseñar y desarrolla modelos de software en diferentes niveles de abstracción y modelos de datos a nivel transaccional y analítico con entornos de desarrollo actuales.
=============
Diagrama de clases propuesto
---------------
![1](https://user-images.githubusercontent.com/34308770/81634226-29b06f80-93d4-11ea-8277-0609e33d42ae.png)

3.Realización de la página web mediante HTML y dichos componentes mencionados con anterioridad.
Requisitos de implementación funcional.

3.1 Realizaremos la implementación de una página HTML mediante servlets el objetivo principal es utilizar las clases DAO que nos permitirán tener una gestión a nivel funcional.

o	Crearemos la implementación de la clase persona:

o	También para la persona tendremos una lista de teléfonos a nivel privado (Una persona puede tener varios teléfonos) 

o	Los usuarios pueden registrarse en la aplicación a través de un formulario de creación de cuentas. 

![2](https://user-images.githubusercontent.com/34308770/81634838-5add6f80-93d5-11ea-89e0-fe4b4ac7dc95.png)
![3](https://user-images.githubusercontent.com/34308770/81634872-7183c680-93d5-11ea-8050-11ecf9b202b1.png)

o	Creación de la tabla si no existe.

o	Implementación de la base de datos.

o	Implementación del método de la base en los servlets en este caso el crear-cuenta.

![4](https://user-images.githubusercontent.com/34308770/81634932-92e4b280-93d5-11ea-8a49-d9666850f7f1.png)
![5](https://user-images.githubusercontent.com/34308770/81634982-aa23a000-93d5-11ea-8908-0b4330a3e869.png)
![6](https://user-images.githubusercontent.com/34308770/81635009-ba3b7f80-93d5-11ea-94b8-249442b3e936.png)

IMPLEMENTACION EN LA PAGINA HTML
------------------
![7](https://user-images.githubusercontent.com/34308770/81635082-e6ef9700-93d5-11ea-87d6-700a60d1851d.png)

o	En el siguiente punto definiremos el login.

o	Los usuarios pueden iniciar sesión usando su correo y contraseña. 

o	Verificaremos si existe o no el usuario.

o	Implementación de la base de datos.

o	Implementación del método de la base en los servlets en este caso el login.

![8](https://user-images.githubusercontent.com/34308770/81635123-0b4b7380-93d6-11ea-98bf-03d37d636b8e.png)
![9](https://user-images.githubusercontent.com/34308770/81635147-18686280-93d6-11ea-93b7-0237bbb44dbb.png)
![10](https://user-images.githubusercontent.com/34308770/81635180-2ae29c00-93d6-11ea-8fe0-87fc598ebbb2.png)


o	En el siguiente punto definiremos la gestión del usuario.

o	Registrar, modificar, eliminar, buscar y listar sus teléfonos

o	Listar los números de teléfono de un usuario usando su número de cédula o correo electrónico

o	Podrá llamar o enviar un correo electrónico desde el sistema usando aplicaciones externas.

o	Visualización del número telefónico, la gestión nos permitirá editar, agregar, eliminar un numero telefónico.

o	Implementación de la base de datos.

o	Implementación del método de la base en los servlets en este caso la Agenda.

EDITAR TELEFONO 
------------
![11](https://user-images.githubusercontent.com/34308770/81635227-59f90d80-93d6-11ea-9dd7-fb42de7af33b.png)

ELIMINAR TELEFONO 
------------
![12](https://user-images.githubusercontent.com/34308770/81635262-71d09180-93d6-11ea-99db-dfcdc8208eaa.png)

AGREGAR TELEFONO 
------------
![13](https://user-images.githubusercontent.com/34308770/81635342-a3e1f380-93d6-11ea-8558-e25420f23d30.png)

INTERFAZ EXTERNA
------------
![14](https://user-images.githubusercontent.com/34308770/81635421-d55abf00-93d6-11ea-84f2-01c836452e86.png)
![15](https://user-images.githubusercontent.com/34308770/81635459-e4417180-93d6-11ea-94f0-b567beb5e2ad.png)
![16](https://user-images.githubusercontent.com/34308770/81635486-f3c0ba80-93d6-11ea-9c6a-eae2db459f2c.png)
![17](https://user-images.githubusercontent.com/34308770/81635523-04713080-93d7-11ea-9051-d31a0e1f7254.png)
![18](https://user-images.githubusercontent.com/34308770/81635560-13f07980-93d7-11ea-843a-18330208036c.png)
![19](https://user-images.githubusercontent.com/34308770/81635582-210d6880-93d7-11ea-8263-8cf983c6ac98.png)
![20](https://user-images.githubusercontent.com/34308770/81635602-2cf92a80-93d7-11ea-8c12-d1f2362e0684.png)
![21](https://user-images.githubusercontent.com/34308770/81635632-413d2780-93d7-11ea-9f68-f9a90398781c.png)

VALIDACION DE FORMULARIOS
---------------------
![22](https://user-images.githubusercontent.com/34308770/81635703-7184c600-93d7-11ea-9f24-b2a612cbfb1f.png)

o	En el siguiente punto definiremos la gestión del Filtro a nivel de gestión.

o	Login

o	Home

o	Agenda

Filtro para la gestión de login.
-----------------------
![23](https://user-images.githubusercontent.com/34308770/81635749-9c6f1a00-93d7-11ea-9ce5-f095122eb9b5.png)



 CONCLUSIONES: 
 ====================
•	El patrón DAO propone separar por completo la lógica de negocio de la lógica para acceder a los datos, de esta forma, el DAO proporcionará los métodos necesarios para insertar, actualizar, borrar y consultar la información; por otra parte, la capa de negocio solo se preocupa por lógica de negocio y utiliza el DAO para interactuar con la fuente de datos.
---------
•	Mediante la implementación tenemos un gestiona miento de una agenda telefónica a nivel del usuario lo usaremos a nivel del patrón dao mencionado con anterioridad con esto nuestro objetivo será tener una clara perspectiva del funcionamiento en los servlets, filtros y clases JSP con una aplicación de HTML.
----------------
