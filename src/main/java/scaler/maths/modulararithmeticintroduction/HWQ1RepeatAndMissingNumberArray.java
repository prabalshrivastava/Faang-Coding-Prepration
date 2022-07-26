package scaler.maths.modulararithmeticintroduction;

import java.util.Arrays;

public class HWQ1RepeatAndMissingNumberArray {
    //    There are certain problems which are asked in the interview to also check how you take care of overflows in your problem.
//    This is one of those problems.
//    Please take extra care to make sure that you are type-casting your ints to long properly and at all places. Try to verify if your solution works if number of elements is as large as 105
//
//    Food for thought :
//
//    Even though it might not be required in this problem, in some cases, you might be required to order the operations cleverly so that the numbers do not overflow.
//    For example, if you need to calculate n! / k! where n! is factorial(n), one approach is to calculate factorial(n), factorial(k) and then divide them.
//    Another approach is to only multiple numbers from k + 1 ... n to calculate the result.
//    Obviously approach 1 is more susceptible to overflows.
//    You are given a read only array of n integers from 1 to n.
//
//    Each integer appears exactly once except A which appears twice and B which is missing.
//
//    Return A and B.
//
//    Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
//
//    Note that in your output A should precede B.
//
//            Example:
//
//    Input:[3 1 2 5 3]
//
//    Output:[3, 4]
//
//    A = 3, B = 4
    public int[] repeatedNumber(final int[] A) {
        long totalSum = ((long) A.length * (A.length + 1)) / 2;
//        long totalSumOfSquare = (A.length * (A.length + 1) * (2L * A.length + 1)) / 6;
        long totalSumOfSquare = 1;
//        System.out.println(totalSum);
//        System.out.println(totalSumOfSquare);
        for (int i = 0; i < A.length; i++) {
            totalSum = totalSum - A[i];
            totalSumOfSquare = totalSumOfSquare - (long) Math.pow(A[i], 2);
        }
        long aMinusB = totalSum;
        long a2MinusB2 = totalSumOfSquare;
        long aPlusB = a2MinusB2 / aMinusB;
        long a = (aMinusB + aPlusB) / 2;
        long b = aPlusB - a;
        return new int[]{(int) b, (int) a};
    }

    public static void main(String[] args) {
        int[] input = new int[]{3, 1, 2, 5, 3};
//        Output:[3, 4]
//        A = 3, B = 4
        System.out.println(Arrays.toString(new HWQ1RepeatAndMissingNumberArray().repeatedNumber(input)));
        int[] input1 = {389, 299, 65, 518, 361, 103, 342, 406, 24, 79, 192, 181, 178, 205, 38, 298, 218, 143, 446, 324, 82, 41, 312, 166, 252, 59, 91, 6, 248, 395, 157, 332, 352, 57, 106, 246, 506, 261, 16, 470, 224, 228, 286, 121, 193, 241, 203, 36, 264, 234, 386, 471, 225, 466, 81, 58, 253, 468, 31, 197, 15, 282, 334, 171, 358, 209, 213, 158, 355, 243, 75, 411, 43, 485, 291, 270, 25, 100, 194, 476, 70, 402, 403, 109, 322, 421, 313, 239, 327, 238, 257, 433, 254, 328, 163, 436, 520, 437, 392, 199, 63, 482, 222, 500, 454, 84, 265, 508, 416, 141, 447, 258, 384, 138, 47, 156, 172, 319, 137, 62, 85, 154, 97, 18, 360, 244, 272, 93, 263, 262, 266, 290, 369, 357, 176, 317, 383, 333, 204, 56, 521, 502, 326, 353, 469, 455, 190, 393, 453, 314, 480, 189, 77, 129, 439, 139, 441, 443, 351, 528, 182, 101, 501, 425, 126, 231, 445, 155, 432, 418, 95, 375, 376, 60, 271, 74, 11, 419, 488, 486, 54, 460, 321, 341, 174, 408, 131, 115, 107, 134, 448, 532, 292, 289, 320, 14, 323, 61, 481, 371, 151, 385, 325, 472, 44, 335, 431, 187, 51, 88, 105, 145, 215, 122, 162, 458, 52, 496, 277, 362, 374, 26, 211, 452, 130, 346, 10, 315, 459, 92, 531, 467, 309, 34, 281, 478, 477, 136, 519, 196, 240, 12, 288, 302, 119, 356, 503, 527, 22, 27, 55, 343, 490, 127, 444, 308, 354, 278, 497, 191, 294, 117, 1, 396, 125, 148, 285, 509, 208, 382, 297, 405, 245, 5, 330, 311, 133, 274, 275, 118, 463, 504, 39, 99, 442, 337, 169, 140, 104, 373, 221, 499, 413, 124, 510, 159, 465, 80, 276, 83, 329, 524, 255, 387, 259, 397, 491, 517, 23, 4, 230, 48, 349, 412, 142, 114, 487, 381, 164, 35, 67, 498, 73, 440, 108, 226, 96, 132, 144, 207, 235, 33, 69, 128, 236, 364, 198, 475, 173, 493, 150, 90, 515, 111, 68, 232, 340, 112, 526, 492, 512, 495, 429, 146, 336, 17, 350, 251, 7, 184, 76, 380, 359, 293, 19, 49, 345, 227, 212, 430, 89, 474, 279, 201, 398, 347, 273, 37, 185, 177, 102, 304, 295, 422, 94, 426, 514, 116, 183, 180, 494, 42, 305, 152, 390, 30, 247, 451, 32, 388, 331, 78, 424, 368, 394, 188, 306, 449, 8, 214, 120, 179, 280, 511, 409, 338, 153, 507, 370, 461, 217, 161, 483, 147, 242, 86, 417, 268, 71, 462, 420, 167, 513, 379, 307, 522, 435, 113, 296, 457, 525, 45, 529, 423, 427, 2, 438, 64, 316, 46, 40, 13, 516, 367, 233, 110, 318, 250, 283, 216, 186, 310, 237, 377, 365, 175, 479, 378, 66, 414, 473, 165, 210, 50, 348, 372, 363, 339, 20, 168, 284, 415, 505, 206, 53, 223, 434, 202, 123, 399, 400, 135, 269, 428, 219, 456, 28, 464, 267, 489, 98, 391, 195, 366, 300, 484, 533, 229, 213, 149, 160, 256, 303, 530, 301, 29, 404, 344, 401, 220, 287, 9, 407, 170, 450, 523, 249, 72, 410, 3, 21, 200, 260};
        System.out.println(Arrays.toString(new HWQ1RepeatAndMissingNumberArray().repeatedNumber(input1)));
        //int[] input1 = { 958199, 129776, 204668, 144688, 505828, 196619, 372712, 150466, 264500, 551021, 435760, 764112, 642343, 28013, 882719, 530164, 192362, 711436, 611508, 38181, 574664, 655693, 582849, 103472, 43634, 663381, 174583, 621993, 560206, 686488, 894157, 493607, 924042, 54479, 84942, 2476, 958321, 330976, 288438, 902056, 35310, 44150, 667288, 889938, 104072, 244340, 737777, 724733, 912941, 641312, 589217, 913510, 878185, 159169, 189513, 667126, 690578, 406204, 619371, 290028, 491263, 123810, 808355, 893193, 738842, 926219, 540893, 18981, 785036, 880313, 335669, 114889, 474769, 95646, 134515, 101682, 705360, 905465, 17243, 583906, 820570, 145632, 276242, 451164, 170830, 78689, 968531, 127042, 86412, 312665, 127475, 585554, 947108, 206278, 678607, 627897, 892786, 65292, 570838, 295194, 45265, 60557, 696439, 434733, 954780, 313786, 116748, 104036, 230721, 208118, 269271, 300851, 769475, 840942, 199217, 863703, 911930, 171929, 419610, 569729, 438688, 295867, 146641, 298251, 270302, 627752, 414131, 423612, 844975, 53661, 533069, 754310, 790537, 705523, 606061, 566162, 742701, 325881, 116181, 501647, 478567, 276771, 845494, 559561, 593517, 266611, 339965, 460958, 788658, 334619, 382902, 619967, 665612, 416817, 913130, 77819, 603815, 253620, 90951, 700499, 570144, 865499, 706789, 835477, 568349, 516214, 287851, 146217, 321228, 258918, 836350, 119179, 733322, 669260, 959437, 154085, 216819, 491938, 618605, 742298, 526838, 100673, 608103, 945692, 570642, 654556, 381897, 787541, 636192, 896051, 610390, 313415, 11391, 408591, 354137, 772785, 555789, 914267, 521574, 697769, 753105, 141822, 136909, 566317, 113425, 244298, 23889, 155928, 449960, 421750, 438926, 148289, 348722, 962185, 933094, 547444, 31499, 701532, 147395, 69768, 573087, 308869, 53285, 881736, 176170, 320786, 217246, 871848, 220637, 977670, 891268, 39016, 813169, 591332, 35114, 839446, 706981, 641697, 182188, 328093, 890735, 180574, 534718, 697084, 450278, 591530, 84635, 890959, 74729, 795307, 13411, 788512, 886728, 785500, 563078, 602971, 134141, 870365, 353412, 470628, 651312, 706574, 493092, 803733, 238709, 160344, 770817, 478204, 16469, 817470, 525578, 379628, 283524, 266016, 845130, 37720, 167589, 920490, 730688, 807340, 120189, 113182, 300500, 568606, 886898, 409107, 132309, 144896, 403492, 916093, 550992, 298773, 889852, 398535, 607768, 193003, 476133, 313499, 132671, 651009, 384854, 456242, 281379, 510416, 130557, 957075, 716058, 388589, 416022, 206290, 445047, 44756, 81848, 134620, 590259, 288600, 670558, 470143, 343274, 486523, 57363, 770913, 898967, 803879, 690824, 630970, 563969, 747887, 640788, 4532, 97318, 843122, 236765, 192383, 237468, 815075, 141794, 893060, 175934, 699509, 354504, 575395, 894688, 765835, 890812, 274790, 621233, 457344, 34104, 34622, 694179, 912925, 328454, 772381, 559888, 409393, 851361, 411317, 305641, 104751, 802456, 3826, 334995, 632473, 942522, 707298, 290577, 396896, 27881, 750537, 847041, 652173, 893199, 151404, 126530, 299210, 3631, 90012, 660418, 540378, 133627, 448481, 822524, 30960, 245303, 712658, 476031, 836265, 606684, 514585, 158102, 368536, 904012, 701171, 462169, 805435, 690310, 637563, 561489, 324977, 957158, 425360, 949358, 602973, 946229, 158091, 83789, 685224, 303237, 51051, 791603, 263929, 394292, 532697, 231272, 2608, 538286, 398253, 652444, 492922, 288755, 960549, 171366, 83246, 136173, 30595, 8445, 660640, 411937, 395056, 52190, 627263, 641540, 151770, 198575, 35048, 941650, 122593, 822765, 728487, 400653, 20698, 266464, 257637, 3989, 147070, 323948, 288386, 685925, 53552, 193774, 78529, 751143, 103258, 406287, 734339, 197101, 668010, 286381, 543837, 133900, 758501, 720068, 221713, 615528, 456844, 655681, 359468, 385459, 670134, 572562, 958361, 578215, 466883, 643396, 850516, 925266, 751500, 600660, 894847, 640746, 877904, 551147, 879634, 157896, 775573, 961230, 32287, 22020, 889423, 812370, 860388, 606972, 771605, 680140, 863315, 177853, 355746, 341800, 36502, 655219, 692191, 652335, 687330, 174244, 914205, 337766, 798602, 155546, 221709, 311513, 91825, 829016, 572003, 143588, 376890, 900845, 830883, 284972, 671006, 229706, 533451, 767921, 1523, 66511, 66570, 240716, 805024, 100881, 645669, 764064, 447181, 96895, 158830, 798588, 654967, 778881, 310869, 14979, 724478, 486439, 289611, 328466, 299058, 518671, 264091, 495628, 263148, 628482, 799075, 160856, 709696, 471703, 475869, 667548, 418903, 870436, 459673, 709346, 956706, 206649, 335717, 977611, 100179, 606643, 502676, 209083, 341828, 374809, 228533, 837260, 958871, 672293, 139462, 711234, 524113, 216790, 595965, 143709, 407631, 706164, 855980, 118612, 575579, 890694, 168269, 779816, 426855, 173472, 86093, 319143, 547601, 282809, 492790, 162124, 326538, 792701, 710695, 79885, 769464, 509496, 258472, 936302, 884559, 491810, 378382, 210054, 158375, 295520, 75414, 348136, 513219, 609378, 39912, 724089, 327749, 377902, 812990, 88056, 5034, 221459, 393976, 522935, 664798, 188188, 563874, 725685, 45931, 832041, 457028, 855553, 760871, 753768, 757526, 65807, 489429, 409885, 53334, 517545, 214013, 798172, 411259, 593122, 546, 921676, 519749, 713704, 580907, 802775, 189852, 280388, 835431, 329015, 849825, 873, 83706, 964364, 473242, 508902, 84373, 546142, 611877, 778275, 797033, 804795, 735209, 187335, 340334, 275392, 206275, 462252, 452678, 103797, 744720, 661844, 760621, 364489, 574562, 245288, 604897, 956843, 171382, 559552, 186400, 707813, 919402, 131980, 469520, 59375, 16060, 909436, 86865, 112263, 140601, 954077, 828062, 287145, 666224, 449691, 232861, 592557, 141848, 221934, 289878, 25305, 145724, 131002, 372236, 380674, 566299, 27101, 552515, 653616, 629766, 488026, 913582, 420095, 625020, 957248, 72641, 417905, 784836, 677023, 799944, 634344, 485416, 620000, 589896, 677248, 495081, 94978, 104579, 841898, 546232, 629581, 365606, 542763, 443110, 244272, 250496, 810330, 65404, 168631, 574588, 329326, 133599, 507406, 409029, 222614, 666802, 904807, 817976, 940875, 228182, 463713, 631711, 238046, 737313, 147343, 844572, 372765, 580539, 623582, 950500, 920505, 638695, 965674, 777388, 682699, 443236, 269273, 673236, 481976, 870880, 108463, 85212, 570103, 441273, 71253, 640004, 518998, 638570, 768234, 675094, 381659, 418385, 917419, 617001, 274485, 361169, 318443, 836214, 452440, 689931, 512011, 511102, 842838, 486456, 639943, 13576, 59804, 490739, 208061, 397061, 805463, 369778, 618139, 949418, 186071, 817841, 640668, 870488, 548239, 88232, 476024, 82870, 765878, 60039, 473146, 749885, 226168, 417053, 469089, 9720, 93186, 762351, 940361, 310659, 604998, 523398, 765301, 651447, 669458, 701227, 274549, 465194, 491896, 661724, 270194, 963479, 658783, 9769, 951721, 168763, 426679, 531362, 701680, 514964, 906477, 226071, 334182, 944703, 790917, 750304, 885813, 201918, 92866, 141049, 308025, 958672, 580125, 602993, 886426, 946361, 307207, 91721, 712750, 114591, 508534, 235127, 401029, 185442, 337359, 134930, 418883, 229034, 573434, 915811, 259231, 532798, 909188, 11661, 408314, 591390, 626190, 281389, 747429, 817692, 808403, 23055, 80843, 597197, 512691, 797226, 761277, 622201, 298807, 211414, 153750, 161983, 306938, 59433, 625190, 887355, 189387, 824368, 515296, 669505, 33347, 673871, 841791, 265812, 101800, 192129, 886281, 455127, 344391, 837109, 229336, 527343, 630533, 479617, 50237, 542982, 22741, 802015, 164590, 114081, 342446, 820868, 94740, 25324, 517869, 581030, 620985, 623841, 614954, 344824, 569075, 886812, 658718, 734216, 401830, 190918, 771825, 938802, 936880, 287996, 911462, 92722, 292920, 570668, 561828, 611548, 872747, 800887, 318400, 558046, 568781, 420181, 190189, 466661, 925147, 148925, 674434, 8921, 165781, 573830, 407632, 624343, 794511, 217647, 427714, 49417, 148578, 158503, 225500, 869372, 734443, 155888, 367693, 655548, 337382, 419018, 494093, 706684, 168409, 538708, 562430, 471593, 402666, 69554, 331315, 110629, 906527, 122620, 34202, 364364, 562059, 575723, 248134, 869966, 409423, 951949, 922088, 301753, 640825, 60185, 30994, 305037, 382553, 240776, 945060, 258697, 627267, 325813, 191817, 254332, 202917, 643142, 142490, 697987, 243354, 364303, 408670, 212719, 664880, 140284, 784528, 294, 89071, 79948, 217721, 844021, 471671, 84786, 333573, 224116, 194687, 419159, 5843, 52367, 847866, 757921, 582078, 285607, 817142, 178659, 717203, 675615, 200247, 575295, 204343, 362877, 954475, 30050, 786976, 139856, 723450, 808420, 438002, 392915, 325954, 345217, 300475, 942355, 307813, 654343, 271635, 708870, 707564, 491727, 835505, 870518, 852682, 553868, 854074, 588127, 533705, 368392, 366844, 50716, 743498, 620254, 524165, 747838, 724415, 20435, 158255, 239126, 727542, 75030, 110563, 705797, 447359, 542510, 792588, 83374, 390915, 16878, 916222, 582783, 497256, 908774, 508025, 670215, 931189, 733657, 281139, 621143, 293329, 723134, 615675, 709241, 403758, 553353, 83115, 460373, 314478, 574427, 944129, 267755, 467185, 797881, 414862, 258102, 284368, 57574, 229444, 571403, 839765, 633716, 373484, 183710, 221319, 545466, 620206, 55477, 690392, 711999, 326998, 576637, 330044, 118378, 857896, 910246, 814202, 463520, 724980, 611399, 139487, 147584, 538247, 878248, 472288, 76914, 708370, 877805, 55003, 397091, 663559, 135149, 601746, 336460, 966785, 257731, 741817, 204846, 669854, 936296, 852982, 826067, 892297, 802905, 494671, 422816, 213942, 631194, 656124, 724228, 673136, 658021, 808668, 977715, 170459, 241199, 195800, 67881, 207708, 547171, 930269, 540165, 192578, 399526, 635396, 272177, 389485, 418666, 53770, 126731, 590620, 851424, 44005, 465140, 696530, 670534, 712685, 555251, 555763, 597708, 759574, 225651, 195553, 3650, 650728, 38142, 686787, 909456, 650176, 459833, 276278, 929701, 252986, 293420, 334587, 549163, 8730, 159576, 532059, 739549, 621278, 132373, 857286, 462215, 804220, 739705, 778314, 809365, 280814, 553458, 627648, 97699, 199658, 407897, 603784, 398862, 688069, 673522, 528670, 494325, 590340, 658290, 966600, 529159, 449254, 924456, 371508, 637381, 573528, 132970, 929817, 900653, 553734, 165175, 287171, 753351, 486634, 159187, 309752, 709796, 450990, 770994, 964076, 172871, 820111, 72639, 840601, 942020, 863190, 181688, 469584, 467109, 960943, 804512, 327455, 712456, 211915, 628586, 39826, 210386, 740378, 570231, 383538, 349597, 340385, 667498, 101423, 10687, 225047, 37479, 682474, 453809, 833767, 350192, 483291, 958921, 654129, 233871, 612009, 976669, 550337, 959584, 760929, 451387, 158224, 87667, 532487, 463805, 742685, 726038, 118001, 252350, 22993, 742529, 352206, 649752, 712563, 469636, 837380, 148185, 413830, 547929, 958872, 90655, 971443, 284079, 174277, 838902, 454808, 974650, 905024, 927708, 80591, 779379, 210272, 191262, 179157, 588371, 712541, 805278, 575343, 561023, 410360, 963603, 53085, 33774, 928621, 107227, 816956, 177723, 886727, 382801, 143332, 533458, 296411, 595930, 285150, 69110, 925765, 276537, 6020, 676369, 152147, 669729, 567975, 272092, 888009, 302105, 535092, 126120, 423198, 277147, 888210, 911965, 100616, 294042, 34319, 640837, 794878, 935095, 789396, 816083, 404446, 482722, 16015, 187719, 147090, 569625, 975415, 386792, 292750, 856918, 554535, 715609, 269103, 704720, 345963, 237301, 165703, 188039, 794415, 309203, 771014, 429212, 957590, 940687, 788293, 538242, 58644, 468694, 881505, 198745, 14203, 571303, 460540, 711004, 123379, 818948, 265930, 54562, 493925, 145319, 458378, 638239, 365776, 897742, 879802, 246452, 771625, 840765, 751533, 906055, 207198, 154754, 224244, 606706, 221774, 454313, 347389, 267277, 101749, 740875};
    }
}
