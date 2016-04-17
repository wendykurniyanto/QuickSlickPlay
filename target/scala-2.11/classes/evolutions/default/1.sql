# --- Created by Slick DDL
# To stop Slick DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table "CART" ("id" SERIAL NOT NULL PRIMARY KEY,"total" DECIMAL(21,2),"netTotal" DECIMAL(21,2));
create table "CART_PRODUCT" ("CartId" INTEGER NOT NULL,"ProductId" INTEGER NOT NULL,"Quantity" INTEGER NOT NULL,"Discount" DECIMAL(21,2) NOT NULL);
create table "CAT" ("name" VARCHAR(254) NOT NULL PRIMARY KEY,"color" VARCHAR(254) NOT NULL);
create table "PRODUCT" ("id" SERIAL NOT NULL PRIMARY KEY,"name" VARCHAR(254) NOT NULL,"description" VARCHAR(254) NOT NULL,"price" DECIMAL(21,2) NOT NULL);
alter table "CART_PRODUCT" add constraint "cart_fk" foreign key("CartId") references "CART"("id") on update NO ACTION on delete NO ACTION;
alter table "CART_PRODUCT" add constraint "product_fk" foreign key("ProductId") references "CART"("id") on update NO ACTION on delete NO ACTION;

# --- !Downs

alter table "CART_PRODUCT" drop constraint "cart_fk";
alter table "CART_PRODUCT" drop constraint "product_fk";
drop table "PRODUCT";
drop table "CAT";
drop table "CART_PRODUCT";
drop table "CART";

