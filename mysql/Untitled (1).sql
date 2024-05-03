CREATE TABLE `historial` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `insumo_name` varchar(255),
  `insumo_description` varchar(255),
  `insumo_code` varchar(255),
  `cantidad_inventario` int,
  `almacen` varchar(255),
  `date` date
);

CREATE TABLE `continent` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255),
  `code` varchar(255),
  `description` varchar(255)
);

CREATE TABLE `country` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255),
  `code` varchar(255),
  `description` varchar(255),
  `continent_id` int
);

CREATE TABLE `status` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255),
  `code` varchar(255),
  `description` varchar(255),
  `country_id` int
);

CREATE TABLE `municipality` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255),
  `code` varchar(255),
  `description` varchar(255),
  `status` int
);

CREATE TABLE `location` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255),
  `code` varchar(255),
  `description` varchar(255),
  `municipality_id` int
);

CREATE TABLE `neighborhood` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255),
  `code` varchar(255),
  `description` varchar(255),
  `location_id` int
);

CREATE TABLE `book` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `title` varchar(255),
  `code` varchar(255),
  `amount` int,
  `autor_id` int
);

CREATE TABLE `lending` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `amount` int,
  `action` boolean,
  `date` date,
  `book_id` int,
  `employed_id` int,
  `client_id` int
);

CREATE TABLE `user` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `username` varchar(255),
  `pasword` varchar(255),
  `person_id` int
);

CREATE TABLE `client` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `code` varchar(255),
  `person_id` int
);

CREATE TABLE `facturadetalle` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `code` varchar(255),
  `amount` int,
  `price` double,
  `factura_id` int,
  `producto_id` int,
  `clien_id` int,
  `employed` int
);

CREATE TABLE `producto` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `description` varchar(255),
  `price` double,
  `code` varchar(255),
  `name` varchar(255)
);

CREATE TABLE `insumoproducto` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `amount` int,
  `insumo_id` int,
  `producto_id` int,
  `unidadmedida_id` int
);

CREATE TABLE `unidadmedida` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `code` varchar(255),
  `name` varchar(255)
);

CREATE TABLE `insumo` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `description` varchar(255),
  `code` varchar(255),
  `name` varchar(255)
);

CREATE TABLE `inventariodetalle` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `insumo_id` int,
  `inventario_id` int,
  `cantidad` int
);

CREATE TABLE `inventario` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255)
);

CREATE TABLE `factura` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `total` int,
  `date` datetime
);

CREATE TABLE `employed` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `code` varchar(255),
  `person_id` int
);

CREATE TABLE `person` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `first_name` varchar(255),
  `last_name` varchar(255),
  `email` varchar(255),
  `date_of_birth` varchar(255),
  `gender` varchar(255),
  `address` varchar(255),
  `type_document` varchar(255),
  `document` varchar(255),
  `municipality_id` int
);

CREATE TABLE `user_rol` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `user_id` int,
  `rol_id` int
);

CREATE TABLE `role` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255),
  `description` varchar(255)
);

CREATE TABLE `view` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255),
  `description` varchar(255),
  `route` varchar(255)
);

CREATE TABLE `role_view` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `view_id` int,
  `rol_id` int
);

CREATE TABLE `module` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255),
  `description` varchar(255)
);

CREATE TABLE `module_view` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `view_id` int,
  `module_id` int
);

ALTER TABLE `country` ADD FOREIGN KEY (`continent_id`) REFERENCES `continent` (`id`);

ALTER TABLE `status` ADD FOREIGN KEY (`country_id`) REFERENCES `country` (`id`);

ALTER TABLE `municipality` ADD FOREIGN KEY (`status`) REFERENCES `status` (`id`);

ALTER TABLE `location` ADD FOREIGN KEY (`municipality_id`) REFERENCES `municipality` (`id`);

ALTER TABLE `neighborhood` ADD FOREIGN KEY (`location_id`) REFERENCES `location` (`id`);

ALTER TABLE `book` ADD FOREIGN KEY (`autor_id`) REFERENCES `person` (`id`);

ALTER TABLE `lending` ADD FOREIGN KEY (`book_id`) REFERENCES `book` (`id`);

ALTER TABLE `lending` ADD FOREIGN KEY (`employed_id`) REFERENCES `employed` (`id`);

ALTER TABLE `lending` ADD FOREIGN KEY (`client_id`) REFERENCES `client` (`id`);

ALTER TABLE `user` ADD FOREIGN KEY (`person_id`) REFERENCES `person` (`id`);

ALTER TABLE `client` ADD FOREIGN KEY (`person_id`) REFERENCES `person` (`id`);

ALTER TABLE `facturadetalle` ADD FOREIGN KEY (`factura_id`) REFERENCES `factura` (`id`);

ALTER TABLE `facturadetalle` ADD FOREIGN KEY (`producto_id`) REFERENCES `producto` (`id`);

ALTER TABLE `facturadetalle` ADD FOREIGN KEY (`clien_id`) REFERENCES `client` (`id`);

ALTER TABLE `facturadetalle` ADD FOREIGN KEY (`employed`) REFERENCES `employed` (`id`);

ALTER TABLE `insumoproducto` ADD FOREIGN KEY (`insumo_id`) REFERENCES `insumo` (`id`);

ALTER TABLE `insumoproducto` ADD FOREIGN KEY (`producto_id`) REFERENCES `producto` (`id`);

ALTER TABLE `insumoproducto` ADD FOREIGN KEY (`unidadmedida_id`) REFERENCES `unidadmedida` (`id`);

ALTER TABLE `inventariodetalle` ADD FOREIGN KEY (`insumo_id`) REFERENCES `insumo` (`id`);

ALTER TABLE `inventariodetalle` ADD FOREIGN KEY (`inventario_id`) REFERENCES `inventario` (`id`);

ALTER TABLE `employed` ADD FOREIGN KEY (`person_id`) REFERENCES `person` (`id`);

ALTER TABLE `person` ADD FOREIGN KEY (`municipality_id`) REFERENCES `municipality` (`id`);

ALTER TABLE `user_rol` ADD FOREIGN KEY (`user_id`) REFERENCES `user` (`id`);

ALTER TABLE `user_rol` ADD FOREIGN KEY (`rol_id`) REFERENCES `role` (`id`);

ALTER TABLE `role_view` ADD FOREIGN KEY (`view_id`) REFERENCES `view` (`id`);

ALTER TABLE `role_view` ADD FOREIGN KEY (`rol_id`) REFERENCES `role` (`id`);

ALTER TABLE `module_view` ADD FOREIGN KEY (`view_id`) REFERENCES `view` (`id`);

ALTER TABLE `module_view` ADD FOREIGN KEY (`module_id`) REFERENCES `module` (`id`);
