package com.mavy0313.patterns.refactoring_guru.mediator.guru.mediator;

import com.mavy0313.patterns.refactoring_guru.mediator.guru.components.Component;

import javax.swing.*;

/**
 * Общий интерфейс посредников.
 */
public interface Mediator {
    void addNewNote(Note note);
    void deleteNote();
    void getInfoFromList(Note note);
    void saveChanges();
    void markNote();
    void clear();
    void sendToFilter(ListModel listModel);
    void setElementsList(ListModel list);
    void registerComponent(Component component);
    void hideElements(boolean flag);
    void createGUI();
}
