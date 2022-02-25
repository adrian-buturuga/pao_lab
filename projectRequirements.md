# Programare avansata pe obiecte - Project Requirements 

Each student will work on an individual project. It will be presented in stages as detailed below. In order for a project to be graded at any of the stages, it must:

* not have compilation errors
* implement requirements for that stage

Timeline for presenting each stage: 

* Stage I: April 1st, 2022
* Stage II: April 29th, 2022 
* Stage III: May 27th, 2022

## Stage I

### Assignment definition

Select a system to be implemented that allows at least 10 actions/queries to be performed on at least 8 types of objects.

### Implementation 

Implement a project using the Java language that complies to the requirements above. 

The application will:

* include simple classes with private/protected attributes and methods
* include at least 2 different collections capable of administering the objects in the application
* use inheritance for some of the classes used within the collections
* at least one service class that exposes the system's operations 
* a main class that calls the service's methods 

## Stage II

### Persistent storage 

Extend the project from the 1st stage by persisting the data using files:

* CSV files will be used to store at least 4 types of objects from the first stage. Each column in the file is separated with a comma. Example: `name,surname,age`
* Generic singleton services will be created for reading and writing from/to files
* At system startup, the data will be automatically loaded from the files.

### Auditing

An auditing service will need to be created that will log to a CSV file each time an action from the first stage is performed. Structure of the file: `name_of_action,timestamp`.

## Stage III 

### Database persistence

Replace the services created in the second stage with others that use JDBC to store the data in a database of your choosing.

A service will be created that will expose create/read/update/delete operations for at least 4 of the defined classes.

## Topic Suggestions

1) catalog (student, subject, professor)
2) library (sections, books, authors, readers)
3) medical office scheduling system (client, medic, appointment)
4) store produce management (category, produce, distributors)
5) banking application (accounts,bank statements, transactions, cards, services)
6) e-learning platform (courses, users, applications, quizez)
7) auctioning system (auction, bids, items, users)
8) food delivery platform (venues, orders, deliveries, users)
9) book lending system (partners, users, books)
10) e-ticketing platform (events, venues, clients)