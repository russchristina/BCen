insert into responsibility values(1, 'Associate Consuite', 'Works together with Chief Consuite to plan our event rations and prepare a food menu for the party.', 2), (2, 'Chief Consuite', 'Takes charge of preparing the food based on the Associate''s menu!', 2), (3, 'Driver', 'Drives people everywhere lolz', 2), (5, 'Panelist', 'Prepares some of dat good ol'' party fun!', 7), (6, 'DJ', 'Who got da jams? Provides the bops.', 2), (7, 'Vendor', 'Yes, money is to be made! Sells swag to party goers.', 7), (8, 'Costume Repair', 'Nurse Joy for cosplay, not Pokemon. Mends threads!', 1), (9, 'Program Coordinator', 'Someone who creates and manages scheduling.', 3), (10, 'Medic', 'Actual Nurse Joy... maybe of a Pokemon, but mostly people. Gives first aid to party goers.', 2);

insert into bcen_user values(1, null, true, null, null, null, null, 'Chewbacca', 'Baka', false, null, 'pass', null, null, null, null), (2, null, true, null, null, null, null, 'Louis', 'Vuitton', false, null, 'money', null, null, null, null), (3, null, true, null, null, null, null, 'Batman', 'Bats', false, null, 'imrich', null, null, null, null);

insert into public."event" values(1, 'kpop', 'kpop dancing', 3, 1), (2, 'anime', 'voice acting competition', 5, 2), (3, 'pop culture', 'reenact that scene', 2, 3);

insert into user_responsibility values(3, 1), (3, 2), (1, 1), (5, 1);

commit;