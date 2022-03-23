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

La imagen está apuntando a una base de datos en https://cloud.mongodb.com/ pero si se desea montar los fuentes en el ambiente local se deja un backup de la la base de datos en la carpeta Xmen

![image](https://user-images.githubusercontent.com/71658927/159723844-09141e7b-0cb9-4294-8e05-8add73787c8f.png)






