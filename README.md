This is a professional README.md tailored for your GitHub repository. It highlights the technical stack, the "Smart Campus" features (QR and Biometrics), and the database architecture you've built.

EduTrack: Smart Campus Attendance Management System
📌 Project Overview
EduTrack is a modern, automated attendance management system designed to replace traditional paper-based tracking in university environments. By leveraging QR Code validation, Biometric (Fingerprint) authentication, and Geofencing, the system ensures high accuracy, prevents proxy attendance (fraud), and provides real-time data synchronization with the Faculty Management System (FMS).

Key Features
Dual-Method Check-in: Students can mark attendance via a time-limited QR code scan or integrated biometric fingerprint scanners.

Geofencing & Validation: The system verifies student location and enrollment status before confirming attendance.

Instructor Dashboard: Faculty can create sessions, monitor live attendance, and manually correct records if necessary.

Automated Reporting: Generates "At-Risk" student reports (for low attendance) and end-of-term summaries in PDF format.

FMS Integration: Automated data syncing to the central university database with retry logic for offline scenarios.

🛠️ Technical Stack
Frontend: Python (CustomTkinter for a modern GUI)

Backend: Python

Database: Microsoft SQL Server (MS SQL)

Drivers: pyodbc for database connectivity

Documentation & Design: Draw.io (ERDs), Figma (UI/UX Prototyping)

🗄️ Database Architecture
The system uses a relational database structured to maintain strict data integrity and role-based access control (RBAC).

Core Entities:
User_Profile: Centralized identity management for Students, Faculty, and Admins.

AttendanceSession: Tracks specific lecture events, locations, and unique QR tokens.

AttendanceRecord: Logs individual check-ins with timestamps, methods, and status (Present/Late/Absent).

BiometricDevice: Manages hardware registry for fingerprint scanners across campus halls.

Note: For the full schema definition, see /sql/edutrack_schema.sql.

🚀 Getting Started
Prerequisites
Python 3.10+

MS SQL Server & SQL Server Management Studio (SSMS)

ODBC Driver for SQL Server

Installation
Clone the repository:

Bash

git clone https://github.com/YourUsername/EduTrack-System.git
cd EduTrack-System
Database Setup:

Open SSMS and run the scripts in the following order:

edutrack_schema.sql (Creates tables)

Insertion.sql (Loads sample data/locations)

Configure Connection:

Open edutrack_final.py and update the DB_CONFIG dictionary with your server name:

Python

DB_CONFIG = {
    "server": "YOUR_SERVER_NAME\SQLEXPRESS",
    "database": "edutrack"
}
Install Dependencies:

Bash

pip install customtkinter pyodbc reportlab
Run the Application:

Bash

python edutrack_final.py
📊 System Design Documents
Detailed design documentation is available in the repository:

ERD: projectERD.drawio

Use Case Clarifications: use case clarifications.pdf

Menu & UI Design: Menu Design.pdf

System Logic: Database_report.docx

👥 Contributors
Belal Mohamed Fathy

Ahmed Tamer Salah

Youssef Khafagy

Youssef Atwa

Mohamed Maged

📜 License
This project is developed for academic purposes as part of the CS curriculum
