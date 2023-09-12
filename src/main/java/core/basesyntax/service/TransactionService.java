package core.basesyntax.service;

import core.basesyntax.model.FruitTransaction;
import java.util.List;

public interface TransactionService {
    List<FruitTransaction> parseTransactions(List<String> lines);
}