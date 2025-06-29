CREATE OR REPLACE PROCEDURE TransferFunds(
    source_account IN NUMBER,
    destination_account IN NUMBER,
    amount IN NUMBER
) IS
    source_balance NUMBER;
BEGIN
    -- Check source balance
    SELECT Balance INTO source_balance
    FROM SavingsAccounts
    WHERE AccountID = source_account;

    IF source_balance < amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in account ' || source_account);
    END IF;

    -- Subtract from source and add to destination
    UPDATE SavingsAccounts
    SET Balance = Balance - amount
    WHERE AccountID = source_account;

    UPDATE SavingsAccounts
    SET Balance = Balance + amount
    WHERE AccountID = destination_account;

    DBMS_OUTPUT.PUT_LINE('Transferred ₹' || amount || ' from account ' || source_account || ' to account ' || destination_account);
END;
/
BEGIN
  TransferFunds(201, 202, 1000);
END;
/

select * from SavingsAccounts;