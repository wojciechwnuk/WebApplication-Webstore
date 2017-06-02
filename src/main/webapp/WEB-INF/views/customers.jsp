<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Customers</title>
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>Klienci</h1>
            <p>K U S T O M E R Z Y bywający w naszym sklepie</p>
        </div>
    </div>
</section>
<section class="container">
    <div class="row">
        <c:forEach items="${customers}" var="customer">
            <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                <div class="thumbnail">
                    <div class="caption">
                        <h3>nazwisko: ${customer.name}</h3>
                        <p>miasto: ${customer.address}</p>
                        <p>id: ${customer.customerId}</p>
                        <p>ilość zamówień: ${customer.noOfOrdersMade} </p>

                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</section>
</body>
</html>