# Projeto de exemplo em Microseviços


![agência de viagem](img/acme-company.png)

Representa uma agência de viagens com 5 microserviços e uma API gateway.

- Acme Travel (usando Sprint Boot)
- Acme Fly (usando Apache Camel + Spring boot)
- Acme Hotel (usando Quarkus)
- Acme Cars (usando Microprofile com Thorntail)
- Acme Pay (usando Micronaut)
- Api Gateway (usando Apache Camel)


### Requisitos

1. Ferramentas como:
  - ![JDK 1.8](https://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)
  - IDE ![Eclipse](https://www.eclipse.org/downloads/packages/) ou ![IntelliJ](https://www.jetbrains.com/idea/download/) ou ![Spring Tools](https://spring.io/tools)
  
2. Baixar o projeto:
```bash
    $git clone https://github.com/alisson-gomesc/unialfa.git
```
	
3. Entre no diretório:

```bash
    $ cd pos-arch-eng-software/projeto-microservico
    $ ls -l
      acme-car
      acme-company.png
      acme-fly
      acme-hotel
      acme-pay
      acme-travel
      api-gateway
      README.md
```

4. Fazer o download do ![lombok](https://projectlombok.org/download)
 
5. Configurar lombok para o ![Eclipse](https://dicasdejava.com.br/como-configurar-o-lombok-no-eclipse/) ou ![IntelliJ IDEA](https://dicasdejava.com.br/como-configurar-o-lombok-no-intellij-idea/)
	
6. Fazer o download do service discovery ![consul](https://www.consul.io/downloads.html)

7. Iniciar o serviço do consul como server:

```bash
    consul agent -server -bootstrap-expect=1 -data-dir=consul.d -ui -bind=<ip da maquina local>
```

### Acme Travel (Sprint Boot)

Representa um sistema de agencia de turismo   

## Acme Fly (Apache Camel)
Representa um sistema para reserva de voos

## Acme Hotel (Quarkus)
Repreenta um sistema para reserva de hoteis

## Acme Cars (Microprofile)
Representa um sistema para reserva de carros

## Acme Payments (micronaut)
Representa um sistema para pagamentos

Portas dos microserviços:
- acme-car    
```bash
    http://localhost:8080/api/greeting
```
- acme-travel
```bash
    http://localhost:8180/api/greeting
```
- acme-hotel
```bash
    http://localhost:8280/api/greeting
```
- acme-fly
```bash
    http://localhost:8380/api/greeting
```
- acme-pay
```bash
    http://localhost:8480/api/greeting
```
- api-gateway
```bash
    http://localhost:8580/api/greeting
	http://localhost:8580/api/acme-car/greeting
	http://localhost:8580/api/acme-travel/greeting
	http://localhost:8580/api/acme-hotel/greeting
	http://localhost:8580/api/acme-fly/greeting
	http://localhost:8580/api/acme-pay/greeting
```
