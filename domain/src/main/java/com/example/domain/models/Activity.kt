package com.example.domain.models

import java.time.LocalDate

data class Activity(
    var content: String? = "",
    var state: ActivityState = ActivityState.TODO,
    var date: LocalDate,
    var type: String
)


enum class ActivityState {
    DONE,
    UNREACHED,
    NOT_DONE,
    TODO
}