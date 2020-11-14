CREATE TABLE [dbo].[INVOICE] (
    [InvoiceID]     NCHAR (9)     NOT NULL,
    [OrderNumber]   NCHAR (9)     NOT NULL,
    [ItemName]      NVARCHAR (20) NOT NULL,
    [UnitPrice]     MONEY         NOT NULL,
    [Quantity]      INT           NOT NULL,
    [Total]         MONEY         NOT NULL,
    [TransactionID] NCHAR (9)     NOT NULL,
    CONSTRAINT [PK_INVOICE_1] PRIMARY KEY CLUSTERED ([InvoiceID] ASC),
    CONSTRAINT [FK_INVOICE_ORDER] FOREIGN KEY ([OrderNumber]) REFERENCES [dbo].[ORDER] ([OrderNumber]),
    CONSTRAINT [FK_INVOICE_TRANSACTION] FOREIGN KEY ([TransactionID]) REFERENCES [dbo].[TRANSACTION] ([TransactionID])
);

