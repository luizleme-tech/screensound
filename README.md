# ScreenSound

<p align="center">
  <img src="https://github.com/luizleme-tech/screensound/blob/main/screensound.png" align="center" style="border-radius: 50%; display: block; margin: auto;" width="35%" >
</p>


<p align="center"
  <img src="" align="center" style="border-radius: 50%; display: block; margin: auto;" width="35%" >
</p>

![Static Badge](https://img.shields.io/badge/project%20status-developing-yellow?logoColor=white)
[![Java Version](https://img.shields.io/badge/Java-11-blue)](https://www.oracle.com/java/)
[![Kotlin](https://img.shields.io/badge/kotlin-1.9.22-blue?logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![License](https://img.shields.io/github/license/luizleme-tech/alugames)](LICENSE)
![Static Badge](https://img.shields.io/badge/developer-%20luiz%20leme-orange?logoColor=white)


O projeto **ScreenSound** é um desafio prático baseado no curso de C# da Alura, adaptado para reforçar conceitos de persistência de dados utilizando Hibernate. Neste desafio, o objetivo é implementar o fluxo completo de persistência em um sistema que gerencia informações sobre álbuns e bandas. A aplicação começará a partir de um projeto base, e você será responsável por configurar e integrar o Hibernate para manipulação de dados.

## Etapas do Projeto

1. **Instalação do Hibernate**  
   Configure o Hibernate no projeto, incluindo a adição das dependências necessárias no `pom.xml` ou `build.gradle`.

2. **Criação do Arquivo de Configuração**  
   Configure o arquivo `hibernate.cfg.xml` ou utilize anotações para definir as propriedades essenciais, como a URL do banco de dados, credenciais de acesso e o driver JDBC.

3. **Mapeamento das Entidades**  
   Realize o mapeamento das classes de domínio (álbum e banda) para que o Hibernate consiga gerenciar as tabelas do banco de dados. Utilize anotações como `@Entity`, `@Table`, `@Id`, `@Column`, entre outras.

4. **Definição das Relações**  
   Estabeleça os relacionamentos entre as entidades, como:
   - **Um-para-muitos**: Uma banda pode ter vários álbuns.
   - **Muitos-para-um**: Um álbum pertence a uma banda.

5. **Testes de Persistência**  
   Implemente testes para verificar a criação, leitura, atualização e exclusão de dados (CRUD) utilizando Hibernate. Certifique-se de que as relações estão funcionando conforme esperado.

## Ferramentas e Tecnologias

- **Hibernate** para mapeamento objeto-relacional (ORM).
- **Java** como linguagem de desenvolvimento.
- **JUnit 5** para testes.
- **Banco de Dados**: MySQL, PostgreSQL ou H2 para desenvolvimento local.
- **Maven ou Gradle** para gerenciar dependências.

## Objetivo Final  

Ao concluir o projeto, você terá uma aplicação funcional que demonstra a capacidade de persistir dados relacionais utilizando Hibernate, com foco no domínio de gerenciamento de bandas e álbuns. Além disso, o desafio promove a prática de conceitos essenciais de ORM, mapeamento de entidades e criação de testes para garantir a consistência dos dados.

Aproveite o aprendizado e compartilhe suas conquistas com a comunidade! 🚀
