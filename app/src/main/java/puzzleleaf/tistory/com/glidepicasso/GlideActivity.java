package puzzleleaf.tistory.com.glidepicasso;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.request.RequestOptions;

public class GlideActivity extends AppCompatActivity {

    ImageView gli1;
    ImageView gli2;
    ImageView gli3;
    ImageView gli4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);

        gli1 = (ImageView)findViewById(R.id.gli1);
        gli2 = (ImageView)findViewById(R.id.gli2);
        gli3 = (ImageView)findViewById(R.id.gli3);
        gli4 = (ImageView)findViewById(R.id.gli4);

        //포맷 설정
        //RequestOptions으로 다양한 효과를 적용할 수 있다.
        //이미지를 로딩하는 중에 placeholder로 지정한 이미지가 출력된다.
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.format(DecodeFormat.PREFER_ARGB_8888).placeholder(R.drawable.ing);

        //Circle 모양으로 자른다.
        Glide.with(this).load(R.drawable.firework)
                .apply(requestOptions.fitCenter().circleCrop())
                .into(gli1);

        //error은 에러 상황에 보여줄 이미지 이다.
        //인터넷 퍼미션을 안줘서 에러 발생
        Glide.with(this)
                .load("http://japan-magazine.jnto.go.jp/jnto2wm/wp-content/uploads/1506_fireworks_main.jpg")
                .apply(requestOptions.error(R.drawable.error))
                .into(gli2);

        //Gif 불러오기
        //TODO (1)raw 디렉토리 만들기
        //TODO (2)gif 파일 넣어두기
        Glide.with(this).load(R.raw.test).into(gli3);
        Glide.with(this).load(R.raw.test)
                .apply(new RequestOptions().format(DecodeFormat.PREFER_ARGB_8888).optionalCircleCrop())
                .into(gli4);

    }
}
