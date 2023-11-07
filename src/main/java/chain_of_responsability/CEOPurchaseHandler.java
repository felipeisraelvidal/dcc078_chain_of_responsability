package chain_of_responsability;

public class CEOPurchaseHandler extends PurchaseHandler {
    @Override
    protected boolean canHandle(PurchaseRequest request) {
        return true;
    }

    @Override
    protected String handle(PurchaseRequest request) {
        return "CEO aprovou a compra de " + request.getDescription();
    }
}
