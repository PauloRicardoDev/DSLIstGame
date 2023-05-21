package br.com.pauloricardodev.dslist.repositories;

import br.com.pauloricardodev.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
