# Renault-Project - Backend

> “Lembre-se de olhar para as estrelas e não para os seus pés. Tente dar sentido ao que você vê e pergunte-se sobre o que faz o universo existir. Seja curioso.” — Stephen Hawking

![java](https://badgen.net/badge/Java/17/red?scale=1.2) ![kotlin](https://badgen.net/badge/Kotlin/1.9.23/green?scale=1.2) ![gradle](https://badgen.net/badge/Gradle/8.7/blue?scale=1.2)

**Olá, Dev!**

Este repositório contém uma atividade desenvolvida durante minha graduação na disciplina "Jornada de Aprendizagem: Métodos Quantitativos Aplicados a Sistemas" como parte de um desafio proposto pela Renault, com o objetivo de criar um sistema de gerenciamento de riscos. A aplicação foi desenvolvida em Kotlin com o uso do framework Spring. Este guia fornece as instruções para configurar e rodar o projeto localmente.

## Pré-Requisitos

Para continuar, atente aos pré-requisitos:

- [Java JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
    
- [Docker](https://www.docker.com/products/docker-desktop/)

- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)

## Configuração do Backend

1. **Inicie o contêiner Docker**

    Para testar a aplicação com o banco de dados PostgreSQL, inicie o Docker Desktop. 
    
    Com o projeto devidamente armazenado localmente, abra um terminal na raiz do projeto.
    
    ```shell
    docker compose up
    ```

2. **Execute o Projeto**

    No IntelliJ IDEA, localize a classe `RenaultApplication` (a classe com a anotação `@SpringBootApplication`).

    Clique com o botão direito na classe e selecione `Run RenaultApplication.main()`.

## Documentação

Após a aplicação iniciar, você pode acessar a interface do Swagger em: [localhost:8080](http://localhost:8080/swagger-ui/index.html).

## Onde obter ajuda?

Para sanar quaisquer dúvidas, procure o Engenheiro de Software responsável pelo projeto.
