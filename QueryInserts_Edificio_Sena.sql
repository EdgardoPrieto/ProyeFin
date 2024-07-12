-- Inserción en la tabla usuarios
INSERT INTO usuarios (nombre, apellido, cedula, contacto, direccion, Email, password) VALUES
('Edgardo', 'Prieto', '1002364783', '3123431278', 'Calle 34', 'edgar@gmail.com', '123'),
('Joseph', 'Joseph', '1007485923', '3203414234', 'Calle 10', 'Joseph@gmail.com', '123');

-- Inserción en la tabla personas
INSERT INTO personas (nombre, apellido, cedula, rol, ficha_o_cFormacion, tipo_transporte, placa, color, marca) VALUES
('Pedro', 'López', '1001122902', 'Aprendiz', '2234135', 'Bicicleta', 'nn', 'Azul', 'nn'),
('Andrea', 'Fonseca', '1008345209', 'Aprendiz', '2234090',  'Moto', 'WAE903', 'Blanco', 'Akt'),
('Ana', 'Martínez', '22634044', 'Aprendiz', '2234558', 'Moto', 'FXS902', 'Gris', 'Susuki'),
('Pablo', 'Escobar', '8543892', 'Intructor', 'Sede TIC', 'Carro', 'LOD231', 'Blanco', 'Kia Rio'),
('María', 'González', '987654321', 'Intructor', 'Sede TIC', 'Carro','SCJ380', 'Blanco', 'Toyota Hilux'),
('Tatiana', 'Perez', '123456789', 'Funcionario', 'Sede TIC', 'Moto', 'QTA224', 'Negro', 'Tvs');

-- Inserción en la tabla pertenenciasEntrada
INSERT INTO pertenenciasEntrada (serial, tipo_pertenencias, id_persona) VALUES
('ABCDE', 'Tableta', 1),
('FGHIJ', 'Laptop', 2),
('KLMNO', 'Laptop', 3),
('PQRST', 'Laptop', 4),
('PQRST', 'Laptop', 5),
('UVWXY', 'Herramientas', 6);

-- Inserción en la tabla pertenenciasSalida
INSERT INTO pertenenciasSalida (serial, tipo_pertenencias, id_persona) VALUES
('ABCDE', 'Tableta', 1),
('FGHIJ', 'Laptop', 2),
('KLMNO', 'Laptop', 3),
('PQRST', 'Laptop', 4),
('PQRST', 'Laptop', 5),
('UVWXY', 'Herramientas', 6);

-- Inserción en la tabla ingresoPersonal
INSERT INTO ingresoPersonal (fecha, hora_entrada, id_persona) VALUES
('2024-04-11', '07:00:00', 1),
('2024-04-11', '07:18:00', 2),
('2024-04-11', '07:30:00', 3),
('2024-04-11', '06:23:00', 4),
('2024-04-11', '14:01:00', 4),
('2024-04-11', '06:50:00', 5),
('2024-04-11', '06:10:00', 6);

-- Inserción en la tabla SalidaPersonal
INSERT INTO SalidaPersonal (fecha, hora_salida, id_persona) VALUES
('2024-04-11', '12:24:00', 1),
('2024-04-11', '12:11:00', 2),
('2024-04-11', '12:42:00', 3),
('2024-04-11', '13:33:00', 4),
('2024-04-11', '19:32:00', 4),
('2024-04-11', '14:01:00', 5),
('2024-04-11', '18:20:00', 6);


