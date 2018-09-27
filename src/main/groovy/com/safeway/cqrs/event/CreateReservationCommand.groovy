package com.safeway.cqrs.event

import org.axonframework.commandhandling.TargetAggregateIdentifier

class CreateReservationCommand {

    @TargetAggregateIdentifier
    UUID id
    String type

}
