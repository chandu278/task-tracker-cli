## Project Repository

https://raw.githubusercontent.com/chandu278/task-tracker-cli/main/README.md

# Task Tracker CLI

https://github.com/chandu278/task-tracker-cli

[Project Repository](https://github.com/chandu278/task-tracker-cli)

A command-line based task management application built using Java.  
This project allows users to add, update, delete, and manage tasks with file-based persistence using JSON format.

---

## Features

- Add new tasks
- Update existing tasks
- Delete tasks
- Mark tasks as done
- Mark tasks as in-progress
- View all tasks
- Store tasks in local file
- Read tasks from file automatically

---

## Technologies Used

- Java
- OOP Concepts
- Collections Framework
- File Handling
- JSON-based Data Storage

---

## Project Structure

``` id="mqqmtk"
task-tracker-cli/
│
├── Main.java
├── Task.java
├── TaskManager.java
├── tasks.txt
├── README.md


How It Works
Tasks are stored in an ArrayList
Task data is written into tasks.txt
Data is stored in JSON format
Tasks are loaded from the file whenever the application starts


Sample Commands
Add Task  >>   java Main add "Buy groceries"
List Tasks >>  java Main list
Update Task >> java Main update 1 "Buy vegetables"
Delete Task >> java Main delete 1
Mark Task as Done >> java Main mark-done 1
Mark Task as In Progress >>  java Main mark-in-progress 1

Sample JSON Storage

[
  {
    "id":1,
    "description":"Buy groceries",
    "status":"pending",
    "createdAt":"2026-05-06",
    "updatedAt":"2026-05-06"
  }
]

```
