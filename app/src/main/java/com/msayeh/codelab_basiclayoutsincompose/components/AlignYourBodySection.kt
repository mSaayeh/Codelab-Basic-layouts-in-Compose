package com.msayeh.codelab_basiclayoutsincompose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.msayeh.codelab_basiclayoutsincompose.ui.theme.CodelabBasicLayoutsInComposeTheme
import com.msayeh.codelab_basiclayoutsincompose.utils.DrawableStringPair
import com.msayeh.codelab_basiclayoutsincompose.utils.alignYourBodyData

// Step: Align your body - Alignment
@Composable
fun AlignYourBodyElement(
    element: DrawableStringPair,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = element.drawable),
            contentDescription = null,
            modifier = Modifier
                .clip(
                    CircleShape
                )
                .size(width = 88.dp, height = 88.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            text = stringResource(element.text),
            style = MaterialTheme.typography.headlineSmall,
            textAlign = TextAlign.Center,
            modifier = Modifier.paddingFromBaseline(top = 24.dp)
        )
    }
}

// Step: Align your body row - Arrangements
@Composable
fun AlignYourBodyRow(
    modifier: Modifier = Modifier,
    elementList: List<DrawableStringPair> = alignYourBodyData
) {
    LazyRow(
        modifier = modifier.fillMaxWidth(),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(elementList) { element ->
            AlignYourBodyElement(element = element)
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun AlignYourBodyElementPreview() {
    CodelabBasicLayoutsInComposeTheme {
        AlignYourBodyElement(
            modifier = Modifier.padding(8.dp),
            element = alignYourBodyData[0]
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun AlignYourBodyRowPreview() {
    CodelabBasicLayoutsInComposeTheme { AlignYourBodyRow() }
}
