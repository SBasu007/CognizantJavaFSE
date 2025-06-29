CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    FullName VARCHAR2(100),
    Salary NUMBER(10,2),
    Dept VARCHAR2(50)
);
CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    FullName VARCHAR2(100),
    Age INT,
    Balance NUMBER(10,2),
    IsVIP CHAR(1) DEFAULT 'N'
);

CREATE TABLE SavingsAccounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerID NUMBER REFERENCES Customers(CustomerID),
    Balance NUMBER(10,2)
);

CREATE TABLE Loans (
    LoanID INT PRIMARY KEY,
    CustomerID INT REFERENCES Customers(CustomerID),
    InterestRate NUMBER(5,2),
    DueDate DATE
);
 

-- inserting dummy data 

INSERT INTO Employees VALUES (1, 'Mr X', 100000, 'Sales' );
INSERT INTO Employees VALUES (2, 'Mr Y', 200000, 'Sales' );
INSERT INTO Employees VALUES (3, 'Dr U',  300000, 'Research' );
INSERT INTO Employees VALUES (4, 'Dr V',  350000, 'Research' );

INSERT INTO Customers VALUES (1, 'A', 24, 12000, 'N');
INSERT INTO Customers VALUES (2, 'B', 55, 9000, 'N');
INSERT INTO Customers VALUES (3, 'C', 76, 15000, 'N');
INSERT INTO Customers VALUES (3, 'C', 76, 15000, 'N');


INSERT INTO Loans VALUES (101, 1, 5.5, SYSDATE + 20);
INSERT INTO Loans VALUES (102, 2, 6.0, SYSDATE + 40);
INSERT INTO Loans VALUES (103, 3, 7.0, SYSDATE + 10);

INSERT INTO SavingsAccounts VALUES (201, 1, 12000.00);
INSERT INTO SavingsAccounts VALUES (202, 2, 9000.00);
INSERT INTO SavingsAccounts VALUES (203, 3, 15000.00);
INSERT INTO SavingsAccounts VALUES (204, 4, 5000.00);

