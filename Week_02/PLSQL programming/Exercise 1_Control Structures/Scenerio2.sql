--  Scenario 2: A customer can be promoted to VIP status based on their balance.
--  Question: Write a PL/SQL block that iterates through all customers and sets a flag IsVIP to TRUE for those with a balance over $10,000.

BEGIN
    FOR rec IN (
        SELECT c.CustomerID, c.Balance
        FROM Customers c
        WHERE c.Balance > 10000
    ) LOOP
        UPDATE Customers
        SET IsVIP = 'TRUE'
        WHERE CustomerID = rec.CustomerID;
    END LOOP;
END;

-- we need to make sure isVIP is a column in the Customers table
-- Since it is not mentioned in the original scenario, we will add it to the Customers table.

ALTER TABLE Customers ADD IsVIP CHAR(1) DEFAULT 'N';
