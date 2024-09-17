## 📋 Visão Geral

O **Aplicativo de Monitoramento de Saúde** é uma plataforma completa de monitoramento de saúde que permite aos usuários registrar atividades físicas, alimentação, sono e metas de saúde. A aplicação oferece integração com APIs externas para dados de fitness, geração de relatórios em PDF e envio de notificações por e-mail.

## 📚 Funcionalidades

- 🏃 **Registro de Atividades Físicas**
- 🍎 **Registro de Alimentação**
- 😴 **Registro de Sono**
- 🎯 **Acompanhamento de Metas de Saúde**
- 🔗 **Integração com APIs Externas de Fitness**
- 📄 **Geração de Relatórios em PDF**
- 📧 **Notificações por E-mail**

## 🚀 Tecnologias Utilizadas

- **Backend:** Java 11, Spring Boot
- **Banco de Dados:** MySQL 8.0+
- **Documentação da API:** Swagger
- **Geração de Relatórios:** iText PDF
- **Envio de E-mails:** JavaMailSender

## 🛠️ Requisitos

- Java 11 ou superior
- MySQL 8.0 ou superior
- Maven

## 📦 Configuração

### 1. Clone o Repositório

```bash
git clone https://github.com/raibarcelos/aplicativo-de-monitoramento-de-sa-de.git
cd health-monitoring-application
```

### 2. Configure o Banco de Dados

- Crie um banco de dados MySQL:

```sql
CREATE DATABASE monitoramento;
```

- Atualize as credenciais do banco de dados no arquivo `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/monitoramento
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Configurações de E-mail
spring.mail.host=smtp.example.com
spring.mail.port=587
spring.mail.username=seu-email@example.com
spring.mail.password=sua_senha
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true

# Configuração da API de Fitness
fitness.api.url=https://api.exemplo.com/fitness
fitness.api.key=sua-chave-api
```

### 3. Compile e Execute a Aplicação

```bash
./mvnw spring-boot:run
```

A aplicação estará disponível em `http://localhost:8080`.

## 🧪 Testes

Execute os testes automatizados com o seguinte comando:

```bash
./mvnw test
```

## 🌐 API

A documentação interativa da API está disponível no Swagger UI. Acesse:

[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## 📈 Geração de Relatórios

A aplicação permite gerar relatórios em PDF com informações sobre atividades físicas, alimentação, sono e metas de saúde. Utilize os endpoints da API para gerar e baixar os relatórios conforme necessário.

## 📧 Notificações por E-mail

Configure as propriedades de e-mail no arquivo `application.properties` para habilitar o envio de notificações e lembretes aos usuários.

## 📷 Capturas de Tela

![Dashboard](src/main/resources/static/images/dashboard.png)
*Exemplo de Dashboard de Estatísticas*

![Registro de Atividades](src/main/resources/static/images/activities.png)
*Exemplo de Registro de Atividades Físicas*

## 🤝 Contribuição

Contribuições são sempre bem-vindas! Siga as instruções abaixo para contribuir com o projeto:

### Como Contribuir

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`)
3. Commit suas alterações (`git commit -m 'Adiciona nova funcionalidade'`)
4. Push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request

## 📄 Licença

Distribuído sob a licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.

## 📝 Contato

- **Seu Nome** - [@seu-usuario](https://github.com/seu-usuario)
- **E-mail:** seu-email@example.com

---

Feito com por [Raí Barcelos Farias](https://github.com/seu-usuario)
```


## Referência

 - [Awesome Readme Templates](https://awesomeopensource.com/project/elangosundar/awesome-README-templates)
 - [Awesome README](https://github.com/matiassingers/awesome-readme)
 - [How to write a Good readme](https://bulldogjob.com/news/449-how-to-write-a-good-readme-for-https://github.com/raibarcelos/aplicativo-de-monitoramento-de-sa-de.git)


## Documentação da API

#### Retorna todos os itens

```http
  GET /api/items
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `api_key` | `string` | **Obrigatório**. A chave da sua API |

#### Retorna um item

```http
  GET /api/items/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do item que você quer |


