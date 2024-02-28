package com.example.testlayout.presentation

import androidx.compose.ui.text.font.FontWeight
import com.example.testlayout.domain.PersonFighter
import kotlin.random.Random

sealed class Events {
    class AddPersons(
        val name: String,
        val weight: Float = Random(400).nextFloat(),
        val countFight: Int = Random(342).nextInt()
    ) : Events()
    class DeletePerson(val personFighter: PersonFighter):Events()
}