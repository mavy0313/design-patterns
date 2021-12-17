package com.mavy0313.patterns.refactoring_guru.mediator.guru;

import com.mavy0313.patterns.refactoring_guru.mediator.guru.components.*;
import com.mavy0313.patterns.refactoring_guru.mediator.guru.mediator.Editor;
import com.mavy0313.patterns.refactoring_guru.mediator.guru.mediator.Mediator;

import javax.swing.*;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
