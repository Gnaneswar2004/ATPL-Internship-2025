create table accounts_gnani (
	account_id int primary key,
    holder_name varchar(50),
    balance float
);

-- Step 1: Insert Initial Records into accounts table
insert into accounts_gnani (account_id, holder_name, balance) values 
(1,'Alice',5000), (2,'Bob',3000), (3,'Charlie',4000);

select * from accounts_gnani;

-- Step 2: Start a Transaction – Transfer ₹1000 from Alice to Bob
begin;

update accounts_gnani set balance = balance - 1000 where account_id = 1;
update accounts_gnani set balance = balance + 1000 where account_id = 2;

-- Then perform a ROLLBACK to revert both operations
rollback;
select * from accounts_gnani;

-- Step 3: New Transaction with SAVEPOINT
update accounts_gnani set balance = balance - 1000 where account_id = 1;

-- Create a SAVEPOINT named after_debit
savepoint After_Debit;
 
update accounts_gnani set balance = balance + 1000 where account_id = 2;
update accounts_gnani set balance = balance + 500 where account_id = 3;

-- Now ROLLBACK TO SAVEPoint After_Debit
rollback to savepoint After_Debit;
select * from accounts_gnani;