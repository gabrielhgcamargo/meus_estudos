package io.github.gabrielhgcamargo.domain.repository;

import io.github.gabrielhgcamargo.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {

}
