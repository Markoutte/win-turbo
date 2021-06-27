package me.markoutte.plugins.turbo

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.ToggleAction

class TurboAction : ToggleAction(WinTurboBundle.message("mode.action")) {

    private var isEnabled: Boolean = false

    override fun isSelected(e: AnActionEvent) = isEnabled

    override fun setSelected(e: AnActionEvent, state: Boolean) {
        isEnabled = state
        if (state) {
            WinMM.begin(2)
        } else {
            WinMM.end(2)
        }
    }

    override fun isDumbAware() = true
}
