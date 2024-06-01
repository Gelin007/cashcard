package dev.gelin.cashcard.persistence;

import dev.gelin.cashcard.model.CashCard;
import org.springframework.data.repository.CrudRepository;

public interface CashCardRepository extends CrudRepository<CashCard, Long> {
}
