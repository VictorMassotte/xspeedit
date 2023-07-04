package com.victorm.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.victorm.model.PackingModel;

import java.util.List;
import org.junit.jupiter.api.Test;

class PackingServiceTest {
    @Test
    void testOptimizePacking() {
        PackingModel model = new PackingModel("Articles");
        PackingService.optimizePacking(model);
        List<String> cartons = model.getCartons();
        assertEquals(8, cartons.size());
        assertEquals("10", cartons.get(0));
        assertEquals("27", cartons.get(1));
        assertEquals("29", cartons.get(2));
        assertEquals("21", cartons.get(5));
        assertEquals("14", cartons.get(6));
        assertEquals("28", cartons.get(7));
    }

    @Test
    void testOptimizePacking2() {
        PackingModel model = new PackingModel("42");
        PackingService.optimizePacking(model);
        List<String> cartons = model.getCartons();
        assertEquals(1, cartons.size());
        assertEquals("42", cartons.get(0));
    }

    @Test
    void testCalculateCartonSize() {
        assertEquals(125, PackingService.calculateCartonSize("Carton"));
    }
}