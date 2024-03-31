package com.soroko.project.Homework21;

import java.util.function.Function;

@FunctionalInterface
public interface ParticipantPredicate {
    Boolean applyParticipant(Participant participant);
}
