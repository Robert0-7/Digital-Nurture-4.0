--  Scenario 1: The bank wants to apply a discount to loan interest rates for customers above 60 years old.
-- 	Question: Write a PL/SQL block that loops through all customers, checks their age, and if they are above 60, apply a 1% discount to their current loan interest rates.

BEGIN
    FOR rec IN (
        SELECT l.LoanID, l.InterestRate
        FROM Loans l
        JOIN Customers c ON l.CustomerID = c.CustomerID
        WHERE FLOOR(MONTHS_BETWEEN(SYSDATE, c.DOB) / 12) > 60
    ) LOOP
        UPDATE Loans
        SET InterestRate = rec.InterestRate - (rec.InterestRate * 0.01)
        WHERE LoanID = rec.LoanID;
    END LOOP;
END;
/
