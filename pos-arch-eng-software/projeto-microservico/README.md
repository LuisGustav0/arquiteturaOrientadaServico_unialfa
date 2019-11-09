# Projeto Microseviços


## Acme Travel (Sprint Boot)
É um sistema de agencia de turismo   


Modelo de dominio: Cliente e Reservas

Framework: 
 https://spring.io/projects/spring-boot
 https://spring.io/projects/spring-cloud

Gerando uma aplicação inicial com os componentes spring-boot.

    https://start.spring.io/



## Acme Fly (Apache Camel)
É um sistema para reserva de voos

Modelo de dominio: Cliente, Aeronaves, Reservas

## Acme Hotel (Quarkus)
É um sistema para reserva de hoteis

Modelo de dominio: Cliente, Quartos, Reservas

Gerando uma aplicação com Quarkus.

    https://code.quarkus.io/

## Acme Cars (Microprofile)
É um sistema para reserva de carros

Framework: https://microprofile.io/

Gerando uma aplicação com Microprofile utilizando o thorntail da Red Hat.


    https://thorntail.io/generator/


Modelo de dominio: Cliente, Carros, Reservas

## Acme Payments (micronaut)
É um sistema para pagamentos

Modelo de dominio: Cliente, Conta, Transaçoes


https://dzone.com/articles/a-quick-guide-to-microservices-with-the-micronaut

## Consul

Iniciando serviço consul em modo desenvolvimento.

    
	consul agent -server -bootstrap-expect=1 -data-dir=consul.d -ui -bind=169.254.156.24


Portas dos microserviços:

- acme-car:8080
- acme-travel:8180
- acme-hotel:8280
- acme-fly:8380
- acme-pay:8480
- api-gateway:8580


