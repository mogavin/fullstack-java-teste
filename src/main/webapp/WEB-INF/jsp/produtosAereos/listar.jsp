<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Produtos aéreos</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
   	  	<div class="container-fluid">  		
	 		<div class="row"> 			
			    <div class="panel panel-primary">
			    	<div class="panel-heading text-center">
			      		<h4>Solicitações com produtos aéreos - 
			      		<fmt:formatDate pattern="dd/MM/yyyy" value="${dataInicialConsulta}"/> à <fmt:formatDate pattern="dd/MM/yyyy" value="${dataFinalConsulta}"/></h4>
			      	</div>
			      	<div class="panel-body">		    	
						<table class="table table-hover">
							<thead>
								<tr>
									<th>Passageiro</th>
									<th>Cia. Aérea</th>
									<th>Data/Hora saída</th>
									<th>Data/Hora chegada</th>
									<th>Cidade origem</th>
									<th>Cidade destino</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="infoViagem" items="${infosViagens}">
									<tr>
										<td>${infoViagem.nomePassageiro}</td>
										<td>${infoViagem.ciaAerea}</td>
										<td><fmt:formatDate pattern="dd/MM/yyyy HH:mm:ss" value="${infoViagem.getDataSaida()}"/></td>
										<td><fmt:formatDate pattern="dd/MM/yyyy HH:mm:ss" value="${infoViagem.getDataChegada()}"/></td>
										<td>${infoViagem.cidadeOrigem}</td>
										<td>${infoViagem.cidadeDestino}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
  </body>
</html>