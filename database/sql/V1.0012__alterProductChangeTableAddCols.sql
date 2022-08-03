
ALTER TABLE postgres.productchange
ADD COLUMN create_date timestamp with time zone,
ADD COLUMN created_by VARCHAR(20)
;





