CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  UPDATE SavingsAccounts
  SET Balance = Balance * 1.01;

  DBMS_OUTPUT.PUT_LINE('Monthly interest of 1% applied to all savings accounts.');
END;
/

BEGIN
  ProcessMonthlyInterest;
END;
/

select * from SavingsAccounts;