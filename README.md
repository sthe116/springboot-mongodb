# API de Gerenciamento de Posts 📝

Este projeto é uma **API RESTful** desenvolvida com **Spring Boot** e **MongoDB**. A API gerencia **usuários** e **posts**, com suporte para **DTOs**para simplificar as transferências de dados. A aplicação foi construída usando **Java 17** e **Maven** como ferramenta de build.

---

## 🚀 Tecnologias utilizadas

- **Linguagem:** Java 17
- **Framework:** Spring Boot
- **Banco de dados:** MongoDB
- **Gerenciamento de dependências:** Maven
- **Dependências principais:**
  - Spring Web
  - Spring Data MongoDB

---
## 🛠️ Configuração e execução
Clone o repositório:
```bash
git clone https://github.com/seu-usuario/springboot-mongodb.git
```
Configure o MongoDB:
  
- Certifique-se de que o MongoDB está em execução.

- Atualize o arquivo application.properties com as configurações.
---
## 📝 Endpoints detalhados
Usuários (/users)
- GET /users – Listar todos os usuários.
- GET /users/{id} – Buscar usuário por ID.
- POST /users – Criar um novo usuário.
- DELETE /users/{id} – Deletar um usuário.
- PUT /users/{id} - Atualizar um usuário.
- GET /users/{id}/posts - Listar os posts por ID.
  
Posts (/posts)
- GET /posts – Listar todos os posts.
- GET /posts/{id} – Buscar post por ID.
- GET /posts/titlesearch - Buscar posts pelo título.
- GET /posts/fullsearch - Buscar posts por texto completo.

---
## 📋 Pré-requisitos
Java 17 ou superior instalado.

MongoDB instalado e em execução.



