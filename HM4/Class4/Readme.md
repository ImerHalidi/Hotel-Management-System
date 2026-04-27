# Hotel Management System (Java 8 Collections)

## Overview

This project is a Java-based Hotel Management System developed to demonstrate the use of Java 8 Collections, including List, Set, and Map. It focuses on efficient data storage, retrieval, and processing using different collection types and loop constructs.

The system simulates core hotel operations such as room management, guest tracking, booking handling, and service pricing.

---

## Features

### Room Management

* Store and manage rooms using List
* Filter available rooms based on date range
* Retrieve rooms by type (Single, Double, Suite)
* Track room occupancy using Map<LocalDate, Boolean>

### Guest Management

* Store unique guests using Set
* Prevent duplicate guest entries
* Retrieve total number of guests
* Extract all guest names

### Booking System

* Manage bookings using Map<String, Booking>
* Retrieve bookings by ID
* Validate booking date overlaps
* Calculate total revenue from bookings
* Group bookings by guest

### Advanced Operations

* Find most frequently booked room type
* Identify guests with multiple bookings
* Retrieve rooms with no bookings
* Find earliest available room

### Staff Management

* Track tasks completed by staff
* Generate performance report using Map<Staff, Integer>

### Service Pricing

* Apply dynamic discounts using Map<String, Double>
* Support discount codes (e.g. SUMMER20, VIP10)

---

## Technologies Used

* Java 8
* Collections Framework (ArrayList, HashSet, HashMap)
* OOP Principles
* LocalDate (java.time)

---

## Project Structure

* Room.java → Handles room data and availability
* Guest.java → Represents hotel guests
* Booking.java → Stores booking information
* Hotel.java → Core system logic
* Staff.java → Staff performance tracking
* HotelService.java → Service pricing and discounts
* Main.java → System simulation and testing

---

## Key Concepts Demonstrated

* Use of List for ordered data storage
* Use of Set for uniqueness
* Use of Map for key-value data handling
* Iteration using for-loop, while-loop, and for-each
* Data filtering, grouping, and counting
* Handling real-world scenarios like booking conflicts

---

## How to Run

1. Open the project in any Java IDE (IntelliJ, Eclipse, VS Code)
2. Compile all .java files
3. Run Main.java
4. Observe console output demonstrating system features

---

## Example Functionalities Demonstrated in Main

* Display available rooms
* Filter rooms by type
* Retrieve booking by ID
* Print guest names
* Calculate total revenue
* Show most booked room type
* Identify repeat guests
* Apply service discounts
* Display staff performance

---

## Bonus Features

* Room occupancy tracking per date
* Earliest available room finder
* Rooms with no bookings
* Booking overlap validation

---

## Author

Imer Halidi

---

## Notes

This project is designed for educational purposes to practice Java Collections and object-oriented design in a real-world scenario.
