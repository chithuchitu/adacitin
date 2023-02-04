@Somke
Feature: Hotel Booking In Adacitin Application
Scenario: User Login To The Web Application
    Given user Launch The Adacitin Application
    When   user Enter The Username
    And  user Enter The Password
    Then user Click Login Button Its Navigate To Login Page
 @Sanity 
 Scenario: User Have To Search The Hotel
 Given User Have To Fill The Given Field And Search The Hotel
 When user Choose The Location
 And  user Select The Hotel
 And user Select The Room Type
 And User Select The Number Of Rooms
 And choose CheckIn Date
 And choose CheckOut Date
 And select No Of Adults
 And select No of Childrens
 Then user Click Search Button
 @Sanity
 Scenario: Select The Hotel From WebPage
 Given Select The Search Hotel And Confirm To Continue
 When User Click the Select Button
 Then Click Continue Button
@Sanity
 Scenario: User Book The Hotel From WebPage
 Given user Enter The First_Name And Last_Name
 When user Enter The Billing Address
 And user Enter The Credit Card_Number
 And user Enter Credit Card_Type
 And user Enter Card Expiry Date
 Then  click Book Now Button
 @Regression
 Scenario: User Logout From The Adacitin Webpage
 Then     User Click Logout Button
   
 

 
  