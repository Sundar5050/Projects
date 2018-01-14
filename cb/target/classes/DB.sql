CREATE TABLE Billing_Master (Master_BillID INT not null, Master_ind_invoiceNo INT,
     Master_ind_billerName VARCHAR(30), Master_ReceiverName VARCHAR(30), Master_Ind_BillDate DATE, Master_Ind_BillQuantity INT,
     Master_Ind_BillAmount Decimal(5,3));

CREATE TABLE Billing_Individual (Ind_BillID INT not null , primary key(Ind_BillID), Ind_BillInvoiceNo INT,
     Ind_BillerName VARCHAR(30), Ind_ReceiverName VARCHAR(30), Ind_BillDate DATE, Ind_BillQuantity INT,
     Ind_BillAmount Decimal(5,3));

Alter table Billing_Master add primary key (Master_BillID);

Alter table Billing_Master modify column Master_BillID INT auto_increment unique first;

show columns from billing_master;

Alter table Billing_individual modify column Ind_BillID INT auto_increment unique first;
