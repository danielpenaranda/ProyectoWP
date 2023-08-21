/*Se crea la base de datos */
drop schema if exists fractalgames;
drop user if exists usuario;
CREATE SCHEMA fractalgames ;

/*Se crea un usuario para la base de datos llamado "usuario_prueba" y tiene la contraseña "Usuario_Clave."*/
create user 'usuario'@'%' identified by 'usuario.';

/*Se asignan los prvilegios sobr ela base de datos fractalgames al usuario creado */
grant all privileges on fractalgames.* to 'usuario'@'%';
flush privileges;
use fractalgames;

CREATE TABLE soporte (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    razon VARCHAR(255) NOT NULL,
    mensaje TEXT NOT NULL
);

CREATE TABLE fractalgames.usuarios (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(255) NOT NULL,
  apellido VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL UNIQUE,
  password VARCHAR(255) NOT NULL,
  activo BOOLEAN
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4;


CREATE TABLE fractalgames.rol (
  id_rol BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(20),
  id_usuario BIGINT,
  FOREIGN KEY (id_usuario) REFERENCES fractalgames.usuarios(id)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4;

CREATE TABLE fractalgames.registro(
idRegistro INT auto_increment PRIMARY KEY,
FOREIGN KEY (usuario_id) REFERENCES usuarios(id),
PRIMARY KEY (idRegistro)
);

CREATE TABLE fractalgames.giftcards(
	idGiftcards INT NOT NULL AUTO_INCREMENT,
	descripcion VARCHAR(255) NOT NULL,
    precio double,
	existencias int,
    rutaImagen VARCHAR(200),
    activo BOOL,
    PRIMARY KEY (idGiftcards)
)ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4;

CREATE TABLE fractalgames.juegos(
	idJuegos INT NOT NULL AUTO_INCREMENT,
	nombreJ VARCHAR(255) NOT NULL,
    descripcion VARCHAR(255) NOT NULL,
    precio double,
	existencias int,
    rutaImagen VARCHAR(200),
    activo BOOL,
    PRIMARY KEY (idJuegos)
)ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4;

CREATE TABLE fractalgames.ofertas(
idOfertas INT NOT NULL auto_increment,
descuento double,
precioNuevo double,
FOREIGN KEY (idGiftcards) REFERENCES giftcards(idGiftcards),
FOREIGN KEY (idJuegos) REFERENCES juegos(idJuegos),
primary key (idOfertas)
)ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4;




INSERT INTO fractalgames.rol (nombre, id_usuario) VALUES ('ADMIN',1), ('USER',2);




