### bild a store front for any imaginable item for sale

### instead of the main class we usally create, create a store clas with amain

### method.

## The Store class should:

- manage a list of products for sale, including displaying the product details
- manage an order which can just be a list of OrderItem objects
- have methods to add an item to the order and print the ordered items, so it looks
  like a sales receipt

#### Also create a ProductForSale class that should have a t least three fields:

#### a type, price and description, this class should also have methods to:

- getSalesPrice, a concrete method, which takes a quantity, and returns the quantity
  times the price
- printPricedItem a concrete method, which takes a quantity, and should print an
  itemized line item for an order, with quantity and line-item price
- showDetails, an abstract method, which represents what might be displayed on a
  product page, Product type, description, price and so on

#### Also create an order item type , that has at a minimum 2 fields, quantity and product

#### for sale.

#### you should also create two or three classes that extend the ProductForSale Class,

#### that will be products in your store
