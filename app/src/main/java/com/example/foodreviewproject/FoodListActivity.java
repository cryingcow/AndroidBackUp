package com.example.foodreviewproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.foodreviewproject.databinding.ActivityFoodListBinding;

import java.util.ArrayList;

public class FoodListActivity extends AppCompatActivity {

    ActivityFoodListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityFoodListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        int[] imageId = {R.drawable.bunbo, R.drawable.bunthitnuong, R.drawable.comsuon, R.drawable.comchien, R.drawable.pho, R.drawable.bunrieu, R.drawable.banhcuon, R.drawable.miudonxao};
        String[] foods_name = {"Bún bò", "Bún thịt nướng", "Cơm sườn bì chả", "Cơm chiên dương châu", "Phở", "Bún Riêu", "Bánh cuốn", "Mì Udon xào"};

        String[] foods_price = {"30.000đ - 45.000đ", "25.000đ - 30.000đ", "35.000đ - 50.000đ", "30.000đ - 40.000đ", "30.000đ - 45.000đ", "25.000đ - 35.000đ", "25.000đ - 35.000đ", "35.000đ - 50.000đ"};

        String[] foods_material = {"300gr xương heo\n200 gr thịt đùi heo (hoặc giò heo)\n200gr thịt cua\n200gr tôm sú\n200gr nấm rơm\n50gr hành lá và ngò rí có rể\n½ kg bánh canh bột gạo\n04 củ hành khô\n½ chén bột năng\nDầu màu điều, gia vị nêm nếm gồm: nước mắm, muối, đường, tiêu, dầu ăn",

                "Thịt heo: 700gr (nên chọn loại thịt nạc vai)\nChả giò (đã chiên): 4 – 5 miếng\nBún tươi: 1kg\nHành lá: 2 nhánh\nCác loại rau: xà lách, chanh, ớt tươi, dưa leo, đồ chua, húng bạc hà, tía tô, kinh giới (định lượng tùy theo sở thích của bạn)\nĐậu phộng rang: 100gr\nGia vị: nước mắm, xì dầu, tiêu, đường, dầu ăn, hành tây và tỏi băm nhỏ, xì dầu và dầu hào",

                "10 miếng thịt cốt lết cắt lát vừa\n500 gr thịt nạc dăm\n300 gr bì\n3 tai nấm mèo\n1 lọn bún tàu\n1 củ cà rốt + 1 củ cải trắng\nHành lá, sả, tỏi, hắc xì dầu, sữa đặc, dầu hào, và gia vị\nDưa leo, cà chua & cơm trắng\n3 quả trứng\n2 trái dừa tươi",

                "4 chén cơm trắng\n2 quả trứng gà\n100g thịt xá xíu\n1 cây lạp xưởng\n20g tôm khô\n100g đậu Hà Lan\n1 củ cà rốt\n1 nắm ngò rí\n1 nắm hành lá\n1 củ tỏi\nCác gia vị cần thiết khác: dầu điều, dầu ăn, nước tương (xì dầu), hạt nêm, đường, muối, tiêu xay…",

                "2kg xương ống bò\n1,2kg bò phi lê\n0,7kg bò bắp\n1kg bánh phở\n400g hành tây\n200g sả cây\nHành tím\nGừng\nThảo mộc nấu nước dùng: quế khô, thảo quả, vỏ quýt, hoa hồi, đinh hương, hạt ngò\nRau ăn kèm: hành lá, ngò gai, ngò rí, chanh, ớt, húng quế, rau om\nGia vị nấu phở bò: muối, nước mắm, hạt nêm, đường phèn",

                "300gr xương heo\n200 gr thịt đùi heo (hoặc giò heo)\n200gr thịt cua\n200gr tôm sú\n200gr nấm rơm\n50gr hành lá và ngò rí có rể\n½ kg bánh canh bột gạo\n04 củ hành khô\n½ chén bột năng\nDầu màu điều, gia vị nêm nếm gồm: nước mắm, muối, đường, tiêu, dầu ăn",

                "1kg bún tươi\n400 gram cua đồng\n100 gram thịt xay\n50 gram tôm khô\n2 quả trứng gà\n2 bì đậu phụ\n2 quả cà chua\nHành lá, hành khô, tỏi, dấm bỗng, mắm tôm\nGia vị: muối, nước mắm,…\nRau sống ăn kèm",

                "200g bột gạo tẻ\n100g bột năng\n5 quả trứng gà\nPhần nhân bánh\n200g thịt lợn\n1 củ hành tây\n5 củ hành tím\n10g nấm mèo",

                "Mì udon tươi gói 200g\nThịt heo cắt lát 60g\nMuối\nTiêu\nBắp cải 80g\nHành tây 30g\nỚt xanh 1 trái\nBột nêm hon-dashi 1 muỗng\nXì dầu ½ muỗng\nDầu salad"
        };

        String[] foods_method = {"+ Bước 1: Sơ chế thực phẩm : Nấm rơm cạo sạch đất ở gốc, ngâm với nước muối pha loãng rồi rửa sạch. Với những tai nấm to bạn có thể bổ làm đôi.\nVới phần thịt cua, bạn uớp cùng ½ muỗng cà phê muối và đầu hành lá băm nhuyễn. Sau đó, phi nóng dầu màu điều rồi cho thịt cua vào xào nhanh tay và trút thịt cua ra chén riêng.\n+ Bước 2: Nấu nước lèo: Bạn xào sơ qua thịt đùi và xương heo cho săn lại. Sau đó, cho 2 lít nước lọc vào nồi nấu cùng. Nướng sơ củ hành khô cho thơm và thả vào nồi. Ngò rí rửa sạch phần rễ, đập dập rồi cùng cho vào nồi nước lèo đun để làm tăng mùi thơm. Bạn ninh tất cả trong khoảng 45 phút và nêm nếm lại cho vừa ăn là được.\nKhi thịt đùi đã chín mềm thì vớt ra trước, chần qua nước lạnh và thái miếng mỏng. Cho tôm vào nồi luộc chín và vớt ra, lột vỏ.\nThả bánh canh bột gạo và nấm rơm vào nồi nước lèo đang sôi. Đảo đều cho bánh canh chín, phần bột áo ngoài cọng bánh canh làm cho nồi nước lèo hơi sệt lại rồi nhưng nếu bạn muốn nồi nước lèo sánh hơn thì cho thêm bột năng đã pha cùng nước lạnh vào. Cuối cùng, khi thấy cọng bánh canh tự nổi lên trên là đã chín và thưởng thức được rồi đấy.\nKhi ăn, bạn vớt cọng bánh canh cho vào tô trước, sau đó xếp thịt và cua, hành ngò lên mặt. Chan nước lèo và nấm rơm vào cùng. Rắc thêm ít tiêu xay. Có thể dùng kèm với bánh giò cháo quẩy cũng rất ngon.",

                "+ Bước 1: Sơ chế nguyên liệu: Thịt lợn sau khi mua về thì sửa sạch, để ráo và thái lát mỏng cho vào tô. Ướp thịt với hành tây và tỏi băm, đường, xì dầu, nước mắm, dầu hào, mật ong và trộn đều tay cho đường tan. Sau đó để thịt ngấm gia vị trong ít nhất 1 giờ (nếu được có thể ướp thịt qua đêm).\nĐậu phộng bóc vỏ và giã hơi nhuyễn vừa ăn.\n  +Bước 2 :  Cách ướp thịt nướng ăn bún: Để món ăn thơm ngon chuẩn vị thì cách ướp thịt làm bún thịt nướng rất quan trọng. Vì vậy, khi thực hiện đến khâu này, các bạn hãy cẩn thận một tý nhé.Bạn ướp thịt như sau: cho 1 muỗng cà phê hành tây và 1 muỗng cà phê tỏi băm, ½ muỗng canh đường, 1 muỗng canh xì dầu, 1 muỗng canh nước mắm, 1 muỗng canh dầu hào, ½ muỗng canh mật ong và trộn đều.\n+ Bước 3: Nướng thịt: Bạn có thể nướng thịt bằng lò nướng hoặc lò than đều được nhưng thường thì nướng thịt với bếp than sẽ cho mùi vị thơm ngon hơn.\nNếu bạn sử dụng lò nướng thì nướng thịt với nhiệt độ 375 độ F trong từ 10 – 15 phút.\nNếu bạn nướng thịt bằng lò than thì trải thịt đều lên vỉ nướng, không để chồng chéo. Trong quá trình nướng, bạn có thể bôi lên thịt lớp dầu ăn cho càng hấp dẫn hơn.\n+ Bước 4: Pha nước mắm chua ngọt: Bạn pha nước chắm theo công thức sau: 2 muỗng canh nước mắm, 2 muỗng canh cốt chanh, 2 muỗng canh đường, 4 muỗng canh nước lọc, 2 muỗng café tỏi, ớt băm nhuyễn, khuấy đều.",

                "+ Bước 1: Thịt cốt lết rửa với nước muối loãng để ráo. Cho tỏi, sả, dầu hào, hắc xì dầu, nước mắm, đường vàng, hạt tiêu và sữa đặc vào máy xay nhuyễn và đều. Cho thêm dầu ăn vào trộn đều. Thịt dùng giấy thấm cho ráo nước rồi dùng chày dần cho thịt mềm và ướp với hỗn hợp nước vừa pha khoảng 1h hay qua đêm trong ngăn mát tủ lạnh.\n+ Bước 2: Thịt nạc dăm rửa sạch với nước muối loãng, cắt phân nửa đem xay nhuyễn. Nấm mèo ngâm nở cắt nhỏ, bún tàu ngâm nở cắt nhỏ. Tất cả cho vào tô cùng 2 quả trứng và hành tím băm nhỏ. Nêm nước mắm, hạt nêm, đường và tiêu.\n+ Bước 3: Trộn tất cả cho vừa ăn rồi đem trứng hấp chín.\n+ Bước 4: Trứng chín dùng lòng đỏ trứng phết lên mặt chả và hấp thêm 5p\n+ Bước 5: Nửa phần thịt còn lại luộc chín với nước dừa tươi và tí xíu muối, sau đó cắt sợi trộn cùng bì, thính và tỏi bằm.\n+ Bước 6: Bắt chảo cho tí xíu dầu để thắm chảo, không cho nhiều dầu. Sau đó cho thịt vào, trở đều chín 2 mặt sẽ có thịt áp chảo mềm, ngon và thơm.\n+ Bước 7: Cho nước dừa tươi, nước mắm và tí đường vào pha nước mắm cho vừa khẩu vị, cho thêm tí chanh và ớt bằm. \n+ Bước 8: Khi ăn cơm thì múc chén cơm úp ngược lên dĩa, miếng sườn, bì, chả, dưa leo, cà chua và ít đồ chua ăn kèm nước mắm.",

                "+ Bước 1:Đầu tiên, bạn thái nhỏ lần lượt thịt xá xíu, lạp xưởng thành hạt lựu. Sau đó, bạn luộc sơ đậu Hà Lan, cà rốt (đã được rửa sạch với nước muối pha loãng). Tiếp đó, bạn thái cà rốt thành hạt lựu chuẩn bị thực hiện món ăn này.\n+ Bước 2:Trong thời gian đó, bạn ngâm tôm khô với nước để tôm nở mềm. Sau đó, bạn bắc chảo lên bếp, khi chảo nóng, bạn cho lạp xưởng vào chiên sơ qua. Lưu ý, bạn không nên dùng dầu ăn trong công đoạn này, bởi vì trong lạp xưởng có sẵn mỡ. Tiếp đó, bạn đập trứng gà vào trong bát nhỏ, dùng đũa đánh cho trứng bông đều.\n+ Bước 3: Ướp gia vị : Sau đó, bạn cho cơm, thịt xá xíu vào chung một bát lớn. Lúc này, bạn cho gia vị vào theo công thức: 1/3 muỗng cà phê muối, 1 muỗng cà phê đường, 2 muỗng cà phê hạt nêm, 1 muỗng cà phê dầu điều và dùng đũa trộn đều. Đây là công đoạn quan trọng trong cách làm cơm chiên Dương Châu ngon ảnh hưởng trực tiếp đến hương vị thành phẩm thu được.\n+ Bước 4: Tiếp đó, bạn bắc một chảo khác lên bếp có sẵn 2 muỗng canh dầu ăn. Khi dầu nóng, bạn cho trứng đã được đánh đều vào chảo chiên. Khi trứng hơi chín tới, bạn cho hỗn hợp cơm vào trộn đều. Theo hướng dẫn chiên cơm của nhiều chuyên gia ẩm thực, bạn nên dùng đũa đảo đều để cơm tơi và không bị khô.\n+ Bước 5: Cuối cùng, bạn cho cơm chiên ra đĩa và rắc thêm ít tiêu xay, hành lá và rau ngò thái nhỏ lên trên để trang trí món ăn thêm bắt mắt.",

                "+ Bước 1: Sơ Chế Nguyên Liệu : Hành tây bóc vỏ, 1 phần thái lát mỏng, 1 phần thái múi cau\nNgò rí rửa sạch, thái nhỏ.\nHành lá để riêng phần đầu hành, phần lá thái nhỏ\nCác loại rau ăn kèm rửa sạch, để ráo.\n+ Bước 2: Cách nấu nước dùng phở bò : Xương ống bò rửa sạch. Bắc nồi nước lên bếp cùng với một ít sả cây đun sôi. Cho xương vào chần sơ qua để khử đi mùi hôi. Vớt xương đã chần ra, cho vào khay cùng với gừng, hành tím, hành tây cắt múi cau đem đi nướng đến khi xương vàng, lấy xương ra khỏi lò, cho ngay vào thau nước đá.Đun sôi một nồi nước, cho xương bò đã nướng, gói gia vị vừa làm, hành tây, gừng đã nướng, sả vào nồi nước. Hầm xương khoảng 5 – 6 tiếng cho ra nước ngọt. Trong lúc hầm xương, bạn cho thịt bắp bò vào luộc chín. Lưu ý là luộc thịt bắp bò chín thì vớt ra ngay nếu để quá lâu thịt sẽ bị mềm nhũn. Sau đó vớt các nguyên liệu ra, lọc lấy nước dùng.Bắc nồi nước dùng đã lọc lên bếp, nêm một ít muối, bột ngọt, hạt nêm, đường phèn sao cho vừa ăn, đun sôi và tắt bếp.",

                "+ Bước 1: Sơ chế thực phẩm : Nấm rơm cạo sạch đất ở gốc, ngâm với nước muối pha loãng rồi rửa sạch. Với những tai nấm to bạn có thể bổ làm đôi.\nVới phần thịt cua, bạn uớp cùng ½ muỗng cà phê muối và đầu hành lá băm nhuyễn. Sau đó, phi nóng dầu màu điều rồi cho thịt cua vào xào nhanh tay và trút thịt cua ra chén riêng.\n+ Bước 2: Nấu nước lèo :Bạn xào sơ qua thịt đùi và xương heo cho săn lại. Sau đó, cho 2 lít nước lọc vào nồi nấu cùng. Nướng sơ củ hành khô cho thơm và thả vào nồi. Ngò rí rửa sạch phần rễ, đập dập rồi cùng cho vào nồi nước lèo đun để làm tăng mùi thơm. Bạn ninh tất cả trong khoảng 45 phút và nêm nếm lại cho vừa ăn là được.\nKhi thịt đùi đã chín mềm thì vớt ra trước, chần qua nước lạnh và thái miếng mỏng. Cho tôm vào nồi luộc chín và vớt ra, lột vỏ.\nThả bánh canh bột gạo và nấm rơm vào nồi nước lèo đang sôi. Đảo đều cho bánh canh chín, phần bột áo ngoài cọng bánh canh làm cho nồi nước lèo hơi sệt lại rồi nhưng nếu bạn muốn nồi nước lèo sánh hơn thì cho thêm bột năng đã pha cùng nước lạnh vào. Cuối cùng, khi thấy cọng bánh canh tự nổi lên trên là đã chín và thưởng thức được rồi đấy.\nKhi ăn, bạn vớt cọng bánh canh cho vào tô trước, sau đó xếp thịt và cua, hành ngò lên mặt. Chan nước lèo và nấm rơm vào cùng. Rắc thêm ít tiêu xay. Có thể dùng kèm với bánh giò cháo quẩy cũng rất ngon.",

                "+ Bước 1: Đậu phụ sau khi mua về bạn mang rửa sạch, để ráo nước rồi thái thành những miếng vừa ăn. Sau đó, đem chiên chín vàng.\n+ Bước 2: Cà chua rửa sạch, thái múi cau rồi đem xào qua với dầu ăn trong 1 – 2 phút.\n+ Bước 3: Cua đồng rửa sạch, bóc bỏ mai yếm rồi dùng đũa hoặc que nhỏ để lấy phần nước màu ở mai cua.\n+ Bước 4: Phần thân cua cho vào máy xay sinh tố xay nhuyễn cùng chút muối.\n+ Bước 5: Trút xác cua vào một bát lớn, đổ thêm khoảng 200ml nước lọc vào và dùng tay bóp nhẹ phần thịt cua. Gạn đổ nước lẫn thịt cua vào nồi từ 2 – 3 lần, đến khi trong bát chỉ còn phần vỏ cứng.\n+ Bước 6: Cho một ít muối, hạt nêm vào nồi nước cua vừa lọc. Sau đó, đặt lên bếp đun nóng với mức lửa vừa. Vừa đun, bạn vừa dùng đũa khuấy nhẹ tay để riêu cua kết lại và nổi lên hết trên mặt nước.\n+ Bước 7: Dùng muôi vớt hết phần riêu cua nổi ra một bát riêng. Sau đó, đổ phần cà chua đã được xào sơ qua ở bước 2 vào nồi.\n+ Bước 8: Cho 1 thìa mắm tôm và nêm nếm thêm các loại gia vị khác cho nồi nước dùng vừa ăn rồi đậy kín nắp vung và tiếp tục đun với mức lửa nhỏ.\n+ Bước 9: Đặt một chảo dầu lên bếp đun sôi rồi cho hành khô vào phi thơm. Sau đó, cho phần nước màu ở mai cua vào đảo đều rồi tắt bếp. Phần nước này bạn có thể cho luôn vào nồi nước dùng hoặc cũng có thể cho vào từng bát khi ăn.",

                "+ Bước 1: Pha bột làm bánh : Trứng gà đem đập vào bát, dùng máy đánh trứng đánh đều rồi lọc qua rây lọc.\nCho bột năng và bột gạo vào bát tô, từ từ đổ nước vào hỗn hợp, khuấy đều.\nĐể hỗn hợp bột lắng trong khoảng 1 giờ, đánh dấu mức nước rồi gạn phần nước trong đổ đi.\n+ Bước 2: Sơ chế nguyên liệu phần nhân bánh : Nấm mèo đem ngâm với nước ấm khoảng 15 phút cho nở, rửa sạch, băm nhỏ.\nHành tím và hành tây bóc vỏ, rửa sạch, băm nhỏ.\nThịt lợn rửa sạch, cho vào máy xay thịt xay nhỏ rồi đem trộn đều với 1 thìa canh hạt nêm. Tiếp theo, bạn dùng màng bọc thực phẩm bọc miệng bát lại, ướp trong khoảng 10 phút cho ngấm đều gia vị.\n+ Bước 3: Xào nhân : Đặt chảo lên bếp, vặn nhỏ lửa, thêm 1 thìa canh dầu ăn vào đun sôi.\nĐổ phần thịt xay, nấm mèo, hành tây, hành tím vào chảo, đảo đều, xào chín.\n+ Bước 4: Trình bày và thưởng thức : Sau khi đã hoàn thành xong các bước làm bánh cuốn trứng trên đây, bạn lấy ra đĩa, cắt thành miếng vừa ăn, trang trí sao cho đẹp mắt rồi thưởng thức thành quả của mình."


        };

        String[] foods_location = {
                "21 Phạm Vấn, Phú Thọ Hoà, Tân Phú, Thành phố Hồ Chí Minh",

                "165 Lê Thiệt, Phú Thọ Hoà, Tân Phú, Thành phố Hồ Chí Minh\n116 Miếu Gò Xoài, Bình Hưng Hoà A, Bình Tân, Thành phố Hồ Chí Minh",

                "165 Lê Thiệt, Phú Thọ Hoà, Tân Phú, Thành phố Hồ Chí Minh\n116 Miếu Gò Xoài, Bình Hưng Hoà A, Bình Tân, Thành phố Hồ Chí Minh",

                "18/1 Nguyễn Cảnh Chân, P. Cầu Kho, Quận 1",

                "222 Thạch Lam, Phú Thạnh, Tân Phú, Thành phố Hồ Chí Minh\n25 Lương Trúc Đàm, Hoà Thanh, Tân Phú, Thành phố Hồ Chí Minh",

                "313 Lê Văn Quới, Bình Trị Đông A, Bình Tân, Thành phố Hồ Chí Minh",

                "29, Huỳnh Thiện Lộc, Phường Hòa Thạnh, Quận Tân Phú, Thành Phố Hồ Chí Minh",

                "215 - 217 Lý Tự Trọng, P. Bến Thành, Quận 1, Hồ Chí Minh\nLầu 1, Aeon Mall Celadon Tân Phú, Quận Tân Phú, Hồ Chí Minh"

        };
        double[] locateX = {
                10.784847469842854,
                10.786126776463792,
                10.786126776463792,
                10.75767559241183,
                10.77868436048371,
                10.776287277512706,
                10.781151155493006,
                10.77287136300719
        };

        double[] locateY = {
                106.62449767759105,
                106.61891041843487,
                106.61891041843487,
                106.68941574393087,
                106.62627126750122,
                106.61076655907239,
                106.6378099166105,
                106.6955986002856
        };

        ArrayList<Foods> foodsArrayList = new ArrayList<>();

        for(int i = 0; i < imageId.length;i++){

            Foods foods = new Foods(foods_name[i], foods_price[i], foods_material[i], foods_method[i], foods_location[i], imageId[i],locateX[i],locateY[i]);
            foodsArrayList.add(foods);

        }

        FoodsListAdapter listAdapter = new FoodsListAdapter(FoodListActivity.this, foodsArrayList);

        binding.flistview.setAdapter(listAdapter);
        binding.flistview.setClickable(true);
        binding.flistview.setOnItemClickListener((parent, view, position, id) ->  {


                Intent i = new Intent(FoodListActivity.this, FoodsDetailsActivity.class);
                i.putExtra("name", foods_name[position]);
                i.putExtra("price", foods_price[position]);
                i.putExtra("material", foods_material[position]);
                i.putExtra("imageId", imageId[position]);
                i.putExtra("location", foods_location[position]);
                i.putExtra("method", foods_method[position]);
                i.putExtra("locateX", locateX[position]);
                i.putExtra("locateY", locateY[position]);
                startActivity(i);


        });
    }
}