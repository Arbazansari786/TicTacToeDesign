package com.lti.model;

public class Dimension {

    private final Integer rows;
   private final Integer cols;

    public Integer getRows() {
        return rows;
    }

    public Integer getCols() {
        return cols;
    }

    public Dimension(Integer rows, Integer cols) {
        this.rows = rows;
        this.cols = cols;
    }
}
