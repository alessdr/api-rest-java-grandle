# Exemplo de API REST criada com Java, Spring Boot, Swagger e Grandle

## Processo de criação:

Projeto foi criado com base no spring initializr (https://start.spring.io/), com as seguintes opções e dependências

- Opções:

	* Project: Gradle Project
	* Language: Java
	* Spring Boot: 2.3.3
	* Group: br.com.ctrlabs
	* Artifact: api-rest-grandle

- Dependências:

	* Spring Web
	* Spring Boot DevTools
	* Spring Data JPA
	* PostgreSQL Driver

Após este processo, foi baixado o arquivo zip gerado pelo spring initializr contendo a "base" do nosso projeto, e importado no Eclipse, seguido da implementação das funcionalidades desejadas.

## Base de dados

- Para este exemplo, utilizamos uma base de dados PostgreSQL
- As configurações do banco podem ser encontradas no arquivo "application.properties"

Obs: Não é necessário a criação da tabela/estrutura, visto que estas serão criadas automaticamente pela aplicação.

## Instação e Execução

- Clone ou baixe o repositório para sua máquina
- Abra o projeto no eclipse
- Execute-o (ApirestApplication.java)

## Testes

- Abra a URL abaixo no seu navegador

	http://127.0.0.1:8080/swagger-ui.htm
