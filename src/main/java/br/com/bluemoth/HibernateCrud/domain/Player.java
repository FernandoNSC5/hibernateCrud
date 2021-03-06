package br.com.bluemoth.HibernateCrud.domain;

import javax.persistence.*;

import com.sun.istack.NotNull;

/**
 * A simple Player Persistence Class
 *
 * @author znogfer
 * @since 0.0.1
 */
@Entity
@Table(name = "ohxplayer")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long playerId;

    @NotNull
    private String name;

    @NotNull
    private String nickname;

    @ManyToOne
    @JoinColumn(name="gameId", nullable=false)
    private Game gameId;

    public Player()
    {}

    public Player (String pName, String pNickName, Game pGame)
    {
        this.name = pName;
        this.nickname = pNickName;
        this.gameId = pGame;
    }

    public Player(String pName, String pNickname)
    {
        this.name = pName;
        this.nickname = pNickname;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setGame(Game pGameId)
    {
        this.gameId = pGameId;
    }

    public Game getGame()
    {
        return gameId;
    }
}
