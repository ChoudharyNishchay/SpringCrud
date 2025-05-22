<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ include file="./base.jsp" %>

<html>
<head>
    <title>Product List</title>
</head>
<body>

<div class="container mt-3">
    <div class="row">
        <div class="col-md-12">
            <h2 class="text-center mb-5">Welcome to Product Page</h2>

            <table class="table table-striped table-dark">
                <thead>
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">Product Name</th>
                        <th scope="col">Description</th>
                        <th scope="col">Price</th>
                        <th scope="col">Action</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${products}" var="p">
                        <tr>
                            <th scope="row">${p.id}</th>
                            <td>${p.name}</td>
                            <td>${p.description}</td>
                            <td class="font-weight-bold">&#8377; ${p.price}</td>
                            <td>
                                <a href="delete/${p.id}"><i class="fas fa-trash text-danger" style="font-size:20px;"></i></a>
                                <a href="update/${p.id}"><i class="fas fa-pen-nib text-primary" style="font-size:20px;"></i></a>

                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

            <div class="container text-center">
                <a href="add-product" class="btn btn-outline-success">Add Product</a>
            </div>

        </div>
    </div>
</div>

</body>
</html>
