package com.example.pam

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun LoginScreen() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        // Gambar background ditaruh di DALAM fungsi Box
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "Background",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
}

Column(
modifier = Modifier
.fillMaxSize()
.padding(top = 40.dp, bottom = 24.dp),
horizontalAlignment = Alignment.CenterHorizontally,
verticalArrangement = Arrangement.SpaceBetween
) {
    // Content sections
}

Text(
text = "Login",
color = Color.Blue,
fontSize = 32.sp,
fontWeight = FontWeight.Bold
)

Text(
text = "Ini adalah halaman login,",
color = Color.White,
fontSize = 16.sp
)

Image(
painter = painterResource(id = R.drawable.logo_umy),
contentDescription = "Logo UMY",
modifier = Modifier.size(140.dp)
)