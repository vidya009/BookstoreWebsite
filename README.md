
# Book-Store 
  This is Bookstore website project developed for buying books online.
  
### Project Description
  Website user will be defining two types of roles Admin Role and User Role.
  In Books tab user and admin can see all the available books along with details like image, name, author and price. Details of books will be retrived by making call to Spring     Boot which retrieves it from MySQL using JPA.
  For buying the books user can add the books to the cart.
  He can then view the cart and can add/remove books from cart.
  The admin can add/modify/delete books using Books tab (View/Delete Book Details Page, Edit Book Page, Add Book Page).
  The admin can add/delete users using User tab (View/Delete Users Details Page, Add User Page).

### Technology Stack
  Component         | Technology
  ---               | ---
  Frontend          | Angular 8+
  Backend (REST)    | Spring Boot (Java)
  Database          | MySql 
  Persistence       | JPA 
  Client Build Tools| angular-cli, npm
  Server Build Tools| Maven (Java) 
  
### Prerequisites
- IDE: Eclipse, VS Code
- DB: MySql
- Java SE 1.8
- Maven 3.6.3+ 
- Node 14 or above
- npm 6 or above
- Angular-cli 10 or above

### Installation and Usage
-	Install node js by downloading the installable from `https://nodejs.org/en/download/`
-	Install angular cli using the following command
  `npm install –g @angular/cli` 
  For more angular related commands refer `https://cli.angular.io/` 
-	Frontend is developed in Visual studio code. Download VSCode from here: `https://code.visualstudio.com/download`
- For backend Springboot java application development Eclipse IDE for Enterprise Java Developers is used.
- For database MySQL workbench 8.0 CE is used.
- Start MySQL workbench and log into it using your credentials (same credentials are used in `application.properties` configuration file in java project).
  In this project Java Persistence API (JPA) is used for Object-relational mapping (ORM).
- In Eclipse IDE, Import Java(Spring Boot) project as 'Existing Maven Project'. All the dependencies required for the spring boot java project are specified in `pom.xml` file.     In  `application.properties` configuration file under src/main/resource update your mysql connection username and password. Now right click `EcommerceApplication.java` file     and Run as Java application. This will start bookstore ecommerce application and also create database and tables in Mysql (Refresh schemas in Mysql). To access Rest endpoint     go to `http://localhost:8080/users/get` in your browser.
- Download and open Angular project in Visual Studio Code. Run `ng serve` command in terminal for a dev server. (Run `ng build` to build the project). Navigate to      `http://localhost:4200/` in your browser. The angular application will automatically reload if you change any of the source files. 

### Accessing Application
Cpmponent         | URL                                      | Credentials
---               | ---                                      | ---
Frontend          |  http://localhost:4200                   | -
Backend           |  http://localhost:8080/users/get   	     | -   

### Images

![BookstoreUsers_20200721](https://github.com/vidya009/BookstoreWebsite/assets/34538293/dfb4e1d2-1eec-403b-9856-b0f03427ce04)


![Bookstore_AddBook_20200721](https://github.com/vidya009/BookstoreWebsite/assets/34538293/e16ccb08-d945-4ae4-a710-d104192e55b4)


![BookstoreBookDetails_20200721](https://github.com/vidya009/BookstoreWebsite/assets/34538293/73ee303a-e494-4866-bc7c-0e1fc819ae4e)


![BookstoreAllBooks_20200721](https://github.com/vidya009/BookstoreWebsite/assets/34538293/3bf598a6-28bb-46fb-bcdb-47c9aa910b91)


![BookstoreCart_20200721_](https://github.com/vidya009/BookstoreWebsite/assets/34538293/dc1cc8fa-716b-4750-bb01-d11ba034e19e)






 
