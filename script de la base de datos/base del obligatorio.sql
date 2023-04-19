create database if not exists Obligatorio;

use Obligatorio;

Create table if not exists cliente (
	Cedula int not Null,
    Nombre varchar (40) not null,
    Apellido varchar (40) not null,
    Direccion varchar (40) not null,
    Telefono int not null,
    Mail varchar (40) not null,
    primary key(Cedula)
    );
    
Create table if not exists Trayecto (
    Id Integer(11)  auto_increment,
    Origen varchar (40) not null,
    HoraSalida varchar (40) not null,
    Destino varchar (40) not null,
    HoraDestino varchar (40) not null,
    Capacidad int,
    Precio int,
    primary key(Id)
    );
    
Create table if not exists Reservas (
    Id_reservas Integer(11) auto_increment,
    Clientecedula int not null,
    Fecha varchar(40),
    CantidadPasajes int not null,
	IdTrayectos int not null ,
    pago  bit(1) not null,
    primary key(Id_reservas) ,
	FOREIGN KEY (Clientecedula) REFERENCES cliente(Cedula),
	FOREIGN KEY (IdTrayectos) REFERENCES trayecto(Id)
    );    
    

    
    
INSERT INTO cliente Values (1,'pepe','Gomez','Yi 1520',0999999,'Algo@algo.com');
INSERT INTO cliente Values (2,'Carlos','Perez','Rodo 1110',0888888,'Cualquiera@algo.com');
INSERT INTO cliente Values (3,'Martin','Rodriguez','18 de Julio 2020',0777777,'Nose@algo.com');

INSERT INTO Trayecto values (default,'Montevideo','9:00','Destino','10:00',20,100);
INSERT INTO Trayecto values (default,'Montevideo','9:00','Destino','10:00',10,50);



INSERT INTO Reservas values (default,2,'23/12/2017',2,1,1);
INSERT INTO Reservas values (default,2,'23/12/2017',2,1,1);
INSERT INTO Reservas values (default,2,'22/12/2017',2,1,1);
INSERT INTO Reservas values (default,2,'13/12/2017',2,1,0);
INSERT INTO Reservas values (default,2,'15/12/2017',2,1,0);
INSERT INTO Reservas values (default,1,'24/12/2017',2,1,0);
INSERT INTO Reservas values (default,1,'24/12/2017',2,1,0);
