
ALTER TABLE postgres.product_change
ADD COLUMN old_product VARCHAR(20),
ADD COLUMN new_product VARCHAR(20),
ADD COLUMN bill_type VARCHAR(1),
ADD COLUMN bill_frequency NUMERIC(3,0),
ADD COLUMN area VARCHAR(6),
ADD COLUMN district VARCHAR(6),
ADD COLUMN depot VARCHAR(6),
ADD COLUMN route VARCHAR(6),
ADD COLUMN promo_exp_date1 DATE,
ADD COLUMN unit_cost_daily1 NUMERIC(5,3),
ADD COLUMN unit_cost_sunday1 NUMERIC(5,3),
ADD COLUMN promo_exp_date2 DATE,
ADD COLUMN unit_cost_daily2 NUMERIC(5,3),
ADD COLUMN unit_cost_sunday2 NUMERIC(5,3),
ADD COLUMN promo_exp_date3 DATE,
ADD COLUMN unit_cost_daily3 NUMERIC(5,3),
ADD COLUMN unit_cost_sunday3 NUMERIC(5,3),
ADD COLUMN pc_reason VARCHAR(20),
ADD COLUMN number_of_copies NUMERIC(3,0),
ADD COLUMN txn_serial_number varchar(200)

;





