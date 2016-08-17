# Consulta de viagens com produtos aéreos

Ao acessar a aplicação é efetuada uma consulta ao webservice da Lemontech pelas solicitações de viagens aéreas dos últimos 2 anos e, após efetuar a consulta, os dados são persistidos na base. Caso os dados tenham sofrido alguma alteração, a base é atualizada.


# Arquitetura da solução

A arquitetura utilizada para o projeto web foi a MVC, utilizando o  framework VRaptor4 e a linguagem Java no servidor (Tomcat), com testes unitários localizados no pacote src/test/java. Devido a falta de tempo não foi possível implementar uma lógica que perceba a existência de dados atualizados na base e ignore a consulta ao webservice e nem a ordenação das viagens por data, no entanto a modelagem permite o acréscimo destas funcionalidades sem maiores problemas.


# Como gerar o war para deploy

O projeto foi feito utilizando a ferramenta de build Maven e o seu war é gerado com o seguinte comando:

mvn clean package -P lemontech


# Link da aplicação em produção

http://desafiolemontech-mogav.rhcloud.com/fullstack-java-teste/