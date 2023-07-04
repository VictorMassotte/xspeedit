package com.victorm;

import com.victorm.model.PackingModel;
import com.victorm.service.PackingService;

public class Application {
    public static void main(String[] args) {
        PackingModel model = new PackingModel("163841689525773");
        PackingService.optimizePacking(model);
        System.out.println(String.join("/", model.getCartons()));
        System.out.println("Nombre de cartons utilisés: " + model.getCartons().size());
    }
}
