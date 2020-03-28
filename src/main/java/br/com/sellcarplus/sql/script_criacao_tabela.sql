create database rentplus;
use rentplus;
 
create table T_cliente (
id              int AUTO_INCREMENT PRIMARY KEY,
nome            VARCHAR(50),
cpf             VARCHAR(15),
dataNascimento  DATE
);

create table T_venda (
id                  int AUTO_INCREMENT PRIMARY KEY,
clienteid           int not null,
dataRetirada        datetime,
valorTotal          double,
porcentagemDesconto double,
FOREIGN KEY (clienteid) REFERENCES cliente(id)
);

create table T_veiculo (
id              int AUTO_INCREMENT PRIMARY KEY,
vendaid         int,
ano             int,
nome            VARCHAR(100),
cor             VARCHAR(50),
potencia        int,
preco           double,
marca           VARCHAR(50),
vendido         boolean,
FOREIGN KEY (vendaid) REFERENCES venda(id)
);

create table T_carro(
id          int PRIMARY KEY,
modelo      varchar(50),
qtdAssento  int,
qtdPorta    int,
FOREIGN KEY (id) REFERENCES veiculo(id) ON DELETE CASCADE
);

create table T_moto(
id          int PRIMARY KEY,
cilindradas int,
FOREIGN KEY (id) REFERENCES veiculo(id) ON DELETE CASCADE
);

create table T_caminhao(
id              int PRIMARY KEY,
tara            double,
lotacao         double,
pesoBrutoTotal  double,
FOREIGN KEY (id) REFERENCES veiculo(id) ON DELETE CASCADE
);

 