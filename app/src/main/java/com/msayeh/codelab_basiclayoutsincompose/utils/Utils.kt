package com.msayeh.codelab_basiclayoutsincompose.utils

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.msayeh.codelab_basiclayoutsincompose.R

val alignYourBodyData = listOf(
    R.drawable.fc1_short_mantras to R.string.ab1_inversions,
    R.drawable.fc2_nature_meditations to R.string.ab2_quick_yoga,
    R.drawable.fc3_stress_and_anxiety to R.string.ab3_stretching,
    R.drawable.fc4_self_massage to R.string.ab4_tabata,
    R.drawable.fc5_overwhelmed to R.string.ab5_hiit,
    R.drawable.fc6_nightly_wind_down to R.string.ab6_pre_natal_yoga
).map { DrawableStringPair(it.first, it.second) }

val favoriteCollectionsData = listOf(
    R.drawable.fc1_short_mantras to R.string.fc1_short_mantras,
    R.drawable.fc2_nature_meditations to R.string.fc2_nature_meditations,
    R.drawable.fc3_stress_and_anxiety to R.string.fc3_stress_and_anxiety,
    R.drawable.fc4_self_massage to R.string.fc4_self_massage,
    R.drawable.fc5_overwhelmed to R.string.fc5_overwhelmed,
    R.drawable.fc6_nightly_wind_down to R.string.fc6_nightly_wind_down
).map { DrawableStringPair(it.first, it.second) }

data class DrawableStringPair(
    @DrawableRes val drawable: Int,
    @StringRes val text: Int
)
