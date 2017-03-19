import static org.junit.Assert.*;
import org.junit.*;

public class basket_test{
  basket myBasket;

  @Before
  public void before() {
    myBasket = new basket();
  }

  @Test
  public void test_add() {
    int num_items = myBasket.numItems();
    item shoes = new item("shoes", 195.25);
    myBasket.addItem(shoes);
    assertEquals(num_items + 1, myBasket.numItems());
  }

  @Test
  public void test_delete() {
    int num_items = myBasket.numItems();
    item shoes = new item("shoes", 195.25);
    myBasket.addItem(shoes);
    myBasket.deleteItem(shoes);
    assertEquals(num_items, myBasket.numItems());
  }

  @Test
  public void test_clear() {
    int num_items = myBasket.numItems();
    item shoes = new item("shoes", 195.25);
    myBasket.addItem(shoes);
    myBasket.emptyBasket();
    assertEquals(0, myBasket.numItems());
  }

  @Test 
  public void test_total() {
    item shoes = new item("shoes", 195.25);
    item beer = new item("beer", 45.00);
    myBasket.addItem(shoes);
    myBasket.addItem(beer);
    assertEquals(240.25, myBasket.total(), 0.001);
    // because floats are not completely precise, we need to set a tolerance on the assert, for how much the result can differ. Let's use 0.001, as we are accounting in pence. See http://junit.sourceforge.net/javadoc/org/junit/Assert.html#assertEquals(double, double, double)
  }

}