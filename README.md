# 🍕 Pizzaria Mario's - Sistema de Pedidos Web

## 🧾 Contexto do Projeto

Mário, um empreendedor de uma pizzaria numa charmosa cidade do interior, viu seu atendimento artesanal virar um caos com o aumento da clientela. O controle manual de pedidos começou a prejudicar o tempo de preparo e a entrega.

A **Pizzaria Mario's** é o sistema web para pedidos desenvolvido para resolver esse problema de forma eficaz, desenvolvido com Java, Spring Boot e Thymeleaf, de forma segura, prática e com baixo custo de manutenção.
O projeto visa permitir o gerenciamento completo de pedidos, catálogo de pizzas, usuários e controle de status dos pedidos.

---

## Índice 🔗

* [🧾 Contexto do Projeto](#contextoDoProjeto)
* [📁 Estrutura do Projeto](#estruturadoprojeto)
* [🛠️ Tecnologias Utilizadas](#tecnologiasutilizadas)
* [📋 Requisitos](#requisitos)
* [🍕 Funcionalidades Previstas](#funcionalidadesprevistas)
   * [👥 Para Clientes](#paraclientes)
   * [🧑‍🍳 Para Administradores](#paraadministradores)
* [🗓️ Cronograma e Etapas](#cronogramaeetapas)
* [📦 Entrega](#entrega)
* [🧱 Camadas e Arquitetura](#camadasearquitetura)
* [📚 Principais Classes e DTOs](#principaisclassesedtos)
* [🚀 Como Executar](#comoexecutar)
* [🤝 Contribuição](#contribuição)
* [📜 Licença](#licença)
* [👨‍💻 Autor](#autor)
* [📣 Feedback](#feedback)

---

## 📁 Estrutura do Projeto

```
├───src
│   ├───main
│   │   ├───java
│   │   │   └───br
│   │   │       └───com
│   │   │           └───fatecmogidascruzes
│   │   │               └───pizzaria_mario
│   │   │                   ├───config
│   │   │                   ├───controller
│   │   │                   ├───dto
│   │   │                   ├───exception
│   │   │                   ├───facade
│   │   │                   ├───mapper
│   │   │                   ├───model
│   │   │                   ├───repository
│   │   │                   └───service
│   │   │                       └───impl
│   │   └───resources
│   │       ├───static
│   │       │   ├───css
│   │       │   ├───images
│   │       │   └───js
│   │       └───templates
│   │           ├───admin
│   │           ├───cliente
│   │           ├───error
│   │           └───pedido
└── test
    └── java
        └── br.com.fatecmogidascruzes.pizzaria_mario
```

---

## 🛠️ Tecnologias Utilizadas

| Camada         | Tecnologias                         |
| -------------- | ----------------------------------- |
| **Back-end**   | Java, Spring Boot                   |
| **Front-end**  | Thymeleaf, HTML, CSS, JavaScript    |
| **Estilo**     | Bootstrap                           |
| **DTO Mapper** | MapStruct                           |
| **Segurança**  | Spring Security                     |
| **Banco**      | H2 (teste e dev) → MongoDB (futuro) |

---

## 📋 Requisitos

* **Java 21**
* **Spring Boot 3.x**
* **Maven**
* **MapStruct**
* **Thymeleaf**
* **H2 Database** (para testes)

---
## 🍕 Funcionalidades Previstas

### 👥 Para Clientes

* Visualizar catálogo de pizzas 🍕
* Adicionar ao carrinho e finalizar pedido 🛒
* Acompanhar status do pedido em tempo real 🔄
* Login e área personalizada 🔐

### 🧑‍🍳 Para Administradores

* Acompanhar todos os pedidos 📋
* Atualizar status do pedido (de “recebido” até “entregue” ou “cancelado”) 🔄
* Gerenciar o catálogo de pizzas (CRUD completo) 🍽️
* Autenticação com acesso restrito 🔒

---

## 🗓️ Cronograma e Etapas

O desenvolvimento segue um cronograma controlado via Trello: **[Projeto - Pizzaria Mario's Trello](doc/board.md)**

---

## 📦 Entrega

Nesta fase inicial, foram implementadas as entidades, DTOs, serviços e mapeamentos com **MapStruct**. A persistência utiliza banco de dados **H2** em memória para testes, com previsão de migração para **MongoDB**.

---

## 🧱 Camadas e Arquitetura

* **Entidades:** Representam os dados do domínio (Pedido, Pizza, Cliente, etc)
* **DTOs:** Dados de entrada/saída para as views
* **MapStruct:** Converte entre Entidades e DTOs
* **Controllers:** Responsáveis pela comunicação entre usuário e sistema
* **Services:** Contêm a lógica de negócio
* **Repositories:** Interface com o banco de dados

## 📚 Principais Classes e DTOs

* **Pizza.java** - Representa uma pizza no sistema
* **Pedido.java** - Pedido feito pelo cliente
* **Cliente.java** - Dados do cliente
* **StatusPedido.java** - Enum com os status de pedidos
* **PizzaDTO / PedidoDTO / ClienteDTO** - Representações de transporte de dados
* **MapStruct Mappers** - `PizzaMapper`, `PedidoMapper`, etc

## 🚀 Como Executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/pizzaria-marios.git
   ```
2. Acesse o diretório:

   ```bash
   cd pizzaria-marios
   ```
3. Execute a aplicação via Maven:

   ```bash
   ./mvnw spring-boot:run
   ```
4. Acesse no navegador:

   ```
   http://localhost:8080
   ```

## 🤝 Contribuição

1. Faça um fork
2. Crie uma branch com sua feature (`git checkout -b feature/nova-feature`)
3. Commit suas alterações (`git commit -am 'feat: nova feature'`)
4. Push para a branch (`git push origin feature/nova-feature`)
5. Crie um Pull Request

## 📜 Licença

Este projeto é um trabalho acadêmico e está aberto para fins educacionais e de aprendizado.
Sinta-se à vontade para usar como base, desde que com bom senso e, de preferência, acompanhado de uma pizza.

## 👨‍💻 Autor

<div align="center">
  <a href="https://www.linkedin.com/in/leonardo-vin%C3%ADcius25/">
    <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/100011077?v=4" width="100px;" alt="foto do autor"/>
  </a>

[![Linkedin Badge linktree](https://img.shields.io/badge/-Leonardo_Vinícius-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/leonardo-vin%C3%ADcius25/)](https://www.linkedin.com/in/leonardo-vin%C3%ADcius25/)
[![Linkedin Badge linkedin](https://img.shields.io/badge/-Leonardo_Vinícius-39E09B?style=flat-square&logo=linktree&logoColor=white&link=https://linktr.ee/pokernol)](https://linktr.ee/pokernol)
</div>

## 📣 Feedback

Se você tiver algum feedback, por favor me deixe saber por meio de meu Email:

[![Gmail Badge](https://img.shields.io/badge/-Lenardopoke25@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:leonardopoke25.com)](mailto:leonardopoke25.com)