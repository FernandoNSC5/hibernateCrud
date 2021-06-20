package br.com.bluemoth.HibernateCrud.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

/**
 * A simple Game Persistence Class
 * May contain a range of games
 *
 * @author znogfer
 * @since 0.0.2
 */
@Entity
@Table(name = "ohxgame")
public class Game
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gameId;

    @NotNull
    private String name;

    @NotNull
    private int baseAge;

    public Game()
    {}

    public Game(String pName, int pBaseAge)
    {
        this.name = pName;
        this.baseAge = pBaseAge;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseAge() {
        return baseAge;
    }

    public void setBaseAge(int baseAge) {
        this.baseAge = baseAge;
    }
}
