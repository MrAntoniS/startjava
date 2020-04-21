-- Database: jaegers

-- DROP DATABASE jaegers;

-- вывод всей таблицы;
SELECT * FROM jaegers;

-- отобразить только не уничтоженных роботов;
SELECT * FROM jaegers WHERE status != 'destroyed';

-- отобразить роботов серий Mark-1 и Mark-6;
SELECT * FROM jaegers WHERE mark IN ('Mark-1', 'Mark-6');

-- сортировака по убыванию по столбцу mark;
SELECT * FROM jaegers ORDER BY mark DESC;

-- отобразить самого старого робота;
SELECT * FROM jaegers WHERE launch = (SELECT MIN(launch) FROM jaegers);

-- отобразить роботов, которые уничтожили больше/меньше всех kaiju;
SELECT * FROM jaegers WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM jaegers);
SELECT * FROM jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM jaegers);

--отобразить средний вес роботов;
SELECT AVG(weight) FROM jaegers;

-- увеличение на единицу количества уничтоженных kaiju у роботов, которые до сих пор не разрушены;
UPDATE jaegers SET kaijuKill = kaijuKill + 1 WHERE status != 'destroyed';

-- удаление уничтоженных роботов
DELETE FROM jaegers WHERE status = 'destroyed';