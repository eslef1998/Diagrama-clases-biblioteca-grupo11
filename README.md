# Sistema de Gestión de Biblioteca

## Proyecto académico

Este proyecto fue desarrollado como parte de la asignatura de Programación Orientada a Objetos, dentro del programa de Tecnología en Desarrollo de Software de la Institución Universitaria Digital de Antioquia, en Medellín. Su objetivo principal fue aplicar los conceptos fundamentales de modelado orientado a objetos mediante la creación de un sistema de biblioteca con clases, atributos, métodos y relaciones entre entidades.

---

## Descripción general

El sistema simula una biblioteca básica en la que se gestionan libros, autores, usuarios y préstamos. A través de la implementación en Java, se representa el comportamiento de un catálogo bibliográfico donde un usuario puede solicitar un libro y cada material puede estar disponible o no según su estado.

El proyecto permite evidenciar en la práctica conceptos como:

- Encapsulamiento
- Abstracción
- Herencia
- Polimorfismo
- Asociación
- Agregación
- Composición

---

## Objetivo del proyecto

### Objetivo general
Diseñar e implementar un sistema de biblioteca orientado a objetos que represente correctamente la relación entre sus entidades principales y demuestre el uso de buenas prácticas de programación.

### Objetivos específicos
- Identificar las entidades del dominio del problema.
- Definir atributos y operaciones relevantes para cada clase.
- Establecer relaciones entre clases con base en la lógica del sistema.
- Aplicar la programación orientada a objetos en Java.
- Validar el funcionamiento del sistema mediante la ejecución del programa principal.

---

## Entidades del sistema

### Usuario
Representa a la persona que puede solicitar libros prestados.

### Autor
Contiene la información del autor de un libro y mantiene relación con sus obras.

### Libro
Es la clase base que representa un recurso bibliográfico físico.

### LibroDigital
Es una extensión de `Libro` que representa un material digital con propiedades adicionales como formato y tamaño.

### Prestamo
Registra la relación entre un usuario y el libro que fue prestado, así como la fecha de préstamo y devolución.

---

## Diagrama de clases UML

![Diagrama de clases UML](<EA1. Planteando el diagrama de clase UML.drawio-1.png>)

---

## Arquitectura y diseño

El diseño del sistema se basa en la separación de responsabilidades y en la organización lógica de cada entidad. Cada clase encapsula sus datos y expone solo los métodos necesarios para interactuar con otras partes del sistema.

### Relación entre clases
- `Usuario` realiza `Prestamo`.
- `Prestamo` está relacionado con un `Libro`.
- `Autor` agrega varios `Libro`.
- `LibroDigital` hereda de `Libro`.

### Principios de diseño aplicados
- **Encapsulamiento:** los atributos de cada clase son privados y se accede a ellos mediante métodos.
- **Herencia:** `LibroDigital` reutiliza la estructura de `Libro` y agrega características específicas.
- **Polimorfismo:** el comportamiento puede variar según el tipo de libro.
- **Cohesión:** cada clase tiene una responsabilidad clara dentro del sistema.

---

## Tecnologías utilizadas

- Java
- Programación Orientada a Objetos
- UML
- Visual Studio Code

---

## Estructura del proyecto

```text
Diagrama-clases-biblioteca-grupo11/
├── README.md
├── Diagramas/
│   └── EA1 Planteando el diagrama de clase UML
├── Documentos/
├── src/
│   ├── Main.java
│   └── modelo/
│       ├── Autor.java
│       ├── Libro.java
│       ├── LibroDigital.java
│       ├── Prestamo.java
│       └── Usuario.java
└── out/
```

---

## Resultado funcional

El programa principal permite crear un usuario, un autor, libros físicos y digitales, asociar autores y registrar préstamos. La salida por consola evidencia la lógica del sistema y confirma que las relaciones entre clases funcionan de manera coherente.

---

## Conclusión

Este proyecto representa una aplicación práctica de la programación orientada a objetos en un contexto académico real. A través de la modelación de un sistema de biblioteca, se logró comprender cómo las clases interactúan entre sí, cómo se aplican los principios del diseño orientado a objetos y cómo se transforma un problema de dominio en una solución estructurada y funcional.

Además, el proyecto permite evidenciar la importancia del análisis previo y del modelado UML como base para el desarrollo de software robusto, escalable y fácil de mantener.

---

## Integrantes

- Luisa Fernanda García Álvarez
- Natalia Andrea Amaya García
- Leandro Marín Parra

## Institución

Institución Universitaria Digital de Antioquia

## Ciudad

Medellín, Antioquia

