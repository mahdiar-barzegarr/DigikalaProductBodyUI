package ir.company.product_body_digikala

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices.PIXEL_6
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Composable
fun ProductBody() {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(WindowInsets.statusBars.asPaddingValues())
    ) {
        item{
            HorizontalDivider(
                modifier = Modifier.padding(horizontal = 14.dp),
                thickness = 2.dp,
                color = Color.Red
            )

            Image(
                painter = painterResource(R.drawable.product),
                contentDescription = "product photo",
                modifier = Modifier.fillMaxWidth().padding(top = 16.dp)
            )

            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.padding(start = 18.dp, top = 18.dp)
            ) {

                val colors = listOf<Color>(Color.Gray, Color.Gray, Color.Black)

                repeat(3){index->
                    Box(
                        modifier = Modifier
                            .size(10.dp)
                            .clip(CircleShape)
                            .background(colors[index])
                    )
                }

            }

            Box(

            ){
                Text(
                    "قوتو چل گیاه رضا بیجاری - 500گرم",
                    modifier = Modifier.fillMaxWidth().padding(top = 32.dp, end = 16.dp),
                    fontSize = 22.sp,
                    textAlign = TextAlign.End,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif
                    )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier.fillMaxWidth()
                ) {


                    
                }
            }
        }

    }

}

@Preview(
    showBackground = true,
    device = PIXEL_6,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    ProductBody()
}