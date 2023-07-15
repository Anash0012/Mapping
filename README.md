
# *Mapping*

This is a sample Spring Boot application that demonstrates the usage of Lombok, and MySQL in a Spring Boot project. 


## Frameworks and Libraries Used

- **Spring Boot**: 
- **Lombok**: 
- **Hibernate**: 
- **MySQL**:



## Database Configuration

The application is configured to use a MySQL database. To configure the database connection, open the `application.properties` file located in the `src/main/resources` directory. Update the following properties with your MySQL database connection details:

spring.datasource.url=jdbc:mysql://localhost:3306/mydatabase
spring.datasource.username=username
spring.datasource.password=password



The application will start and listen on the default port `8080`.

## API Endpoints

The application exposes RESTful API endpoints for managing the entities. Here are the main endpoints for each entity:

### Student

- `GET /students`: Retrieves a list of all students.
- `GET /students/{id}`: Retrieves a student by ID.
- `POST /students`: Creates a new student.
- `PUT /students/{id}`: Updates an existing student.
- `DELETE /students/{id}`: Deletes a student by ID.

### Laptop

- `GET /laptops`: Retrieves a list of all laptops.
- `GET /laptops/{id}`: Retrieves a laptop by ID.
- `POST /laptops`: Creates a new laptop.
- `PUT /laptops/{id}`: Updates an existing laptop.
- `DELETE /laptops/{id}`: Deletes a laptop by ID.

### Course

- `GET /courses`: Retrieves a list of all courses.
- `GET /courses/{id}`: Retrieves a course by ID.
- `POST /courses`: Creates a new course.
- `PUT /courses/{id}`: Updates an existing course.
- `DELETE /courses/{id}`: Deletes a course by ID.

### Book

- `GET /books`: Retrieves a list of all books.
- `GET /books/{id}`: Retrieves a book by ID.
- `POST /books`: Creates a new book.
- `PUT /books/{id}`: Updates an existing book.
- `DELETE /books/{id}`: Deletes a book by ID.

You can use tools like cURL, Postman, or Swagger UI to interact with these endpoints and perform CRUD operations on the respective entities.
