package com.mavy0313.patterns.refactoring_guru.mediator.guru.components;

import com.mavy0313.patterns.refactoring_guru.mediator.guru.mediator.Mediator;

/**
 * Общий интерфейс компонентов.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
