CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(department TEXT, bonus_percent NUMERIC)
LANGUAGE plpgsql
AS $$
BEGIN
  UPDATE Employees
  SET Salary = Salary + (Salary * bonus_percent / 100)
  WHERE Dept = department;

  RAISE NOTICE 'Bonus of %%% applied to department: %', bonus_percent, department;
END;
$$;

-- To call the procedure:
BEGIN
  UpdateEmployeeBonus('Sales', 10);
END;
/

select * from Employees
