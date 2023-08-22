package com.banking.cqrs.core.commands;

@FunctionalInterface
public interface CommandHandlerMethod<T extends BaseCommand>{
    void handle(T command);
}
