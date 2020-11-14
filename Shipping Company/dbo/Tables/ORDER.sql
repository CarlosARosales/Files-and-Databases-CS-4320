CREATE TABLE [dbo].[ORDER] (
    [OrderNumber]   NCHAR (9)     NOT NULL,
    [CustomerID]    NCHAR (9)     NOT NULL,
    [OrderDate]     DATE          NOT NULL,
    [ShipDate]      DATE          NULL,
    [ReceiveDate]   DATE          NULL,
    [ShippingType]  NVARCHAR (15) NOT NULL,
    [TransactionID] NCHAR (9)     NOT NULL,
    [DriverID]      NCHAR (9)     NOT NULL,
    [InvoiceID]     NCHAR (9)     NOT NULL,
    CONSTRAINT [PK_ORDER_1] PRIMARY KEY CLUSTERED ([OrderNumber] ASC),
    CONSTRAINT [FK_ORDER_CUSTOMER] FOREIGN KEY ([CustomerID]) REFERENCES [dbo].[CUSTOMER] ([CustomerID]),
    CONSTRAINT [FK_ORDER_Driver] FOREIGN KEY ([DriverID]) REFERENCES [dbo].[Driver] ([DriverID]),
    CONSTRAINT [FK_ORDER_INVOICE] FOREIGN KEY ([InvoiceID]) REFERENCES [dbo].[INVOICE] ([InvoiceID]),
    CONSTRAINT [FK_ORDER_TRANSACTION] FOREIGN KEY ([TransactionID]) REFERENCES [dbo].[TRANSACTION] ([TransactionID])
);

