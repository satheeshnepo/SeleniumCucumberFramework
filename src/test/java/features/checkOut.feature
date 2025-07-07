Feature: Search and Place the order for products
@CheckOut
Scenario Outline: Search Experience both product Search and both home and offer page

Given user must on Green card Landing page
When user searched with shortname <Name> and extracted actual name of products
And add <Quantity> items to cart
Then user proceeds to checkout and validate <Name> items in checkout page
And Verify user has ability to enter promo code and place the order



Examples:
|Name | Quantity|
|Tom|   3 |
|beet|  4 |

