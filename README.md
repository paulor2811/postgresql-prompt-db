# PostgreSQL Prompt DB

## Descrição

Este projeto é uma aplicação de prompt interativo para cadastro e gerenciamento de usuários em um banco de dados PostgreSQL.

## Estrutura do Projeto

O projeto está organizado nas seguintes classes e pacotes:
...

## Importando o Projeto

Para importar o projeto em uma IDE (Ambiente de Desenvolvimento Integrado), siga as etapas abaixo:

1. Certifique-se de ter o Java Development Kit (JDK) instalado em sua máquina.

2. Clone o repositório do projeto para um diretório local em sua máquina.

3. Abra sua IDE de preferência (por exemplo, Eclipse, IntelliJ IDEA, NetBeans).

4. No menu da IDE, selecione "Importar Projeto" ou uma opção semelhante.

5. Navegue até o diretório do projeto clonado e selecione-o.

6. Siga as instruções da IDE para importar o projeto.

## Executando o Projeto

Depois de importar o projeto em sua IDE, você pode executá-lo diretamente da IDE. Cada IDE tem sua própria maneira de executar um projeto Java, mas geralmente envolve a execução da classe principal (Main).

Certifique-se de configurar corretamente as dependências do projeto, incluindo o arquivo JAR do PostgreSQL JDBC Driver.

## Uso

O prompt interativo oferece as seguintes opções:

1. **Cadastrar Usuário**: Permite cadastrar um novo usuário no banco de dados. Você será solicitado a fornecer o nome de usuário, email e senha para o novo usuário.

2. **Editar Dados**: Permite editar os dados de um usuário existente no banco de dados. Você será solicitado a fornecer o nome de usuário, email, senha e o ID do usuário que deseja atualizar.

3. **Excluir Cadastro**: Permite excluir um usuário do banco de dados. Você será solicitado a fornecer o ID do usuário que deseja excluir.

4. **Buscar Usuário**: Permite buscar informações de um usuário específico no banco de dados. Você será solicitado a fornecer o nome de usuário do usuário que deseja buscar. Se você digitar "all", serão exibidos todos os usuários cadastrados.

## Requisitos

Antes de executar o projeto, verifique se você atende aos seguintes requisitos:

- JDK (Java Development Kit) instalado em sua máquina.
- IDE (Ambiente de Desenvolvimento Integrado) de sua preferência.
- PostgreSQL JDBC Driver (JAR) configurado no projeto.

## Configuração do Banco de Dados

Certifique-se de ter um servidor PostgreSQL em execução e as seguintes informações de conexão disponíveis:

- Host: endereço do servidor PostgreSQL (por exemplo, localhost)
- Porta: número da porta do servidor PostgreSQL (por exemplo, 5432)
- Banco de Dados: nome do banco de dados
- Usuário: nome de usuário do banco de dados
- Senha: senha do banco de dados

## Configuração do Projeto

Antes de executar o projeto, você precisa configurar as informações de conexão com o banco de dados.

1. Abra o arquivo `ConnectionDB.java` no pacote `io.github.paulor2811.postgresqlpromptdb.database.postgre`.

2. Edite as seguintes linhas de código para refletir suas informações de conexão:

```java
String url = "jdbc:postgresql://localhost:5432/nome_do_banco_de_dados";
String username = "seu_usuario";
String password = "sua_senha";
```

## Executando o Projeto

Após configurar o projeto e o banco de dados, você pode executar o projeto na sua IDE:

1. Certifique-se de que o servidor PostgreSQL esteja em execução.

2. Abra o projeto na sua IDE.

3. Execute a classe `Main.java` no pacote `io.github.paulor2811.postgresqlpromptdb`.

4. O prompt interativo será exibido no console da IDE.

5. Siga as instruções exibidas no prompt para interagir com o projeto.

## Contribuindo

Se você deseja contribuir para este projeto, sinta-se à vontade para abrir uma issue ou enviar um pull request.

