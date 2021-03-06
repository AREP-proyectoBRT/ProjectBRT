### Arquitectura Empresarial
### Arquitecturas nativas para la nube
> Integrantes:
> * 馃懇 Paula Andrea Guevara S谩nchez.
> * 馃懆 Daniel Felipe Rinc贸n Mu帽oz.
> * 馃懆 Alan Yesid Mar铆n Medez.

# Arquitecturas IoT y Big Data para sistemas BRT

[![danielrincon-m](https://circleci.com/gh/danielrincon-m/AREP_LAB4.svg?style=svg)](https://app.circleci.com/pipelines/github/danielrincon-m/AREP_LAB4)
<!-- [![Heroku](img/heroku_long.png)](https://nanospring.herokuapp.com/nspapp/register) -->

## Descripci贸n 鈽侊笍

En este documento hablaremos sobre la importancia que tienen las nuevas tecnolog铆as a la hora de optimizar la movilidad en los sistemas BRT. Abordaremos una soluci贸n a la falta de flexibilidad en la planeaci贸n de rutas, proponiendo una programaci贸n din谩mica de rutas gracias a tecnolog铆as como IoT y Big Data alojada en la nube en AWS.

La arquitectura de los servicios se muestra a continuaci贸n:

![Arquitectura](https://github.com/AREP-proyectoBRT/ProjectBRT/blob/main/img/Arquitectura%20de%20la%20soluci贸n.png)

## Documento de dise帽o 馃搫

se realizo un articulo, donde se explica en detalle el estudio realizado y sobre la soluci贸n la aquitetura. [AQU脥](https://github.com/AREP-proyectoBRT/ProjectBRT/blob/main/paper/PROYECTO-AREP.pdf)

## Implementaci贸n 馃洝锔?

La arquitectura de la aplicaci贸n se basa en la implementaci贸n de una API por medio del Ec2 de AWS, donde se enfoca en la recolecci贸n de datos de unos sensores, usando IoT Core y por medio de Kinesis Analitics, se realiza la colecci贸n y an谩lisis de los datos que se enviara a la aplicaci贸n  docker Ec2 y ser谩 alojada de esta manera en una base de datos PostgreSQL y la presentaci贸n de una interfaz amigable con el usuario por medio de una p谩gina web.


## Video de demostraci贸n 馃摴

Se realiz贸 un video demostrando y explicando el funcionamiento de todo el sistema.

https://user-images.githubusercontent.com/46799459/119025556-dcad9480-b969-11eb-80c4-130b3f784466.mp4

## Descarga del proyecto 猬囷笍

Clone el proyecto utilizando el siguiente comando:

```
https://github.com/AREP-proyectoBRT/ProjectBRT.git
```

## Correr las pruebas unitarias 馃И

### Prerrequisitos

Un IDE que soporte proyectos Java, o una instalaci贸n de Maven en su sistema, puede obtenerlo desde
la [p谩gina oficial.][mvnLink]

### Ejecuci贸n de pruebas

Las pruebas pueden ser ejecutadas desde la secci贸n de pruebas de su IDE o si tiene maven puede navegar a la carpeta principal de TempConverter y ejecutar el comando

```
mvn test
```

## Herramientas utilizadas 馃洜锔?

* [Visual Studio Code](https://code.visualstudio.com/) - IDE de desarrollo
* [Maven](https://maven.apache.org/) - Manejo de Dependencias
* [JUnit](https://junit.org/junit4/) - Pruebas unitarias
* [GitHub](https://github.com/) - Repositorio de c贸digo
* [Spark](https://sparkjava.com/) - Framework web
* [AWS](https://aws.amazon.com/es/) - Despliegue en la nube
* [REST Assured](https://rest-assured.io/) - Herramienta de pruebas para el API REST

## Autores

**Daniel Felipe Rinc贸n Mu帽oz:** *Planeaci贸n y desarrollo del proyecto* -
[Perfil de GitHub](https://github.com/danielrincon-m)

**Paula Andrea Guevara S谩nchez:** *Planeaci贸n y desarrollo del proyecto* -
[Perfil de GitHub](https://github.com/PaulaSanchez810)

**Alan Yesit Mar铆n Medez:** *Planeaci贸n y desarrollo del proyecto* -
[Perfil de GitHub](https://github.com/Elan-MarMEn)

## Licencia 馃殌

Este proyecto se encuentra licenciado bajo **GNU General Public License** - consulte el archivo [LICENSE.md](LICENSE.md)
para m谩s detalles.

<!-- 
## Acknowledgments 

* Hat tip to anyone whose code was used
* Inspiration
* etc
-->

[gitLink]: https://git-scm.com/downloads
[mvnLink]: https://maven.apache.org/download.cgi
