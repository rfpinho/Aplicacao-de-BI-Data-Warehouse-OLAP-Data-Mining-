/* Criar os índices */
CREATE INDEX index_1 ON factos (idCompanhia);
CREATE INDEX index_2 ON factos (idAeroporto);
CREATE INDEX index_3 ON factos (idTempo);
CREATE INDEX index_4 ON factosCompanhiaAerea (idCompanhia);
CREATE INDEX index_5 ON factosCompanhiaAerea (idTempo);

/* Eliminar os índices */
DROP INDEX index_1;
DROP INDEX index_2;
DROP INDEX index_3;
DROP INDEX index_4;
DROP INDEX index_5;

/* Mostrar os índices */
SELECT * FROM pg_indexes WHERE tablename = 'factos';
SELECT * FROM pg_indexes WHERE tablename = 'factoscompanhiaaerea';


/* Criar vistas materializadas */
CREATE MATERIALIZED VIEW tabela1 AS
select t.idTempo as idTempo, ca.nome as nome, sum(f.nPartidas) as nPartidas, sum(f.nChegadas) as nChegadas, sum(f.nVoosCancelados) as nVoosCancelados, sum(f.nVoosDesviados) as nVoosDesviados, 
	sum(f.nVoosAtrasadosP) as nVoosAtrasadosP, sum(f.somaTempoAtrasoP) as somaTempoAtrasoP, sum(f.nVoosAtrasadosC) as nVoosAtrasadosC, sum(f.somaTempoAtrasoC) as somaTempoAtrasoC,
	sum(atrasoSistemaAereo) as atrasoSistemaAereo, sum(atrasoCompanhiaAerea) as atrasoCompanhiaAerea, sum(atrasoVerificacoesTecnicas) as atrasoVerificacoesTecnicas, sum(atrasoCondicoesMeterologicas) as atrasoCondicoesMeterologicas
from factos f, companhiaAerea ca, tempo t
where f.idCompanhia = ca.idCompanhia and f.idTempo = t.idTempo
group by t.idTempo, ca.nome;

CREATE MATERIALIZED VIEW tabela2 AS
select t.idTempo as idTempo, a.nome as nome, sum(f.nPartidas) as nPartidas, sum(f.nChegadas) as nChegadas, sum(f.nVoosCancelados) as nVoosCancelados, 
	sum(f.nVoosDesviados) as nVoosDesviados, sum(f.somaTaxiOut) as somaTaxiOut, sum(f.somaTaxiIn) as somaTaxiIn
from factos f, aeroporto a, tempo t
where f.idAeroporto = a.idAeroporto and f.idTempo = t.idTempo
group by t.idTempo, a.nome;

/* Atualizar as vistas materializadas */
REFRESH MATERIALIZED VIEW tabela1;
REFRESH MATERIALIZED VIEW tabela2;

/* Indexar as vistas materializadas */
CREATE INDEX index_6 ON tabela1 (idTempo);
CREATE INDEX index_7 ON tabela2 (idTempo);
DROP INDEX index_6;
DROP INDEX index_7;


/* Verificar o tamanho da base de dados e de uma tabela */
SELECT pg_size_pretty(pg_database_size('database'));
SELECT pg_size_pretty(pg_total_relation_size('table'));

/* SQL */
select count(*) from companhiaaerea;
select count(*) from aeroporto;
select count(*) from tempo;
select count(*) from factos;
select count(*) from factoscompanhiaaerea;
select count(*) from tabela1;
select count(*) from tabela2;