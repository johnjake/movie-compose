package com.cinema.guide.features.domain.state.discover

import com.cinema.guide.features.presentation.cinema.Discovery

sealed class StateDiscover {
    object ShowLoader : StateDiscover()
    object HideLoader : StateDiscover()

    data class OnSuccess(val data: List<Discovery>) : StateDiscover()
    data class OnFailed(val error: String) : StateDiscover()
}
