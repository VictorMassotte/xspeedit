package com.victorm.service;

import com.victorm.model.PackingModel;

import java.util.ArrayList;
import java.util.List;

public class PackingService {

    public static void optimizePacking(PackingModel model) {
        List<String> cartons = new ArrayList<>();

        for (int i = 0; i < model.getArticles().length(); i++) {
            int article = Character.getNumericValue(model.getArticles().charAt(i));
            boolean addedToExistingCarton = false;

            // Parcourir les cartons existants pour trouver un carton où l'article peut être ajouté
            for (int j = 0; j < cartons.size(); j++) {
                String currentCarton = cartons.get(j);
                int currentCartonSize = calculateCartonSize(currentCarton);

                // Vérifier si l'article peut être ajouté au carton courant
                if (currentCartonSize + article <= 10) {
                    cartons.set(j, currentCarton + article);
                    addedToExistingCarton = true;
                    break;
                }
            }

            // Si l'article n'a pas été ajouté à un carton existant, créer un nouveau carton avec cet article
            if (!addedToExistingCarton) {
                cartons.add(String.valueOf(article));
            }
        }

        model.setCartons(cartons);
    }

    public static int calculateCartonSize(String carton) {
        int size = 0;
        for (int i = 0; i < carton.length(); i++) {
            size += Character.getNumericValue(carton.charAt(i));
        }
        return size;
    }
}
