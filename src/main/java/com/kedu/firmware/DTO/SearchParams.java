package com.kedu.firmware.DTO;

public class SearchParams {
    private String query;
    private int offset;
    private int size;

    public SearchParams(String query, int offset, int size) {
        this.query = query;
        this.offset = offset;
        this.size = size;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
