-- TABLE dogs
--ID INTEGER NOT NULL PRIMARY KEY,
--NAME VARCHAR(50) NOT NULL
--
--TABLE cats
--ID INTEGER NOT NULL PRIMARY KEY,
--NAME VARCHAR(50) NOT NULL


WITH
   DOGS
   AS
      (SELECT 1 id, 'Scoobe' nome FROM DUAL
       UNION
       SELECT 2, 'Rex' FROM DUAL
       UNION
       SELECT 3, 'Mel' FROM DUAL
       UNION
       SELECT 4, 'Lulu' FROM DUAL
       UNION
       SELECT 5, 'Boris' FROM DUAL
       UNION
       SELECT 6, 'Cao' FROM DUAL),
   CATS
   AS
      (SELECT 1 id, 'Mimi' nome FROM DUAL
       UNION
       SELECT 2, 'Lulu' FROM DUAL
       UNION
       SELECT 3, 'Mel' FROM DUAL)
SELECT DISTINCT t.nome
  FROM (SELECT * FROM dogs
        UNION
        SELECT * FROM cats) t