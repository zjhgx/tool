public class ChangeString {
    public static final char UNDERLINE = '_';

    public static void main(String[] args){
        String str = "id\n" +
                "orderId\n" +
                "parentId\n" +
                "orderTime\n" +
                "finishTime\n" +
                "modifyTime\n" +
                "orderEmt\n" +
                "plus\n" +
                "unionId\n" +
                "skuId\n" +
                "skuName\n" +
                "skuNum\n" +
                "skuReturnNum\n" +
                "skuFrozenNum\n" +
                "price\n" +
                "commissionRate\n" +
                "subSideRate\n" +
                "subsidyRate\n" +
                "finalRate\n" +
                "estimateCosPrice\n" +
                "estimateFee\n" +
                "actualCosPrice\n" +
                "actualFee\n" +
                "validCode\n" +
                "traceType\n" +
                "positionId\n" +
                "siteId\n" +
                "unionAlias\n" +
                "pid\n" +
                "cid1\n" +
                "cid2\n" +
                "cid3\n" +
                "subUnionId\n" +
                "unionTag\n" +
                "popId\n" +
                "ext1\n" +
                "payMonth\n" +
                "cpActId\n" +
                "unionRole\n" +
                "giftCouponOcsAmount\n" +
                "giftCouponKey\n" +
                "balanceExt\n" +
                "sign\n" +
                "proPriceAmount\n" +
                "rid\n" +
                "goodsInfo\n";

        String result = camelToUnderline(str,1);

        System.out.println(result);
    }

    //驼峰转下划线
    public static String camelToUnderline(String param, Integer charType) {
        if (param == null || "".equals(param.trim())) {
            return "";
        }
        int len = param.length();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            char c = param.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append(UNDERLINE);
            }
            if (charType == 2) {
                sb.append(Character.toUpperCase(c));  //统一都转大写
            } else {
                sb.append(Character.toLowerCase(c));  //统一都转小写
            }


        }
        return sb.toString();
    }

    //下划线转驼峰
    public static String underlineToCamel(String param) {
        if (param == null || "".equals(param.trim())) {
            return "";
        }
        int len = param.length();
        StringBuilder sb = new StringBuilder(len);
        Boolean flag = false; // "_" 后转大写标志,默认字符前面没有"_"
        for (int i = 0; i < len; i++) {
            char c = param.charAt(i);
            if (c == UNDERLINE) {
                flag = true;
                continue;   //标志设置为true,跳过
            } else {
                if (flag == true) {
                    //表示当前字符前面是"_" ,当前字符转大写
                    sb.append(Character.toUpperCase(param.charAt(i)));
                    flag = false;  //重置标识
                } else {
                    sb.append(Character.toLowerCase(param.charAt(i)));
                }
            }
        }
        return sb.toString();
    }

}
