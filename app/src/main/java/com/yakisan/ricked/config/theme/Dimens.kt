package com.yakisan.ricked.config.theme

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Dimens(
    val extraSmall: Dp = 0.dp,
    val small1: Dp = 0.dp,
    val small2: Dp = 0.dp,
    val small3: Dp = 0.dp,
    val medium1: Dp = 0.dp,
    val medium2: Dp = 0.dp,
    val medium3: Dp = 0.dp,
    val large: Dp = 0.dp,
)

// for Small Devices
val CompactSmallDimens = Dimens(
    small1 = 6.dp,
    small2 = 7.dp,
    small3 = 8.dp,
    medium1 = 10.dp,
    medium2 = 20.dp,
    medium3 = 25.dp,
    large = 35.dp,
)

// for Medium Devices
val CompactMediumDimens = Dimens(
    small1 = 8.dp,
    small2 = 13.dp,
    small3 = 17.dp,
    medium1 = 20.dp,
    medium2 = 25.dp,
    medium3 = 30.dp,
    large = 90.dp,
)


val CompactDimens = Dimens(
    small1 = 8.dp,
    small2 = 13.dp,
    small3 = 17.dp,
    medium1 = 20.dp,
    medium2 = 25.dp,
    medium3 = 30.dp,
    large = 90.dp,
)

val MediumDimens = Dimens(
    small1 = 10.dp,
    small2 = 15.dp,
    small3 = 20.dp,
    medium1 = 30.dp,
    medium2 = 36.dp,
    medium3 = 40.dp,
    large = 110.dp,
)

val ExpandedDimens = Dimens(
    small1 = 15.dp,
    small2 = 20.dp,
    small3 = 25.dp,
    medium1 = 35.dp,
    medium2 = 30.dp,
    medium3 = 45.dp,
    large = 130.dp,
)