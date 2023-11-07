package chain_of_responsability;

public class DirectorPurchaseHandler extends PurchaseHandler {
    @Override
    protected boolean canHandle(PurchaseRequest request) {
        return request.getAmount() <= 5000;
    }

    @Override
    protected String handle(PurchaseRequest request) {
        return "Diretor aprovou a compra de " + request.getDescription();
    }
}
