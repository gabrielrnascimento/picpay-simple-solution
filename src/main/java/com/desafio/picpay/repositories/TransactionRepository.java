package com.desafio.picpay.repositories;

import com.desafio.picpay.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
