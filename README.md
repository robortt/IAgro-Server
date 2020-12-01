# Welcome to IAgro server enterprise proyect
### for Stigma Software's rendition for the Testing and Development Proyect of UTEC's ITL

This repository hosts source code for the Enterprise Java Bean proyect allocated into ejbModule/com folder and a diagrams folder for class database structures

IAgro server application classes are structured and grouped by layers. Entity layer packaged as com/entities has code for reality objects such as users, roles, forms, written
as a Singleton pattern annotated with persistance tags to generate tables directly from the java objects. Persistance Layer packaged as com/persistance holds DAO or Data Access 
Object classes describing CRUD functionality for each entity facilitated by the use of EntityManager instance, with local interfaces extending a general CRUD definition interface. 
Last layer is called Service layer under com/services wich encounters a similar structure as Persistance layer giving remote interfaces for functions acting as intermediary 
between client calls and persistance. Also user bootstrap to allow client access on first deploy

#Bienvenido a proyecto empresarial IAgro server
### para la rendición de Stigma Software del Proyecto de Desarrollo y Testing 2020 de la carrera LTI de UTEC

Este repositorio es anfitrion del codigo fuente para el proyecto Enterprise Java Bean ubicado en carpeta ejbModule/com y una carpeta diagrams para estructura de la persistencia

Las clases del aplicativo IAgro estan estructuradas y agrupadas por capas. La capa Entidad en el paquete com/entities tiene codigo para objetos de la realidad como usuarios, roles,
formularios, escritos siguiendo un patrón Singleton y con anotaciones de persistencia para generar tablas directamente de los objetos Java. La capa de persistencia empaquetada en
com/persistance mantien clases DAOs o Objetos de Acceso de Datos describiendo funcionalidad CRUD para cada entidad, facilitado por el uso de instancias EntityManager, con interfaces
locales extendiendo una interfaz general de la definicion CRUD. La ultima capa es llamada capa de Servicio bajo com/services la cual cuenta con una estructura similar a la capa
de Persistencia otorgando interfaces remotas para funciones, actuando como intermediario entre llamadas cliente y Persistencia. También un Bootstrap de usuario permite acceso 
al cliente en primer despliegue



