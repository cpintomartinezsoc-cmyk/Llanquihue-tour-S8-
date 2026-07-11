<img width="488" height="157" alt="image" src="https://github.com/user-attachments/assets/f80ca68b-059b-4ed7-8500-7e1562cc24f6" /><br><br>





🧠 Actividad Formativa Semana 8 – Integrando interfaces, polimorfismo y estructuras dinámicas
👤 

Nombre completo: Camilo Pinto

Carrera: Analista Programador

Asignatura: Desarrollo Orientado a Objetos I

Caso: Llanquihue Tour<br><br><br><br>








📘 Descripción general del sistema

Este proyecto corresponde a la actividad sumativa de la Semana 8 de la asignatura **Desarrollo Orientado a Objetos I**.

El sistema representa distintas entidades de la agencia turística **Llanquihue Tour**, utilizando los principales conceptos de la Programación Orientada a Objetos.








🧱 Estructura del proyecto

src/

│

├── model/

│   ├── Registrable.java

│   ├── RecursoAgencia.java

│   ├── GuiaTuristico.java

│   ├── Vehiculo.java

│   └── ColaboradorExterno.java

│

├── data/

│   └── GestorEntidades.java

│

└── ui/

    └── Main.java
    






# 📂 Descripción de las clases

<br><br>

## Registrable

Interfaz que define el comportamiento común de todas las entidades administradas por el sistema.

**Método declarado**

- mostrarResumen()

Permite que todas las entidades puedan mostrar su información utilizando una misma referencia, aplicando polimorfismo.

<br><br><br><br>

## RecursoAgencia

Clase base del sistema.

Contiene la información común para los distintos recursos administrados por la agencia.

**Atributos**

- nombre
- codigo

**Métodos implementados**

- Constructor
- Getters y Setters
- mostrarResumen() (sobrescrito por las subclases)

Esta clase sirve como base para las demás entidades del proyecto.

<br><br><br><br>

## GuiaTuristico

Hereda de **RecursoAgencia** e implementa la interfaz **Registrable**.

**Atributos adicionales**

- idioma
- aniosExperiencia

Implementa el método **mostrarResumen()**, mostrando la información correspondiente al guía turístico.

<br><br><br><br>

## Vehiculo

Hereda de **RecursoAgencia** e implementa la interfaz **Registrable**.

**Atributos adicionales**

- patente
- capacidad

Sobrescribe el método **mostrarResumen()**, mostrando la información del vehículo registrado.

<br><br><br><br>

## ColaboradorExterno

Hereda de **RecursoAgencia** e implementa la interfaz **Registrable**.

**Atributos adicionales**

- empresa

Implementa el método **mostrarResumen()**, mostrando los datos del colaborador externo.

<br><br><br><br>

## GestorEntidades

Clase encargada de administrar las entidades del sistema.

Sus funciones principales son:

- Crear una colección `ArrayList<Registrable>`.
- Agregar entidades al sistema.
- Retornar la colección para recorrerla desde la interfaz principal.

Durante el recorrido de la colección se utiliza **instanceof** para identificar el tipo específico de cada objeto.

<br><br><br><br>

## Main

Clase principal del proyecto.

Su función consiste en:

- Mostrar un menú gráfico utilizando **JOptionPane**.
- Registrar nuevos Guías Turísticos.
- Registrar nuevos Vehículos.
- Registrar nuevos Colaboradores Externos.
- Mostrar todas las entidades almacenadas.
- Utilizar polimorfismo mediante la interfaz **Registrable**.
- Diferenciar el tipo de objeto utilizando **instanceof**.

<br><br><br><br>

# ▶️ Instrucciones para ejecutar el proyecto

<br><br>

1. Clonar el repositorio desde GitHub.

2.git clone https://github.com/cpintomartinezsoc-cmyk/Llanquihue-tour-S8.git

3. Abrir el proyecto en IntelliJ IDEA.

4. Verificar que todas las clases se encuentren organizadas en los paquetes correspondientes.

5. Ejecutar la clase:nui/Main.java

6. Utilizar el menú con botones para registrar nuevas entidades.

7. Visualizar el resumen de todas las entidades creadas mediante la interfaz gráfica.

<br><br><br><br>

# 🧪 Prueba realizada

**Repositorio GitHub:**

https://github.com/cpintomartinezsoc-cmyk/Llanquihue-tour-S8.git

**Fecha de entrega:** [11/07/2026]
