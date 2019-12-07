INSERT INTO sys_user (id, login_name, password, salt, nick_name, user_status, create_time) VALUES (1, 'admin', '773f00fb76091f51daecd83f0b667623d21a195b3d8d9150d2a65901d6b61712', 'Y2ZlOTRhN2E1NmI0NDNlZTE3YzBkMmIzZjI5ZGFkMWM=', '管理员', 1, '2019-10-31 06:46:10');

INSERT INTO sys_role (id, role_name) VALUES (1, 'admin');
INSERT INTO sys_role (id, role_name) VALUES (2, 'first');
INSERT INTO sys_role (id, role_name) VALUES (3, 'second');

INSERT INTO cost.sys_permission (id, name, url, method, `desc`) VALUES (1, 'C', null, 'first:create', null);
INSERT INTO cost.sys_permission (id, name, url, method, `desc`) VALUES (2, 'R', null, 'first:read', null);
INSERT INTO cost.sys_permission (id, name, url, method, `desc`) VALUES (3, 'U', null, 'first:update', null);
INSERT INTO cost.sys_permission (id, name, url, method, `desc`) VALUES (4, 'D', null, 'first:delete', null);

INSERT INTO sys_user_role (id, user_id, role_id) VALUES (1, 1, 1);
INSERT INTO sys_user_role (id, user_id, role_id) VALUES (2, 1, 2);
INSERT INTO sys_user_role (id, user_id, role_id) VALUES (3, 1, 3);

INSERT INTO sys_role_permission (id, role_id, permission_id) VALUES (1, 2, 1);
INSERT INTO sys_role_permission (id, role_id, permission_id) VALUES (2, 2, 2);
INSERT INTO sys_role_permission (id, role_id, permission_id) VALUES (3, 2, 3);
INSERT INTO sys_role_permission (id, role_id, permission_id) VALUES (4, 2, 4);
