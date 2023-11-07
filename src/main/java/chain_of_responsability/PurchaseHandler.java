package chain_of_responsability;

abstract public class PurchaseHandler {
    private PurchaseHandler nextHandler;

    public void setNextHandler(PurchaseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public String processRequest(PurchaseRequest request) {
        if (canHandle(request)) {
            return handle(request);
        } else {
            if (nextHandler != null) {
                return nextHandler.processRequest(request);
            } else {
                return "No handler";
            }
        }
    }

    protected abstract boolean canHandle(PurchaseRequest request);
    protected abstract String handle(PurchaseRequest request);
}
