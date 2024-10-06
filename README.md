# Land Management System

This project is a web-based **Land Management System** designed to help users manage land parcels by storing and retrieving their land information based on a specific user ID. The project is built using Spring Boot for the backend and simple HTML, CSS, and JavaScript (with the Fetch API) for the frontend. The application allows users to view, add, and manage land information interactively.

## Features

- **Add Land Information**: Users can add land details including name, description, and coordinates.
- **View Lands**: Users can view a list of land parcels associated with their user ID.
- **Backend Service**: The backend is developed using Spring Boot, providing RESTful API endpoints for managing land data.
- **Frontend Interface**: The frontend is a simple HTML/JavaScript interface for interacting with the backend services.
  
## Technologies Used

- **Backend**: 
  - Spring Boot
  - JPA (Hibernate)
  - RESTful API
  - Lombok
- **Frontend**:
  - HTML, CSS, JavaScript
  - Fetch API for HTTP requests
- **Database**: 
  - MySQL (or any JPA-supported database)
  
## How to Run

### Prerequisites
- JDK 17+ installed on your machine.
- MySQL (or other databases) installed and running.
- Maven installed for managing dependencies.
  
### Backend Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/land-management-system.git

2. Configure your database connection in application.properties (or application.yml):

spring.datasource.url=jdbc:mysql://localhost:3306/land_management_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

3. Build and run the Spring Boot application:

mvn clean install
mvn spring-boot:run


Frontend Setup
Open the index.html file in your browser.
Enter a user ID in the input field and click "Fetch Lands" to retrieve lands for that user.
RESTful Endpoints
POST /api/v1/land/add: Add new land information.
GET /api/v1/land/get?userId={userId}: Retrieve all land information for the specified user.

