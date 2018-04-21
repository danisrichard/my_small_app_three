
CREATE SEQUENCE election_seq START WITH 1;

--ELECTION TABLE INSERTS
INSERT INTO ELECTION_TABLE VALUES(election_seq.NEXTVAL,'Dáma','Maecenas in dolor feugiat, hendrerit orci eget, pharetra nulla. Maecenas ut dui non neque dapibus lacinia ac id purus.',3);
INSERT INTO ELECTION_TABLE VALUES(election_seq.NEXTVAL,'NFS','Sed posuere faucibus diam, ac finibus quam lacinia et. Suspendisse bibendum et elit sit amet ornare.',4);
INSERT INTO ELECTION_TABLE VALUES(election_seq.NEXTVAL,'Counter-Strike','Nulla placerat augue libero, sit amet accumsan elit pharetra non. Sed egestas tincidunt nisl in rhoncus.',4);
INSERT INTO ELECTION_TABLE VALUES(election_seq.NEXTVAL,'Yugioh','Donec congue lorem nisl, in accumsan libero bibendum et. Proin ut mauris quis est lobortis feugiat.',5);
INSERT INTO ELECTION_TABLE VALUES(election_seq.NEXTVAL,'Pokemon','Maecenas ac leo porttitor ipsum placerat elementum. ',6);
INSERT INTO ELECTION_TABLE VALUES(election_seq.NEXTVAL,'PUBG','Maecenas tincidunt fermentum leo in ornare.',8);

CREATE SEQUENCE user_seq START WITH 1;

INSERT INTO MICRO_GAME_USER VALUES(user_seq.NEXTVAL,'Pelda',SYSDATE);

COMMIT;

INSERT INTO MICRO_GAME_USER VALUES(user_seq.NEXTVAL,'PeldaEllenfele',SYSDATE);

COMMIT;

INSERT INTO MICRO_GAME_USER VALUES(user_seq.NEXTVAL,'Boss',SYSDATE);

commit;

INSERT INTO LATEST_RESULT_TABLE(user_id,user_score,update_time) values (22,'2 - 3',SYSDATE);

commit;

CREATE SEQUENCE shop_item_seq START WITH 1;

INSERT INTO SHOP_ITEMS(item_id,item_name,item_desc,item_value,ITEM_QUANTITY) values(shop_item_seq.NEXTVAL,'Sapka','Maecenas tincidunt fermentum leo in ornare.',3321,4);

commit;

INSERT INTO SHOP_ITEMS(item_id,item_name,item_desc,item_value,ITEM_QUANTITY) values(shop_item_seq.NEXTVAL,'Macska','Maecenas tincidunt fermentum leo in ornare.',1500,10);

commit;

INSERT INTO SHOP_ITEMS(item_id,item_name,item_desc,item_value,ITEM_QUANTITY) values(shop_item_seq.NEXTVAL,'Ágy','Maecenas tincidunt. ',9990,2);

commit;