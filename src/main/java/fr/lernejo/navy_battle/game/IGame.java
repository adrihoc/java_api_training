package fr.lernejo.navy_battle.game;

import fr.lernejo.navy_battle.enumeration.Consequence;
import fr.lernejo.navy_battle.enumeration.Victory;
import fr.lernejo.navy_battle.game.point.IPoint;

import java.net.UnknownHostException;

public interface IGame {

    public void Initialize();

    public boolean GetReadyTOShoot();


    public Consequence receiveShoot(IPoint point);


    public boolean GetIfLost();


    public void Start() throws UnknownHostException, InterruptedException;

    public void SetTrueReadyTOShoot();

    public void SetVictory();

    public void SetDefeat();


    public Victory GetVictory();
}
