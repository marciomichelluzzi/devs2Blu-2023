INSERT INTO Person (name, address, phone, cpf, dateOfBirth, observations, hasActive)
VALUES 
('John Doe', '123 Main St', '+55 1234567890', '12345678901', '1990-01-15', 'Observations for John Doe', true),
('Jane Smith', '456 Oak Ave', '+55 9876543210', '23456789012', '1985-05-20', 'Observations for Jane Smith', true),
('Michael Johnson', '789 Elm Rd', '+55 5555555555', '34567890123', '1998-09-10', 'Observations for Michael Johnson', false),
('Alice Brown', '246 Pine Ln', '+55 2222222222', '65032109876', '1993-12-05', 'Observations for Alice Brown', true),
('Robert White', '987 Cedar St', '+55 3333333333', '98765432109', '1980-08-25', 'Observations for Robert White', false),
('Mary Johnson', '987 Elm St', '+55 4444444444', '87654321098', '1995-11-30', 'Observations for Mary Johnson', true),
('William Davis', '654 Oak St', '+55 5555555555', '76543210987', '1992-03-12', 'Observations for William Davis', false),
('Sophia Lee', '321 Cedar Ave', '+55 6666666666', '65432199876', '1997-07-20', 'Observations for Sophia Lee', true),
('Alexander Wright', '456 Elm Rd', '+55 7777777777', '54321098765', '1989-09-05', 'Observations for Alexander Wright', false),
('Olivia Adams', '789 Pine St', '+55 8888888888', '43210987654', '1991-04-18', 'Observations for Olivia Adams', true),
('James Stewart', '123 Oak Rd', '+55 9999999999', '32109876543', '1996-06-25', 'Observations for James Stewart', false),
('Emma Roberts', '456 Cedar St', '+55 1010101010', '21098765432', '1987-02-09', 'Observations for Emma Roberts', true),
('Benjamin Turner', '987 Elm Ave', '+55 1212121212', '10987654321', '1994-10-27', 'Observations for Benjamin Turner', false),
('Isabella Murphy', '246 Pine Rd', '+55 1313131313', '09876543210', '1984-08-14', 'Observations for Isabella Murphy', true),
('Daniel Cook', '789 Oak St', '+55 1414141414', '91765432109', '1999-12-03', 'Observations for Daniel Cook', false),
('Mia Turner', '123 Elm Ave', '+55 1515151515', '87754321098', '1990-11-07', 'Observations for Mia Turner', true),
('Elijah Lewis', '456 Oak Rd', '+55 1616161616', '76553210987', '1995-03-21', 'Observations for Elijah Lewis', false),
('Ava Roberts', '789 Cedar St', '+55 1717171717', '65432109876', '1992-07-12', 'Observations for Ava Roberts', true),
('Logan Baker', '246 Pine Ave', '+55 1818181818', '54323098765', '1989-09-28', 'Observations for Logan Baker', false),
('Harper Reed', '987 Elm Rd', '+55 1919191919', '43210287654', '1996-01-15', 'Observations for Harper Reed', true),
('Jackson Collins', '123 Cedar St', '+55 2020202020', '32309876543', '1987-05-30', 'Observations for Jackson Collins', false);


INSERT INTO Employee (personId, rg, meritalStatus, schooling, responsability, pis, admissionDate, resignationDate, employeeAviability)
VALUES 
(1,'1234567', 'MARRIED', 'HIGHER', 'MANAGER', 123456789, '2022-01-15', NULL, 'AVAILABLE'),
(2,'9876543', 'SINGLE', 'ELEMENTARY', 'CLEANER', 987654321, '2022-02-20', NULL, 'AVAILABLE'),
(3,'5432109', 'DIVORCED', 'HIGH', 'WAITER', 567890123, '2021-11-10', NULL, 'AVAILABLE'),
(4,'9876113', 'SINGLE', 'HIGHER', 'COOK', 432109876, '2022-03-05', NULL, 'AVAILABLE'),

INSERT INTO Customer (personId, allergies, vip) 
VALUES 
(5, 'Peanuts', true),
(6, 'Lactose', false),
(7, 'Gluten', true),
(8, 'Shellfish', false),
(9, 'Eggs', true),
(10, 'Soy', false),
(11, 'Fish', true),
(12, 'Tree Nuts', false),
(13, 'Wheat', true),
(14, 'Milk', false),
(15, 'Sesame', true),
(16, 'Cocoa', false),
(17, 'Caffeine', true),
(18, 'Citrus Fruits', false),
(19, 'Corn', true);

INSERT INTO "Table" (employeeId, name, code, number, tableStatus) 
VALUES 
(1, 'Table 1', 'TBL001', 101, 'RESERVED'),
(2, 'Table 2', 'TBL002', 102, 'OCCUPIED'),
(3, 'Table 3', 'TBL003', 103, 'AVAILABLE'),
(4, 'Table 4', 'TBL004', 104, 'AVAILABLE'),
(5, 'Table 5', 'TBL005', 105, 'RESERVED'),
(6, 'Table 6', 'TBL006', 106, 'OCCUPIED'),
(7, 'Table 7', 'TBL007', 107, 'AVAILABLE'),
(8, 'Table 8', 'TBL008', 108, 'AVAILABLE'),
(9, 'Table 9', 'TBL009', 109, 'RESERVED'),
(10, 'Table 10', 'TBL010', 110, 'OCCUPIED');

INSERT INTO Product (name, description, code, costPrice, salePrice, preparationTime, comments, productType, hasActive) 
VALUES
('Cheeseburger', 'Juicy beef patty topped with cheese, lettuce, tomato, and pickles.', 'LCH001', 5.75, 10.00, '15 minutes', 'All-time favorite!', 'SNACK', true),
('Chicken Sandwich', 'Grilled chicken breast with lettuce, mayo, and tomato on a bun.', 'LCH002', 4.50, 8.50, '12 minutes', 'Healthy option.', 'SNACK', true),
('French Fries', 'Crispy golden fries seasoned with salt.', 'LAN003', 2.00, 4.00, '8 minutes', 'Perfect side dish.', 'SNACK', true),
('Coca-Cola', 'Classic carbonated soft drink.', 'BEB001', 1.50, 3.00, '1 minute', 'Best served chilled.', 'DRINK', true),
('Orange Juice', 'Freshly squeezed orange juice.', 'BEB002', 2.25, 4.50, '3 minutes', 'Vitamin C boost!', 'DRINK', true),
('Chocolate Cake', 'Moist chocolate cake with rich chocolate frosting.', 'SBR003', 4.75, 9.00, '20 minutes', 'Indulge yourself!', 'DESSERT', true),
('Iced Tea', 'Chilled black tea served with ice.', 'BEB048', 1.75, 3.50, '2 minutes', 'Refreshing choice.', 'DRINK', true),
('Tiramisu', 'Italian dessert made with layers of coffee-soaked ladyfingers and mascarpone cheese.', 'SBR049', 5.50, 10.00, '25 minutes', 'Elegant and delightful.', 'DESSERT', true),
('Hamburger', 'Classic beef patty with lettuce, tomato, onion, and ketchup.', 'LCH004', 4.75, 9.00, '10 minutes', 'All-time favorite!', 'SNACK', true),
('Grilled Cheese Sandwich', 'Toasted bread with melted cheese.', 'LCH005', 3.50, 7.00, '8 minutes', 'Simple and tasty.', 'SNACK', true),
('Onion Rings', 'Crispy deep-fried onion rings.', 'LAN006', 3.25, 6.50, '10 minutes', 'Addictive appetizer.', 'SNACK', true),
('Lemonade', 'Refreshing lemon-flavored drink.', 'BEB003', 2.00, 4.00, '3 minutes', 'Perfect thirst quencher.', 'DRINK', true),
('Iced Coffee', 'Chilled coffee with milk and ice.', 'BEB004', 2.50, 5.00, '2 minutes', 'Great pick-me-up!', 'DRINK', true),
('Cheesecake', 'Creamy cheesecake with a graham cracker crust.', 'SBR005', 4.25, 8.50, '18 minutes', 'A classic dessert.', 'DESSERT', true),
('Milkshake', 'Creamy milkshake in various flavors.', 'BEB046', 3.25, 6.50, '5 minutes', 'Indulgent treat.', 'DRINK', true),
('Apple Pie', 'Homemade apple pie with a flaky crust.', 'SBR047', 4.50, 9.00, '22 minutes', 'Comforting dessert.', 'DESSERT', true),
('Fruit Salad', 'Assorted fresh fruits served in a bowl.', 'SAL048', 3.00, 6.00, '5 minutes', 'Healthy and delicious.', 'SNACK', true);

INSERT INTO "Order" (productId, requestDateTime, startPreparationDateTime, remindingPreparationTime, preparationOrderStatus, comments, quantity)
VALUES 
(1, '2023-07-20 10:00:00', '2023-07-20 10:05:00', '2023-07-20 10:15:00', 'REQUESTED', 'No onions, please.', 2),
(2, '2023-07-20 11:30:00', '2023-07-20 11:35:00', '2023-07-20 11:45:00', 'READY', 'Extra cheese.', 1),
(3, '2023-07-20 12:15:00', '2023-07-20 12:20:00', '2023-07-20 12:30:00', 'PREPARING', 'Add whipped cream.', 3),
(4, '2023-07-20 13:00:00', '2023-07-20 13:05:00', '2023-07-20 13:15:00', 'RELIVERED', 'Extra hot sauce.', 2),
(5, '2023-07-20 14:45:00', '2023-07-20 14:50:00', '2023-07-20 15:00:00', 'REQUESTED', 'No pickles, please.', 1),
(6, '2023-07-20 15:20:00', '2023-07-20 15:25:00', '2023-07-20 15:35:00', 'READY', 'Extra mayo.', 2),
(7, '2023-07-20 16:10:00', '2023-07-20 16:15:00', '2023-07-20 16:25:00', 'PREPARING', 'Add extra syrup.', 1),
(8, '2023-07-20 17:30:00', '2023-07-20 17:35:00', '2023-07-20 17:45:00', 'RELIVERED', 'Extra cheese.', 3),
(9, '2023-07-20 18:15:00', '2023-07-20 18:20:00', '2023-07-20 18:30:00', 'REQUESTED', 'No onions, please.', 2),
(10, '2023-07-20 19:00:00', '2023-07-20 19:05:00', '2023-07-20 19:15:00', 'READY', 'Extra ketchup.', 1),
(11, '2023-07-21 14:45:00', '2023-07-21 14:50:00', '2023-07-21 15:00:00', 'REQUESTED', 'No ice, please.', 1);

INSERT INTO Commanda (tableId, customerId, code, comments, commandaStatus) 
VALUES 
(1, 1, 'CMD001', '', 'OPEN'),
(2, 2, 'CMD002', '', 'OPEN'),
(3, 3, 'CMD003', '', 'OPEN'),
(4, 4, 'CMD004', '', 'CLOSED'),
(5, 5, 'CMD005', '', 'CLOSED'),
(6, 6, 'CMD006', '', 'OPEN'),
(7, 7, 'CMD007', '', 'OPEN'),
(8, 8, 'CMD008', '', 'OPEN'),
(9, 9, 'CMD009', '', 'PAID'),
(10, 10, 'CMD010', '', 'PAID');