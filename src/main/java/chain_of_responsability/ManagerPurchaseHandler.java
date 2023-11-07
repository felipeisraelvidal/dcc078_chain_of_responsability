package chain_of_responsability;

public class ManagerPurchaseHandler extends PurchaseHandler {
    @Override
    protected boolean canHandle(PurchaseRequest request) {
        return request.getAmount() <= 1000;
    }

    @Override
    protected String handle(PurchaseRequest request) {
        return "Gerente aprovou a compra de " + request.getDescription();
    }
}
