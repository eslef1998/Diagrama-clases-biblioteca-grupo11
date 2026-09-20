# Sistema de Gestión de Biblioteca - POO

## Descripción General
Este proyecto fue desarrollado como parte de la asignatura de Programación Orientada a Objetos II - Avanzada, dentro del programa de Tecnología en Desarrollo de Software de la Institución Universitaria Digital de Antioquia (Medellín).

El sistema simula la gestión básica de una biblioteca procesando libros (físicos y digitales), autores, usuarios y préstamos. Aplica los pilares de la POO y buenas prácticas de diseño de software.

---

## Objetivos del Proyecto

### Objetivo General
Diseñar e implementar en lenguaje Java un sistema de biblioteca orientado a objetos que represente correctamente las relaciones entre sus entidades principales y aplique principios SOLID.

### Objetivos Específicos
* Traducir correctamente el diagrama de clases UML a código Java.
* Aplicar los pilares de la POO (Encapsulamiento, Abstracción, Herencia y Polimorfismo).
* Implementar relaciones entre clases (Asociación, Composición, Agregación y Herencia).
* Evidenciar la aplicación de al menos tres principios SOLID.
* Validar el funcionamiento del sistema mediante la ejecución de la clase Main.

---

## Entidades del Sistema

* **Usuario**: Representa a la persona que solicita préstamos de materiales bibliográficos.
* **Autor**: Contiene la información del autor y gestiona su lista de obras (Agregación).
* **Libro**: Clase base que representa un recurso físico con su estado de disponibilidad y préstamos asociados (Composición).
* **LibroDigital**: Subclase que extiende de Libro agregando formato y tamaño de archivo (Herencia y Sobrescritura).
* **Prestamo**: Gestiona las fechas de préstamo, devolución y la asociación con el usuario.

---

## Diagrama de Clases UML

![Diagrama UML](Diagramas/EA1.%20Planteando%20el%20diagrama%20de%20clase%20UML.drawio-1.png)

---

## Principios SOLID Aplicados

1. **SRP (Single Responsibility Principle - Principio de Responsabilidad Única):**
   Cada clase en el paquete `modelo` tiene un único motivo de cambio. Por ejemplo, `Usuario` solo almacena y valida datos de los usuarios, mientras que `Prestamo` gestiona únicamente las fechas y el estado de la transacción.

2. **OCP (Open/Closed Principle - Principio de Abierto/Cerrado):**
   El sistema está abierto a la extensión pero cerrado a la modificación. La clase `Libro` se puede extender mediante `LibroDigital` para incorporar nuevos comportamientos sin alterar el código existente de `Libro`.

3. **LSP (Liskov Substitution Principle - Principio de Sustitución de Liskov):**
   Los objetos de la subclase `LibroDigital` pueden sustituir a los de la superclase `Libro` en la lista del catálogo (`List<Libro>`) y ejecutar el método `prestar()` sin alterar el correcto funcionamiento del programa.

---

## Estructura del Proyecto

```text
Diagrama-clases-biblioteca-grupo11/
├── README.md
├── Diagramas/
│   └── EA1 Planteando el diagrama de clase UML.drawio-1.png
├── Documentos/
│   └── EA1_DiagramaClases_Grupo11.pdf
├── src/
│   ├── Main.java
│   └── modelo/
│       ├── Autor.java
│       ├── Libro.java
│       ├── LibroDigital.java
│       ├── Prestamo.java
│       └── Usuario.java
└── out/


## Compilación y Ejecución

Para compilar y ejecutar el proyecto desde la terminal, ubícate en la raíz del proyecto y ejecuta:

```bash
# 1. Compilar los archivos Java a la carpeta 'out'
javac src/Main.java src/modelo/*.java -d out

# 2. Ejecutar la clase principal
java -cp out Main
```