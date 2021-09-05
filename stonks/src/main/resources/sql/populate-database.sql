INSERT INTO MUNICIPIOS (ID_MUNICIPIO, NOME_MUNICIPIO, URL_PORTAL) VALUES (MUNICIPIOS_SEQ.NEXTVAL, 'Itapevi', 'www.portalItapevi.com.br');
INSERT INTO MUNICIPIOS (ID_MUNICIPIO, NOME_MUNICIPIO, URL_PORTAL) VALUES (MUNICIPIOS_SEQ.NEXTVAL, 'Osasco', 'www.osascoCity.com.br');
INSERT INTO MUNICIPIOS (ID_MUNICIPIO, NOME_MUNICIPIO, URL_PORTAL) VALUES (MUNICIPIOS_SEQ.NEXTVAL, 'São Matheus', 'www.sanMathew.com.br');
INSERT INTO MUNICIPIOS (ID_MUNICIPIO, NOME_MUNICIPIO, URL_PORTAL) VALUES (MUNICIPIOS_SEQ.NEXTVAL, 'Guarulhos', 'www.gruPortal.com.br');
INSERT INTO MUNICIPIOS (ID_MUNICIPIO, NOME_MUNICIPIO, URL_PORTAL) VALUES (MUNICIPIOS_SEQ.NEXTVAL, 'São Bernardo do Campo', 'www.saoBernardoPortal.com.br');
INSERT INTO MUNICIPIOS (ID_MUNICIPIO, NOME_MUNICIPIO, URL_PORTAL) VALUES (MUNICIPIOS_SEQ.NEXTVAL, 'Santo André', 'www.santoAndrePortal.com.br');
INSERT INTO MUNICIPIOS (ID_MUNICIPIO, NOME_MUNICIPIO, URL_PORTAL) VALUES (MUNICIPIOS_SEQ.NEXTVAL, 'Ribeirão Preto', 'www.ribeirãoPortal.com.br');
INSERT INTO MUNICIPIOS (ID_MUNICIPIO, NOME_MUNICIPIO, URL_PORTAL) VALUES (MUNICIPIOS_SEQ.NEXTVAL, 'Campinas', 'www.campinasPortal.com.br');

INSERT INTO FUNCIONARIOS (ID_FUNCIONARIO, NOME_FUNCIONARIO, CARGO, CPF, DT_NASCIMENTO, CEP) VALUES (FUNCIONARIO_SEQ.NEXTVAL, 'Laura Antonella Milena da Mata', 'Gerente de Financeiro', '085.914.290-60', '23/08/1948', '74535-410');
INSERT INTO FUNCIONARIOS (ID_FUNCIONARIO, NOME_FUNCIONARIO, CARGO, CPF, DT_NASCIMENTO, CEP) VALUES (FUNCIONARIO_SEQ.NEXTVAL, 'Edson Igor Nathan Moreira', 'Analista de dados Sr', '099.942.784-95', '27/03/1980', '79002-204');
INSERT INTO FUNCIONARIOS (ID_FUNCIONARIO, NOME_FUNCIONARIO, CARGO, CPF, DT_NASCIMENTO, CEP) VALUES (FUNCIONARIO_SEQ.NEXTVAL, 'Natália Sophia Isabela Gonçalves', 'Analista de dados Jr', '483.358.401-80', '24/07/1997', '72978-970');
INSERT INTO FUNCIONARIOS (ID_FUNCIONARIO, NOME_FUNCIONARIO, CARGO, CPF, DT_NASCIMENTO, CEP) VALUES (FUNCIONARIO_SEQ.NEXTVAL, 'Renato Enzo Carlos Eduardo Carvalho', 'Gerente de E-commerce', '678.012.344-72', '19/10/1995', '81315-720');
INSERT INTO FUNCIONARIOS (ID_FUNCIONARIO, NOME_FUNCIONARIO, CARGO, CPF, DT_NASCIMENTO, CEP) VALUES (FUNCIONARIO_SEQ.NEXTVAL, 'Vanessa Natália da Cunha', 'Estagio de Desenvolvedora Backend', '087.954.462-73', '17/04/2002', '69945-970');
INSERT INTO FUNCIONARIOS (ID_FUNCIONARIO, NOME_FUNCIONARIO, CARGO, CPF, DT_NASCIMENTO, CEP) VALUES (FUNCIONARIO_SEQ.NEXTVAL, 'Rafael Márcio Alexandre Ramos', 'Desenvolvedor Backend Sr', '757.890.100-16', '03/02/1983', '93880-970');

INSERT INTO USUARIOS (ID_USUARIO, EMAIL, NOME, TELEFONE, SENHA, ID_MUNICIPIO, ID_FUNCIONARIO) VALUES (USUARIO_SEQ.NEXTVAL, 'email@gmail.com', '13421', '119863176789', 'senha123', 2, 3);
INSERT INTO USUARIOS (ID_USUARIO, EMAIL, NOME, TELEFONE, SENHA, ID_MUNICIPIO, ID_FUNCIONARIO) VALUES (USUARIO_SEQ.NEXTVAL, 'email@outlook.com', '53413', '11914356789', 'senha123', 4, 3);
INSERT INTO USUARIOS (ID_USUARIO, EMAIL, NOME, TELEFONE, SENHA, ID_MUNICIPIO, ID_FUNCIONARIO) VALUES (USUARIO_SEQ.NEXTVAL, 'email@hotmail.com', '96542', '1198546789', 'senha123', 3, 2);
INSERT INTO USUARIOS (ID_USUARIO, EMAIL, NOME, TELEFONE, SENHA, ID_MUNICIPIO, ID_FUNCIONARIO) VALUES (USUARIO_SEQ.NEXTVAL, 'email@ig.com', '42167', '11923456789', 'senha123', 2, 3);

INSERT INTO ARQUIVOS (ID_ARQUIVO, NOME_ARQUIVO,ID_MUNICIPIO) VALUES (ARQUIVO_SEQ.NEXTVAL, 'Relatorio semanal Osasco', 2);
INSERT INTO ARQUIVOS (ID_ARQUIVO, NOME_ARQUIVO,ID_MUNICIPIO) VALUES (ARQUIVO_SEQ.NEXTVAL, 'Relatorio semanal Sao Mateus', 3);
INSERT INTO ARQUIVOS (ID_ARQUIVO, NOME_ARQUIVO,ID_MUNICIPIO) VALUES (ARQUIVO_SEQ.NEXTVAL, 'Relatorio semanal Itapevi', 1);
INSERT INTO ARQUIVOS (ID_ARQUIVO, NOME_ARQUIVO,ID_MUNICIPIO) VALUES (ARQUIVO_SEQ.NEXTVAL, 'Relatorio semanal Guarulhos', 4);
INSERT INTO ARQUIVOS (ID_ARQUIVO, NOME_ARQUIVO,ID_MUNICIPIO) VALUES (ARQUIVO_SEQ.NEXTVAL, 'Relatorio semanal São Bernardo do Campo', 5);
INSERT INTO ARQUIVOS (ID_ARQUIVO, NOME_ARQUIVO,ID_MUNICIPIO) VALUES (ARQUIVO_SEQ.NEXTVAL, 'Relatorio semanal Santo André', 6);
INSERT INTO ARQUIVOS (ID_ARQUIVO, NOME_ARQUIVO,ID_MUNICIPIO) VALUES (ARQUIVO_SEQ.NEXTVAL, 'Relatorio semanal Ribeirão Preto', 7);
