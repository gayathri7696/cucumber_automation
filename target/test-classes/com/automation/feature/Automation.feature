Feature: Dress purchase in Automation
Background:
Given user Launch The Application
When user Clicks The Signin Page
And user Enter Emailid In Emailid Field
And user Enter Password In Password Field
Then user Clicks Signin Button And Navigates To Home Page
@Ap1
Scenario: Women Purchase
When user Click Women
And user Clicks The Dress
And user Clicks Addtocart
And user Clicks Proceed To Checkout
And user Clicks Proceed To Summary Checkout
And user Clicks Proceed To Address Checkout
And user Clicks Terms Checkbox
And user Clicks Proceed To Shipping Checkout
And user Clicks Pay By Bankwire
And user Clicks Conform My Order
Then user Clicks Logout Button
@Ap2
Scenario: Dress Purchase
When user Clicks Dresses
And user Clicks Evening Dresses
And user Clicks The Dress2
And user Clicks Addtocart2
And user Clicks Proceed To Checkout2
And user Clicks Proceed To Summary Checkout2
And user Clicks Proceed To Address Checkout2
And user Clicks Terms Checkbox2
And user Clicks Proceed To Shipping Checkout2
And user Clicks Pay By Bankwire2
And user Clicks Conform My Order2
Then user Clicks Logout Button2
@Ap3
Scenario: Tshirt Purchase
When user Clicks Tshirt
And user Clicks The Dress3
And user Clicks Addtocart3
And user Clicks Proceed To Checkout3
And user Clicks Proceed To Summary Checkout3
And user Clicks Proceed To Address Checkout3
And user Clicks Terms Checkbox3
And user Clicks Proceed To Shipping Checkout3
And user Clicks Pay By Bankwire3
And user Clicks Conform My Order3
Then user Clicks Logout Button3




