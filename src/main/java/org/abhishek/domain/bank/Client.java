package org.abhishek.domain.bank;

import lombok.Builder;
import lombok.Value;

import java.util.List;

/**
 * @author  : Abhishek
 * @since   : 2024-02-05, Monday
 **/
@Builder
@Value
public class Client {
    String firstName;
    String lastName;
    List<String> middleNames;
}
