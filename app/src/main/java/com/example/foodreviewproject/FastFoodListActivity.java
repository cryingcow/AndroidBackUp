package com.example.foodreviewproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.foodreviewproject.databinding.ActivityFastFoodListBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FastFoodListActivity extends AppCompatActivity {
    ActivityFastFoodListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFastFoodListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageId = {R.drawable.spaghetti, R.drawable.pizza, R.drawable.banhmi, R.drawable.banhmicuon, R.drawable.hamburger, R.drawable.bittet};

        String[] ff_name = {"Mì Spaghetti", "Pizza", "Bánh Mì Kẹp", "Bánh Mì Cuộn", "Hamburger", "Bít Tết Phô Mai"};

        String[] ff_price = {"50.000đ - 70.000đ", "50.000đ - 70.000đ", "15.000đ - 30.000đ", "15.000đ - 30.000đ", "15.000đ - 30.000đ", "40.000đ - 60.000đ"};

        String[] ff_material = {"Khoảng 450 gr thịt bò xay\n1 củ hành tây cắt nhỏ\n2 thìa cà phê muối\n3 thìa cà phê hạt tiêu\n2 nhánh tỏi băm\n30 gram sốt cà chua đặc (nguyên chất)\n425 gram sốt cà chua (ketchup)\nKhoảng 800 gram cà chua tươi cắt nhỏ\n4 thìa cà phê cỏ xạ hương khô\n2 thìa cà phê húng quế khô\n2 thìa cà phê cỏ hương thảo khô\n1 thìa cà phê kinh giới tây khô\n1 thìa cà phê lá thơm (bay leaf) nghiền",

        "100gr bột mì\n5gr men nở\n150ml nước\n1 thìa dầu olive\nPhô mai ( nên chọn các loại phomai có thương hiệu tại châu Âu nhé)\nSốt cà chua. Bạn có thể tự mua bên ngoài hoặc cũng có thể tự chế biến cho theo sở thích nhé.\nNhân pizza",

        "Bánh mì: 4 ổ\nThịt heo: 300 gram\nRau răm: 1 mớ\nRượu trắng: 30m\nNước lọc: 50ml\nỚt: 2 quả\nTỏi: 1 củ\nDưa leo: 1 quả",

         "250g bột mì số 13\n1 quả trứng\n100ml sữa tươi không đường\n2g muối\n3g men nở\n50g đường\n30g bơ",

         "Hành tây, hành khô, tỏi\nBột năng, muối và gia vị\nTrứng\nBột chiên xù\nRau xà lách\nRau mùi thơm\nDưa chuột\nBánh mì tròn",

         "Thịt thăn lưng bò 500 gr\n Nấm mỡ trắng 100 gr (hoặc nẫm mỡ nâu)\n Phô mai lát 4 lát\n Bơ lạt 200 gr\n Sữa tươi không đường 150 ml\n Rau xà lách caron 2 bó\n Cà chua bi 200 gr\n Hạt bắp Mỹ 100 gr (khoảng 7 muỗng canh)\n Hành tây 1 củ\n Tỏi 6 tép\n Sốt teriyaki 2 muỗng canh\n Sốt mè rang 3 muỗng canh\n Dầu hào 1/2 muỗng canh\n Bột năng 2 muỗng cà phê\n Dầu oliu 200 ml\n Nước cốt chanh 2 muỗng canh\n Mật ong 1 muỗng canh\n Bột ớt 1 muỗng cà phê\n Muối/tiêu 1 ít"

        };

        String[] ff_method = {
                "Cho thịt bò xay và chảo chống dính, rộng và sâu, để lửa vừa và đảo tới khi thịt chuyển sang màu nâu (loại bỏ mỡ nếu có).\nCho tiếp hành vào đảo tới khi hành chín mềm, nêm gia vị muối, tiêu.\nTrộn tỏi vào hỗn hợp 3 loại cà chua với nhau, sau đó, đổ tất vào chảo thịt.\nCho tiếp các loại thảo mộc vào cùng. Đậy lại và đun liu riu ở lửa nhỏ khoảng 30 phút là được.",

                "Đầu tiên, bạn nướng rau củ gồm cà tím và bí ngô ở nhiệt độ 230ºC trong thời gian 15 phút. Trong quá trình nướng, bạn cần lật qua miếng rau củ để nguyên liệu không bị khô. Sau đó, bạn sơ chế qua hành tây, ớt chuông bằng cách xào trên bếp từ 4 đến 5 phút. Cuối cùng, bạn xếp nhân lên bánh pizza theo thứ tự: Phô mai, cà tím, bí ngô, hành tây và ớt chuông rồi bỏ bánh vào lò, nướng trong 20 phút ở nhiệt độ 230ºC.\nVới pizza chay nấm bông cải, bạn phết một lớp sốt cà chua lên bánh rồi đặt topping theo thứ tự: Ớt chuông, bông cải, nấm đùi gà, hành tây, cà chua và phô mai bào sợi. Sau đó, bạn nướng bánh ở nhiệt độ 200ºC trong 15 đến 20 phút để bánh chín.",

                "+ Bước 1: Sơ chế nguyên liệu :Rửa sạch thịt heo với nước muối loãng, để ráo nước. Tiếp theo, khứa vài đường lên trên miếng thịt rồi dùng xiên đâm nhẹ lên phần bì để gia vị thấm đều vào thịt.\nBóc vỏ tỏi, rửa tỏi với ớt cho sạch, băm nhỏ.\nNgắt phần non của rau răm, cũng rửa sạch và để ráo nước.\nCắt hai đầu của dưa leo để nhựa chảy ra, ngâm một lúc trong nước muối loãng. Sau đó cắt dưa thành các lát mỏng.\n+ Bước 2: Cách ướp thịt heo quay : Trộn đều muối, ngũ vị hương, 1 thìa đường, giấm, tiêu xay và rượu trắng trong bát để các nguyên liệu hòa quyện vào nhau.\nDùng cọ phết hỗn hợp gia vị lên thịt, dùng  tay bóp nhẹ miếng thịt.\nLau sạch gia vị trên phần bì, để yên thịt khoảng 4 tiếng.\nCách làm nước xốt bánh mì thịt heo quay\nCho ớt băm, tỏi băm, nước lọc, nước mắm cùng 1 thìa cà phê đường vào bát, khuấy đều đến khi đường tan hết là xong phần nước xốt của bánh mì thịt heo quay.\n+ Bước 3: Hoàn thành và hưởng thức : Nếu bánh mì bị mềm, hãy cho vào lò vi sóng hoặc chảo để quay nóng. Sau đó, xẻ dọc ổ bánh, lần lượt cho thịt heo quay, rau rắm, dưa leo và rưới nước xốt lên trên là xong.\nBánh mì thịt heo quay ngon nhất là khi mới được làm xong, bạn có thể thưởng thức bánh vào bất cứ lúc nào khi mình đói. Nếu muốn tăng hương vị, hãy thêm một chút đồ chua (củ cải, cà rốt, đu đủ) và tương ớt cay cay.",

                "Để làm bánh, các bạn sẽ trộn đều các nguyên liệu bằng tay với các động tác gập bột và đập bột một cách cơ bản nhất.\nNếu thời tiết nóng bức, bạn sẽ chỉ cần mất 20 phút để bột nở đạt. Hãy canh giờ và quan sát bột nếu bạn không muốn bánh mì của bạn chỉ toàn mùi chua của men.\nBột sau khi nở đạt sẽ ấn xẹp bột, nhồi sơ lại từ 5-10 phút. Tùy vào các loại khuôn mà các bạn sẽ chia thành các phần bằng nhau. Hiện nay, bánh mì cuộn len được nhiều bạn trẻ biết đến với những hình tròn được ghép từ 4 miếng bột, giống như 4 cuộn len được chắp lại.\nMỗi một miếng bột các bạn sẽ cán thành hình chữ nhật dài, một đầu sẽ sử dụng dao sắc hoặc dụng cụ rạch bánh chuyên nghiệp rạch thật nhiều đường.\nCuộn lại từ phần bột chưa cắt, mép bột được nên được chỉnh lại để khi bánh nở sẽ không bị mất thớ. Các bạn xếp đều 4 phần bột và khuôn tròn đã được chống dính.\nCác bạn sẽ để bánh nở đến khi gấp đôi thì bật lò 180 độ C nướng 20 phút. Trước khi nướng, các bạn nên quét một lớp lòng đỏ trứng mỏng lên bề mặt bánh để bánh mì cuộn len có màu nâu vàng bắt mắt hơn. ",

                "+ Bước 1; Cho thịt bò, bột chiên xù, trứng gà vào bát to, trộn đều. Thêm 1 thìa nước mắm, 2 thìa đường vào trộn tiếp, ướp trong 30 phút cho hỗn hợp thịt, trứng, bột ngấm đều gia vị.\n+ Bước 2: Hành tây bóc vỏ, rửa sạch, thái miếng nhỏ vừa. Cà chua rửa sạch, thái khoanh nhỏ vừa ăn. Xà lách bỏ cuống, rửa sạch, tách từng lá một.\nĐun nóng dầu ăn, cho hành tây vào xào tái rồi đổ ra để ráo dầu. Hành tây sau khi xào sẽ bớt cay nồng, dễ ăn hơn.\nNặn hỗn hợp thịt bò thành bốn phần tròn, dẹt, có đường kính bằng với đường kính bánh mì đã chuẩn bị. Cho thịt bò vào chảo dầu nóng, chiên lửa nhỏ cho tới khi thịt chín, bên ngoài xém vàng là được.\n+ Bước 3: Cắt đôi bánh mì theo chiều ngang, đặt lá xà lách rồi đến một lát cà chua, hành tây, phô mai lên trên một nửa chiếc bánh. Đặt nhân thịt bò vào giữa, xếp các loại rau, phô mai như lúc nãy lên trên miếng thịt bò, cuối cùng đặt nửa bánh mì còn lại lên.\nTiếp tục làm như vậy với phần nguyên liệu còn lại.",

                "+ Bước 1: Sơ chế và ướp thịt bò :Thịt thăn bò mua về, bạn đem rửa sạch với nước muối pha loãng rồi rửa lại với nước sạch.\nCà chua bỏ cuống rồi đem rửa sạch và ngâm trong nước muối khoảng 10 phút, sau đó rửa lại với nước sạch rồi để ráo.\nHạt bắp Mỹ đem luộc chín.\nNấm mỡ rửa sơ, ngâm 10 phút với nước muối loãng rồi cắt bỏ chân nấm, sau đó rửa lại với nước sạch 2 - 3 lần rồi cắt thành những lát mỏng.\nTỏi bóc vỏ, để nguyên tép.\nHành tây lột vỏ, 1 nửa cắt lát mỏng, nửa còn lại cắt làm đôi.\n+ Bước 2: Làm sốt nấm teriyaki : Bắc chảo lên bếp và cho vào chảo 10ml dầu oliu (khoảng gần 1 muỗng canh), đợi dầu nóng thì cho nấm mỡ vào xào với lửa lớn.\n+ Bước 3: Làm sốt phô mai : Bắc 1 cái chảo khác lên bếp và cho 100gr bơ lạt vào đun chảy, sau đó cho thêm 100ml sữa tươi không đường vào chảo.\nĐun hỗn hợp liu riu ở lửa nhỏ đến khi sữa bắt đầu sôi lăn tăn thì bạn thêm 4 miếng phô mai lát vào rồi khuấy đều cho phô mai chảy hết, quyện vào sữa.\n+ Bước 4: Áp chảo thịt bò : Trước tiên, bạn đun nóng chảo với 150ml dầu oliu, sau đó cho 50gr bơ lạt vào đun chảy.\nTiếp đến, cho 3 muỗng canh sốt mè rang vào rồi trộn đều sốt với rau và quả, sau đó cho phần sốt mật ong đã pha vào rồi tiếp tục trộn thật đều tay.\n+ Bước 5: Hoàn thành : Cho miếng thịt bò áp chảo ra dĩa, rưới một nửa sốt nấm, một nửa sốt phô mai rồi gắp vào dĩa thêm 1 ít salad nữa là món ăn đã hoàn thành và chỉ đợi bạn thưởng thức! "
        };

        String[] ff_location = {
                "15/40C, Cầu Xéo, Phường Tân Quý, Quận Tân Phú, Thành Phố Hồ Chí Minh",

                "576 Đường 3/2, Phường 14, Quận 10, Thành phố Hồ Chí Minh",

                "12 Đường Số 12, Bình Hưng Hoà, Bình Tân, Thành phố Hồ Chí Minh",

                "14 Trần Bình Trọng, Phường 4, Quận 5, Thành phố Hồ Chí Minh",

                "137/12 Nguyễn Quý Anh, Tân Sơn Nhì, Tân Phú, Thành phố Hồ Chí Minh",

                "137/12 Nguyễn Quý Anh, Tân Sơn Nhì, Tân Phú, Thành phố Hồ Chí Minh"
        };

        double[] locateX = {
                10.79839505778613,
                10.767540243530568,
                10.7963299293415,
                10.763943620977555,
                10.805407933155374,
                10.805407933155374,
        };

        double[] locateY = {
                 106.62370950241633,
                 106.66146468792624,
                106.60783157390445,
                106.67831177437725,106.62758532464427,106.62758532464427
        };



        ArrayList<FastFood> fastfoodArrayList = new ArrayList<>();

        for(int i = 0; i < imageId.length;i++){

            FastFood fastFood = new FastFood(ff_name[i], ff_price[i], ff_material[i], ff_method[i], ff_location[i], imageId[i], locateX[i], locateY[i]);
            fastfoodArrayList.add(fastFood);

        }

        FastFoodListAdapter listAdapter = new FastFoodListAdapter(FastFoodListActivity.this, fastfoodArrayList);

        binding.fflistview.setAdapter(listAdapter);
        binding.fflistview.setClickable(true);
        binding.fflistview.setOnItemClickListener((parent, view, position, id) -> {

            Intent i = new Intent(FastFoodListActivity.this, FastFoodDetailsActivity.class);
            i.putExtra("name", ff_name[position]);
            i.putExtra("price", ff_price[position]);
            i.putExtra("material", ff_material[position]);
            i.putExtra("imageId", imageId[position]);
            i.putExtra("location", ff_location[position]);
            i.putExtra("method", ff_method[position]);
            i.putExtra("locateX",locateX[position]);
            i.putExtra("locateY",locateY[position]);
            startActivity(i);

        });

    }
}