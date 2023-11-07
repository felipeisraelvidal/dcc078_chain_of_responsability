package chain_of_responsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HandlerTest {

    ManagerPurchaseHandler manager;
    DirectorPurchaseHandler director;
    CEOPurchaseHandler ceo;

    @BeforeEach
    void setUp() {
        this.manager = new ManagerPurchaseHandler();
        this.director = new DirectorPurchaseHandler();
        this.ceo = new CEOPurchaseHandler();
    }

    @Test
    void shouldReturnManager() {
        manager.setNextHandler(director);
        director.setNextHandler(ceo);

        PurchaseRequest request1 = new PurchaseRequest("Laptop", 900);
        PurchaseRequest request2 = new PurchaseRequest("Conference table", 3000);
        PurchaseRequest request3 = new PurchaseRequest("New office building", 100000);

        manager.processRequest(request1);
        manager.processRequest(request2);
        manager.processRequest(request3);
    }


}
