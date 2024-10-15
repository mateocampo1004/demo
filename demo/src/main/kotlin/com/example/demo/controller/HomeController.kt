package com.example.demo.controller

import com.ejemplo.demo.model.Model
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/home")

    class HomeController {

        @PostMapping("/{id}")
        fun registrarUsuario(
            @PathVariable id: Int,                        // Recibe el ID del usuario
            @RequestParam(required = false) verificado: Boolean?,  // Param opcional para estado de verificación
            @RequestBody model: Model
        ): String {
            val estadoVerificacion = if (verificado == true) "verificado" else "no verificado"
            return "Usuario registrado con ID $id: $model y el estado de verificación es $estadoVerificacion"
        }
    }
