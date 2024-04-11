package com.flagquest.game.utils

import com.badlogic.gdx.scenes.scene2d.InputEvent
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener
import com.flagquest.game.states.GameStateManager
<<<<<<< HEAD
import com.flagquest.game.states.State
=======
import com.flagquest.game.states.HighscoreState
import com.flagquest.game.states.JoinGameState
import com.flagquest.game.states.LobbyInitiationState
import com.flagquest.game.states.LoginState
import com.flagquest.game.states.MainMenuState
import com.flagquest.game.states.ManageFriendsState
import com.flagquest.game.states.OnlineGameState
import com.flagquest.game.states.RegistrationState

class ButtonClickListener(private val gsm: GameStateManager, private val buttonText: String) : ClickListener() {
>>>>>>> 1895028767cc4718a05023ce6db63e38b65f5f33

class ButtonClickListener(private val gsm: GameStateManager, private val lazyState: Lazy<State>?) : ClickListener() {
    override fun clicked(event: InputEvent, x: Float, y: Float) {
<<<<<<< HEAD
        if (lazyState is Lazy<State>){
            val state = lazyState.value
            gsm.push(state)
=======
        when (buttonText) {
            //Login Menu
            "LOGIN" -> gsm.push(LoginState(gsm))
            "NEW USER" -> gsm.push(RegistrationState(gsm))

            //Login
            "ENTER" -> gsm.push(MainMenuState(gsm)) //TODO: Login Mechanism

            //Register
            "REGISTER" -> gsm.push(MainMenuState(gsm)) //TODO: Registration Mechanism

            //Main Menu
            "CREATE GAME" -> gsm.push(LobbyInitiationState(gsm))
            "JOIN GAME" -> gsm.push(JoinGameState(gsm))
            "TRAINING MODE" -> gsm.push(OnlineGameState(gsm)) // TODO: Change to Offline once available.
            "HIGHSCORE BOARD" -> gsm.push(HighscoreState(gsm))
            "MANAGE FRIENDS" -> gsm.push(ManageFriendsState(gsm))

            //Create Lobby
            "CREATE LOBBY" -> gsm.push(GameLobbyState(gsm, isAdmin = true)) //TODO: Lobby Creation Mechanism

            //Join Lobby
            "JOIN RANDOM GAME" -> gsm.push(GameLobbyState(gsm, isAdmin = false)) //TODO: Implement joining mechanism
            "JOIN WITH CODE" -> gsm.push(GameLobbyState(gsm, isAdmin = false)) //TODO: Implement joining mechanism

            //Lobby
            "START NOW" -> gsm.push(OnlineGameState(gsm)) // TODO: Communicate with backend to start game

            else -> println("Unknown button clicked")
>>>>>>> 1895028767cc4718a05023ce6db63e38b65f5f33
        }
        else
            println("LINK TO STATE!")
    }
}
