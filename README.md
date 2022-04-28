# backend
google drive link: https://drive.google.com/file/d/1PsNJUm9NWbVrkVJGruyx4xhVkjhk0o9t/view?usp=sharing


Endpoints for curl requests

end point to list all shops:  http://localhost:2020/shops

end point to add shops: http://localhost:2020/addShop

end point to add shops: http://localhost:2020/getshopByLocation/

Database table format

CREATE TABLE `shops` (
  `id` int(11) NOT NULL,
  `shop_location` varchar(255) NOT NULL,
  `shop_name` varchar(255) NOT NULL,
  `shop_street` varchar(255) NOT NULL,
  `cp_fk` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

