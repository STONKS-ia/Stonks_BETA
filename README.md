# MicroserviceAM

Nesse projeto focamos em criar a tela de administracao do nosso challenge, onde é possivél criar usuarios e municipios. 

Para fazer o banco de dados funcionar, executar o script abaixo no SQL:

'''CREATE TABLE MUNICIPIOS (
    ID_MUNICIPIO     NUMBER(38) NOT NULL PRIMARY KEY,
    NOME_MUNICIPIO  VARCHAR2(100) NOT NULL,
    URL_PORTAL      VARCHAR2(100) NOT NULL
);

CREATE SEQUENCE MUNICIPIOS_SEQ START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER TR_INSERT_ID_MUNICIPIO
                  BEFORE INSERT ON MUNICIPIOS FOR EACH ROW       
BEGIN
 
SELECT MUNICIPIOS_SEQ.NEXTVAL
INTO :new.ID_MUNICIPIO
FROM DUAL;
END;
/

INSERT INTO MUNICIPIOS(NOME_MUNICIPIO, URL_PORTAL) VALUES ('BORA', 'www.com');

commit;

SELECT * FROM MUNICIPIOS;


CREATE TABLE USUARIOS (
    ID_USUARIO     NUMBER(38) NOT NULL PRIMARY KEY,
    EMAIL      VARCHAR2(100) NOT NULL,
    TELEFONE VARCHAR2(100) NOT NULL,
    SENHA VARCHAR2(50) NOT NULL,
    ID_MUNICIPIO NUMBER(38)
);


ALTER TABLE USUARIOS ADD CONSTRAINT FK_ID_MUNICIPIO FOREIGN KEY (ID_MUNICIPIO) REFERENCES MUNICIPIOS(ID_MUNICIPIO); 

CREATE SEQUENCE USUARIO_SEQ START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER TR_INSERT_ID_USUARIO
                  BEFORE INSERT ON USUARIOS FOR EACH ROW       
BEGIN
 
SELECT USUARIO_SEQ.NEXTVAL
INTO :new.ID_USUARIO
FROM DUAL;
END;
/

INSERT INTO USUARIOS(EMAIL, TELEFONE, SENHA, ID_MUNICIPIO) VALUES ('email@email.com', '32341', 'wwwcom', 1);

commit;

SELECT * FROM USUARIOS;'''

