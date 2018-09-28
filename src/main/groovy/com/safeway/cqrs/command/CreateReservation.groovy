package com.safeway.cqrs.command

import org.axonframework.commandhandling.TargetAggregateIdentifier

class CreateReservation {

    @TargetAggregateIdentifier
    UUID id
    String type

}
