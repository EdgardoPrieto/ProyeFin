-- Crear la base de datos
CREATE DATABASE registros;

-- SeleccionaR la BD
USE registros;

-- Tabla usuarios
CREATE TABLE IF NOT EXISTS usuarios (
    id_usuarios INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),      					 
	apellido VARCHAR(50),
    cedula VARCHAR(100),
    contacto VARCHAR(100),
    direccion VARCHAR(100),
    Email VARCHAR(100),
    password VARCHAR(100)
);

-- Tabla personas
CREATE TABLE IF NOT EXISTS personas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    cedula VARCHAR(20),
    rol VARCHAR (20),
    ficha_o_cFormacion VARCHAR (50),
    tipo_transporte VARCHAR(50),
    placa VARCHAR(20),
    color VARCHAR(20),
    marca VARCHAR(50)
);

-- Tabla entrada de pertenencias
CREATE TABLE IF NOT EXISTS pertenenciasEntrada (
    id_pertenencias INT AUTO_INCREMENT PRIMARY KEY,
    serial VARCHAR(50),
    tipo_pertenencias VARCHAR(50),
    id_persona INT,
    constraint fk_pertenencias_personaid_entrada foreign key (id_persona) references personas(id)
);

-- Tabla salida de pertenencias
CREATE TABLE IF NOT EXISTS pertenenciasSalida (
    id_pertenencias INT AUTO_INCREMENT PRIMARY KEY,
    serial VARCHAR(50),
    tipo_pertenencias VARCHAR(50),
    id_persona INT,
    constraint fk_pertenencias_personaid_salida foreign key (id_persona) references personas(id)
);

-- Tabla ingreso del personal
CREATE TABLE IF NOT EXISTS ingresoPersonal (
    id INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE,
    hora_entrada TIME,
    id_persona INT,
    constraint fk_ingreso_persona_id  foreign key (id_persona) references personas(id)
);

-- Tabla salida del Personal
CREATE TABLE IF NOT EXISTS SalidaPersonal (
    id INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE,
    hora_salida TIME,
    id_persona INT,
    CONSTRAINT fk_salida_persona_id FOREIGN KEY (id_persona)
        REFERENCES personas (id)
);


