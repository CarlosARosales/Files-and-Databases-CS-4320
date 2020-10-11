CREATE TABLE [dbo].[CUSTOMER] (
    [FirstName]     NVARCHAR (15) NOT NULL,
    [MiddleInitial] NCHAR (1)     NOT NULL,
    [LastName]      NVARCHAR (10) NOT NULL,
    [Address]       NVARCHAR (30) NOT NULL,
    [CustomerID]    NCHAR (9)     NOT NULL,
    CONSTRAINT [PK_CUSTOMER] PRIMARY KEY CLUSTERED ([CustomerID] ASC)
);
GO
CREATE UNIQUE NONCLUSTERED INDEX [IX_CUSTOMER]
    ON [dbo].[CUSTOMER]([Address] ASC);