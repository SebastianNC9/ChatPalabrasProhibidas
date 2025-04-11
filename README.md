# 🚫 Filtro de Palabras Prohibidas - Spring Boot App

Esta es una aplicación desarrollada con Spring Boot que permite al usuario escribir mensajes y filtra automáticamente palabras prohibidas. El filtro se ejecuta desde:

- La terminal

Además, implementa un **Aspecto (AOP)** que se encarga de detectar y sustituir las palabras prohibidas, siguiendo buenas prácticas de desacoplamiento.

---

## 🛠️ Tecnologías

- Java 17+
- Spring Boot 3.x
- Spring AOP
- Maven
- Git

---

## ⚙️ Funcionalidades

- El usuario puede ingresar mensajes de cualquier longitud.
- Se filtran palabras prohibidas de una lista predefinida.
- Las palabras pueden ser sustituidas por otras palabras o caracteres.
- Si un mensaje contiene más de 3 palabras prohibidas, se muestra una advertencia.
- AOP se usa para interceptar el servicio y aplicar el filtrado.
- Se usa desde terminal

---
