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
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ListItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.composables.InsetAwareTopAppBar
import com.example.androiddevchallenge.data.doggos
import dev.chrisbanes.accompanist.insets.LocalWindowInsets
import dev.chrisbanes.accompanist.insets.toPaddingValues

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ListScreen(title: String, modifier: Modifier = Modifier, onDoggoClick: (Int) -> Unit) {
    var topAppBarSize by remember { mutableStateOf(0) }
    val navController = rememberNavController()

    Surface {
        Box(
            modifier = modifier,
        ) {

            LazyColumn(
                contentPadding = LocalWindowInsets.current.systemBars
                    .toPaddingValues(
                        top = false,
                        additionalTop = with(LocalDensity.current) { topAppBarSize.toDp() }
                    )
            ) {
                items(doggos) { doggo ->
                    ListItem(
                        text = { Text(doggo.name) },
                        icon = {
                            Image(
                                painter = painterResource(id = doggo.image),
                                contentDescription = doggo.name
                            )
                        },
                        modifier = Modifier.clickable {
                            onDoggoClick(doggo.id)
                        }
                    )
                }
            }
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
