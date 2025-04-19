package dio.web.dio_challenge.types;

public enum PaymentEnum {
    CREDIT_CARD("credit card"),
    BILLET("billet"),
    PIX("pix");

    private String label;

    private PaymentEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
