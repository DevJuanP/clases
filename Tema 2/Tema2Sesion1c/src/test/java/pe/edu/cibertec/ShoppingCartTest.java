package pe.edu.cibertec;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    private ShoppingCart cart1;
    private Product prod1;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("Ejecutando setUpBeforeClass");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println("Ejecutando tearDownAfterClass");
    }

    @BeforeEach
    void setUp() throws Exception {
        System.out.println("Ejecutando setUp");
        cart1 = new ShoppingCart();
        prod1 = new Product("P001", "Plasma TV LG 32", "Plasma TV with TDT Decod. and high resolution Screen", 699.99);
        cart1.addItem(prod1);
    }

    @AfterEach
    void tearDown() throws Exception {
        System.out.println("Ejecutando tearDown");
        cart1 = null;
        prod1 = null;
    }

    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        double expResult = 699.99;
        double result = cart1.getBalance();
        assertEquals(expResult, result);
    }

    @Test
    public void testAddItem() {
        System.out.println("addItem");
        Product prod2 = new Product("P002", "DVD player Sanmsung",
                "DVD player with remote control and programming features", 39.99);
        cart1.addItem(prod2);
        assertEquals(2, cart1.getItemCount());
        double expectedBalance = prod1.getPrice() + prod2.getPrice();
        assertEquals(expectedBalance, cart1.getBalance());
    }

    @Test
    public void testGetItemCount() {
        System.out.println("getItemCount");
        int expResult = 1;
        int result = cart1.getItemCount();
        assertEquals(expResult, result);
    }

    @Test
    public void testRemoveItem() {
        System.out.println("removeItem");
        cart1.removeItem(prod1);
        assertEquals(0, cart1.getItemCount());
    }

    @Test
    public void testEmpty() {
        System.out.println("empty");
        cart1.empty();
        assertEquals(0, cart1.getItemCount());
    }
}