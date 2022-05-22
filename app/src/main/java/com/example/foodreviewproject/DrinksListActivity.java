package com.example.foodreviewproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.foodreviewproject.databinding.ActivityDrinksListBinding;


import java.util.ArrayList;

public class DrinksListActivity extends AppCompatActivity {

    ActivityDrinksListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDrinksListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageId = {R.drawable.cfcapuchino, R.drawable.cfcaramel, R.drawable.cfden, R.drawable.cfsua, R.drawable.hongtrachanh, R.drawable.phinbotbien, R.drawable.sinhtochanh, R.drawable.suachua, R.drawable.trahoahong, R.drawable.tranhanvai };

        String[] drinks_name = {"Cà Phê Cappuccino Đá Xay", " Cà phê Caramel Đá Xay ", "Cà phê đen", "Cà phê sữa", "Hồng trà chanh","Phin Bọt Biển", "Sinh Tố Chanh", "Sữa Chua Phúc Bồn Tử", "Trà Hoa Hồng", "Trà Nhãn Vải"};

        String[] drinks_price = {"40.000đ - 60.000đ", "40.000đ - 60.000đ", "15.000đ - 30.000đ", "20.000đ - 35.000đ", "30.000đ - 40.000đ", "30.000đ - 45.000đ", "30.000đ - 50.000đ", "50.000đ - 68.000đ", "35.000đ - 50.000đ", "35.000đ - 50.000đ"};

        String[] drinks_material = {"60ml Cà phê \n50ml Sữa đặc\n20gr Bột sữa\n20gr Bột Frappe\n300gr đá viên",
                "Bột cà phê 1.5 muỗng canh (25gr) Siro caramel 20ml\nTopping cream 30gr\nSữa tươi không đường 50 ml\nWhipping cream 1 ít\nNước đá đông lạnh 1 ít 150 gr",
                "Cafe bột 3 thìa canh\nĐường cát trắng 1 thìa canh\nNước sôi 100°C 160 ml",
                "Cà phê nguyên chất 25g (2-3 thìa)\nSữa đặc: 2-3 muỗng cafe (1 sữa : 1 cà phê)\nNước sôi: 100ml\nnhiệt độ 93-95 độ C",
                "5g hồng trà (dùng trà cánh hoặc thay bằng 2 túi lọc)\n1 quả chanh ta (½ dùng lấy nước, ½ dùng trang trí)\n30g đường kính (khoảng 3 thìa đường - có thể thay bằng 30ml mật ong)\n200ml nước nóng, 100g đá viên\n2 nhánh bạc hà (tùy chọn))",
                "3 thìa bột cafe Trung Nguyên rang xay/xay thường\n50ml nước sôi\n50g đường trắng, 15ml sữa đặc ông Thọ\n60ml sữa tươi không đường\nĐá viên",
                "50ml nước lọc, 5ml nước đường, 30ml nước cốt chanh, 1gr vỏ chanh, đá viên",
                "sữa chua Vinamilk có đường : 1 hộp\nSữa đặc : 30ml\nRick's: 20ml\nCam : 2 lát\nPhúc bồn tử : 2 trái",
                "10 nụ hoa hồng sấy khô\n10 gam gừng\n15ml mật ong\n1 gói trà túi lọc\nNước sạch",
                "5 – 7 quả vải ngâm đường hoặc vải tươi\n3gr trà đen hoặc trà Earl Grey\n10ml nước cốt chanh\n10ml đường nước\n100gr đường cát\n10ml syrup vải\nĐá viên\nLá bạc hà\nSả cây"
        };

        String[] drinks_method = {"Cho lần lượt đá, cà phê, sữa đặc, bột Frappe, bột sữa vào máy xay trong vòng 15-20s cho nhuyễn, mịn.\nCho hỗn hợp cappuchino đá xay ra ly, trang trí bằng lớp Milk Cap cùng với hạt cà phê và rắc ít bột cacao lên trên mặt\nCách làm lớp Milk Cap: đong 25gr bột Milk Cap và 60ml nước lọc (hoặc sữa tươi không đường), khuấy đều hỗn hợp trong vòng 30-40s",

                "+ Bước 1: Pha cà phê: Đầu tiên, cho vào phin 1.5 muỗng canh bột cà phê, 30ml nước sôi rồi ủ trong 20 giây. Sau 20 giây, bạn dùng tay ấn mạnh tim gài xuống để nén cà phê.Kế đến, cho vào thêm 70ml nước sôi và tiếp tục ủ đến khi nước cà phê chảy ra hết.Cuối cùng, dùng tay nén chặt tim gài 1 lần nữa để ép ra hết phần nước cốt là hoàn tất.\n+Bước 2: Xay hỗn hợp nguyên liệu: Cho vào máy xay sinh tố phần nước cốt cà phê, 20ml siro caramel, 50ml sữa tươi không đường, 30gr topping cream, 1 ít nước đá đông lạnh. Xay hỗn hợp từ 15 - 30 giây đến khi nhuyễn, mịn hoàn toàn\n+Bước 3: Hoàn thành: Cho hỗn hợp đá xay ra ly, trang trí lên mặt 1 ít whipping cream đã đánh bông cứng, 1 ít siro caramel là hoàn tất.",

                "+ Bước 1: Dùng nước sôi tráng qua phin cà phê, bạn cần tráng kỹ cả nắp phin và gạt phin nhé, để làm tăng nhiệt độ của phin, từ đó khi pha thì cafe sẽ nhận được lượng nhiệt chuẩn nhất.\nĐây là bước bị mọi người bỏ qua rất nhiều vì nghĩ rằng bước này không quan trọng. Tuy nhiên để có được một lý cafe đen nóng ngon thì các bạn không nên bỏ qua. Cách pha cafe đen chuẩn vị thì bắt buộc các bạn phải qua bước này.\n + Bước 2: Cho cafe vào phin sau đó lắc nhẹ phin để cafe dàn đều, rồi ấn nhẹ nắp gài phin, bạn cần lưu ý nên ấn một lượng vừa phải, không nên ấn chặt sẽ khiến cafe quá đậm, ấn nhẹ sẽ khiến cafe bị nhạt.\n+ Bước 3: Ủ cafe: Rót 160ml nước sôi 100 độ vào phin, rưới từ từ theo vòng tròn vào phần gài phin được khoảng 20% nước sôi thì dừng lại, chờ 30 – 60 giây để cafe ngấm rồi mới tiếp tục ró 80% nước sôi còn lại cho đến khi hết nước. Sau đó chờ cho cafe hòa hết nước.\nBước ủ cafe này là bước quan trọng nhất trong cách pha cafe đen để có ly cafe thơm ngon, nếu sau khi rót hết nước sôi, bạn quan sát thấy cà phê nhỏ từng giọt một mỗi giây thì coi như bạn đã thành công phân nửa, còn nếu cafe nhỏ thành dòng tức là bạn đa ấn chặn cafe không đủ chặt, sẽ khiến cafe bị loãng.\nNgoài ra bạn cũng nên lưu ý rằng cafe đen nguyên chất có độ nở khá cao, nên bạn cần chú ý trong quá trình ủ cafe xem phần nắng gài phin bị bung thì cần ấn chặt lại như cũ ngay, tránh trường hợp cafe bị nhạt.",

                "+ Bước 1: Tráng qua các dụng cụ pha cà phê: phin, ly, tách. Việc này làm dụng cụ nóng đều sẽ cho ly cà phê ngon hơn.\n+ Bước 2: Cho sữa đặc vào ly pha cafe. Thông thường, với mỗi phin cà phê, bạn nên cho khoảng 2-3 muỗng sữa đặc. Có thể điều chỉnh lượng sữa theo khẩu vị của mình. (Bạn cũng có thể cho sữa vào cà phê sau khi pha xong).\n+Bước 3 : Cho bột cà phê vào phin. Lắc nhẹ để mặt cà phê phẳng. Đặt phin cà phê lên ly cafe. Dùng tấm nén ép nhẹ bột cafe xuống. Nên nén vừa đủ để cà phê chảy chậm mà không bị nghẽn nước.\n+ Bước 4: Để nước giảm nhiệt độ giảm đến 93-95 độ C (để 1-2 phút sau khi đun sôi), rót nước vừa cao hơn mặt cà phê để ủ. Bạn có thể đặt phin lên nắp phin, rót ít nước sôi vào nắp để cà phê hấp thụ nước nóng từ bên dưới. Điều này giúp các tầng của cà phê thấm đều nước, giúp cà phê ngon hơn.\n + Bước 5: Sau khoảng 1-2 phút, rót nước đến gần đầy phin rồi đậy nắp phin lại.\n+ Bước 6: Đợi khoảng 3-5 phút cà phê sẽ chảy xong. Khuấy đều cà phê và sữa đặc. Bạn cũng có thể cho sữa vào ở bước này rồi khuấy. Cho cà phê sữa vào ly đá đã chuẩn bị sẵn. Vậy là bạn có thể thưởng thức ly cà phê sữa đá thơm ngon do mình pha rồi đó.",

                "Pha hồng trà với 200ml nước nóng khoảng 90 độ C, đậy nắp và đợi trong khoảng 5-10 phút để trà ngấm. Sau đó lọc bã trà lấy nước cốt, để nguội phần nước cốt hồng trà này.\nVắt ½ quả chanh lấy nước, bỏ hạt. ½ quả chanh còn lại cắt lát mỏng.\nCho hồng trà đã để nguội bớt vào bình lắc, thêm nước chanh và đường (hoặc mật ong) vào khuấy đều cho tan hết.\nCho đá viên cùng 1 nhánh bạc hà vào bình lắc, đậy nắp lại và lắc khoảng 10 lần.\nThả 2 lát chanh vào ly, rót trà vào ly, trang trí 1 lát chanh và 1 nhánh bạc hà lên miệng ly là hoàn thành.\nHồng trà chanh đá có màu nâu cam đẹp mắt, vị trà chua ngọt sảng khoải, vị trà đen đậm đà nổi bật. Trên miệng ly có một lớp bọt nhẹ.",

                "+ Bước 1: Làm bọt cafe : Cho bột cafe vào phin, chế nước sôi vào rồi đậy lại. Đợi một lúc để lấy phần nước cốt cafe.\nCho 25g đường và phần nước cốt cafe vào tô. Dùng phới đánh trứng đánh cho đường tan và tạo thành hỗn hợp sánh mịn, có màu nâu đậm.\nCho 25g đường còn lại vào đánh chung cho đến khi tạo được lớp bọt mịn có màu nâu nhạt, bông đều và có chóp là được.\n+ Bước 2 : Làm cafe bọt biển 3 màu đẹp mắt : ho phần sữa đặc vào đáy ly rồi chế sữa tươi không đường lên trên tạo thành lớp sữa 2 màu.\nĐổ đá viên vào, cuối cùng là rưới từ từ lớp bọt cafe lên trên cùng.\n+ Cuối cùng : sau khi hoàn thành cách làm cafe bọt biển không cần máy đánh trứng trên đây, bạn chỉ việc thưởng thức thành quả của mình. Đảm bảo ly cafe bọt biển mà bạn tự pha sẽ cực kỳ lôi cuốn và “đã” miệng!",

                "+ Bước 1: Chanh vắt lấy 30ml nước cốt, khoảng 2 trái. Sau đó dùng 1 vỏ chanh \n+ Bước 2: Cho lần lượt vào cối xay sinh tố 50ml nước lọc, 5ml nước đường, 30ml nước cốt chanh, 1 vỏ chanh và đá viên. Xay thật nhuyễn hỗn hợp.\n+ Bước 3: Cẩn thận rót ra ly và cho lớp đá tuyết bồng bềnh lên trên ly để làm đồ uống thêm phần hấp dẫn.",

                "Đầu tiên, bạn xay nhuyễn hỗn hợp kem Rick’s, sữa đặc, sữa chua với đá trên cối đá xay.\nCho Phúc Bồn Tử vào đáy ly, sau đó đổ hỗn hợp vào đầy ly\nCuối cùng bạn chỉ cần trang trí vài lát cam và quả Phúc Bồn Tử là đã có ngay một công thức Sữa Chua Phúc Bồn Tử tuyệt ngon rồi.\n(*) Cách làm nước cốt Phúc Bồn Tử Golden Tree: Xay 200gr phúc bồn tử với 300ml nước sau đó lọc qua rây lấy nước cốt. Lưu ý nước cốt nếu không sử dụng hết có thể để trong ngăn mát tủ lạnh dùng từ 3 - 5 ngày.",

                "+ Bước 1: Gừng rửa sạch, cạo vỏ và cắt thành từng lát mỏng.\n+ Bước 2: Cho nước sạch vào ấm đun sôi.\n+ Bước 3: Đổ nước sôi vào ly thủy tinh để ngâm trà túi lọc trong khoảng 2 phút rồi lấy ra để lấy nước.\n+ Bước 4: Cho gừng và nụ hoa hồng khô vào trong ấm trà, ngâm trong khoảng 8 – 10 phút cho ra nước.\n+ Bước 5: Khi uống, bạn rót trà ra tách rồi cho thêm chút mật ong vào nếu muốn uống trà hoa hồng mật ong. \nNếu thích, bạn có thể cắt thêm một lát chanh cho vào tách trà và uống nóng hoặc uống lạnh đều được.",

                "+ Bước 1 : Cách ủ trà thơm nồng: Đầu tiên, bạn dùng nước sôi có nhiệt độ khoảng 90 độ C (đối với trà đen). Ở nhiệt độ này, trà sẽ được chiết xuất trọn vẹn mùi hương, không để lại vị chát hoặc đắng. Bạn ủ trà khoảng 10 phút là được. Sau đó, để nguội nước cốt trà.\n+ Bước 2: Cách làm vải ngâm đường: Bạn hòa tan khoảng 100gr đường với 300ml nước lọc sau đó dùng muỗng khuấy đều để đường tan hoàn toàn. Bạn chọn những quả vải tươi ngon nhất bóc vỏ, bỏ hạt và ngâm phần thịt vải ngập trong nước đường này.\n+ Bước 3: Hoàn thiện thành phẩm: Bạn cho khoảng 1/3 lượng nước đường vải đã để nguội vào ly, rót thêm 80ml trà, 10ml nước cốt chanh, 10ml syrup vải (nếu bạn cho nước vải ngâm thì không cần cho syrup vải vào), một ít sả cắt nhỏ. Sau đó bạn khuấy nhẹ và thêm đá viên, vải ngâm vào. Bạn cũng có thể shake lên để thức uống được hòa quyện với nhau rồi rót ra ly, trang trí thêm cho thức uống bằng một vài lá bạc hà tươi."
        };

        String[] drinks_location = {"296 Hòa Bình, Phú Thạnh, Tân Phú, Thành phố Hồ Chí Minh",

                "45 Đ. Lê Văn Huân, Phường 13, Tân Bình, Thành phố Hồ Chí Minh",

                "330 Phan Đình Phùng, Phường 1, Phú Nhuận, Thành phố Hồ Chí Minh",

                "3 Đường Trần Hưng Đạo, Tân Thành, Tân Phú, Thành phố Hồ Chí Minh",

                "18E Cộng Hòa, Phường 4, Tân Bình, Thành phố Hồ Chí Minh",

                "180 Thạch Lam, Phú Thạnh, Tân Phú, Thành phố Hồ Chí Minh",

                "247 Lý Thường Kiệt, Phường 6, Tân Bình, Thành phố Hồ Chí Minh",

                "299 Đường số 7, Bình Trị Đông B, Bình Tân, Thành phố Hồ Chí Minh",

                "55 Đ. Vườn Lài, Phú Thọ Hoà, Tân Phú, Thành phố Hồ Chí Minh",

                "296 Hòa Bình, Phú Thạnh, Tân Phú, Thành phố Hồ Chí Minh"

        };
        double[] locateX = {
                10.77181068283618,
                10.804079132206251,
                10.798739889883686,
                10.79521743091575,
                10.802013453600306,
                10.778246438462046,
                10.781898808272805,
                10.751656391882234,
                10.787456012459872,
                10.773566396503098
        };

        double[] locateY = {
                106.63631604276391,
                106.64074872373696,
                106.68069507187646,
                106.63756029866957,
                106.6548654150518,
                106.62771591636611,
                106.65508432885548,
                106.61207577421149,
                106.63372091652474,
                106.62440147345833
        };

        ArrayList<Drinks> drinksArrayList = new ArrayList<>();


        for(int i = 0; i < imageId.length;i++){

            Drinks drinks = new Drinks(drinks_name[i], drinks_price[i], drinks_material[i], drinks_location[i], drinks_method[i] , imageId[i],locateX[i],locateY[i]);
            drinksArrayList.add(drinks);

        }

        DrinksListAdapter listAdapter = new DrinksListAdapter(DrinksListActivity.this, drinksArrayList);

        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener((parent, view, position, id) -> {


                Intent i = new Intent(DrinksListActivity.this, DrinksDetailsActivity.class);
                i.putExtra("name", drinks_name[position]);
                i.putExtra("price", drinks_price[position]);
                i.putExtra("material", drinks_material[position]);
                i.putExtra("imageId", imageId[position]);
                i.putExtra("method", drinks_method[position]);
                i.putExtra("location", drinks_location[position]);
                i.putExtra("locateX",locateX[position]);
                i.putExtra("locateY",locateY[position]);
                startActivity(i);


        });
    }

}