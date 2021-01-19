WITH
   ALUNO
   AS
      (SELECT 1 id, 'Julia' nome, 88 valor, 9 nota FROM DUAL
       UNION
       SELECT 2, 'Carol', 68, 7 FROM DUAL
       UNION
       SELECT 3, 'Maria', 99, 10 FROM DUAL
       UNION
       SELECT 4, 'Andreia', 78, 8 FROM DUAL
       UNION
       SELECT 5, 'Jaqueline', 63, 7 FROM DUAL
       UNION
       SELECT 6, 'Jonas', 63, 6 FROM DUAL
       UNION
       SELECT 7, 'Carlos', 63, 5 FROM DUAL
       UNION
       SELECT 8, 'Marcela', 81, 9 FROM DUAL
       UNION
       SELECT 9, 'Daniel', 81, 9 FROM DUAL
       UNION
       SELECT 10, 'Daniela', 81, 9 FROM DUAL
       UNION
       SELECT 11, 'Daiane', 81, 9 FROM DUAL)
SELECT *
  FROM (  SELECT CASE WHEN nota >= 8 THEN nome ELSE 'NULL' END Nome
               , nota
               , valor
            FROM ALUNO
           WHERE nota >= 8
        ORDER BY nota DESC
               , nome ASC)
UNION ALL
SELECT *
  FROM (  SELECT 'NULL' Nome
               , nota
               , valor
            FROM ALUNO
           WHERE nota < 8
        ORDER BY nota ASC
               , nome ASC)
