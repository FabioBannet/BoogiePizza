package com.boogiepizza.BoogiePizza.controllers;

import com.boogiepizza.BoogiePizza.dto.AddMeasurementTypeDTO;
import com.boogiepizza.BoogiePizza.dto.EditMeasurementTypeDTO;
import com.boogiepizza.BoogiePizza.models.MeasurementType;
import com.boogiepizza.BoogiePizza.services.IMeasurementTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MeasurementTypeController {
    @Autowired
    private IMeasurementTypeService measurementTypeService;

    @GetMapping("/measurement_type")
    public List<MeasurementType> getAll(){
        return measurementTypeService.getAll();
    }

    @GetMapping("/measurement_type/{id}")
    public MeasurementType get(@PathVariable(name = "id")Integer id){
        return measurementTypeService.get(id);
    }

    @PostMapping("/measurement_type")
    public MeasurementType post(@RequestBody AddMeasurementTypeDTO measurementTypeDTO){
        return measurementTypeService.post(measurementTypeDTO);
    }

    @PutMapping("/measurement_type")
    public MeasurementType put(@RequestBody EditMeasurementTypeDTO measurementTypeDTO){
        return measurementTypeService.put(measurementTypeDTO);
    }

    @DeleteMapping("/measurement_type/{id}")
    public boolean delete(@PathVariable(name = "id")Integer id){
        return measurementTypeService.delete(id);
    }
}
