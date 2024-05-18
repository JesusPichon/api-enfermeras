Se esta desarrollando una Api para la base datos.
Aquí hay una explicación de cada archivo y componente de tu proyecto:

Archivos Java:
EnfermeraController.java: Este es el controlador principal de tu aplicación. Maneja las solicitudes HTTP relacionadas con las enfermeras. Tiene métodos para registrar una nueva enfermera y para obtener una lista de todas las enfermeras registradas.

DatosDireccion.java: Esta clase define la estructura de los datos de dirección, como la calle, municipio, localidad, estado y código postal.

Direccion.java: Esta clase modela la entidad de dirección y la mapea como un componente incrustado en otras entidades, como la enfermera.

DatosRegistroEnfermera.java: Define la estructura de los datos necesarios para registrar una enfermera, como nombre, apellidos, teléfono y especialidad.

Enfermera.java: Representa la entidad de enfermera con sus atributos como nombre, apellidos, teléfono y especialidad. Utiliza la anotación @Entity de JPA para mapearla a una tabla en la base de datos.

Especialidad.java: Es una enumeración que define diferentes especialidades que puede tener una enfermera.

EnfermeraRepository.java: Define la interfaz del repositorio de enfermeras, que extiende JpaRepository para operaciones CRUD básicas en la base de datos.

EnfermerasApplication.java: Clase principal de la aplicación Spring Boot que inicia la aplicación.

Archivo de Propiedades:
application.properties: Este archivo contiene la configuración de la aplicación Spring Boot, incluyendo el nombre de la aplicación, la configuración de la base de datos (URL, nombre de usuario, contraseña) y la configuración de Hibernate para la generación del esquema de base de datos (spring.jpa.hibernate.ddl-auto).
Explicaciones adicionales:
La anotación @RestController en la clase EnfermeraController indica que esta clase define endpoints REST.
@RequestMapping("/enfermeras") especifica que todas las solicitudes a este controlador deben comenzar con "/enfermeras".
@PostMapping y @GetMapping son anotaciones para mapear solicitudes HTTP POST y GET respectivamente.
Se utilizan anotaciones de Lombok (@Getter, @NoArgsConstructor, @AllArgsConstructor) para generar automáticamente getters, constructores sin argumentos y constructores con todos los argumentos para las clases de entidad.
