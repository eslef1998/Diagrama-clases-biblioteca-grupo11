#  Diagrama de Clases UML — Sistema de Biblioteca

##  Información del Proyecto
- **Institución:** Institución Universitaria Digital de Antioquia
- **Asignatura:** Orientación Orientada a Objetos Avanzada / POO
- **Docente:** Boris Alberto Salleg
- **Integrantes:**
  - Luisa Fernanda García Alvarez
  - Natalia Andrea Amaya García
  - Leandro Marín Parra

---

##  Introducción
Este trabajo nace de la necesidad de entender, de manera práctica, cómo se organiza la información antes de convertirla en un programa. Para lograrlo, elegimos un sistema de bibliotecas con sus libros, sus autores y los préstamos que se hacen a los usuarios.

La idea principal fue representar, a través de un diagrama de clases, cómo se relacionan estos elementos entre sí: qué información maneja cada uno, qué hace cada parte del sistema y cómo se conectan unas a otras. Este ejercicio nos permitió aplicar de forma sencilla algunos principios importantes de la programación orientada a objetos, como organizar bien la información, evitar que las partes del sistema dependan demasiado unas de otras y dejar todo diseñado de manera clara para que, si en un futuro se requiere ampliar o modificar, sea fácil de hacer.

---

##  Objetivos

### Objetivo General
Diseñar un diagrama UML que permita mostrar de manera clara cómo está organizado y cómo funciona un sistema de biblioteca, teniendo en cuenta las características principales de la programación orientada a objetos (abstracción, encapsulamiento, herencia y polimorfismo).

### Objetivos Específicos
- Identificar las clases, los datos y las acciones necesarias para representar el sistema de biblioteca.
- Definir cómo se relacionan las diferentes clases de acuerdo con la función que cumple cada una dentro del sistema.
- Explicar y registrar el proceso de creación del diagrama de manera clara, trabajando de forma colaborativa.

---

##  Diagrama de Clases UML
![Diagrama de clases UML](<EA1. Planteando el diagrama de clase UML.drawio-1.png>)


---

##  Arquitectura y Decisiones de Diseño

### 1. Descripción de Clases Identificadas
El sistema modela una biblioteca a partir de cinco clases principales: **Usuario, Préstamo, Libro, LibroDigital y Autor**. Cada una encapsula sus atributos como privados y expone su comportamiento únicamente a través de métodos públicos, cumpliendo el principio de **encapsulamiento**.

- **Usuario:** Representa a la persona que solicita libros en préstamo.
- **Libro:** Representa el material físico disponible en el catálogo.
- **LibroDigital:** Especialización para recursos electrónicos.
- **Autor:** Almacena la información de quien escribió cada obra.
- **Préstamo:** Articula la operación central del sistema, vinculando a un usuario con un libro durante un periodo determinado.

La decisión de separar `Préstamo` como clase independiente responde al **Principio de Responsabilidad Única (SRP)**: cada clase se encarga exclusivamente de su propio dominio de información y comportamiento, sin mezclar la lógica de disponibilidad de un libro con la lógica temporal de un préstamo.

### 2. Justificación de Relaciones
- **Asociación (Usuario - Préstamo):** Un usuario puede realizar varios préstamos a lo largo del tiempo (`1` a `0..*`), pero ambas clases tienen existencia independiente entre sí; un usuario sigue existiendo aunque no tenga préstamos activos.
- **Composición (Préstamo - Libro):** Se modeló como composición porque un préstamo no tiene sentido sin el libro que referencia (dependencia fuerte del todo hacia su parte `Libro`, representada con el rombo relleno).
- **Agregación (Autor - Libro):** Un autor puede agregar varios libros que ha escrito (`1` a `0..*`), pero la relación es débil: si se elimina un autor del sistema, los libros pueden seguir existiendo en el catálogo.
- **Herencia y Polimorfismo (Libro - LibroDigital):** `LibroDigital` hereda de `Libro` sus atributos (`titulo`, `disponible`) y sobrescribe el método `prestar()` para reflejar un comportamiento distinto: un libro físico bloquea su disponibilidad al prestarse, mientras que un libro digital genera una copia de acceso temporal sin agotar existencias.

### 3. Cohesión, Acoplamiento y Principios SOLID
- **Alta Cohesión:** Cada clase agrupa únicamente los atributos y métodos relacionados con su responsabilidad.
- **Bajo Acoplamiento y OCP (Open/Closed Principle):** La clase `Préstamo` puede componerse de cualquier subtipo de `Libro` sin conocer sus detalles internos. El sistema queda abierto a extensiones futuras (por ejemplo, `LibroAudio`) sin necesidad de modificar el código existente.

---

##  Enlaces del Proyecto

-  **Diagrama en vivo (Lucidchart / draw.io):** https://app.diagrams.net/#G1DbrF8UaT20-L7SLSYhvbyGCb8Qr-kNjr#%7B%22pageId%22%3A%22P24jo5nsiwFDoYnhvOSi%22%7D 
-  **Video Explicativo (YouTube / Drive):**  https://drive.google.com/file/d/1RNs-FG-1aFJ2R4dwy1Xq6K0Fl36Z6vaL/view 

---

##  Conclusiones

- Con el desarrollo de este trabajo pudimos comprender de una manera práctica cómo se estructura y organiza la información antes de llevarla a un programa. Al realizar el diagrama UML del sistema de biblioteca, se logró identificar la función de cada clase y entender cómo sus relaciones permiten representar situaciones reales.
- Es clave destacar la capacidad del diagrama de clases para integrar una mirada sistémica sobre procesos complejos. Este modelado visual facilita profesionalmente la resolución de problemas y la creación de soluciones tecnológicas escalables y mantenibles en el tiempo.