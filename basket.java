import java.util.ArrayList;

class basket {
  ArrayList<item> contents;

  public basket() {
    this.contents = new ArrayList<item>();
  }

  public int numItems() {
    return this.contents.size();
  }

  public int addItem(item thisItem) {
    this.contents.add(thisItem);
    return this.contents.size();
  }

  public int deleteItem(item thisItem){
    this.contents.remove(thisItem);
    return this.contents.size();
  }

  public int emptyBasket() {
    this.contents.clear();
    return this.contents.size();
  }

  public double total() {
    double total = 0.0;
    for (item thisItem : this.contents) {
      total += thisItem.getPrice();
    }
    return total;
  }

}