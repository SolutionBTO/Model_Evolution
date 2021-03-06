--CRIA��O DE SEQUENCE E TRIGGER
--http://www.oracle.com/technetwork/pt/articles/database-performance/abordando-o-uso-sequencias-oracle-495861-ptb.html

DROP TABLE ORDEM_SERVICO CASCADE CONSTRAINTS;	
	
CREATE TABLE ORDEM_SERVICO(
	OS_CODIGO NUMBER(15),
	CONSTRAINTS OS_CODIGO_PK PRIMARY KEY(OS_CODIGO),
	OS_SOLICITANTE VARCHAR2(50) NOT NULL,
    OS_SETOR  VARCHAR2(30)  NOT NULL,
    OS_CONTATO VARCHAR2(15) NOT NULL,
    OS_EQUIPAMENTO VARCHAR2(30),
    OS_SERIAL VARCHAR2(20),
    OS_MODELO VARCHAR2(30),
    OS_DESCRICAO VARCHAR2(150) NOT NULL,
    OS_OBSERVACAO VARCHAR2(150),
    OS_DATA_HORA  TIMESTAMP  NOT NULL,
	OS_DT_HR_VISITA  TIMESTAMP,
	OS_STATUS VARCHAR2(10)  NOT NULL
);

CREATE OR REPLACE SEQUENCE SEQ_ORDEM_SERVICO
    MINVALUE 1
    MAXVALUE 1000
    START WITH 1
    INCREMENT BY 1
    CACHE 20;
	
CREATE OR REPLACE TRIGGER GERA_OS_CODIGO
    BEFORE INSERT ON ORDEM_SERVICO FOR EACH ROW
BEGIN
     SELECT SEQ_ORDEM_SERVICO.NEXTVAL INTO :NEW.OS_CODIGO FROM DUAL;
END;	

COMMIT;
	
	