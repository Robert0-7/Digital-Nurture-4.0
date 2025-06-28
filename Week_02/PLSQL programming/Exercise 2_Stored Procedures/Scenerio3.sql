--  Scenario 3: Customers should be able to transfer funds between their accounts.
--  Question: Write a stored procedure TransferFunds that transfers a specified amount from one account to another, checking that the source account has sufficient balance before making the transfer.

CREATE OR REPLACE PROCEDURE TransferFunds (
    p_from_acc IN NUMBER,
    p_to_acc   IN NUMBER,
    p_amount   IN NUMBER
) IS
    v_balance NUMBER;
BEGIN
    -- Get source account balance
    SELECT Balance INTO v_balance
    FROM Accounts
    WHERE AccountID = p_from_acc;

    -- Check sufficient balance
    IF v_balance >= p_amount THEN
        -- Deduct from sender
        UPDATE Accounts
        SET Balance = Balance - p_amount,
            LastModified = SYSDATE
        WHERE AccountID = p_from_acc;

        -- Add to receiver
        UPDATE Accounts
        SET Balance = Balance + p_amount,
            LastModified = SYSDATE
        WHERE AccountID = p_to_acc;

        -- Optional: Insert transaction logs (you can add this part if needed)
    ELSE
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
    END IF;
END;
/

EXEC TransferFunds(1, 2, 300);  -- Transfer 300 from Account 1 to 2
