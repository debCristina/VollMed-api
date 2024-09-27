<h1 align="center">VollMed API</h1>
<p align="center">
<img alt="Static Badge" src="https://img.shields.io/badge/Maven-3.6.3-blue">
<img alt="Static Badge" src="https://img.shields.io/badge/Spring%20Boot-2.4.5-green">
<img alt="Static Badge" src="https://img.shields.io/badge/MySQL-8.0-blue">
<img alt="Static Badge" src="https://img.shields.io/badge/Status-Conclu%C3%ADdo-green">
</p>

Este projeto consiste no desenvolvimento de uma API RESTful para uma clínica médica, como parte da minha formação no programa One Alura e Oracle. A API foi projetada para gerenciar de forma eficiente e segura os dados de pacientes, médicos e consultas médicas, além de implementar um sistema de autenticação robusto com tokens JWT.

## Funcionalidades
- CRUD de Pacientes:
Cadastro, leitura, atualização e remoção de dados de pacientes, como nome, idade, endereço , email, telefone e cpf.
- CRUD de Médicos:
Gerenciamento de informações dos médicos, incluindo nome, especialidade, telefone, email e endereço.
- CRUD de Consultas:
Criação, visualização, atualização e cancelamento de consultas médicas, vinculando médicos e pacientes, além de incluir detalhes como data, horário e motivo da consulta.
- Autenticação e Autorização via JWT (Auth0):
A API utiliza tokens JWT (JSON Web Token) gerados através do Auth0 para autenticação e autorização dos usuários, garantindo acesso seguro às rotas protegidas. Apenas usuários autenticados podem acessar e modificar informações sensíveis, como dados de pacientes e médicos.

## Tecnologias Utilizadas
- Spring Boot: Framework principal utilizado para a construção da aplicação, permitindo uma rápida configuração e desenvolvimento de microserviços.
- Maven: Utilizado para gerenciamento de dependências e construção do projeto, facilitando a integração de bibliotecas externas.
- MySQL: Banco de dados relacional escolhido para armazenar informações de forma estruturada e eficiente.
- Spring Security: Implementado para garantir a segurança da aplicação, protegendo as rotas e os dados sensíveis dos usuários.
- Flyway: Ferramenta utilizada para versionamento e gerenciamento de migrações do banco de dados, assegurando a integridade dos dados ao longo do desenvolvimento.
- Lombok: Biblioteca que simplifica o código Java, reduzindo a quantidade de código boilerplate e melhorando a legibilidade.
- Java JWT: Utilizada para implementar a autenticação baseada em tokens JWT (JSON Web Token);
- Spring Boot validation:
- 
# Como utilizar
Antes de utilizar o projeto certifique-se de estar utilizando as seguintes tecnologias:
- Java 17
- Spring boot
- Maven
- Spring Data JPA
- MySql
- Lombook
- Flyway
- Spring Security

  1. Clone este repositório
   
 ```
bash
   git clone https://github.com/debCristina/literalura.git
```
2. Configure seu PostgreSQL criando um banco de dados para a aplicação
   
3.  No arquivo `src/main/resources/aplication.properties` configure com suas informações

   ```
   properties
      spring.datasource.url=jdbc:mysql://{DB_HOST}/{DB_VOLLMED_NAME}
      spring.datasource.username={USER_MYSQL_NAME}
      spring.datasource.password={USER_MYSQL_PASSWORD}
   ```
   
- Configure as variáveis de ambiente ${DB_HOST}, ${DB_VOLLMED_NAME}, ${USER_MYSQL_NAME} e ${USER_MYSQL_ASSWORD} pelos valores específicos do seu ambiente de desenvolvimento.
- Abra o projeto em sua IDE java preferida.
- Execute a aplicação e aproveite as funcionalidades disponíveis.

## Documentação

A API possui uma documentação interativa gerada automaticamente com o **Swagger**, facilitando a consulta e o teste dos endpoints disponíveis. A documentação fornece detalhes sobre as rotas, parâmetros, respostas, além de permitir a execução de requisições diretamente pelo navegador.

### Endpoints de Documentação

- **/v3/api-docs/**: Este endpoint fornece as especificações da API no formato OpenAPI, que pode ser utilizado para integrar a API com outras ferramentas.
  
- **/swagger-ui.html**: A interface gráfica interativa do Swagger, onde é possível visualizar e testar todos os endpoints da API.

### Acesso à Documentação

Após iniciar a aplicação, a documentação interativa pode ser acessada através do seguinte endereço: http://localhost:8080/swagger-ui.html

## Minha experiência

Realizar este projeto foi uma experiência extremamente gratificante, pois pude perceber o quanto estou avançando nos meus conhecimentos em desenvolvimento. Fico muito feliz por estar explorando novas ferramentas e conceitos no mundo da tecnologia, o que me faz sentir cada vez mais motivada a continuar aprendendo.

Sei que ainda tenho um longo caminho a percorrer, mas completar este projeto representa um passo importante na minha jornada de aprendizado, especialmente no domínio de Java e, em particular, com o framework Spring. Tive a oportunidade de trabalhar com diversas tecnologias novas, como autenticação via tokens JWT, integração com Lombok, gerenciamento de migrações com Flyway e a documentação de APIs usando Swagger. Todas essas ferramentas me ajudaram a enriquecer meu entendimento e a aplicar conceitos fundamentais no desenvolvimento de APIs seguras e eficientes.

Essa experiência tem sido extremamente recompensadora, e estou ansiosa para continuar avançando e explorando ainda mais o vasto mundo da tecnologia!
