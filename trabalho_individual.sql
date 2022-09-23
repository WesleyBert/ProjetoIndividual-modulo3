/* individual_Lógico_1: */

CREATE TABLE Permissoes (
    id_permissao INTEGER PRIMARY KEY auto_increment,
    login_permissao VARCHAR(20),
    senha_permissao INTEGER
);

CREATE TABLE Usuario (
    id_usuario INTEGER PRIMARY KEY auto_increment,
    nome_usuario VARCHAR(20),
    email_usuario VARCHAR(20),
    senha_usuario REAL,
    endereço_usuario VARCHAR(20)
);

CREATE TABLE Passagens (
    id_compra INTEGER PRIMARY KEY,
    data_compra DATE,
    valor_compra INT
);

CREATE TABLE Hotel (
    id_hotel INTEGER PRIMARY KEY auto_increment,
    dataInicio_hotel DATE,
    dataFim_hotel DATE,
    valor_hotel REAL
);


CREATE TABLE Passeios (
    id_passagens INTEGER PRIMARY KEY auto_increment,
    valor_passeio REAL,
    data_passeio INTEGER
);
 
 CREATE TABLE items_compra (
    id_compra INTEGER PRIMARY KEY auto_increment,
    valor_compra REAL,
    data_compra varchar(20),
    quantidade_compra INT,
    
    FOREIGN KEY(id_usuario)REFERENCES Usuario(id_usuario)
    
);
 
 
ALTER TABLE Permissoes ADD CONSTRAINT FK_Permissoes_2
    FOREIGN KEY (senha_permissao)
    REFERENCES Usuario (id_usuario);
 
ALTER TABLE Passagens ADD CONSTRAINT FK_Passagens_2
    FOREIGN KEY (valor_compra)
    REFERENCES Usuario (id_usuario);
 
ALTER TABLE Passeios ADD CONSTRAINT FK_Passeios_2
    FOREIGN KEY (data_passeio)
    REFERENCES Hotel (id_hotel);