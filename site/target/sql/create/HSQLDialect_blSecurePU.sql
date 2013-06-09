create table BLC_BANK_ACCOUNT_PAYMENT (PAYMENT_ID bigint not null, ACCOUNT_NUMBER varchar(255) not null, REFERENCE_NUMBER varchar(255) not null, ROUTING_NUMBER varchar(255) not null, primary key (PAYMENT_ID));
create table BLC_CREDIT_CARD_PAYMENT (PAYMENT_ID bigint not null, EXPIRATION_MONTH integer not null, EXPIRATION_YEAR integer not null, NAME_ON_CARD varchar(255) not null, PAN varchar(255) not null, REFERENCE_NUMBER varchar(255) not null, primary key (PAYMENT_ID));
create table BLC_GIFT_CARD_PAYMENT (PAYMENT_ID bigint not null, PAN varchar(255) not null, PIN varchar(255), REFERENCE_NUMBER varchar(255) not null, primary key (PAYMENT_ID));
create index BANKACCOUNT_INDEX on BLC_BANK_ACCOUNT_PAYMENT (REFERENCE_NUMBER);
create index CREDITCARD_INDEX on BLC_CREDIT_CARD_PAYMENT (REFERENCE_NUMBER);
create index GIFTCARD_INDEX on BLC_GIFT_CARD_PAYMENT (REFERENCE_NUMBER);
create table SEQUENCE_GENERATOR ( ID_NAME varchar(255) not null ,  ID_VAL bigint, primary key ( ID_NAME ) ) ;
