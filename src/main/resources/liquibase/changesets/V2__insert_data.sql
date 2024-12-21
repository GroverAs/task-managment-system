insert into users (name, username, password)
values ('Will Smith', 'w.smith@gmail.com', '$2y$10$uoYpCO8dvsn4G6TqFhbeu.rD4rAxP.caQqx6tR/u9hXrAkMMCq5IK'),
       ('CrazyGnom', 'cheeeze@yandex.ru', '$2y$10$tZEg.E7zI3Tsmwb69QKLTuHeqY3K4SdEohS1TGKr7vb06Pw/YCiPS');

insert into tasks (title, description, status, expiration_date)
values ('Make laundry', null, 'TODO', '2024-11-30 12:00:00'),
       ('Go to Mike', 'Clean the car', 'IN_PROGRESS', '2024-11-28 10:30:00'),
       ('Receive parcel ', null, 'DONE', null),
       ('Call Sasha', 'Ask about meeting', 'TODO', '2024-12-01 14:00:00');

insert into users_tasks (task_id, user_id)
values (1, 2),
       (2, 2),
       (3, 2),
       (4, 1);

insert into users_roles (user_id, role)
values (1, 'ROLE_ADMIN'),
       (1, 'ROLE_USER'),
       (2, 'ROLE_USER');