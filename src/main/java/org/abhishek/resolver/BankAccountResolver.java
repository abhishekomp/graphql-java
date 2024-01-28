package org.abhishek.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.abhishek.domain.bank.BankAccount;
import org.abhishek.domain.bank.Currency;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author : Abhishek
 * @since : 2024-01-28, Sunday
 **/
@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {
    public BankAccount bankAccount(UUID id){
        log.info("Retrieving bank account id: {}", id);
        return BankAccount.builder().id(id).currency(Currency.CHF).name("Abhishek").build();
    }
}
