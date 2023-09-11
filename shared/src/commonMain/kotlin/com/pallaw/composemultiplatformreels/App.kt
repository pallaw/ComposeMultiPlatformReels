package com.pallaw.composemultiplatformreels

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun App() {

    val reels = (0 until 10).toList()

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        VerticalPager(
            pageCount = reels.size,
        ) { index ->
            Text(
                text = "Page $index",
                style = TextStyle(
                    fontSize = 60.sp
                )
            )
        }
    }
}