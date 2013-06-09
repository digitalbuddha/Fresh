create table BLC_STATIC_ASSET_STRG (STATIC_ASSET_STRG_ID bigint not null, FILE_DATA blob, STATIC_ASSET_ID bigint not null, primary key (STATIC_ASSET_STRG_ID));
create index STATIC_ASSET_ID_INDEX on BLC_STATIC_ASSET_STRG (STATIC_ASSET_ID);
create table SEQUENCE_GENERATOR ( ID_NAME varchar(255) not null ,  ID_VAL bigint, primary key ( ID_NAME ) ) ;
