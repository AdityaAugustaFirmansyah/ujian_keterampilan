package com.example.learningrecyclerview.recyclerview;

import java.util.ArrayList;

class FoodsData {
    private static String [][] data = new String[][]{
            {"instant noodle", "Instant noodles are a Japanese noodle dish, sold in a precooked and dried noodle block, with flavoring powder and/or seasoning oil. The flavoring is usually in a separate packet, although in the case of cup noodles the flavoring is often loose in the cup", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Mama_instant_noodle_block.jpg/1200px-Mama_instant_noodle_block.jpg","5000"},
            {"pancake", "A pancake is a flat cake, often thin and round, prepared from a starch-based batter that may contain eggs, milk and butter and cooked on a hot surface such as a griddle or frying pan, often frying with oil or butter.", "https://thestayathomechef.com/wp-content/uploads/2018/03/Perfect-Pancakes-4-e1520987577263.jpg","10000"},
            {"sausage", "A sausage is a cylindrical meat product usually made from ground meat, often pork, beef, or veal, along with salt, spices and other flavourings, and breadcrumbs, encased by a skin. Typically, a sausage is formed in a casing traditionally made from intestine, but sometimes from synthetic materials.", "data:image/jpeg;base64,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","15000"},
            {"sunny side up egg", "What Are Sunny-Side-Up Eggs? An egg cooked “sunny-side up” means that it is fried just on one side and never flipped. The yolk is still completely liquid and the whites on the surface are barely set. You can cover the pan briefly to make sure the whites are cooked or baste them with butter", "https://images.cdn1.stockunlimited.net/clipart/sunny-side-up-egg_2008875.jpg","15000"},
            {"fried chicken", "Southern fried chicken, also known simply as fried chicken, is a dish consisting of chicken pieces which have been coated in a seasoned batter and pan-fried, deep fried, or pressure fried. The breading adds a crisp coating or crust to the exterior of the chicken while retaining juices in the meat.", "https://tmbidigitalassetsazure.blob.core.windows.net/secure/RMS/attachments/37/1200x1200/Crispy-Fried-Chicken_EXPS_FRBZ19_6445_C01_31_3b.jpg","5000"},
            {"toast", "Toast is a form of bread that has been browned by exposure to radiant heat. This browning is the result of a Maillard reaction, altering the flavor of the bread and making it firmer so that it is easier to spread toppings on it. Toasting is a common method of making stale bread more palatable.", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/Toast-3.jpg/1200px-Toast-3.jpg","5000"},
            {"hamburger", "A hamburger is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. The patty may be pan fried, grilled, or flame broiled.", "data:image/jpeg;base64,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","10000"},
            {"salad", "A salad is a dish consisting of a mixture of small pieces of food, usually vegetables or fruit. However, different varieties of salad may contain virtually any type of ready-to-eat food.", "https://www.gimmesomeoven.com/wp-content/uploads/2018/06/Everyday-Green-Salad-Recipe-3.jpg","10000"},
            {"sandwich", "A sandwich is a food typically consisting of vegetables, sliced cheese or meat, placed on or between slices of bread, or more generally any dish wherein two or more pieces of bread serve as a container or wrapper for another food type.", "https://upload.wikimedia.org/wikipedia/commons/e/e6/BLT_sandwich_on_toast.jpg","10000"},
            {"curry", "Curry is a variety of dishes originating in the Indian subcontinent that use a complex combination of spices or herbs, usually including ground turmeric, cumin, coriander, ginger, and fresh or dried chilies. Curry is generally prepared in a sauce.", "https://www.recipetineats.com/wp-content/uploads/2019/03/Best-easy-Chicken-Curry_5.jpg","10000"}
    };

    static ArrayList<Food> getlisdata(){
        ArrayList<Food> list = new ArrayList<>();
        for (String [] aData: data){
            Food food = new Food();
            food.setName(aData[0]);
            food.setDesc(aData[1]);
            food.setImg(aData[2]);
            food.setPrice(aData[3]);
            list.add(food);
        }
        return list;
    }
}