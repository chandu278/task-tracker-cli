# Task Tracker CLI

https://github.com/chandu278/task-tracker-cli

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

```text
task-tracker-cli/
│
├── Main.java
├── Task.java
├── TaskManager.java
├── tasks.txt
├── README.md
```

---

## How It Works

- Tasks are stored in an ArrayList
- Task data is written into tasks.txt
- Data is stored in JSON format
- Tasks are loaded from the file whenever the application starts

---

## Sample Commands

### Add Task

```bash
java Main add "Buy groceries"
```

### List Tasks

```bash
java Main list
```

### Update Task

```bash
java Main update 1 "Buy vegetables"
```

### Delete Task

```bash
java Main delete 1
```

### Mark Task as Done

```bash
java Main mark-done 1
```

### Mark Task as In Progress

```bash
java Main mark-in-progress 1
```

---

## Sample JSON Storage

```json
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
