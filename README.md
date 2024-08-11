# Renault-Project - Backend

> “Lembre-se de olhar para as estrelas e não para os seus pés. Tente dar sentido ao que você vê e pergunte-se sobre o que faz o universo existir. Seja curioso.” — Stephen Hawking

![java](https://badgen.net/badge/Java/17/red?scale=1.2) ![kotlin](https://badgen.net/badge/Kotlin/1.9.23/green?scale=1.2) ![gradle](https://badgen.net/badge/Gradle/8.7/blue?scale=1.2)

**Olá, Dev!**

Este é um projeto com arquitetura API RESTful, desenvolvido em Java / Kotlin, com o uso do framework Spring Boot e Gradle. 
O projeto é parte de um desafio proposto pela Renault, com o objetivo de criar um sistema de gerenciamento de riscos.

As instruções a seguir irão guiá-lo na configuração do ambiente de desenvolvimento e na execução do projeto utilizando a IDE IntelliJ IDEA.

## Pré-Requisitos

Para continuar, atente aos pré-requisitos:

- IntelliJ IDEA
    - Como instalar?
        - Instalação manual: [baixar](https://www.jetbrains.com/idea/download/)
- Java JDK 17
    - Como instalar?
        - Instalação manual: [baixar](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- Docker Desktop
    - Como instalar?
        - Instalação manual: [baixar](https://www.docker.com/products/docker-desktop/)

## Ambiente de desenvolvimento

### Importe o Projeto

- Abra o IntelliJ IDEA.
- Selecione `File -> Open` e navegue até a pasta raiz do projeto.
- Selecione a pasta e clique em `Open`.

### Configuração do Gradle
- Após a importação, aguarde o IntelliJ IDEA sincronizar e configurar o Gradle automaticamente. Isso pode levar alguns minutos.
- Caso o Gradle não seja executado automaticamente, você pode forçar a execução clicando no menu superior em `Build -> Build Project`.

### Configuração do Docker

- Para testar a aplicação com o banco de dados PostgreSQL, inicie o Docker Desktop. 
- Através de um terminal, execute o comando abaixo na pasta raiz do projeto.

```shell
docker compose up
```

Com este comando, todas as ferramentas necessárias para o desenvolvimento vão ficar disponíveis no seu `localhost` a saber:

| Ferramenta                                      | Versão     | Portas       | Login       | Senha         | Observação |
|-------------------------------------------------|------------|--------------|-------------|---------------|------------|
| [PostgreSQL](https://hub.docker.com/_/postgres) | latest     | 5432         | postgres    | postgres      | -          |

## Executando o backend

Para começar, certifique-se que seu [Ambiente de desenvolvimento](#Ambiente-de-desenvolvimento) esteja funcionando. Você pode fazer isso usando um SGBD de sua preferência, como o [DBeaver](https://dbeaver.io/), a fim de conectar ao banco contido no container docker criado.

### Execute o Projeto

- No IntelliJ IDEA, localize a classe RenaultApplication (a classe com a anotação @SpringBootApplication).
- Clique com o botão direito na classe e selecione `Run RenaultApplication.main()`.

### Acesse o Swagger
- Após a aplicação iniciar, você pode acessar a interface do Swagger em: [localhost:8080](http://localhost:8080/swagger-ui/index.html).

## Onde obter ajuda?

Para sanar quaisquer dúvidas, procure o Engenheiro de Software responsável pelo projeto.
