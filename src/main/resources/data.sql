INSERT INTO note (id,note_id,note_text) values
(1,'dota-secret','Buy BKB'),
(2,'shoping-list','Buy bread'),
(3,'dota-tip','Do not feed!');

INSERT INTO note_comment(id,text,note_id) values
(1,'Good tip!',1),
(2,'No, buy MKB',1);

INSERT INTO collection(id,name) values
(1,'Dota notes'),
(2,'Shopping notes');

INSERT INTO note_to_collection_mapping (note_id, collection_id) values
(1,1),
(3,1),
(2,2);
