CREATE TABLE [dbo].[ORDER] (
    [OrderNumber]   NCHAR (9)     NOT NULL,
    [CustomerID]    NCHAR (9)     NOT NULL,
    [OrderDate]     DATE          NOT NULL,
    [ShipDate]      DATE          NULL,
    [ReceiveDate]   DATE          NULL,
    [ShippingType]  NVARCHAR (10) NOT NULL,
    [TransactionID] NCHAR (9)     NOT NULL,
    [DriverID]      NCHAR (9)     NOT NULL,
    [InvoiceID]     NCHAR (9)     NOT NULL,
    CONSTRAINT [PK_ORDER_1] PRIMARY KEY CLUSTERED ([OrderNumber] ASC),
    CONSTRAINT [FK_ORDER_CUSTOMER] FOREIGN KEY ([CustomerID]) REFERENCES [dbo].[CUSTOMER] ([CustomerID])
);


GO
CREATE UNIQUE NONCLUSTERED INDEX [IX_ORDER]
    ON [dbo].[ORDER]([DriverID] ASC);


GO
CREATE UNIQUE NONCLUSTERED INDEX [IX_ORDER_1]
    ON [dbo].[ORDER]([DriverID] ASC);

