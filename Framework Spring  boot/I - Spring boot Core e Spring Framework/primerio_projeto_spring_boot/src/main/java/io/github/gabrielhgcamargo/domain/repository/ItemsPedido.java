package io.github.gabrielhgcamargo.domain.repository;

import io.github.gabrielhgcamargo.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
