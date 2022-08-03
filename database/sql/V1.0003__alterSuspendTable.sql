
ALTER TABLE postgres.suspend_transactions
ALTER COLUMN effective_date TYPE DATE,
ALTER COLUMN restart_date TYPE DATE,
ADD COLUMN create_date timestamp with time zone,
ADD COLUMN created_by VARCHAR(20)
;




