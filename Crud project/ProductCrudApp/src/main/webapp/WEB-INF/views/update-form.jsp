<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
<%@ include file="./base.jsp" %>
</head>
<body>
   <div class="container mt-5">
       <div class="row justify-content-center">
           <div class="col-md-6">

               <h2 class="text-center mb-4">Change Product Details</h2>

               <form action="${pageContext.request.contextPath}/handle-Product" method="post">
               <input type="hidden
               " value ="${product.id}" name="id"/>
                   <!-- Product Name -->
                   <div class="form-group">
                       <label for="name">Product Name</label>
                       <input type="text"
                              class="form-control"
                              id="name"
                              name="name"
                              placeholder="Enter the product name here"
                              value ="${product.name}"
                              required>
                   </div>

                   <!-- Product Description -->
                   <div class="form-group">
                       <label for="description">Product Description</label>
                       <textarea class="form-control"
                                 id="description"
                                 name="description"
                                 rows="5"
                                 placeholder="Enter the product description"${product.description}
                                 required></textarea>
                   </div>

                   <!-- Product Price -->
                   <div class="form-group">
                       <label for="price">Product Price</label>
                       <input type="text"
                              class="form-control"
                              id="price"
                              name="price"
                              placeholder="Enter Product Price"
                              value="${product.price}"
                              required>
                   </div>

                   <!-- Buttons -->
                   <div class="d-flex justify-content-between">
                       <a href="${pageContext.request.contextPath}/" class="btn btn-back">Back</a>
                       <button type="submit" class="btn btn-warning">Update</button>
                   </div>
               </form>

           </div>
       </div>
   </div>
</body>
</html>
