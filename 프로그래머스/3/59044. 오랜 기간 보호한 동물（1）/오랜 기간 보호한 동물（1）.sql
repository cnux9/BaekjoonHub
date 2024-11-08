SELECT animal_ins.name, animal_ins.datetime
FROM animal_ins LEFT JOIN animal_outs ON animal_ins.animal_id = animal_outs.animal_id
WHERE sex_upon_outcome IS NULL
ORDER BY 2 ASC
LIMIT 3;