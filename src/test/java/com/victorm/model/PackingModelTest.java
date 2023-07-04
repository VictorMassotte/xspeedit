package com.victorm.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class PackingModelTest {
    @Test
    void testConstructor() {
        PackingModel actualPackingModel = new PackingModel("Articles");
        actualPackingModel.setArticles("Articles");
        ArrayList<String> cartons = new ArrayList<>();
        actualPackingModel.setCartons(cartons);
        assertEquals("Articles", actualPackingModel.getArticles());
        assertSame(cartons, actualPackingModel.getCartons());
    }
}

