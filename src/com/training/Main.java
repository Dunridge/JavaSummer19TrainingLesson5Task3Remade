package com.training;

import com.training.controller.Controller;
import com.training.view.View;
import com.training.model.Model;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();

        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
