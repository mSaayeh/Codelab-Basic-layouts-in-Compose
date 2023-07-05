package com.msayeh.codelab_basiclayoutsincompose.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.msayeh.codelab_basiclayoutsincompose.R

private val fontFamilyKulim = FontFamily(
    listOf(
        Font(
            resId = R.font.kulim_park_regular
        ),
        Font(
            resId = R.font.kulim_park_light,
            weight = FontWeight.Light
        )
    )
)

private val fontFamilyLato = FontFamily(
    listOf(
        Font(
            resId = R.font.lato_regular
        ),
        Font(
            resId = R.font.lato_bold,
            weight = FontWeight.Bold
        )
    )
)

val Typography = Typography(
    headlineLarge = TextStyle(
        fontFamily = fontFamilyKulim,
        fontWeight = FontWeight.Light,
        fontSize = 28.sp,
        letterSpacing = (1.15).sp
    ),
    headlineMedium = TextStyle(
        fontFamily = fontFamilyKulim,
        fontSize = 15.sp,
        letterSpacing = (1.15).sp
    ),
    headlineSmall = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        letterSpacing = 0.sp
    ),
    bodyLarge = TextStyle(
        fontSize = 14.sp,
        letterSpacing = 0.sp
    ),
    labelMedium = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        letterSpacing = (1.15).sp
    ),
    bodySmall = TextStyle(
        fontFamily = fontFamilyKulim,
        fontSize = 12.sp,
        letterSpacing = (1.15).sp
    ),
    displayLarge = TextStyle(fontFamily = fontFamilyLato),
    displayMedium = TextStyle(fontFamily = fontFamilyLato),
    displaySmall = TextStyle(fontFamily = fontFamilyLato),


    titleLarge = TextStyle(fontFamily = fontFamilyLato),
    titleMedium = TextStyle(fontFamily = fontFamilyLato),
    titleSmall = TextStyle(fontFamily = fontFamilyLato),

    bodyMedium = TextStyle(fontFamily = fontFamilyLato),

    labelLarge = TextStyle(fontFamily = fontFamilyLato),
    labelSmall = TextStyle(fontFamily = fontFamilyLato)
)