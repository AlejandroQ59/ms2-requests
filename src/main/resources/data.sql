INSERT INTO user (id, name, age, phone, city, email, password)
VALUES ('11111111-1111-1111-1111-111111111111','Jane Doe',25,'+51-999-888-777','Lima','jane@example.com','secret');

INSERT INTO request (id, user_id, pet_id, request_date, status, status_date, message)
VALUES ('22222222-2222-2222-2222-222222222222','11111111-1111-1111-1111-111111111111',
        '33333333-3333-3333-3333-333333333333', NOW(), 'pending', NULL, 'Your request is being processed.');
