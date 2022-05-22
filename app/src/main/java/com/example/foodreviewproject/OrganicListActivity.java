package com.example.foodreviewproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.foodreviewproject.databinding.ActivityOrganicListBinding;

import java.util.ArrayList;

public class OrganicListActivity extends AppCompatActivity {

    ActivityOrganicListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrganicListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageId = {R.drawable.hutieu, R.drawable.canhnamhatsen, R.drawable.dauhuxao, R.drawable.canhrongbien, R.drawable.nemran};

        String[] organic_name = {"Hủ Tiếu Chay", "Canh Nấm Hạt Sen", "Đậu Hủ Xào Rau Củ", "Canh Rong Biển Hạt Sen", "Nem Rán Chay"};

        String[] organic_price = {"30.000đ - 45.000đ", "30.000đ - 50.000đ", "30.000đ - 45.000đ", "80.000đ - 100.000đ", "30.000đ - 45.000đ"};

        String[] organic_material = {
                "Hủ tiếu: 70 Gram\nCải thảo: 4 Lá\nCà rốt: 1/4 Củ\nCủ cải trắng: 1 Củ vừa\nNấm đông cô (Tươi): 15 Gram\nTàu hũ ky: 5 Gram\nĐậu hũ chiên: 2 Miếng\nChả lụa chay: 20 Gram\nHẹ: 5 Gram\nNgò rí: 1 Nhánh\nHành boa rô: 1 cây\nGiá đỗ: 20 Gram\nXà lách: 1 Bắp vừa\nMuối: 3/4 Muỗng cà phê\nĐường trắng: 1/2 Muỗng cà phê\nBột ngọt: 1/2 Muỗng cà phê\nĐường phèn: 5 Gr\nNước tương: 1 Muỗng cà phê\nHạt nêm chay: 1/2 Muỗng cà phê\nChanh, ớt (tùy ý thích)",

                "Hạt sen: 50g\nNấm đông cô tươi : 50g\nNấm linh chi : 50g\nCà rốt : 1/2 cây\nĐậu hũ non : 100g\nNgò rí\nTiêu\nHạt nêm",

                "Đậu hũ 1 miếng\nỚt chuông xanh/ vàng/ đỏ 1/2 trái\nNấm đông cô tươi 3 cây (có thể dùng khô)\n Hành tây 1 củ\n Mè rang 1 muỗng cà phê\n Nước tương 4 muỗng cà phê\n Dầu mè 1 muỗng canh\n Dầu ăn 2 muỗng canh \n Đường ngô 4 muỗng canh (có thể thay bằng đường trắng)\n Muối 1 muỗng cà phê",

                "Rong biển khô: 100g\nHạt sen khô hoặc tươi đều được. Nếu được, hãy dùng hạt sen tươi để rút ngắn thời gian nấu\nCà rốt: 1 củ nhỏ\nNấm rơm: 100g\nGừng: 1 nhánh nhỏ: có tác dụng át chế mùi tanh của rong biển\nGia vị: hạt nêm chay, tiêu xay, muối",

                "Bánh đa nem: 1 gói\nMiến: 50-100 g\nCà rốt, hành tây mỗi thứ ½ củ\nNấm hương, mộc nhĩ: 4-5 tai (ngâm nở, rửa sạch)\nGiá đỗ: 100 g\nHành hoa, rau mùi (ngò)\nDầu ăn, bột canh, mì chính, hạt tiêu"
        };

        String[] organic_method = {

                "+ Bước 1: Nấu nước dùng hủ tiếu :  Bắc chảo lên bếp, cho gốc hành boa rô băm nhỏ vào khử cho thơm, sau đó cho nấm đông cô vào chảo, cho nước tương vào xào đều khoảng 2-3 phút rồi nhắc xuống.\nCho một lượng nước vừa đủ khẩu phần vào một nồi, đun tới sôi thì cho cà rốt và củ cải trắng vào nấu cho ra nước ngọt, đến khi mềm thì rút nấm đã xào vào.\nTiếp tục nấu sôi thì cho hết phần cải thảo còn lại vào, giảm lửa để cải thảo không bị mềm bấy. Nêm nếm gia vị: muối, bột ngọt, đường, hạt nêm chay cho vừa ăn.\n+ Bước 2: Hoàn thành : Trụng hủ tiếu sơ qua với nước sôi để khi chế nước dùng nóng vào không bị bấy.\nSắp chả chay và rắc ngò rí với hẹ lên trên. Múc đầy đủ cà rốt, cải thảo, nấm, tàu hũ lên rồi chan nước dùng vào.",

                "+ Bước 1: Sơ chế : Cà rốt tỉa hoa, cắt lát. Nấm các loại sơ chế sạch, để ráo. Ngò rí cắt nhỏ.\nĐậu hũ non cắt miếng vừa ăn.\n+ Bước 2: Thực hiện : Đun sôi 1 lít nước, cho hạt sen và cà rốt vào nấu khoảng 10 phút, tiếp tục cho các loại nấm vào nấu chín, nêm 3M hạt nêm Aji-ngon từ nấm hương và hạt sen, cho đậu hũ vào tắt bếp, rắc thêm tiêu và ngò rí.",

                "+ Bước 1: Sơ chế nguyên liệu : Ngâm nấm đông cô trong nước ấm khoảng 1 - 2 phút để sạch hết đất và bụi bẩn bám trên thân nấm. Sau đó vớt ra và rửa sạch dưới vòi nước.\nNấm đông cô cắt bỏ chân nấm rồi cắt thành những lát mỏng vừa ăn.\n+ Bước 2: Sơ chế và chiên đậu hũ : Đậu hũ mua về rửa sơ qua nước rồi để thật ráo, sau đó cắt thành những lát dày khoảng 1/2 đốt ngón tay.\nBắc chảo lên bếp và cho vào 2 muỗng canh dầu ăn, đun nóng. Khi dầu nóng, cho đậu hũ vào chiên trong 5 - 7 phút ở lửa vừa cho đến khi đậu hũ được vàng giòn thì vớt ra cho ráo dầu.\nĐậu hũ sau khi chiên, bạn cắt thành sợi dài tương đương phần rau củ.\n+ Bước 3: Xào đậu hũ với rau củ : Trên cùng chảo dầu chiên đậu, bạn đun nóng chảo rồi cho các loại rau và nấm vào xào trong 3 - 5 phút ở lửa lớn, nêm thêm 1 muỗng cà phê muối vào và đảo đều cho đến khi hành tây bắt đầu đổi màu trong và ớt chuông mềm. Sau đó, bạn cho phần đậu hũ vào và đảo đều.\nCho vào 4 muỗng cà phê nước tương và 4 muỗng cà phê đường ngô, đảo đều. Xào khoảng 2 - 3 phút để tất cả nguyên liệu thấm đều gia vị rồi tắt bếp. Cho vào 1 muỗng canh dầu mè và 1 muỗng cà phê mè rang vào, đảo qua rồi qua thấm đều gia vị rồi nêm nếm lại cho vừa ăn, bày ra đĩa.\n+ Bước 4: hành phẩm : Đậu hũ xào rau củ có màu sắc đẹp mắt, vừa chín tới lại thấm vị, cực kì thơm ngon mà lại không hề bị nhiều dầu mỡ, thích hợp để ăn vào những ngày nóng bức hoặc khi bạn cảm thấy ngán các món thịt cá.\nMón ăn được ăn kèm với cơm nóng là ngon hết ý luôn!",

                "+ Bước 1: Sơ chế nguyên liệu : Cho rong biển khô vào nước ngâm cho nở rồi đem vớt ra để ráo nước.\nCà rốt đem gọt vỏ, rửa sạch, tỉa hoa và thái miếng mỏng vừa.\nGừng cạo vỏ, đem đập rập.\nNấm rơm rửa sạch với nước ấm, cắt thành miếng nhỏ vừa ăn.\nHạt sen tươi đem bóc bỏ vỏ, bỏ phần tâm sen đi, rửa sạch lại rồi để ráo nước.\n+ Bước 2: Cho khoảng 500ml nước lạnh vào nồi, sau đó cho hạt sen cùng gừng đã dập vào đun. Đun trong khoảng 8 phút để hạt sen mềm hơn, sau đó mới tiếp tục cho cà rốt, nấm rơm vào nấu cùng. Nêm các loại gia vị.\n+ Bước 3: Đợi đến khi bạn thấy hạt sen đã chín mềm, cà rốt cũng chín tới thì mới bắt đầu cho rong biển vào. Đun sôi lại rồi tắt bếp là xong rồi. Rong biển không nên nấu quá lâu sẽ bị nhừ quá, ăn không ngon.",

                "Các nguyên liệu rửa sạch, hành tây thái mỏng, cà rốt, mộc nhĩ, nấm hương thái sợi nhỏ, hành hoa, rau mùi (ngò) thái nhỏ.\nCho các nguyên liệu trên vào bát to, cho miến  (ngâm nước ấm, cắt nhỏ) thêm chút xíu bột canh, mì chính, hạt tiêu (hạt tiêu tùy theo khẩu vị ăn) và trộn đều.\nChải bánh đa nem, cho nhân vừa đủ, cuộn tròn bánh đa nem, làm cho đến khi hết nhân nem\nĐun sôi dầu trong chảo, thả nem vào và rán vàng hai mặt.\nGắp ra đĩa và chấm với nước mắm chua cay mặn ngọt. "
        };

        String[] organic_location = {
                "24 Lò Siêu, Phường 16, Quận 11, Thành phố Hồ Chí Minh\n24 Phú Thọ, Phường 2, Quận 11, Thành phố Hồ Chí Minh",

                "12 Lê Lăng, Phú Thọ Hoà, Tân Phú, Thành phố Hồ Chí Minh\nAn D. Vương, Bình Trị Đông, Bình Tân, Thành phố Hồ Chí Minh",

                "188 Đường Hàn Hải Nguyên, Phường 8, Quận 11, Thành phố Hồ Chí Minh\n54A Trương Phước Phan, Bình Trị Đông, Bình Tân, Thành phố Hồ Chí Minh",

                "142 Trần Quý, Phường 6, Quận 11, Thành phố Hồ Chí Minh\n280 Lãnh Binh Thăng, Phường 8, Quận 11, Thành phố Hồ Chí Minh",

                "86 Đường Hàn Hải Nguyên, Phường 2, Quận 11, Thành phố Hồ Chí Minh"
        };
        double[] locateX = {
                10.75555253666536,
                10.784470656741808,
                10.758763783409792,
                10.759283491280144,
                10.758386088576215
        };

        double[] locateY = {
                106.648260851844,
                106.62378818732415,
                106.64633385613894,
                106.65477552838261,
                106.64861118756251
        };

        ArrayList<Organic> organicArrayList = new ArrayList<>();


        for(int i = 0; i < imageId.length; i++){

            Organic organic = new Organic(organic_name[i], organic_price[i], organic_material[i], organic_method[i], organic_location[i], imageId[i],locateX[i],locateY[i]);
            organicArrayList.add(organic);

        }

        OrganicListAdapter listAdapter = new OrganicListAdapter(OrganicListActivity.this, organicArrayList);

        binding.olistview.setAdapter(listAdapter);
        binding.olistview.setClickable(true);
        binding.olistview.setOnItemClickListener((parent, view, position, id) ->{


                Intent i = new Intent(OrganicListActivity.this, OrganicDetailsActivity.class);
                i.putExtra("name", organic_name[position]);
                i.putExtra("price", organic_price[position]);
                i.putExtra("material", organic_material[position]);
                i.putExtra("imageId", imageId[position]);
                i.putExtra("location", organic_location[position]);
                i.putExtra("method", organic_method[position]);
                i.putExtra("locateX",locateX[position]);
                i.putExtra("locateY",locateY[position]);
                startActivity(i);


        });

    }
}