# Project Name : RestaurantDeliveryApplication

I have created a Basic food Delivery system which provides the basic services for placing the order, fetching status of order, updating order status via delivery agent etc.

Below are the apis which are implemented in the project:

1. Order place which returns orderId, bill value, discount and preparation time.
2. Fetch OrderStatus.
3. AssignOrder to available DeliveryPerson.
4. Update orderStatus.
5. Get status of all DeliveryPerson.
6. Get status of Specific DeliveryPerson.
7. Add and retrieve items from Inventory.
8. Add newDeliveryPerson.

API flow:

1. Add item then add agent.
2. Order place -> order assign to delivery boy -> update order(PICKED/DELIVERED) -> agent available again


I have used spring-boot framework 2.2.5 with gradle dependency management. 
For datasource I  have used H2 database file based to persist data. I have used caffeineCache with 10 minutes as expiration time. 

I have also integrated JUnit Test using Mockito along with spring-boot API integration test.

I have also added swagger file with the project.
