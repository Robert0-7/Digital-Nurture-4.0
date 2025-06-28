--  Scenario 2: The bank wants to implement a bonus scheme for employees based on their performance.
--  Question: Write a stored procedure UpdateEmployeeBonus that updates the salary of employees in a given department by adding a bonus percentage passed as a parameter.

CREATE PROCEDURE UpdateEmployeeBonus (
    p_department IN VARCHAR2,
    p_bonus_pct IN NUMBER
) IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonus_pct / 100)
    WHERE Department = p_department;
END;
/

EXEC UpdateEmployeeBonus('IT', 10);  -- Adds 10% bonus to IT dept
