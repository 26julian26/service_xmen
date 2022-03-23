# service_xmen
Servicio que implementa la validación de la secuencia de ADN para determinar si una persona es mutante

A continuación se describen los pasos para ejecutar la API desarrollada, la cual cumple con las indicaciones entregadas para la prueba. 

1. Localmente

Se deberá descargar la imagen de dockerhub https://hub.docker.com/

![image](https://user-images.githubusercontent.com/71658927/159715905-127bd9c5-28db-490a-8e53-5f1ce0ba46ea.png)

Ejecutar el siguiente comando para realizar la descarga del docker:

docker pull 26julian26/ms-xmenadn-service

![image](https://user-images.githubusercontent.com/71658927/159715530-15e0de4c-7289-4889-b397-80e0d3edc810.png)

Luego de tener la imagen, se deberá ejecutar el siguiente comando para correr el docker localmente (version: 1.0.1). 

docker run 26julian26/ms-xmenadn-service:1.0.1

![image](https://user-images.githubusercontent.com/71658927/159719588-434c47ce-99af-475d-b2e2-c7f8889ed4b6.png)

1.1. Base de datos MongoDB

La imagen está apuntando a una base de datos en https://cloud.mongodb.com/ y funciona sin necesidad de realizar ninguna parametrización, pero si se desea montar los fuentes en el ambiente local se deja un backup de la la base de datos en la carpeta Xmen

![image](https://user-images.githubusercontent.com/71658927/159723844-09141e7b-0cb9-4294-8e05-8add73787c8f.png)

![image](https://user-images.githubusercontent.com/71658927/159727495-778f0149-a57f-4f17-9310-3694ca8ff7dd.png)

Para conectarse a la base de datos en https://cloud.mongodb.com/ se debe utilizar el siguiente connection String:

mongodb+srv://admin:Bogota2020+M@cluster0.nxbbh.mongodb.net/Xmen?retryWrites=true

Para nuestro caso se utilizó la aplicación de MongoDB Compass

![image](https://user-images.githubusercontent.com/71658927/159728777-6fe6562b-7c5b-4cc8-92b9-abfb8ef73b04.png)

1.3. Pruebas del API Local 

Para poder ejecutar las pruebas se deberá descargar la collection (postman), la cual se deja en el repositorio  (este paso aplica tambien para la ejecución del API en Google Cloud)

https://github.com/26julian26/service_xmen/blob/master/Test_Mercado_Libre.postman_collection.json

![image](https://user-images.githubusercontent.com/71658927/159732955-3d0ad383-3d8f-4937-b8a4-41a69df281dd.png)

Luego de importar la colección en postman se debe abrir el request “Local”-“01_mutant” para hacer pruebas de validación de la secuencia de ADN

![image](https://user-images.githubusercontent.com/71658927/159735366-09806d5f-cf21-49f8-be96-d07ee8920066.png)

Para realizar la prueba del servicio de stats se debe abrir el request “Local”-“02_stats”

![image](https://user-images.githubusercontent.com/71658927/159735491-38c9c74f-0974-4bc9-b0e7-04fed8b18e19.png)


1.4. Pruebas del API Google Cloud









