package com.boogiepizza.BoogiePizza.dto;

import java.util.Objects;

public class EditMeasurementTypeDTO {
    private Integer id;
    private String type;

    public EditMeasurementTypeDTO() {}

    public EditMeasurementTypeDTO(Integer id, String type) {
        this.id = id;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EditMeasurementTypeDTO that = (EditMeasurementTypeDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type);
    }

    @Override
    public String toString() {
        return "EditMeasurementTypeDTO{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
