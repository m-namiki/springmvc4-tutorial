CREATE TABLE `zipcode` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `organization_code` int(11) NOT NULL COMMENT '全国地方公共団体コード',
  `old_zipcode` char(5) NOT NULL COMMENT '郵便番号（旧）',
  `zipcode` char(7) NOT NULL COMMENT '郵便番号（現）',
  `prefecture_name_kana` varchar(256) NOT NULL COMMENT '都道府県名',
  `city_name_kana` varchar(256) NOT NULL COMMENT '市区町村名',
  `town_name_kana` varchar(256) NOT NULL COMMENT '町域名',
  `prefecture_name` varchar(256) NOT NULL COMMENT '都道府県名',
  `city_name` varchar(256) NOT NULL COMMENT '市区町村名',
  `town_name` varchar(256) NOT NULL COMMENT '町域名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='郵便番号データ';
