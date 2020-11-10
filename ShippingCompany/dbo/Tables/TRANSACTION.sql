CREATE TABLE [dbo].[TRANSACTION] (
    [TransactionID]          NCHAR (9)     NOT NULL,
    [OrderNumber]            NCHAR (9)     NOT NULL,
    [TransactionAmount]      MONEY         NOT NULL,
    [TransactionDate]        DATE          NOT NULL,
    [CreditCardNum]          NCHAR (16)    NOT NULL,
    [CreditCardExpiration]   NCHAR (5)     NOT NULL,
    [CreditCardSecurityCode] NCHAR (3)     NOT NULL,
    [CreditCardHolderName]   NVARCHAR (25) NOT NULL,
    CONSTRAINT [PK_TRANSACTION] PRIMARY KEY CLUSTERED ([TransactionID] ASC)
);

