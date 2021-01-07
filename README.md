This project is created to get experience on **Microservices With Netflix OSS**. This is a simple project by coded imperative programming with simple business requirements.

## Architecture ( JobBoard link ):

https://docs.google.com/presentation/d/1kgkP3VaAijRl-Jf7nJnpFW5NeAY_9VVWWRWMW1aGgW4/edit?usp=sharing


## There are six microservices:

- **Client-service** : This microservice is responsible for managing clients. An account is a client.
    .                   URI for gateway : *http://localhost:8082*
    .                   URI for H2 database : *http://localhost:8082/h2*
                                       H2 connect link :  *./Database/Data/Client* 
                       

- **Reclamation-service** : This microservice is responsible for managing reclamations. a client will be able to fill a reclamation.
    .                   URI for gateway : *http://localhost:8084*
    .                   URI for H2 database : *http://localhost:8084/h2*
     .                                  H2 connect link :  *./Database/Data/Reclamation*


- **Vol-service** : This microservice is responsible for managing flights. a client will be able to consult flights in order to make a reservation.
    .                   URI for gateway : *http://localhost:8085*
    .                   URI for H2 database : *http://localhost:8085/h2*
     .                                  H2 connect link :  *./Database/Data/Vols*
                       
                       
             
 **Netflix Eureka** is used for managing instances             
    .                   URI for eureka : *http://localhost:8761*


- **Netflix Ribbon** is used for client side load-balancing.
- **Netflix Zuul** is used for gateway(07/01/2021 : netflix-zuul is under maintenance , therefore we want be able to excute the zuul gateway).


## Docker : 
    -used Docker Desktop for Windows .
    - each microservice has his own docker file , to create docker image , 
    first excute this command  in cmd under each micro service directory "docker build -t image_name . "    . is to search and execute the docker file in current directory 
    - to run an image " docker run -p   port_desired:port_of_your_micro_service  image_name 
    -list images : docker image ls 
    -list containers : docker container ps 
    -delete container/image : docker image/container rm image/container ID 
    -AS for docker compose , 07/01/2021 , zuul is udner maintenance , so there won't be any need to use docker compose to orchestrate the micro services .





## Build & Run

- *>mvn clean package* : to build
     In docker-compose.yml file:

## VERSIONS 1.0


### 1.0.0 SNAPSHOT

- Spring-Boot 2.3.1.RELEASE
