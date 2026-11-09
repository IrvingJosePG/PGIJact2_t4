# Actividad 2: Sistema MVC con Thymeleaf y DTOs

Desarrollo de la Actividad 2. El contexto del proyecto está orientado a **NextVoto**, una plataforma de evaluaciones escolares, permitiendo visualizar y registrar cuestionarios.

## Arquitectura y Funcionalidades
Se implementaron las siguientes características requeridas:
1. **Patrón MVC:** Separación lógica entre `CuestionarioDTO` (Modelo), `CuestionarioController` (Controlador) y Vistas HTML.
2. **Thymeleaf:** Uso de directivas como `th:each` para iterar listas y `th:object`/`th:field` para el manejo de formularios.
3. **Parámetros Web:** Captura de datos mediante `@RequestParam` y `@PathVariable`.
4. **Configuración Externa:** Inyección de variables de entorno hacia las vistas usando `@Value`.
5. **API REST Paralela:** Mantenimiento de un endpoint POST puro recibiendo datos con `@RequestBody`.

## Evidencias de Ejecución 

### 1. Vista de Listado (`th:each` y `@Value`)
Se muestra la lista de cuestionarios iterada dinámicamente y el título inyectado desde `application.properties`.
![Vista de listado de cuestionarios](img/Listado.png)

### 2. Formulario de Captura (`@ModelAttribute`)
Formulario HTML que vincula directamente los inputs con el objeto `CuestionarioDTO`.
![Formulario de nuevo cuestionario](img/Captura.png)

### 3. Filtrado mediante `@RequestParam`
Ruta que recibe un parámetro por URL para filtrar los cuestionarios (ej. `?materia=Redes`).
![Prueba de RequestParam filtrando materia](img/Filtrado.png)

### 4. Detalle mediante `@PathVariable`
Ruta dinámica que muestra la información de un solo cuestionario basado en su ID (ej. `/detalle/1`).
![Detalle de un cuestionario usando PathVariable](img/Detalle.png)

### 5. Prueba de Endpoint POST (Postman)
Prueba del `CuestionarioRestController` enviando un JSON válido y recibiendo el objeto creado con su ID asignado.
![Prueba POST en Postman](img/POST.png)


## Enlaces de Despliegue en VPS
Ambas versiones del proyecto se encuentran corriendo de forma simultánea e independiente en el servidor VPS configurado.

* **Actividad 2 (MVC/Thymeleaf) - Puerto 9081:**
  [http://167.99.15.140:9081/cuestionarios](http://167.99.15.140:9081/cuestionarios)

* **Actividad 1 (REST API original) - Puerto 8081:**
  [http://167.99.15.140:8081/mi-nombre](http://167.99.15.140:8081/mi-nombre)