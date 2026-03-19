# 🆔 ID Card Generator Application

## 📌 Overview

The **ID Card Generator Application** is a Java-based desktop application developed using **Core Java** and **Java Swing/AWT** for graphical user interface design. This application allows users to generate professional digital ID cards by entering essential personal and organizational details.

It is designed as an educational project to demonstrate **GUI development, object-oriented programming (OOP), input validation, and event handling** in Java.

---

## 🎯 Features

* 🧾 User-friendly GUI for entering details
* 🖼️ Profile photo upload support
* 🆔 Automatic unique ID generation
* 📅 Date of issue generation
* ✅ Input validation for accuracy
* 🎨 Structured and formatted ID card preview
* 🔄 Modular and scalable architecture (OOP-based)

---

## 🛠️ Tech Stack

| Layer        | Technology                        |
| ------------ | --------------------------------- |
| Language     | Java (JDK)                        |
| GUI          | Java Swing & AWT                  |
| IDE          | VS Code                           |
| Architecture | Object-Oriented Programming (OOP) |

---

## 📂 Project Structure

```
ID-Card-Generator/
│
├── src/
│   └── idcard/
│       ├── main/           # Entry point of application
│       ├── ui/             # GUI components (Swing Frames)
│       ├── model/          # Data models (User, ID info)
│       ├── service/        # Business logic
│       ├── utils/          # Helper utilities
│       └── validation/     # Input validation logic
│
├── resources/
│   ├── images/             # Profile & default images
│   └── templates/          # ID card design templates
│
├── README.md
```

---

## 🚀 Getting Started

### Prerequisites

* Java JDK (8 or above)
* VS Code (or any Java IDE)
* Java Extension Pack (recommended for VS Code)

---

## ▶️ How to Run the Project

### 🔹 Method 1: Using Terminal (Recommended)

1. Open terminal and navigate to the `src` folder:

```bash
cd path/to/ID-Card-Generator/src
```

2. Compile all Java files:

```bash
javac idcard/**/*.java
```

3. Run the application:

```bash
java idcard.main.MainApp
```

---

### 🔹 Method 2: Compile Specific Files

```bash
cd path/to/ID-Card-Generator/src

javac idcard/main/MainApp.java idcard/ui/LoginFrame.java
java idcard.main.MainApp
```

---

### 🔹 Method 3: Using VS Code

1. Open project in VS Code
2. Navigate to:

```
src/idcard/main/MainApp.java
```

3. Right-click on `MainApp.java`
4. Click **"Run Java"**

---

## ⚠️ Important Notes

* Always run commands from the **`src` folder**
* Do NOT run from inside `main/` or `ui/` folders
* Ensure package names match folder structure:

```java
package idcard.main;
package idcard.ui;
```

---

## 🧩 Application Flow

1. User opens the application
2. Inputs required details:

   * Name
   * ID Number
   * Department
   * Designation
   * Blood Group
   * Contact Info
3. Uploads profile photo
4. System validates input
5. ID card is generated dynamically
6. Preview is displayed

---

## 📸 Sample Fields in ID Card

* Name
* Unique ID
* Department
* Designation
* Blood Group
* Contact Number
* Date of Issue
* Profile Image

---

## 🧠 Concepts Used

* Object-Oriented Programming (Encapsulation, Modularity)
* Java Swing Event Handling
* File Handling (for images)
* Input Validation
* GUI Layout Management

---

## 🔮 Future Enhancements

* 💾 Save ID cards as PDF/image
* 🗂️ Database integration (MySQL/MongoDB)
* 🔐 User authentication system
* 🌐 Web-based version (React + Spring Boot)
* 📱 Mobile-friendly version

---

## 👨‍🎓 Author

**Vishakh CS**
MSc Computer Science

---

## 📄 License

This project is developed for educational purposes and is free to use and modify.

---

## ⭐ Acknowledgement

This project helped in understanding real-world implementation of Java GUI applications and strengthening problem-solving and design skills.

---
