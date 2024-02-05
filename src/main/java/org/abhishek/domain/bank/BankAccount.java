package org.abhishek.domain.bank;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

/**
 * @author  : Abhishek
 * @since   : 2024-01-28, Sunday
 **/
@Builder
@Value
public class BankAccount {
    UUID id;
    Client client;
    Currency currency;
}
