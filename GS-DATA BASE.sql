CREATE TABLE PRODUCT(
    ProductId INT,
    ProductName VARCHAR2(30),
    ProductCategory VARCHAR2(30),
    CONSTRAINT PRODUCT_PK PRIMARY KEY (ProductId) 
);

CREATE TABLE STOCK(
    StockId INT,
    ProductId INT,
    QTY INT,
    UpdateDate Date,
    CONSTRAINT STOCK_PK PRIMARY KEY (StockId)
);

CREATE TABLE COMPANY(
    CompanyId INT,
    CompanyName VARCHAR2(30),
    CompanyPhoneNumber INT,
    CompanyAdresse VARCHAR2(30),
    CONSTRAINT COMPANY_PK PRIMARY KEY (CompanyId)
);

CREATE TABLE SUPPLYING(
    SupplyingId INT,
    CompanyId INT,
    ProductId INT,
    QTY INT,
    ShippingDate DATE, 
    ArrivingDate DATE,
    CONSTRAINT SUPPLYING_PK PRIMARY KEY (SupplyingId)
);

CREATE TABLE ORDRE(
    OrderId INT,
    CompanyId INT,
    OrderDate Date,
    CONSTRAINT ORDRE_PK PRIMARY KEY (OrderId)
);


CREATE TABLE PRODUCT_ORDER(
    PRODUCT_ORDERId INT,
    OrderId INT,
    ProductId INT,
    QTY INT,
    CONSTRAINT PRODUCT_ORDER_PK PRIMARY KEY (PRODUCT_ORDERId)
);

ALTER TABLE STOCK
ADD CONSTRAINT STOCK_FK FOREIGN KEY (ProductId) REFERENCES PRODUCT(ProductId);

ALTER TABLE SUPPLYING
ADD CONSTRAINT SUPPLYING_FK1 FOREIGN KEY (ProductId) REFERENCES PRODUCT(ProductId);
ALTER TABLE SUPPLYING
ADD CONSTRAINT SUPPLYING_FK2 FOREIGN KEY (CompanyId) REFERENCES COMPANY(CompanyId);

ALTER TABLE ORDRE
ADD CONSTRAINT ORDRE_FK FOREIGN KEY (CompanyId) REFERENCES COMPANY(CompanyId);

ALTER TABLE PRODUCT_ORDER
ADD CONSTRAINT PRODUCT_ORDER_FK1 FOREIGN KEY (OrderId) REFERENCES ORDRE(OrderId);
ALTER TABLE PRODUCT_ORDER
ADD CONSTRAINT PRODUCT_ORDER_FK2 FOREIGN KEY (ProductId) REFERENCES PRODUCT(ProductId);




/* login */
CREATE TABLE USERS(
    Username VARCHAR2(20),
    Pass VARCHAR2(20)
); 