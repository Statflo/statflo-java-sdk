package com.statflo.example;

import com.statflo.client.model.OneOfVendorMessageCreatePayload;

import java.util.List;

public class TextMessagePayload implements OneOfVendorMessageCreatePayload {
    private List<?> items;

    public TextMessagePayload(List<?> items) {
        this.items = items;
    }

    public List<?> getItems() {
        return items;
    }
}