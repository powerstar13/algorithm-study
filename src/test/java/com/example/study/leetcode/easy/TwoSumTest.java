package com.example.study.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {
    private final TwoSum twoSum = new TwoSum();

    @Test
    void example1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void example2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void example3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void example34() {
        int[] nums = {-8917359, -3393562, -8256583, 4057867, 2611238, 4611132, -8726051, 6361040, -1826119, -8016444, -9017070, 8595841, -3099907, 2286772, -5345485, 359319, -8249320, 4255509, 6307427, -862040, 6380821, -7687095, -5075581, -217547, -375546, -3391824, -1271432, -2857654, 8310995, -8570496, 1811653, 4739621, 9599206, -4471787, -736711, -4981520, 7294662, -4763581, 1137109, 1292603, 9656998, 7000865, 2133644, 8941626, -1409185, -853113, 7538235, -5147898, 3195498, 1690713, 1877642, 1128108, 9378444, -9498925, 7397455, -7072692, 169411, -446712, 4246047, -7405757, -8872285, 7231648, -6430380, -398196, -5268276, -5593579, -5822668, 5236602, -2221247, -2980103, 3946383, 5111388, 7715781, 8950198, 8398899, -4512860, 1569171, -2251717, 3198443, 5698765, 1057573, 6557498, 8317524, 945832, 7086962, -5434853, 2271084, -1449903, -7725772, -8898675, 8923789, 7235382, 5520127, 6377606, -2763221, -3021321, 9706429, -8471916, 2283950, 588499, 5302710, 134323, 1746753, -4751132, 6390835, -7700993, 9514627, -6279663, -8296551, 9044423, 8243785, 4825096, -6540493, -4139694, -7027112, 8671303, -4111535, 2378224, -4615555, 1070803, -761923, 8927368, 254969, -9941047, -8855530, -2505801, -7774359, -7013936, -7748090, 6115245, -2470245, 6501508, 3249640, -8940978, 5741201, -258377, -1473048, 7120633, -6089266, 5587743, 9918892, 4663701, -6670745, 5704943, 5871602, -1482682, -2737558, -5679230, 5676177, 395759, -1065507, 7424483, 8248241, 9638334, 391762, 2297921, 9335034, 3871448, -675703, 3722449, 3732518, 6355886, 660710, 2999554, -9212474, 3148495, 972915, 37561, 6479554, -3155386, 5922277, -2657379, 5034628, 8433218, 9933028, -7804980, 3039349, -7292059, -1871653, 2187690, -6364180, 4174059, 7248091, 7885659, -7254133, -3811113, -6569525, 732407, -9034488, -3115174, -2229422, 8721640, 7615680, -5444831, -7099987, -9131421, 6451607, 9524512, 4639057, 9171599, -9965279, -4936677, -646224, -6299532, -4845394, -948079, 6356590, -1484649, 3547323, -7688904, 4313740, -6824872, -5644693, -458073, -8300800, 2545476, 6523466, 7508611, -2794715, 2391984, 5000201, 3429902, 8545548, 1768640, 147618, -1197912, -807942, -3161250, 3835124, -4319234, -2473993, 2433710, 945095, 812870, 7532627, 6154523, -3199255, -1334544, 3234030, -7033919, -3170421, 2193785, -5277816, -3051602, -7345952, 640889, -5200529, 2261705, -7101552, -5008745, 847833, 2194793, -398366, 5904084, 3159754, 1921148, 5357539, -2450208, -2304560, 3157859, 8601313, 8758766, 5350437, -2174351, 3171152, 4839343, 7257676, 7168818, -8180105, 4015867, 3659215, 3832703, 4101063, 9997163, 5918574, 4188158, 4964194, 9993496, 9446397, 9970285, 8629528, 708366, 6413888, 3269968, -280616, 7219139, 3529136, -239421, -1970986, 7862788, -1907505, -3235507, -930069, -7847949, -9997548, -2812358, -9045899, 6189326, 2823223, -2373049, -2191474, 2641094, 3469658, -4389120, -5999377, 7854613, -5729852, 8714543, 4530151, 81529, -7534041, 4944195, -7093626, -1188406, -3025691, 2313920, 3181411, 8059232, 8873539, -8501364, -2267204, 4812906, 2686428, 8549379, -1149548, -7457458, 560728, -112067, -4113146, -1346004, -7424001, 4850723, -1779788, 7588130, 4429491, -8309150, -5023900, 3818077, 4053775, 5027992, -8811126, -8980727, 6065446, -544758, 6051113, -3907217, 1180092, 9790270, 4833828, 6127672, 2037673, 8863579, 9350805, 371312, 6152337, -7541866, 5513716, 5130832, 5951275, 9498557, -6052559, -3056861, -4801191, 2263475, -3838645, 6737873, -7892850, -6916654, 9274659, 2860404, -5616282, 8459101, -4026051, -7375743, 4942601, 4021557, 7156380, -5231065, -1270929, -4191639, 5331906, 8490586, 9720503, -5567009, 4869367, 7609182, -8915938, -427987, -1339905, 6858720, -3013939, 274342, 5515773, 3072062, 8209071, 9208469};
        int target = -12310921;
        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void example46() {
        int[] nums = {3, 2, 3};
        int target = 6;
        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 2}, result);
    }
}