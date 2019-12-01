package com.unialfa.enums;

public enum StatusE {
    CONFIRMADO(1),
    PENDENTE_PAGAMENTO(2),
    CANCELADO(3);

    private int id;

    StatusE(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
