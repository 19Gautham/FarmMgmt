
INSERT INTO farm_details (farm_id, user_id, moisture_threshold)
values
(7, "sam", 0.3),
(8, "john", 0.2),
(9, "ted", 0.25),
(10, "patrick", 0.35);

INSERT INTO moisture_sensor (sensor_id, farm_id, zone, reading)
values 
 (1, 7, 1, 0.3),
 (2, 7, 2, 0.5),
 (3, 7, 3, 0.6),
 (4, 7, 4, 0.2);

INSERT INTO sprinkler (sprinkler_id, farm_id, zone, status)
values
(1, 7, 1, 0),
(2, 7, 2, 0),
(3, 7, 3, 0),
(4, 7, 4, 0),
(5, 8, 1, 0),
(6, 8, 2, 0),
(7, 8, 3, 0),
(8, 8, 4, 0);
