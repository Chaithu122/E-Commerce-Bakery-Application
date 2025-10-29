# 🍰 E-Commerce Bakery Application
## 📖 Description
**E-Commerce Bakery Application** is a modern, full-stack web application designed to provide a seamless online shopping experience for bakery products. Users can effortlessly browse through categories, explore detailed product information, add items to their cart, and complete orders with ease. The platform also features an **admin panel** that allows administrators to efficiently manage products and categories by adding, updating, or deleting them. Built with a focus on **responsive design, performance, and usability**, this project demonstrates practical expertise in **frontend and backend development, database management, and full-stack integration**.
## 🎯 Objective
The objective of the **E-Commerce Bakery Application** is to provide a convenient and seamless online platform for users to browse and order bakery products, while enabling administrators to efficiently manage products and categories. This project aims to improve user experience, streamline bakery operations, and showcase practical full-stack development skills.
## 🚀 Live Demo
The Bakery E-Commerce project is deployed and accessible at the link below:

🌐 **Live URL:**  
[![Live Demo](https://img.shields.io/badge/Visit-Live%20Site-blue?style=for-the-badge&logo=google-chrome)](https://your-project-name.up.railway.app)

## ✨ Features
- 🛍 **Modern E-Commerce Experience**: Browse a wide range of bakery products with images, prices, and descriptions.

- 🔎 **Smart Search & Filters**: Find products instantly by category or keyword.

- 🛒 **Interactive Cart System**: Add, update, remove items and view total cost in real time.

- 💳 **Order Placement Flow**: Complete checkout with customer details and order summary.

- 🔐 **Admin Dashboard**: Admin can add, update, and delete products & categories.

- 🗄 **Full Database Integration**: All products, categories & orders are saved using MySQL.

- ⚡ **Robust Spring Boot Backend**: REST APIs built with Spring Boot following clean architecture.

- 📱 **Responsive UI**: Works smoothly on mobile, tablet, and desktop screens.

- 🧼 **Clean Code & Layered Architecture**: Follows MVC, service, repository pattern for maintainability.

## 🛠 Technologies Used
  
 - **Backend**: Core Java, Spring Boot
 - **Frontend**: HTML, CSS, Bootstrap
 - **Database**: MySQL
 - **Tools**:Maven, Git & GitHub

   ## 📂 Project Structure
```

E-Commerce-Bakery-Application
│
├── src/main/java
│   └── com.web
│       ├── controller
│       ├── model
│       ├── repository
│       ├── service
│       └── E-Commerce-Bakery-Application.java
│
├── src/main/resources
│   ├── templates
│   ├── static
│   └── application.properties
│
├── pom.xml
└── README.md
```

## 🚀 Installation & Running the Project
Follow these steps to run the Student Management System on your local machine:
1. **Clone the repository**
 ```
git clone <your-repository-link>
```

2. **Open the project in your IDE**
- Recommended: IntelliJ IDEA or Eclipse or Spring Tool Suite


3. **Configure the database**
- Install MySQL or use any preferred database.

- Create a database named: bakery_db

- Update application.properties with your database credentials:

```
spring.datasource.url=jdbc:mysql://localhost:3306/bakery_db

spring.datasource.username=root

spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
```
4. Build the project
- Using Maven:

  ```
   mvn clean install
  
  ```
  
5. Run the project
   
  - Run the main class E-Commerce-Bakery-Application.java from your IDE
  - Or using Maven:

    ```
    mvn spring-boot:run
    ```

6. Access the application

- Open your browser and go to:

  ```
  http://localhost:8080
  ```

7. Start managing students!
- You can now add, edit, view, and delete student records through the web interface.

## 🗄Database Configuration
The project uses MySQL to store student data. Follow these steps to set up the database:

1. Install MySQL 

2. Create a database
```
CREATE DATABASE student_db;
```

3. Configure database credentials in src/main/resources/application.properties:

  ```
 # Database URL
spring.datasource.url=jdbc:mysql://localhost:3306/bakery_db

# Database username
spring.datasource.username=root

# Database password
spring.datasource.password=your_password

# Hibernate settings
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

```

4. Optional Settings

- spring.jpa.hibernate.ddl-auto can be set to:

- update → Automatically updates the database schema

- create → Creates a new schema every time (all previous data will be lost)

- validate → Validates the schema without changing it

  Once configured, your Spring Boot application will automatically connect to the MySQL database when you run it.


  ## 📸 Screenshots
  ## 🏠 Home Page
  <img src="https://github.com/user-attachments/assets/4578de2b-defd-4a53-bd6e-715810ab1e76" alt="homepage1"/>
  <img src="https://github.com/user-attachments/assets/a5f2a6ca-6d9b-4012-957f-5e554cc2cd32" alt="homepage2"/>
  <img src="https://github.com/user-attachments/assets/34f16dd7-a2d4-4dc8-9f53-9632ef397485" alt="homepage3"/>

  ## 🛒 Shop Page
  
  <img src="https://github.com/user-attachments/assets/6462f5f9-2a37-4b1b-8bfb-071f45bf855b" alt="shoppage"/>

  ## 👀 View Product Page

  The **View Product** section shows complete details of a selected bakery item.  
When a user clicks on any product from the shop page, they are redirected to this page.

  ### 📌 What is shown on this page
 - 🖼 Large product image
 - 📝 Product title & description
 - 💰 Price & offer
 - 📦 Quantity selector
 - 🛒 **Add to Cart** & ❤ **Add to Wishlist** buttons
 - 🔙 Back to Shop link/button

  <img src="https://github.com/user-attachments/assets/dfa5a823-aa13-4b79-83fb-a9a8f7f99501 " alt="viewproduct"/>

  ## 👥 Customer Information Page

  The **Customer Information** page collects details about the user before checkout.  
It ensures accurate delivery and contact information for bakery orders.

  ### 📌 Fields Included

  - 📝 **Full Name** – Customer's name  
  - ✉ **Email Address** – For order confirmation  
  - 📞 **Phone Number** – For delivery contact  
  - 🏠 **Address** – Street, city, zip code  
  - 🏷 **Special Instructions** – Optional notes for delivery

  <img src="https://github.com/user-attachments/assets/8a857e06-d310-42a0-b37b-96d471ff2767" alt="customerpage"/>

  ## 📝 Register Page

  The **Register Page** allows new customers to create an account in the bakery application.  
This helps in saving customer details for faster checkout, order tracking, and personalized offers.

 ### 📌 Fields Included

 - 🧑 **Full Name** – Customer's name  
 - ✉ **Email Address** – Used for login and order confirmation  
 - 🔑 **Password** – Secure password input  
 - 🔑 **Confirm Password** – To ensure password is correct  
 - 📞 **Phone Number** – Optional, for delivery notifications

   <img src="https://github.com/user-attachments/assets/75c7a912-8398-4d56-8d89-31634bd75e30" alt="registerpage"/>

    ## 🛠 Admin Page

   The **Admin Page** allows the bakery owner or staff to **manage products, orders, and customers**.  
    It is accessible only to authorized users (admin role).

    ### 📌 Features

   ## 📦 **Manage Products**
  -  Add new bakery products (cakes, cookies, pastries, breads)  
  -  Update product details (name, price, image, description)  
  -  Delete products from the catalog

     ##  🛍 **Manage Orders**
  -   View all customer orders  
  -   Update order status (Pending, Processing, Delivered, Cancelled)  
  -   Filter orders by date or status

      ## 👥 **Manage Customers**
  -  View customer details and purchase history  
  -  Edit customer information if required
 
   <img src="https://github.com/user-attachments/assets/56bc6134-7d03-45bf-8d26-5ba2ed7ede96" alt="adminpage"/>
 
    
   ## 🗂 Categories Section

   The **Categories Section** helps users browse bakery products by type.  
   It improves navigation and makes it easier to find specific items like cakes, cookies, breads, and pastries.

   ### 📌 Features
   -  Displays all product categories  
   -  Each category can show an **icon or image** representing it  
   -  Clicking a category filters the products on the **Shop Page**  
   -  Supports **dynamic addition** of new categories

   <img src="https://github.com/user-attachments/assets/97ca98c1-c471-40c5-bfad-d0deb743fbb3" alt="addcategorypage"/>
   
   ## 📦 Add a Product

   ## 🔐 Login as Admin

   -  Open the application in browser

   -  Login using admin credentials

  ## 🧭 Go to Product Management

   - Open Dashboard

   - Navigate to 📦 Products → ➕ Add Product

   ## 📝 Enter Product Details

   🏷 Product Name

  📂 Choose Category

  💰 Product Price

  📄 Short & Full Description

  📦 Stock / Quantity

  🖼 Upload Product Image (PNG/JPG)

  ## 💾 Save Product

  Click Save / Add Product

  ✅ Validations run for all mandatory fields

  🗃 Product stored into Database

  ## 👀 Verify Product

 🛍 Product now visible on Storefront

 ✅ Listed under the selected Category
 
 
 <img src="https://github.com/user-attachments/assets/723daab1-8f60-4530-9142-2de00abf71cc" alt="addproduct"/>
 <img src="https://github.com/user-attachments/assets/63ba8441-f36b-40e7-960f-f94941b85152" alt="add"/>

 ## 🙏 Acknowledgements

This project was developed as part of my learning practice by referring to official documentation, developer communities, and publicly available resources.

## ✍ Author

- Name: Krishna Chaithanya Pigilapu
- Role: Java Full Stack Developer (Fresher)
- Tech Skills: Java · Spring Boot · HTML · CSS · JavaScript · React · SQL
- GitHub:https://github.com/Chaithu122
- LinkedIn:https://linkedin.com/in/krishna-chaithanya-pigilapu-655563349

## 📬 Contact Me

If you have any questions, feedback, or collaboration opportunities, feel free to reach out:


- 🔗 [LinkedIn](https://www.linkedin.com/in/krishna-chaithanya-pigilapu-655563349/)
- 📧 [Email](pigilapuchaithanya123@gmail.com)
- 💻 [GitHub](https://github.com/Chaithu122)

  **🙏Thank you for visiting this repository. I look forward to contributing my skills and growing with a forward-thinking team.**












 





















   



    














