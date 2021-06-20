package br.com.bluemoth.HibernateCrud.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.com.bluemoth.HibernateCrud.domain.Player;
import br.com.bluemoth.HibernateCrud.gateway.repository.PlayerRepository;

/**
 * The Player services
 *
 * @author znogfer
 * @since 0.0.1
 */
@RestController
public class CreateCrudService
{
    protected static final Logger LOGGER = LogManager.getLogger();

    @Autowired
    private PlayerRepository playerRepository;

    /**
     * Persists the given Player in database
     * @param pPlayer
     *          The {@link Player} to be persisted
     */
    public void execute(Player pPlayer)
    {
        LOGGER.warn("Saving player..");
        playerRepository.save(pPlayer);
        LOGGER.warn("Saved completed.");
    }

    /**
     * The list of all Players
     * @return
     *     A {@link Player} Iterable
     */
    public Iterable<Player> findAllPlayers()
    {
        return playerRepository.findAll();
    }

}
