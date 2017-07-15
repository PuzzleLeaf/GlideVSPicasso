package puzzleleaf.tistory.com.glidepicasso;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import puzzleleaf.tistory.com.glidepicasso.R;


public class PicassoActivity extends AppCompatActivity {

    ImageView pica1;
    ImageView pica2;
    ImageView pica3;
    ImageView pica4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso);
        pica1 = (ImageView)findViewById(R.id.pica1);
        pica2 = (ImageView)findViewById(R.id.pica2);
        pica3 = (ImageView)findViewById(R.id.pica3);
        pica4 = (ImageView)findViewById(R.id.pica4);

        Picasso.with(this).load(R.drawable.firework)
                .rotate(50)
                .into(pica1);

        Picasso.with(this).load("http://japan-magazine.jnto.go.jp/jnto2wm/wp-content/uploads/1506_fireworks_main.jpg")
                .placeholder(R.drawable.ing)
                .error(R.drawable.error)
                .into(pica2);

        Picasso.with(this).load(R.drawable.firework).into(pica3);

        Picasso.with(this).load(R.drawable.firework).resize(300,100).into(pica4);



    }
}
