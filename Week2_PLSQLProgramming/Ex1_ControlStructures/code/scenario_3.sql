BEGIN
  FOR loan_record IN (
    SELECT c.FullName, l.LoanID, l.DueDate
    FROM Customers c
    JOIN Loans l ON c.CustomerID = l.CustomerID
    WHERE l.DueDate <= SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || loan_record.LoanID || 
                         ' for customer ' || loan_record.FullName || 
                         ' is due on ' || TO_CHAR(loan_record.DueDate, 'DD-MON-YYYY'));
  END LOOP;
END;
/