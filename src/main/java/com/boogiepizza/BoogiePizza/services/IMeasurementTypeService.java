package com.boogiepizza.BoogiePizza.services;

import com.boogiepizza.BoogiePizza.dto.AddMeasurementTypeDTO;
import com.boogiepizza.BoogiePizza.dto.EditMeasurementTypeDTO;
import com.boogiepizza.BoogiePizza.models.MeasurementType;

import java.util.List;

public interface IMeasurementTypeService {

    List<MeasurementType> getAll();
    MeasurementType get(Integer id);
    MeasurementType post(AddMeasurementTypeDTO measurementTypeDTO);
    MeasurementType put(EditMeasurementTypeDTO measurementTypeDTO);
    boolean delete(Integer id);

}
