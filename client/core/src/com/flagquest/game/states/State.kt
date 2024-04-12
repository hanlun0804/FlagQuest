package com.flagquest.game.states

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.math.Vector3
import com.badlogic.gdx.scenes.scene2d.InputEvent
import com.badlogic.gdx.scenes.scene2d.InputListener
import com.badlogic.gdx.scenes.scene2d.Stage

abstract class State(protected val gsm: GameStateManager) {
    protected var cam: OrthographicCamera = OrthographicCamera()
    protected var mouse: Vector3 = Vector3()
    protected abstract val stage: Stage
    private var backButtonListenerAdded: Boolean = false
    abstract fun handleInput()
    abstract fun update(dt: Float) // dt = delta time (difference between two frames)
    abstract fun render()
    fun switchInputProcessor(){ //Takes the back press and pops the current state.
        if (!backButtonListenerAdded){
            stage.addListener(backButtonListener)
            backButtonListenerAdded = true
        }
        Gdx.input.inputProcessor = stage
    }

    // Handles system back button presses s.t. state is popped.
    private val backButtonListener = object : InputListener() {
        override fun keyDown(event: InputEvent?, keycode: Int): Boolean {
            // Check if the back button is pressed
            if (keycode == Input.Keys.BACK) {
                // Handle back button press here
                if (!gsm.isEmpty()) {
                    gsm.pop()
                }
                return true
            }
            return super.keyDown(event, keycode)
        }
    }
}