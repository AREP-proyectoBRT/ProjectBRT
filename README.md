### Arquitectura Empresarial
### Arquitecturas nativas para la nube
> Integrantes:
> * 👩 Paula Andrea Guevara Sánchez.
> * 👨 Daniel Felipe Rincón Muñoz.
> * 👨 Alan Yesid Marín Medez.

# Arquitecturas IoT y Big Data para sistemas BRT

[![danielrincon-m](https://circleci.com/gh/danielrincon-m/AREP_LAB4.svg?style=svg)](https://app.circleci.com/pipelines/github/danielrincon-m/AREP_LAB4)
<!-- [![Heroku](img/heroku_long.png)](https://nanospring.herokuapp.com/nspapp/register) -->

## Descripción ☁️

En este documento hablaremos sobre la importancia que tienen las nuevas tecnologías a la hora de optimizar la movilidad en los sistemas BRT. Abordaremos una solución a la falta de flexibilidad en la planeación de rutas, proponiendo una programación dinámica de rutas gracias a tecnologías como IoT y Big Data alojada en la nube en AWS.

La arquitectura de los servicios se muestra a continuación:

![Arquitectura](https://github.com/AREP-proyectoBRT/ProjectBRT/blob/main/img/Arquitectura%20de%20la%20solución.png)

## Documento de diseño 📄

se realizo un articulo, donde se explica en detalle el estudio realizado y sobre la solución la aquitetura. [AQUÍ](https://github.com/AREP-proyectoBRT/ProjectBRT/blob/main/paper/PROYECTO-AREP.pdf)

## Implementación 🛡️

La arquitectura de la aplicación se basa en la implementación de una API por medio del Ec2 de AWS, donde se enfoca en la recolección de datos de unos sensores, usando IoT Core y por medio de Kinesis Analitics, se realiza la colección y análisis de los datos que se enviara a la aplicación  docker Ec2 y será alojada de esta manera en una base de datos PostgreSQL y la presentación de una interfaz amigable con el usuario por medio de una página web.


## Video de demostración 📹

Se realizó un video demostrando y explicando el funcionamiento de todo el sistema.

https://user-images.githubusercontent.com/46799459/119025556-dcad9480-b969-11eb-80c4-130b3f784466.mp4

## Descarga del proyecto ⬇️

Clone el proyecto utilizando el siguiente comando:

```
https://github.com/AREP-proyectoBRT/ProjectBRT.git
```

## Correr las pruebas unitarias 🧪

### Prerrequisitos

Un IDE que soporte proyectos Java, o una instalación de Maven en su sistema, puede obtenerlo desde
la [página oficial.][mvnLink]

### Ejecución de pruebas

Las pruebas pueden ser ejecutadas desde la sección de pruebas de su IDE o si tiene maven puede navegar a la carpeta principal de TempConverter y ejecutar el comando

```
mvn test
```

## Herramientas utilizadas 🛠️

* [Visual Studio Code](https://code.visualstudio.com/) - IDE de desarrollo
* [Maven](https://maven.apache.org/) - Manejo de Dependencias
* [JUnit](https://junit.org/junit4/) - Pruebas unitarias
* [GitHub](https://github.com/) - Repositorio de código
* [Spark](https://sparkjava.com/) - Framework web
* [AWS](https://aws.amazon.com/es/) - Despliegue en la nube
* [REST Assured](https://rest-assured.io/) - Herramienta de pruebas para el API REST

## Autores

**Daniel Felipe Rincón Muñoz:** *Planeación y desarrollo del proyecto* -
[Perfil de GitHub](https://github.com/danielrincon-m)

**Paula Andrea Guevara Sánchez:** *Planeación y desarrollo del proyecto* -
[Perfil de GitHub](https://github.com/PaulaSanchez810)

**Alan Yesit Marín Medez:** *Planeación y desarrollo del proyecto* -
[Perfil de GitHub](https://github.com/Elan-MarMEn)

## Licencia 🚀

Este proyecto se encuentra licenciado bajo **GNU General Public License** - consulte el archivo [LICENSE.md](LICENSE.md)
para más detalles.

<!-- 
## Acknowledgments 

* Hat tip to anyone whose code was used
* Inspiration
* etc
-->

[gitLink]: https://git-scm.com/downloads
[mvnLink]: https://maven.apache.org/download.cgi
