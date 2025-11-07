package com.example.restaurant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.RestaurantMenu
import androidx.compose.material.icons.filled.WorkspacePremium
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.material.icons.outlined.WorkspacePremium
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.BeyondBoundsLayout
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.restaurant.ui.theme.RestaurantTheme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RestaurantTheme {
                Sobre()
            }
        }
    }
}


@Composable
fun Sobre() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(25.dp)
    ) {
        val titleTextStyle = TextStyle(
            fontFamily = FontFamily.SansSerif,
            fontSize = 36.sp,
            textAlign = TextAlign.Center
        )
        val normalTextStyle = TextStyle(
            fontFamily = FontFamily.SansSerif, fontSize = 20.sp,
            lineHeight = 30.sp
        )

        Text(
            text = "Nossa História",
            style = titleTextStyle,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(25.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(4f / 3f)
                .clip(RoundedCornerShape(12.dp))
        ) {
            Image(
                painter = painterResource(R.drawable.restaurant),
                contentDescription = "Imagem generica de restaurante",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds,
            )
        }

        Spacer(modifier = Modifier.height(25.dp))

        Text(
            text = """
            Desde 2010, o Sabor Moderno tem sido uma referência em alta gastronomia, combinando técnicas tradicionais com toques contemporâneos para criar experiências culinárias inesquecíveis.

            Nosso chef executivo, formado nas melhores escolas de culinária da Europa, traz sua paixão e criatividade para cada prato.
        """.trimIndent(),
            style = normalTextStyle
        )

        Spacer(modifier = Modifier.height(50.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
                    .border(1.dp, Color.Black, RoundedCornerShape(15.dp))
                    .background(Color(0xFFFFFBEB)),
                contentAlignment = Alignment.Center,
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Icon(
                        imageVector = Icons.Outlined.WorkspacePremium,
                        tint = Color(0xFFE17100),
                        contentDescription = "Icone de estrela",
                        modifier = Modifier.size(36.dp)
                    )
                    Spacer(modifier = Modifier.height(25.dp))
                    Text(
                        text = "Prêmios Gastronômicos",
                        style = normalTextStyle,
                        textAlign = TextAlign.Center
                    )
                }
            }

            Spacer(modifier = Modifier.width(25.dp))

            Box(
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
                    .border(1.dp, Color.Black, RoundedCornerShape(15.dp))
                    .background(Color(0xFFFFFBEB)),
                contentAlignment = Alignment.Center,
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Icon(
                        imageVector = Icons.Outlined.StarOutline,
                        tint = Color(0xFFE17100),
                        contentDescription = "Icone de estrela",
                        modifier = Modifier.size(36.dp)
                    )
                    Spacer(modifier = Modifier.height(25.dp))
                    Text(text = "5 Estrelas", style = normalTextStyle, textAlign = TextAlign.Center)
                }
            }

            Spacer(modifier = Modifier.width(25.dp))

            Box(
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
                    .border(1.dp, Color.Black, RoundedCornerShape(15.dp))
                    .background(Color(0xFFFFFBEB)),
                contentAlignment = Alignment.Center,
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        imageVector = Icons.Filled.RestaurantMenu,
                        tint = Color(0xFFE17100),
                        contentDescription = "Icone de estrela",
                        modifier = Modifier.size(36.dp)
                    )
                    Spacer(modifier = Modifier.height(25.dp))
                    Text(
                        text = "Chef Premiado",
                        style = normalTextStyle,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}