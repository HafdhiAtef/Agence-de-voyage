This project is created to get experience on **Microservices With Netflix OSS**. This is a simple project by coded imperative programming with simple business requirements.

## Architecture ( JobBoard link ):

https://docs.google.com/presentation/d/1kgkP3VaAijRl-Jf7nJnpFW5NeAY_9VVWWRWMW1aGgW4/edit?usp=sharing


## There are four microservices:

- **Client-service** : This microservice is responsible for managing clients. An account is a client.
    .                   URI for gateway : *http://localhost:8082*
    .                   URI for H2 database : *http://localhost:8082/h2*
                                       H2 connect link :  *./Database/Data/Client* 
                       

- **Reclamation-service** : This microservice is responsible for managing reclamations. a client will be able to fill a reclamation.
    .                   URI for gateway : *http://localhost:8084*
    .                   URI for H2 database : *http://localhost:8084/h2*
                                       H2 connect link :  *./Database/Data/Reclamation*
                       
                       
                       
             
 **Netflix Eureka** is used for managing instances             
    .                   URI for eureka : *http://localhost:8761*


- **Netflix Ribbon** is used for client side load-balancing.
- **Netflix Zuul** is used for gateway.





## Build & Run

- *>mvn clean package* : to build
     In docker-compose.yml file:

## VERSIONS 1.0


### 1.0.0 SNAPSHOT

- Spring-Boot 2.3.1.RELEASE
