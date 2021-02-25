/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ExtendedFloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Pets
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.composables.InsetAwareTopAppBar
import com.example.androiddevchallenge.data.doggos
import dev.chrisbanes.accompanist.insets.LocalWindowInsets
import dev.chrisbanes.accompanist.insets.navigationBarsPadding
import dev.chrisbanes.accompanist.insets.toPaddingValues
import kotlin.math.min

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun DetailScreen(dogId: Int, title: String, modifier: Modifier = Modifier) {
    var topAppBarSize by remember { mutableStateOf(0) }
    val doggo = doggos[dogId]
    val scrollState = rememberScrollState()

    Surface {
        Box(
            modifier = modifier,
        ) {

            Column(
                modifier = Modifier
                    .padding(
                        LocalWindowInsets.current.systemBars
                            .toPaddingValues(
                                top = false,
                                additionalTop = with(LocalDensity.current) { topAppBarSize.toDp() }
                            )
                    )
                    .fillMaxHeight()
                    .verticalScroll(scrollState)

            ) {
                Image(
                    painter = painterResource(id = doggo.bigImage),
                    contentScale = ContentScale.Crop,
                    contentDescription = doggo.name,
                    modifier = Modifier
                        .fillMaxWidth()
                        .graphicsLayer {
                            alpha = min(1f, 1 - (scrollState.value / 600f))
                            translationY = -scrollState.value * 0.1f
                        }
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    "${doggo.name}",
                    fontSize = 24.sp,
                    modifier = Modifier.padding(all = 8.dp)
                )
                Text(
                    "Breed: ${doggo.breed}",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(all = 8.dp)
                )
                Text(
                    "${doggo.origin}",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(all = 8.dp)
                )
                Text(
                    "Gender: ${doggo.gender}",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(all = 8.dp)
                )
                Text(
                    "Age: ${doggo.age}",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(all = 8.dp)
                )
                Row(
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {

                    Text(
                        "Country of Origin: ${doggo.origin}",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(all = 8.dp)
                    )
                    Spacer(Modifier.width(8.dp))
                    Image(
                        painter = painterResource(id = doggo.originFlag),
                        contentDescription = doggo.origin,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .height(32.dp)
                            .width(32.dp)
                    )
                }
                Text(
                    "Lifespan: ${doggo.lifeSpan}",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(all = 8.dp)
                )
                Text(doggo.description, Modifier.padding(all = 8.dp))
            }
            ExtendedFloatingActionButton(
                text = { Text("ADOPT") },
                onClick = { },
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .navigationBarsPadding()
                    .padding(16.dp),
                icon = {
                    Icon(
                        imageVector = Icons.Default.Pets,
                        contentDescription = "Adopt"
                    )
                }
            )
            InsetAwareTopAppBar(
                title = { Text(title) },
                backgroundColor = MaterialTheme.colors.surface.copy(alpha = 0.9f),
                modifier = Modifier
                    .fillMaxWidth()
                    .onSizeChanged { topAppBarSize = it.height }
            )
        }
    }
}
