package com.mi_tiempo.myapplication.uses_cases.videollamada

import com.mi_tiempo.myapplication.base.App
import com.mi_tiempo.myapplication.data_access.videollamada.InteraccionEntreWebRTCYSocketVideollamada
import com.mi_tiempo.myapplication.data_access.videollamada.LogicaSocketVideollamada
import javax.inject.Inject

class DesvincularDelSocketDeVideollamadaCasoUso {

    @Inject lateinit var interaccionEntreWebRTCYSocketVideollamada: InteraccionEntreWebRTCYSocketVideollamada

    init {
        (App.getContext() as App).traerComponenteAplicacion()?.inject(this)
    }

    fun invoke() {
        interaccionEntreWebRTCYSocketVideollamada.desvincularSocketVideollamada()
    }
}