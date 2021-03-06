# ProjetoWebSpringBasico
É um Projeto Web Mavem com Spring MVC Básico. Já pré-configurado a conexão com banco de dados com firebird e usar o JPA e Hibernete.
O projeoto foi construido usando a IDE Netbeans 8.2
No arquivo `pon.xml`já existe diversas dependências e configurações para que o projeto funcione assim que for clonado.

## Estrutura do projeto

Dentro do download você encontrará os seguintes diretórios e arquivos, os pacores e projetos main se chamam `SisInfoWeb`(abreviação de Sistemas de Informação Web).

```

SisInfoWeb/
├── src/
│   └── main/
│       ├── java/
│       │   └── br/com/sisinfoweb/
│       │       ├── banco/
│       │       │   ├── beans/
│       │       │   │   ├── RetornoWebServiceBeans.java
│       │       │   │   └── StatusRetornoWebServiceBeans.java
│       │       │   └── diagrama/
│       │       │       └── JPADiagramaBanco.jpa
│       │       ├── controller/
│       │       │   ├── BaseMyController.java
│       │       │   ├── CfaclifoController.java
│       │       │   ├── DashboardController.java
│       │       │   ├── IndexController.java
│       │       │   ├── LoginController.java
│       │       │   ├── SmaempreController.java
│       │       │   └── SmausuarController.java
│       │       ├── entity/
│       │       │   ├── CfaclifoEntity.java
│       │       │   ├── SmadispoEntity.java
│       │       │   ├── SmaempreEntity.java
│       │       │   └── SmausuarEntity.java
│       │       ├── funcoes/
│       │       │   └── FuncoesPersonalizadas.java
│       │       ├── interceptor/
│       │       │   └── AutorizadorInterceptor.java
│       │       ├── repository/
│       │       │   ├── BaseMyRepository.java
│       │       │   ├── BaseMyRepositoryImpl.java
│       │       │   ├── CfaclifoRepository.java
│       │       │   ├── SmaempreRepository.java
│       │       │   └── SmausuarRepository.java
│       │       └── service/
│       │       │   ├── BaseMyService.java
│       │       │   ├── CfaclifoService.java
│       │       │   ├── InicializacaoBancoDadosService.java
│       │       │   ├── SmaempreService.java
│       │       │   └── SmausuarService.java
│       ├── resources/
│       │   └── META-INF/
│       │       └── persistence.xml
│       └── webapp/
│           ├── lib/
│           │   ├── menuCabecalho.jsp
│           │   ├── menuLateralEsquerda.jsp
│           │   ├── MyLayout.tag
│           │   └── rodape.jsp
│           ├── WEB-INF/
│           │   ├── jsp/
│           │   │   ├── dashboard.jsp
│           │   │   ├── index.jsp
│           │   │   └── smpempre.jsp
│           │   ├── tags/
│           │   ├── applicationContext.xml
│           │   ├── dispatcher-servlet.xml
│           │   ├── glassfish-resources.xml
│           │   ├── glassfish-web.xml
│           │   └── web.xml
│           └── index.html
├── nb-configuration.xml
└── pom.xml

```

## Plugin para o Netbeans IDE

Na estrutura do projeto existe o arquivo `JPADiagramaBanco.jpa`, onde mostra a modelagem gráfica do banco de dados. Para visualizar esse arquivo é necessário usar o plugin para o Netbeans chamado [Jeddict](https://jeddict.github.io). Com esse plugin pode modelar a estrutura de banco de dados e gerar as classes de entidades(`@Entity`) de forma automática. Também pode ser gerado o banco de dados através da modelagem feita pelo [Jeddict](https://jeddict.github.io). Para mais detalhes basta acessa o site ou entrar no canal do [Youtube da Jeddict](https://www.youtube.com/channel/UCGiNTVm6N_gtn4qIvBXOAoA).

## BaseMyController.java

```

│       │       ├── controller/
│       │       │   ├── BaseMyController.java

```

Foi criado uma classe de base para todas as classes Controller, onde pode ser adicionado uma função na classe base (`BaseMyController.java`) e todas as outras classes Controlles vai ter a função adicionada.
Todas as classes do pacote `controller` tem que estender a classe `BaseMyController.java`.

## BaseMyRepository.java

```

│       │       ├── repository/
│       │       │   ├── BaseMyRepository.java

```

Foi criado uma classe de base para todas as classes de interface Repository, onde pode ser adicionado uma função na classe base (`BaseMyRepository.java`) e todas as outras interfaces Repository vai ter a função adicionada. Foi feito um classe de implementação de acordo com o que é pedido nas instruções do Spring.
Todas as classes de interface do pacote `repository` tem que estender a classe `BaseMyRepository.java`.

## BaseMyService.java

```

│       │       └── service/
│       │       │   ├── BaseMyService.java

```

Foi criado uma classe de base para todas as classes de Service, onde pode ser adicionado uma função na classe base (`BaseMyService.java`) e todas as outras classes Service vai ter a função adicionada.
Todas as classes de interface do pacote `service` tem que estender a classe `BaseMyService.java`.