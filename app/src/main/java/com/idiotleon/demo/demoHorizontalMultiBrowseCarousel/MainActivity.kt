package com.idiotleon.demo.demoHorizontalMultiBrowseCarousel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel
import androidx.compose.material3.carousel.rememberCarouselState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
            ) {
                HorizontalMultiBrowseCarousel(
                    state = rememberCarouselState { 10 },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(221.dp),
                    preferredItemWidth = 333.dp,
                    itemSpacing = 8.dp,
                    contentPadding = PaddingValues(horizontal = 16.dp),
                ) { index ->
                    Image(
                        painter = painterResource(id = R.mipmap.ic_loading_placeholder_landscape),
                        contentDescription = null,
                        modifier = Modifier
                            .height(height = 205.dp)
                            .maskClip(shape = MaterialTheme.shapes.extraLarge),
                        contentScale = ContentScale.FillWidth,
                    )
                }

                Spacer(modifier = Modifier.height(height = 8.dp))

                HorizontalMultiBrowseCarousel(
                    state = rememberCarouselState { 10 },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(221.dp),
                    preferredItemWidth = 333.dp,
                    itemSpacing = 8.dp,
                    contentPadding = PaddingValues(horizontal = 16.dp),
                ) { index ->
                    Image(
                        painter = painterResource(id = R.mipmap.ic_loading_placeholder_landscape),
                        contentDescription = null,
                        modifier = Modifier
                            .height(height = 205.dp)
                            .maskClip(shape = MaterialTheme.shapes.extraLarge),
                        contentScale = ContentScale.FillWidth,
                    )
                }

                Spacer(modifier = Modifier.height(height = 8.dp))

                HorizontalMultiBrowseCarousel(
                    state = rememberCarouselState { 10 },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(221.dp),
                    preferredItemWidth = 333.dp,
                    itemSpacing = 8.dp,
                    contentPadding = PaddingValues(horizontal = 16.dp),
                ) { index ->
                    Image(
                        painter = painterResource(id = R.mipmap.ic_loading_placeholder_landscape),
                        contentDescription = null,
                        modifier = Modifier
                            .height(height = 205.dp)
                            .maskClip(shape = MaterialTheme.shapes.extraLarge),
                        contentScale = ContentScale.FillWidth,
                    )
                }

                Spacer(modifier = Modifier.height(height = 8.dp))

                HorizontalMultiBrowseCarousel(
                    state = rememberCarouselState { 10 },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(221.dp),
                    preferredItemWidth = 333.dp,
                    itemSpacing = 8.dp,
                    contentPadding = PaddingValues(horizontal = 16.dp),
                ) { index ->
                    Image(
                        painter = painterResource(id = R.mipmap.ic_loading_placeholder_landscape),
                        contentDescription = null,
                        modifier = Modifier
                            .height(height = 205.dp)
                            .maskClip(shape = MaterialTheme.shapes.extraLarge),
                        contentScale = ContentScale.FillWidth,
                    )
                }

                Spacer(modifier = Modifier.height(height = 8.dp))

                HorizontalMultiBrowseCarousel(
                    state = rememberCarouselState { 10 },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(221.dp),
                    preferredItemWidth = 333.dp,
                    itemSpacing = 8.dp,
                    contentPadding = PaddingValues(horizontal = 16.dp),
                ) { index ->
                    Image(
                        painter = painterResource(id = R.mipmap.ic_loading_placeholder_landscape),
                        contentDescription = null,
                        modifier = Modifier
                            .height(height = 205.dp)
                            .maskClip(shape = MaterialTheme.shapes.extraLarge),
                        contentScale = ContentScale.FillWidth,
                    )
                }

                Spacer(modifier = Modifier.height(height = 8.dp))

                HorizontalMultiBrowseCarousel(
                    state = rememberCarouselState { 10 },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(221.dp),
                    preferredItemWidth = 333.dp,
                    itemSpacing = 8.dp,
                    contentPadding = PaddingValues(horizontal = 16.dp),
                ) { index ->
                    Image(
                        painter = painterResource(id = R.mipmap.ic_loading_placeholder_landscape),
                        contentDescription = null,
                        modifier = Modifier
                            .height(height = 205.dp)
                            .maskClip(shape = MaterialTheme.shapes.extraLarge),
                        contentScale = ContentScale.FillWidth,
                    )
                }

                Spacer(modifier = Modifier.height(height = 8.dp))
            }
        }
    }
}