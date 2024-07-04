create table if not exists item (
          id Long PRIMARY KEY AUTO_INCREMENT,
          name varchar(255),
          description varchar(1000),
          price BigDecimal,
          quantity int,

);


create table if not exists order (
          id Long PRIMARY KEY AUTO_INCREMENT,
          customerId Long,
          orderDate DATE,
          status varchar(255)
);

create table if not exists orderItem (
          id Long PRIMARY KEY AUTO_INCREMENT,
          itemId Long,
          orderId Long,
          quantity int,
          foreign key(itemId) references item(id),
          foreign key(orderId) references order(id),

);