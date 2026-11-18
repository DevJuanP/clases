package pe.edu.cibertec;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
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
        prod1 = new Product("P001", "Plasma TV LG 32", "Plasma TV with TDT Decod. and high resolution Screen", 699.99);
    }

    @AfterEach
    void tearDown() throws Exception {
        System.out.println("Ejecutando tearDown");
        prod1 = null;
    }

    @Test
    void testGetCode() {
        System.out.println("getCode");
        String expResult = "P001";
        String result = prod1.getCode();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        String expResult = "Plasma TV LG 32";
        String result = prod1.getTitle();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        String expResult = "Plasma TV with TDT Decod. and high resolution Screen";
        String result = prod1.getDescription();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        double expResult = 699.99;
        double result = prod1.getPrice();
        assertEquals(expResult, result);
    }
}