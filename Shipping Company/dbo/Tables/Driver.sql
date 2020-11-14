CREATE TABLE [dbo].[Driver] (
    [DriverID]  NCHAR (9)     NOT NULL,
    [FirstName] NVARCHAR (15) NOT NULL,
    [LastName]  NVARCHAR (15) NOT NULL,
    CONSTRAINT [PK_Driver] PRIMARY KEY CLUSTERED ([DriverID] ASC)
);

