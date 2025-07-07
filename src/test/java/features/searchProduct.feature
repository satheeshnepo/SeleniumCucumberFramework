Feature: Search and Place the order for products
@OfferPage
Scenario Outline: Search Experience both product Search and both home and offer page

Given user must on Green card Landing page
When user searched with shortname <Name> and extracted actual name of product
Then user go and search same <Name> on offer page to check product exist
And get matching both products

Examples:
|Name |
|Tom|
|beet|

