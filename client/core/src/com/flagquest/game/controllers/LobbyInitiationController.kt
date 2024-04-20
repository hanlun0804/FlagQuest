package com.flagquest.game.controllers

import com.flagquest.game.models.LobbyApiModel
import com.flagquest.game.navigation.LobbyRedirectionListener
import com.flagquest.game.states.GameStateManager
import com.flagquest.game.states.LobbyInitiationState
import com.flagquest.game.utils.DataManager
import com.flagquest.game.views.LobbyInitiationView

class LobbyInitiationController(private val model: LobbyApiModel) {
    var redirectionListener: LobbyRedirectionListener? = null
    fun onCreateGameClicked(size: Int) {
        val lobby: String? = model.postLobby(size)
        val lobbyId: String = model.getIdFromResponse(lobby!!)
        DataManager.setData("lobbyId", lobbyId)
        redirectionListener?.redirectToLobbyState(lobbyId)
    }

}