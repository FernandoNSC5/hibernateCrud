package br.com.bluemoth.HibernateCrud.gateway.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.bluemoth.HibernateCrud.domain.Player;

/**
 * A simple Player Repository
 *
 * @author znogfer
 * @since 0.0.1
 */
public interface PlayerRepository extends CrudRepository<Player, Long>
{
}
