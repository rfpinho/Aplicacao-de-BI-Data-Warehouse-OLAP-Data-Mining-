/*==============================================================*/
/* DBMS name:      PostgreSQL 8                                 */
/* Created on:     02/04/2017 19:17:41                          */
/*==============================================================*/


drop index AEROPORTO_PK;

drop table AEROPORTO;

drop index COMPANHIAAEREA_PK;

drop table COMPANHIAAEREA;

drop index RELACAO_3_FK;

drop index RELACAO_1_FK;

drop index RELACAO_2_FK;

drop table FACTOS;

drop index RELACAO_5_FK;

drop index RELACAO_4_FK;

drop table FACTOSCOMPANHIAAEREA;

drop index TEMPO_PK;

drop table TEMPO;

/*==============================================================*/
/* Table: AEROPORTO                                             */
/*==============================================================*/
create table AEROPORTO (
   IDAEROPORTO          SERIAL               not null,
   CODIGO               VARCHAR(10)          not null,
   NOME                 VARCHAR(100)         not null,
   CIDADE               VARCHAR(100)         not null,
   ESTADO               VARCHAR(100)         not null,
   constraint PK_AEROPORTO primary key (IDAEROPORTO)
);

/*==============================================================*/
/* Index: AEROPORTO_PK                                          */
/*==============================================================*/
create unique index AEROPORTO_PK on AEROPORTO (
IDAEROPORTO
);

/*==============================================================*/
/* Table: COMPANHIAAEREA                                        */
/*==============================================================*/
create table COMPANHIAAEREA (
   IDCOMPANHIA          SERIAL               not null,
   CODIGO               VARCHAR(10)          not null,
   NOME                 VARCHAR(100)         not null,
   HUB                  VARCHAR(100)         not null,
   NAVIOES              DECIMAL(4)           not null,
   constraint PK_COMPANHIAAEREA primary key (IDCOMPANHIA)
);

/*==============================================================*/
/* Index: COMPANHIAAEREA_PK                                     */
/*==============================================================*/
create unique index COMPANHIAAEREA_PK on COMPANHIAAEREA (
IDCOMPANHIA
);

/*==============================================================*/
/* Table: FACTOS                                                */
/*==============================================================*/
create table FACTOS (
   IDCOMPANHIA          INT4                 not null,
   IDTEMPO              INT4                 not null,
   IDAEROPORTO          INT4                 not null,
   NPARTIDAS            DECIMAL(10)          not null,
   NCHEGADAS            DECIMAL(10)          not null,
   NVOOSCANCELADOS      DECIMAL(10)          not null,
   NVOOSDESVIADOS       DECIMAL(10)          not null,
   NVOOSATRASADOSP      DECIMAL(10)          not null,
   SOMATEMPOATRASOP     DECIMAL(10)          not null,
   NVOOSATRASADOSC      DECIMAL(10)          not null,
   SOMATEMPOATRASOC     DECIMAL(10)          not null,
   SOMATAXIOUT          DECIMAL(10)          not null,
   SOMATAXIIN           DECIMAL(10)          not null,
   ATRASOSISTEMAAEREO   DECIMAL(10)          not null,
   ATRASOSEGURANCA      DECIMAL(10)          not null,
   ATRASOCOMPANHIAAEREA DECIMAL(10)          not null,
   ATRASOVERIFICACOESTECNICAS DECIMAL(10)          not null,
   ATRASOCONDICOESMETEROLOGICAS DECIMAL(10)          not null
);

/*==============================================================*/
/* Index: RELACAO_2_FK                                          */
/*==============================================================*/
create  index RELACAO_2_FK on FACTOS (
IDTEMPO
);

/*==============================================================*/
/* Index: RELACAO_1_FK                                          */
/*==============================================================*/
create  index RELACAO_1_FK on FACTOS (
IDCOMPANHIA
);

/*==============================================================*/
/* Index: RELACAO_3_FK                                          */
/*==============================================================*/
create  index RELACAO_3_FK on FACTOS (
IDAEROPORTO
);

/*==============================================================*/
/* Table: FACTOSCOMPANHIAAEREA                                  */
/*==============================================================*/
create table FACTOSCOMPANHIAAEREA (
   IDCOMPANHIA          INT4                 not null,
   IDTEMPO              INT4                 not null,
   SOMATEMPOVOO         DECIMAL(10)          not null,
   SOMADISTANCIAPERCORRIDA DECIMAL(10)          not null,
   NPASSAGEIROS         DECIMAL(10)          not null,
   LUCROLIQUIDO         DECIMAL(10)          not null
);

/*==============================================================*/
/* Index: RELACAO_4_FK                                          */
/*==============================================================*/
create  index RELACAO_4_FK on FACTOSCOMPANHIAAEREA (
IDCOMPANHIA
);

/*==============================================================*/
/* Index: RELACAO_5_FK                                          */
/*==============================================================*/
create  index RELACAO_5_FK on FACTOSCOMPANHIAAEREA (
IDTEMPO
);

/*==============================================================*/
/* Table: TEMPO                                                 */
/*==============================================================*/
create table TEMPO (
   IDTEMPO              SERIAL               not null,
   ANO                  DECIMAL(4)           not null,
   TRIMESTRE            DECIMAL(4)           not null,
   MES                  DECIMAL(4)           not null,
   DIA                  DECIMAL(4)           not null,
   DIASEMANA            DECIMAL(4)           not null,
   constraint PK_TEMPO primary key (IDTEMPO)
);

/*==============================================================*/
/* Index: TEMPO_PK                                              */
/*==============================================================*/
create unique index TEMPO_PK on TEMPO (
IDTEMPO
);

alter table FACTOS
   add constraint FK_FACTOS_RELACAO_1_COMPANHI foreign key (IDCOMPANHIA)
      references COMPANHIAAEREA (IDCOMPANHIA)
      on delete restrict on update restrict;

alter table FACTOS
   add constraint FK_FACTOS_RELACAO_2_TEMPO foreign key (IDTEMPO)
      references TEMPO (IDTEMPO)
      on delete restrict on update restrict;

alter table FACTOS
   add constraint FK_FACTOS_RELACAO_3_AEROPORT foreign key (IDAEROPORTO)
      references AEROPORTO (IDAEROPORTO)
      on delete restrict on update restrict;

alter table FACTOSCOMPANHIAAEREA
   add constraint FK_FACTOSCO_RELACAO_4_COMPANHI foreign key (IDCOMPANHIA)
      references COMPANHIAAEREA (IDCOMPANHIA)
      on delete restrict on update restrict;

alter table FACTOSCOMPANHIAAEREA
   add constraint FK_FACTOSCO_RELACAO_5_TEMPO foreign key (IDTEMPO)
      references TEMPO (IDTEMPO)
      on delete restrict on update restrict;

