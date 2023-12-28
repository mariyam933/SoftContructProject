/**
 * The `Product` class represents a general product with common attributes such as ID,
 * quantity, price, name, type, description, and image path. It provides methods to
 * set and get these attributes, as well as compute the total price based on a specified quantity.
 */
class Product {

  private int ID;
  private int quantity;
  private double price;
  private String name;
  private String type;
  private String desc;
  private String imgPath;

  public Product(
      int id,
      int quantity,
      double price,
      String name,
      String type,
      String desc,
      String imgPath) {
    this.ID = id;
    this.quantity = quantity;
    this.price = price;
    this.name = name;
    this.type = type;
    this.desc = desc;
    this.imgPath = imgPath;
  }

  //Setters
  public void setID(int id) {
    this.ID = id;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  //setters
  public void setPrice(double price) {
    this.price = price;
  }

  //setters
  public void setName(String name) {
    this.name = name;
  }

  //setters
  public void setType(String type) {
    this.type = type;
  }

  //setters
  public void setDesc(String desc) {
    this.desc = desc;
  }

  //setters
  public void setImgPath(String imgPath) {
    this.imgPath = imgPath;
  }

  //getters
  public int getID() {
    return this.ID;
  }

  //getters
  public int getQuantity() {
    return this.quantity;
  }

  //getters
  public double getPrice() {
    return this.price;
  }

  //getters
  public String getName() {
    return this.name;
  }

  //getters
  public String getType() {
    return this.type;
  }

  //getters
  public String getDesc() {
    return this.desc;
  }

  //getters
  public String getImgPath() {
    return this.imgPath;
  }

  /**
     * Computes the total price of the product based on the given quantity.
     *
     * @param quantity The quantity of the product.
     * @return The total price computed as the product of quantity and the unit price.
     */
  public double computrPrice(int quantity) {
    return quantity * this.price;
  }
}
/**
 * The `Electronics` class extends the `Product` class and represents electronic products.
 * It inherits attributes and methods from the `Product` class.
 */
class Electronics extends Product {

  public Electronics(
      int id,
      int quantity,
      double price,
      String name,
      String type,
      String desc,
      String imgPath) {
    super(id, quantity, price, name, type, desc, imgPath);
  }
}

/**
 * The `Cosmetics` class extends the `Product` class and represents cosmetic products.
 * It inherits attributes and methods from the `Product` class.
 */
class Cosmetics extends Product {
  public Cosmetics(
      int id,
      int quantity,
      double price,
      String name,
      String type,
      String desc,
      String imgPath) {
    super(id, quantity, price, name, type, desc, imgPath);
  }
}


/**
 * The `FruitAndVegetables` class extends the `Product` class and represents fruit and vegetable products.
 * It inherits attributes and methods from the `Product` class.
 */
class FruitAndVegitables extends Product {

  public FruitAndVegitables(
      int id,
      int quantity,
      double price,
      String name,
      String type,
      String desc,
      String imgPath) {
    super(id, quantity, price, name, type, desc, imgPath);
  }
}


/**
 * The `Households` class extends the `Product` class and represents household products.
 * It inherits attributes and methods from the `Product` class.
 */
class Households extends Product {

  public Households(
      int id,
      int quantity,
      double price,
      String name,
      String type,
      String desc,
      String imgPath) {
    super(id, quantity, price, name, type, desc, imgPath);
  }
}

/**
 * The `Dairy` class extends the `Product` class and represents dairy products.
 * It inherits attributes and methods from the `Product` class.
 */
class Dairy extends Product {

  public Dairy(
      int id,
      int quantity,
      double price,
      String name,
      String type,
      String desc,
      String imgPath) {
    super(id, quantity, price, name, type, desc, imgPath);
  }
}
/**
 * The `Kitchen` class extends the `Product` class and represents kitchen products.
 * It inherits attributes and methods from the `Product` class.
 */
class kitchen extends Product {

  public kitchen(
      int id,
      int quantity,
      double price,
      String name,
      String type,
      String desc,
      String imgPath) {
    super(id, quantity, price, name, type, desc, imgPath);
  }
}
