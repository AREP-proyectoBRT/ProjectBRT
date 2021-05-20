### Arquitectura Empresarial
### Arquitecturas nativas para la nube
> Integrantes:
> * 👩 Paula Andrea Guevara Sánchez.
> * 👨 Daniel Felipe Muñoz Rincón.
> * 👨 Alan Yesit Marín Medez

# Arquitecturas IoT y Big Data para sistemas BRT

[![danielrincon-m](https://circleci.com/gh/danielrincon-m/AREP_LAB4.svg?style=svg)](https://app.circleci.com/pipelines/github/danielrincon-m/AREP_LAB4)
<!-- [![Heroku](img/heroku_long.png)](https://nanospring.herokuapp.com/nspapp/register) -->

## Descripción ☁️

En este documento hablaremos sobre la importancia que tienen las nuevas tecnologías a la hora de optimizar la movilidad en los sistemas BRT. Abordaremos una solución a la falta de flexibilidad en la planeación de rutas, proponiendo una programación dinámica de rutas gracias a tecnologías como IoT y Big Data alojada en la nube en AWS.

La arquitectura de los servicios se muestra a continuación:

![Arquitectura](https://github.com/AREP-proyectoBRT/ProjectBRT/blob/main/img/Arquitectura%20de%20la%20solución.png)


## Implementación 🛡️

La arquitectura de la aplicación se basa en la abstracción de una API por medio del API Gateway de Amazon, y la presentación de una interfaz amigable con el usuario por medio de una página web.

Vamos a realizar un breve recorrido por cada uno de los servicios.


### Pruebas de funcionamiento

Las pruebas de funcionamiento se realizaron con todo el sistema montado, probando diferentes valores, tanto válidos como no válidos, se realizaron de manera similar al estilo mostrado en el [Video de Demostración](#video-de-demostración-).

## Video de demostración 📹

Se realizó un video demostrando y explicando el funcionamiento de todo el sistema, este video puede ser encontrado [AQUÍ](demostracion.mp4).

## Descarga del proyecto ⬇️

Clone el proyecto utilizando el siguiente comando:

```
git clone https://github.com/danielrincon-m/AREP_LAB7.git
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

## Documentación del código fuente 🌎

La documentación del proyecto puede ser encontrada en la carpeta [TempConverter/docs](TempConverter/docs).

También puede ser generada con Maven, clonando el proyecto y ejecutando el siguiente comando en la carpeta TempConverter:

```
mvn javadoc:javadoc
```

## Documento de diseño 📄

Este laboratorio no cuenta con documento de diseño.

## Herramientas utilizadas 🛠️

* [Visual Studio Code](https://code.visualstudio.com/) - IDE de desarrollo
* [Maven](https://maven.apache.org/) - Manejo de Dependencias
* [JUnit](https://junit.org/junit4/) - Pruebas unitarias
* [GitHub](https://github.com/) - Repositorio de código
* [Spark](https://sparkjava.com/) - Framework web
* [AWS](https://aws.amazon.com/es/) - Despliegue en la nube
* [REST Assured](https://rest-assured.io/) - Herramienta de pruebas para el API REST

## Autor 🧔

**Daniel Felipe Rincón Muñoz:** *Planeación y desarrollo del proyecto* -
[Perfil de GitHub](https://github.com/danielrincon-m)

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
