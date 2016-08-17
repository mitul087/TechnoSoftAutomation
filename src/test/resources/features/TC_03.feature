Feature: PriceLine Hotel Search Test
	
	Scenario: Verify if User is able  to  see the details of the selected hotel once clicked on it
	When Click on Hotel link from Header
	And Enter "Paris" as valid City
	And Click on check in field
	And Select "8/25/2016" as Check-in Date
	And Click on check out field 
	And Select "8/29/2016" as Check-out Date
	And Click on rooms
	And Select "2 Rooms" from Rooms
	And Click on Seach for Hotels