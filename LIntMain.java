
package com.LongIntegerADT;



/*SLL Implementation [STEP_1]
* Test Case #1 : Initialize Long Integers A-I 
* A: 27954
* B: 16814
* C: 20335
* D: 16050
* E: 34532
* F: 29705
* G: 50044
* H: 46266
* I: 123650
* 
* Test Case #2 : Traverse and print the value Stored in each position
* A: 629915
* B: 163972
* C: 194862
* D: 2760033
* E: 628337
* F: 319623
* G: 573491
* H: 898880
* I: 1643357
* 
* Test Case #3 : Print Each Long Integer to standard output using output()
* A: 85291
* B: 113007
* C: 75503
* D: 158559
* E: 247986
* F: 152769
* G: 205373
* H: 301593
* I: 494963
*
* Test Case #4 : Print the sign and the number of digits of each Long Integer
* A: 72483
* B: 26829
* C: 25743
* D: 30784
* E: 24670
* F: 23779
* G: 26697
* H: 24172
* I: 24654
*
* Test Case #5 : Testing the Utility methods
* A: 244180
* B: 177344
*
* Test Case #6 : Testing the Comparison methods
* A  Compared with other variables
* A: IsEqual = 22926; IsLessThan = 10478; IsGreaterthan = 6871
* B: IsEqual = 1196; IsLessThan = 1424; IsGreaterthan = 1292
* C: IsEqual = 1019; IsLessThan = 1004; IsGreaterthan = 1005
* D: IsEqual = 997; IsLessThan = 1355; IsGreaterthan = 1361
* E: IsEqual = 1056; IsLessThan = 1419; IsGreaterthan = 1345
* F: IsEqual = 1160; IsLessThan = 948; IsGreaterthan = 1140
* G: IsEqual = 1159; IsLessThan = 1501; IsGreaterthan = 1378
* H: IsEqual = 1054; IsLessThan = 979; IsGreaterthan = 1007
* I: IsEqual = 1033; IsLessThan = 4137; IsGreaterthan = 1386
* 
* B  Compared with other variables
* A: IsEqual = 1198; IsLessThan = 1795; IsGreaterthan = 1444
* B: IsEqual = 6891; IsLessThan = 4356; IsGreaterthan = 4105
* C: IsEqual = 1271; IsLessThan = 1055; IsGreaterthan = 1021
* D: IsEqual = 1172; IsLessThan = 1533; IsGreaterthan = 1332
* E: IsEqual = 904; IsLessThan = 1583; IsGreaterthan = 1647
* F: IsEqual = 1131; IsLessThan = 1321; IsGreaterthan = 1086
* G: IsEqual = 1298; IsLessThan = 14341; IsGreaterthan = 1586
* H: IsEqual = 1231; IsLessThan = 7755; IsGreaterthan = 1038
* I: IsEqual = 1055; IsLessThan = 1372; IsGreaterthan = 1415
* 
* C  Compared with other variables
* A: IsEqual = 1128; IsLessThan = 1131; IsGreaterthan = 2249
* B: IsEqual = 6424; IsLessThan = 5431; IsGreaterthan = 5156
* C: IsEqual = 1202; IsLessThan = 1239; IsGreaterthan = 1082
* D: IsEqual = 2515; IsLessThan = 1901; IsGreaterthan = 1575
* E: IsEqual = 1385; IsLessThan = 1688; IsGreaterthan = 1985
* F: IsEqual = 1365; IsLessThan = 1285; IsGreaterthan = 1200
* G: IsEqual = 1747; IsLessThan = 1744; IsGreaterthan = 8158
* H: IsEqual = 2036; IsLessThan = 7755; IsGreaterthan = 1038
* I: IsEqual = 1055; IsLessThan = 2002; IsGreaterthan = 1968
* 
* D  Compared with other variables
* A: IsEqual = 2523; IsLessThan = 14882; IsGreaterthan = 1961
* B: IsEqual = 2141; IsLessThan = 2022; IsGreaterthan = 3161
* C: IsEqual = 1374; IsLessThan = 1841; IsGreaterthan = 1311
* D: IsEqual = 1222; IsLessThan = 1521; IsGreaterthan = 1813
* E: IsEqual = 1280; IsLessThan = 2153; IsGreaterthan = 1477
* F: IsEqual = 1664; IsLessThan = 1604; IsGreaterthan = 1492
* G: IsEqual = 1747; IsLessThan = 1744; IsGreaterthan = 8158
* H: IsEqual = 2036; IsLessThan = 7755; IsGreaterthan = 1038
* I: IsEqual = 1365; IsLessThan = 2015; IsGreaterthan = 6483
*
* E  Compared with other variables
* A: IsEqual = 1198; IsLessThan = 1795; IsGreaterthan = 1444
* B: IsEqual = 6891; IsLessThan = 4356; IsGreaterthan = 4105
* C: IsEqual = 1271; IsLessThan = 1055; IsGreaterthan = 1021
* D: IsEqual = 1222; IsLessThan = 1521; IsGreaterthan = 1813
* E: IsEqual = 1280; IsLessThan = 2153; IsGreaterthan = 1477
* F: IsEqual = 1664; IsLessThan = 1604; IsGreaterthan = 1492
* G: IsEqual = 1747; IsLessThan = 1744; IsGreaterthan = 8158
* H: IsEqual = 2036; IsLessThan = 7755; IsGreaterthan = 1038
* I: IsEqual = 1365; IsLessThan = 2015; IsGreaterthan = 6483
*
* F  Compared with other variables
* A: IsEqual = 2523; IsLessThan = 14882; IsGreaterthan = 1961
* B: IsEqual = 2141; IsLessThan = 2022; IsGreaterthan = 3161
* C: IsEqual = 1374; IsLessThan = 1841; IsGreaterthan = 1311
* D: IsEqual = 1222; IsLessThan = 1521; IsGreaterthan = 1813
* E: IsEqual = 1280; IsLessThan = 2153; IsGreaterthan = 1477
* F: IsEqual = 1664; IsLessThan = 1604; IsGreaterthan = 1492
* G: IsEqual = 1747; IsLessThan = 1744; IsGreaterthan = 8158
* H: IsEqual = 2036; IsLessThan = 7755; IsGreaterthan = 1038
* I: IsEqual = 1365; IsLessThan = 2015; IsGreaterthan = 6483
*
* G  Compared with other variables
* A: IsEqual = 1198; IsLessThan = 1795; IsGreaterthan = 1444
* B: IsEqual = 6891; IsLessThan = 4356; IsGreaterthan = 4105
* C: IsEqual = 1271; IsLessThan = 1055; IsGreaterthan = 1021
* D: IsEqual = 1172; IsLessThan = 1533; IsGreaterthan = 1332
* E: IsEqual = 904; IsLessThan = 1583; IsGreaterthan = 1647
* F: IsEqual = 1131; IsLessThan = 1321; IsGreaterthan = 1086
* G: IsEqual = 1298; IsLessThan = 14341; IsGreaterthan = 1586
* H: IsEqual = 1231; IsLessThan = 7755; IsGreaterthan = 1038
* I: IsEqual = 1055; IsLessThan = 1372; IsGreaterthan = 1415
*
* H  Compared with other variables
* A: IsEqual = 22926; IsLessThan = 10478; IsGreaterthan = 6871
* B: IsEqual = 1196; IsLessThan = 1424; IsGreaterthan = 1292
* C: IsEqual = 1019; IsLessThan = 1004; IsGreaterthan = 1005
* D: IsEqual = 997; IsLessThan = 1355; IsGreaterthan = 1361
* E: IsEqual = 1056; IsLessThan = 1419; IsGreaterthan = 1345
* F: IsEqual = 1160; IsLessThan = 948; IsGreaterthan = 1140
* G: IsEqual = 1159; IsLessThan = 1501; IsGreaterthan = 1378
* H: IsEqual = 1054; IsLessThan = 979; IsGreaterthan = 1007
* I: IsEqual = 1033; IsLessThan = 4137; IsGreaterthan = 1386
*
* I  Compared with other variables
* A: IsEqual = 22926; IsLessThan = 10478; IsGreaterthan = 6871
* B: IsEqual = 1196; IsLessThan = 1424; IsGreaterthan = 1292
* C: IsEqual = 1019; IsLessThan = 1004; IsGreaterthan = 1005
* D: IsEqual = 997; IsLessThan = 1355; IsGreaterthan = 1361
* E: IsEqual = 1056; IsLessThan = 1419; IsGreaterthan = 1345
* F: IsEqual = 1160; IsLessThan = 948; IsGreaterthan = 1140
* G: IsEqual = 1159; IsLessThan = 1501; IsGreaterthan = 1378
* H: IsEqual = 1054; IsLessThan = 979; IsGreaterthan = 1007
* I: IsEqual = 1033; IsLessThan = 4137; IsGreaterthan = 1386
*
* Array Implementation [STEP_1]
* Test Case #1 : Initialize Long Integers A-I 
* A: 23410
* B: 11858
* C: 18238
* D: 19471
* E: 42777
* F: 23335
* G: 139182
* H: 84607
* I: 246500
* 
* Test Case #2 : Traverse and print the value Stored in each position
* A: 655512
* B: 126327
* C: 159713
* D: 5558996
* E: 544721
* F: 254933
* G: 565061
* H: 759797
* I: 1034752
* 
* Test Case #3 : Print Each Long Integer to standard output using output()
* A: 86403
* B: 114084
* C: 74898
* D: 153408
* E: 247986
* F: 334883
* G: 146895
* H: 274956
* I: 355061
*
* Test Case #4 : Print the sign and the number of digits of each Long Integer
* A: 72617
* B: 33025
* C: 23990
* D: 20923
* E: 21852
* F: 35065
* G: 24586
* H: 20688
* I: 44074
*
* Test Case #5 : Testing the Utility methods
* A: 374234
* B: 198594
*
* Test Case #6 : Testing the Comparison methods
* A  Compared with other variables
* A: IsEqual = 22693; IsLessThan = 11556; IsGreaterthan = 8061
* B: IsEqual = 1285; IsLessThan = 1608; IsGreaterthan = 1640
* C: IsEqual = 1069; IsLessThan = 1421; IsGreaterthan = 1649
* D: IsEqual = 1194; IsLessThan = 1368; IsGreaterthan = 1360
* E: IsEqual = 1146; IsLessThan = 1079; IsGreaterthan = 1218
* F: IsEqual = 1120; IsLessThan = 1323; IsGreaterthan = 1331
* G: IsEqual = 953; IsLessThan = 967; IsGreaterthan = 1017
* H: IsEqual = 1077; IsLessThan = 979; IsGreaterthan = 1007
* I: IsEqual = 1033; IsLessThan = 1380; IsGreaterthan = 1434
* 
* B  Compared with other variables
* A: IsEqual = 1198; IsLessThan = 1795; IsGreaterthan = 1444
* B: IsEqual = 6891; IsLessThan = 4356; IsGreaterthan = 4105
* C: IsEqual = 1271; IsLessThan = 1055; IsGreaterthan = 1021
* D: IsEqual = 1172; IsLessThan = 1533; IsGreaterthan = 1332
* E: IsEqual = 904; IsLessThan = 1583; IsGreaterthan = 1647
* F: IsEqual = 1131; IsLessThan = 1321; IsGreaterthan = 1086
* G: IsEqual = 1298; IsLessThan = 14341; IsGreaterthan = 1586
* H: IsEqual = 1231; IsLessThan = 7755; IsGreaterthan = 1038
* I: IsEqual = 1055; IsLessThan = 1372; IsGreaterthan = 1415
* 
* C  Compared with other variables
* A: IsEqual = 1128; IsLessThan = 1131; IsGreaterthan = 2249
* B: IsEqual = 6424; IsLessThan = 5431; IsGreaterthan = 5156
* C: IsEqual = 1202; IsLessThan = 1239; IsGreaterthan = 1082
* D: IsEqual = 2515; IsLessThan = 1901; IsGreaterthan = 1575
* E: IsEqual = 1385; IsLessThan = 1688; IsGreaterthan = 1985
* F: IsEqual = 1365; IsLessThan = 1285; IsGreaterthan = 1200
* G: IsEqual = 1747; IsLessThan = 1744; IsGreaterthan = 8158
* H: IsEqual = 2036; IsLessThan = 7755; IsGreaterthan = 1038
* I: IsEqual = 1055; IsLessThan = 2002; IsGreaterthan = 1968
* 
* D  Compared with other variables
* A: IsEqual = 2523; IsLessThan = 14882; IsGreaterthan = 1961
* B: IsEqual = 2141; IsLessThan = 2022; IsGreaterthan = 3161
* C: IsEqual = 1374; IsLessThan = 1841; IsGreaterthan = 1311
* D: IsEqual = 1222; IsLessThan = 1521; IsGreaterthan = 1813
* E: IsEqual = 1280; IsLessThan = 2153; IsGreaterthan = 1477
* F: IsEqual = 1664; IsLessThan = 1604; IsGreaterthan = 1492
* G: IsEqual = 1747; IsLessThan = 1744; IsGreaterthan = 8158
* H: IsEqual = 2036; IsLessThan = 7755; IsGreaterthan = 1038
* I: IsEqual = 1365; IsLessThan = 2015; IsGreaterthan = 6483
*
* E  Compared with other variables
* A: IsEqual = 1198; IsLessThan = 1795; IsGreaterthan = 1444
* B: IsEqual = 6891; IsLessThan = 4356; IsGreaterthan = 4105
* C: IsEqual = 1271; IsLessThan = 1055; IsGreaterthan = 1021
* D: IsEqual = 1222; IsLessThan = 1521; IsGreaterthan = 1813
* E: IsEqual = 1280; IsLessThan = 2153; IsGreaterthan = 1477
* F: IsEqual = 1664; IsLessThan = 1604; IsGreaterthan = 1492
* G: IsEqual = 1747; IsLessThan = 1744; IsGreaterthan = 8158
* H: IsEqual = 2036; IsLessThan = 7755; IsGreaterthan = 1038
* I: IsEqual = 1365; IsLessThan = 2015; IsGreaterthan = 6483
*
* F  Compared with other variables
* A: IsEqual = 2523; IsLessThan = 14882; IsGreaterthan = 1961
* B: IsEqual = 2141; IsLessThan = 2022; IsGreaterthan = 3161
* C: IsEqual = 1374; IsLessThan = 1841; IsGreaterthan = 1311
* D: IsEqual = 1222; IsLessThan = 1521; IsGreaterthan = 1813
* E: IsEqual = 1280; IsLessThan = 2153; IsGreaterthan = 1477
* F: IsEqual = 1664; IsLessThan = 1604; IsGreaterthan = 1492
* G: IsEqual = 1747; IsLessThan = 1744; IsGreaterthan = 8158
* H: IsEqual = 2036; IsLessThan = 7755; IsGreaterthan = 1038
* I: IsEqual = 1365; IsLessThan = 2015; IsGreaterthan = 6483
*
* G  Compared with other variables
* A: IsEqual = 1198; IsLessThan = 1795; IsGreaterthan = 1444
* B: IsEqual = 6891; IsLessThan = 4356; IsGreaterthan = 4105
* C: IsEqual = 1271; IsLessThan = 1055; IsGreaterthan = 1021
* D: IsEqual = 1172; IsLessThan = 1533; IsGreaterthan = 1332
* E: IsEqual = 904; IsLessThan = 1583; IsGreaterthan = 1647
* F: IsEqual = 1131; IsLessThan = 1321; IsGreaterthan = 1086
* G: IsEqual = 1298; IsLessThan = 14341; IsGreaterthan = 1586
* H: IsEqual = 1231; IsLessThan = 7755; IsGreaterthan = 1038
* I: IsEqual = 1055; IsLessThan = 1372; IsGreaterthan = 1415
*
* H  Compared with other variables
* A: IsEqual = 22926; IsLessThan = 10478; IsGreaterthan = 6871
* B: IsEqual = 1196; IsLessThan = 1424; IsGreaterthan = 1292
* C: IsEqual = 1019; IsLessThan = 1004; IsGreaterthan = 1005
* D: IsEqual = 997; IsLessThan = 1355; IsGreaterthan = 1361
* E: IsEqual = 1056; IsLessThan = 1419; IsGreaterthan = 1345
* F: IsEqual = 1160; IsLessThan = 948; IsGreaterthan = 1140
* G: IsEqual = 1159; IsLessThan = 1501; IsGreaterthan = 1378
* H: IsEqual = 1054; IsLessThan = 979; IsGreaterthan = 1007
* I: IsEqual = 1033; IsLessThan = 4137; IsGreaterthan = 1386
*
* I  Compared with other variables
* A: IsEqual = 1245; IsLessThan = 1331; IsGreaterthan = 1652
* B: IsEqual = 1321; IsLessThan = 1190; IsGreaterthan = 1156
* C: IsEqual = 977; IsLessThan = 1837; IsGreaterthan = 958
* D: IsEqual = 931; IsLessThan = 1289; IsGreaterthan = 1126
* E: IsEqual = 948; IsLessThan = 949; IsGreaterthan = 921
* F: IsEqual = 1160; IsLessThan = 948; IsGreaterthan = 1140
* G: IsEqual = 876; IsLessThan = 1263; IsGreaterthan = 1297
* H: IsEqual = 1092; IsLessThan = 985; IsGreaterthan = 993
* I: IsEqual = 53848; IsLessThan = 42960; IsGreaterthan = 49494
*
*SLL Implementation [STEP_2]
*Test Case #1 : Testing the Add methods
*
* A Add with other variables
* A: 193
* B: 13489
* C: 64556
* D: 8641
* E: 6924
* F: 82934
* G: 14116
* H: 311636
* I: 26728
*
* B Add with other variables
* A: 8391
* B: 18910
* C: 47918
* D: 5821
* E: 6993
* F: 90946
* G: 5901
* H: 247919
* I: 25328
*
* C Add with other variables
* A: 46683
* B: 66061
* C: 7667
* D: 63891
* E: 152854
* F: 6934
* G: 266511
* H: 9532
* I: 1198856
*
* D Add with other variables
* A: 15093
* B: 4901
* C: 90722
* D: 6864
* E: 16527
* F: 35967
* G: 9699
* H: 238506
* I: 76504
*
* E Add with other variables
* A: 6123
* B: 9814
* C: 260241
* D: 8990
* E: 7791
* F: 145146
* G: 11247
* H: 247498
* I: 27213
*
* F Add with other variables
* A: 4391
* B: 18210
* C: 41918
* D: 5821
* E: 6693
* F: 90246
* G: 9901
* H: 247519
* I: 23328
* 
* G Add with other variables
* A: 15393
* B: 4951
* C: 90722
* D: 6854
* E: 16527
* F: 75967
* G: 9699
* H: 238507
* I: 36504
*
* H Add with other variables
* A: 4391
* B: 18210
* C: 41918
* D: 5821
* E: 6693
* F: 90246
* G: 9901
* H: 247519
* I: 23328
*
* I Add with other variables
* A: 31789
* B: 20626
* C: 585912
* D: 21724
* E: 40702
* F: 697010
* G: 26485
* H: 705000
* I: 45482
*
* Test Case #2 : Testing the Sub methods
*
* A  Sub with other variables
* A: 19321
* B: 13489
* C: 64520
* D: 5641
* E: 6824
* F: 82834
* G: 13116
* H: 311736
* I: 27728
*
* B  Sub with other variables
* A: 4391
* B: 18210
* C: 41918
* D: 5821
* E: 6693
* F: 90246
* G: 9901
* H: 247519
* I: 23328
*
* C  Sub with other variables
* A: 46693
* B: 64061
* C: 4667
* D: 63691
* E: 152854
* F: 6934
* G: 266911
* H: 9502
* I: 1138856
*
* D  Sub with other variables
* A: 15393
* B: 4951
* C: 90722
* D: 6854
* E: 16527
* F: 75967
* G: 9699
* H: 238507
* I: 36504
*
* E  Sub with other variables
* A: 6123
* B: 9814
* C: 260241
* D: 8990
* E: 7791
* F: 145146
* G: 11247
* H: 247498
* I: 27213
*
* F  Sub with other variables
* A: 4391
* B: 18210
* C: 41918
* D: 5821
* E: 6693
* F: 90246
* G: 9901
* H: 247519
* I: 23328
* 
* G  Sub with other variables
* A: 15393
* B: 4951
* C: 90722
* D: 6854
* E: 16527
* F: 75967
* G: 9699
* H: 238507
* I: 36504
*
* H  Sub with other variables
* A: 4391
* B: 18210
* C: 41918
* D: 5821
* E: 6693
* F: 90246
* G: 9901
* H: 247519
* I: 23328
*
* I  Sub with other variables
* A: 31789
* B: 20626
* C: 585912
* D: 21724
* E: 40702
* F: 697010
* G: 26485
* H: 705000
* I: 45482
*
* Test Case #3 : Testing the Product methods
*
* A Mul with other variables
* A: 58989
* B: 94757
* C: 157468
* D: 343059
* E: 1297464
* F: 506988
* G: 4044202
* H: 3450159
* I: 21866662
*
* B Mul with other variables
* A: 45889
* B: 78148
* C: 115678
* D: 230529
* E: 716799
* F: 262833
* G: 4161678
* H: 7132370
* I: 26267417
*
* C Mul with other variables
* A: 75747
* B: 136842
* C: 269256
* D: 503075
* E: 1308750
* F: 497801
* G: 1801808
* H: 2740098
* I: 11947286
*
* D Mul with other variables
* A: 93261
* B: 176104
* C: 270798
* D: 290879
* E: 1483253
* F: 628228
* G: 3565550
* H: 5064686
* I: 14800676
*
* E Mul with other variables
* A: 45889
* B: 78148
* C: 115678
* D: 230529
* E: 716799
* F: 262833
* G: 4161678
* H: 7132370
* I: 26267417
*
* F Mul with other variables
* A: 75747
* B: 136842
* C: 269256
* D: 503075
* E: 1308750
* F: 497801
* G: 1801808
* H: 2740098
* I: 11947286
* 
* G Mul with other variables
* A: 58989
* B: 94757
* C: 157468
* D: 343059
* E: 1297464
* F: 506988
* G: 4044202
* H: 3450159
* I: 21866662
*
* H Mul with other variables
* A: 125610
* B: 245629
* C: 359830
* D: 619572
* E: 1575759
* F: 735856
* G: 9723586
* H: 5501866
* I: 24553156
*
* I Mul with other variables
* A: 607286
* B: 1554120
* C: 2158033
* D: 3229326
* E: 6872762
* F: 2093366
* G: 15725786
* H: 8022409
* I: 46335461
*
* Test Case #4 : Testing the Power methods
* A Powers 
* 5 :360679
* 10:692155
* 20:4483793
* 30:5151606
*
* B Powers 
* 5 :655094
* 10:6207179
* 20:13016759
* 30:18110805
*
* C Powers 
* 5 :993563
* 10:4338808
* 20:15015746
* 30:35086614
*
* D Powers 
* 5 :3610826
* 10:10606034
* 20:40983103
* 30:58552225
*
* E Powers 
* 5 :8366945
* 10:44888471
* 20:227551244
* 30:262884335
*
* F Powers 
* 5 :1333330
* 10:5699259
* 20:28301509
* 30:90483265
*
* G Powers 
* 5 :35198949
* 10:113312391
* 20:542750054
* 30:1365656862
*
* H Powers 
* 5 :16352453
* 10:76881096
* 20:407297285
* 30:1024473812
*
* I Powers 
* 5 :172424347
* 10:1013982985
* 20:7501673589
* 30:21076435845
*
* Test Case #5 : Compute the following
* J :57967
* K :9508
* L :170310
* M :153009
* N :27689
* O :23910
* P :24694
* Q :24408
* R :71789
* S :20014
* T :13683
* U :107768
* V :58353
* W :184314
* X :7191903
* Y :134893
* Z :1542255
*
*Array Implementation [STEP_2]
*Test Case #1 : Testing the Add methods
*
* A Add with other variables
* A: 193
* B: 13489
* C: 64556
* D: 8641
* E: 6924
* F: 82934
* G: 14116
* H: 311636
* I: 26728
*
* B Add with other variables
* A: 8391
* B: 18910
* C: 47918
* D: 5821
* E: 6993
* F: 90946
* G: 5901
* H: 247919
* I: 25328
*
* C Add with other variables
* A: 46683
* B: 66061
* C: 7667
* D: 63891
* E: 152854
* F: 6934
* G: 266511
* H: 9532
* I: 1198856
*
* D Add with other variables
* A: 15093
* B: 4901
* C: 90722
* D: 6864
* E: 16527
* F: 35967
* G: 9699
* H: 238506
* I: 76504
*
* E Add with other variables
* A: 6123
* B: 9814
* C: 260241
* D: 8990
* E: 7791
* F: 145146
* G: 11247
* H: 247498
* I: 27213
*
* F Add with other variables
* A: 4391
* B: 18210
* C: 41918
* D: 5821
* E: 6693
* F: 90246
* G: 9901
* H: 247519
* I: 23328
* 
* G Add with other variables
* A: 15393
* B: 4951
* C: 90722
* D: 6854
* E: 16527
* F: 75967
* G: 9699
* H: 238507
* I: 36504
*
* H Add with other variables
* A: 4391
* B: 18210
* C: 41918
* D: 5821
* E: 6693
* F: 90246
* G: 9901
* H: 247519
* I: 23328
*
* I Add with other variables
* A: 31789
* B: 20626
* C: 585912
* D: 21724
* E: 40702
* F: 697010
* G: 26485
* H: 705000
* I: 45482
*
* Test Case #2 : Testing the Sub methods
*
* A  Sub with other variables
* A: 17135
* B: 17246
* C: 56431
* D: 10865
* E: 9931
* F: 113996
* G: 14444
* H: 264551
* I: 38326
*
* B  Sub with other variables
* A: 6686
* B: 8804
* C: 47398
* D: 8039
* E: 10030
* F: 86248
* G: 17995
* H: 262433
* I: 32711
*
* C  Sub with other variables
* A: 59345
* B: 90641
* C: 7552
* D: 79562
* E: 145069
* F: 11574
* G: 368829
* H: 16427
* I: 958999
*
* D  Sub with other variables
* A: 11794
* B: 8545
* C: 79705
* D: 7238
* E: 15030
* F: 95067
* G: 15379
* H: 250313
* I: 58299
*
* E  Sub with other variables
* A: 10121
* B: 13076
* C: 184979
* D: 10507
* E: 7653
* F: 219837
* G: 20356
* H: 253324
* I: 58318
*
* F  Sub with other variables
* A: 82639
* B: 74315
* C: 9956
* D: 71961
* E: 155785
* F: 6267
* G: 265669
* H: 19591
* I: 673001
* 
* G  Sub with other variables
* A: 21052
* B: 16557
* C: 259141
* D: 21997
* E: 13899
* F: 349738
* G: 8846
* H: 268624
* I: 34601
*
* H  Sub with other variables
* A: 233076
* B: 230047
* C: 13809
* D: 229253
* E: 247234
* F: 20832
* G: 287160
* H: 12522
* I: 620965
*
* I  Sub with other variables
* A: 41086
* B: 42895
* C: 697169
* D: 35364
* E: 32548
* F: 828675
* G: 40929
* H: 700004
* I: 22365
*
* Test Case #3 : Testing the Product methods
*
* A Mul with other variables
* A: 90929
* B: 130063
* C: 251235
* D: 402156
* E: 1389716
* F: 475331
* G: 3931432
* H: 3106232
* I: 25257370
*
* B Mul with other variables
* A: 66440
* B: 118016
* C: 189857
* D: 356245
* E: 1321725
* F: 461598
* G: 4135298
* H: 2653578
* I: 22725171
*
* C Mul with other variables
* A: 70014
* B: 127239
* C: 185545
* D: 384518
* E: 1285745
* F: 493312
* G: 6697652
* H: 5057122
* I: 15501240
*
* D Mul with other variables
* A: 207600
* B: 164840
* C: 270798
* D: 320033
* E: 1708389
* F: 662661
* G: 6271450
* H: 3828560
* I: 13696228
*
* E Mul with other variables
* A: 45889
* B: 78148
* C: 115678
* D: 230529
* E: 716799
* F: 262833
* G: 4161678
* H: 7132370
* I: 26267417
*
* F Mul with other variables
* A: 75747
* B: 136842
* C: 269256
* D: 503075
* E: 1308750
* F: 497801
* G: 1801808
* H: 2740098
* I: 11947286
* 
* G Mul with other variables
* A: 58985
* B: 94557
* C: 157468
* D: 348089
* E: 1247464
* F: 506988
* G: 4074202
* H: 3459159
* I: 21666662
*
* H Mul with other variables
* A: 125610
* B: 245629
* C: 359830
* D: 619572
* E: 1575759
* F: 735856
* G: 9723586
* H: 5501866
* I: 24553156
*
* I Mul with other variables
* A: 597446
* B: 1410289
* C: 1998259
* D: 3061040
* E: 10505555
* F: 1833781
* G: 12075602
* H: 9869458
* I: 38536785
*
* Test Case #4 : Testing the Power methods
* A Powers 
* 5 :294566
* 10:706776
* 20:2322351
* 30:4081472
*
* B Powers 
* 5 :669204
* 10:2351825
* 20:10610222
* 30:19251059
*
* C Powers 
* 5 :1391087
* 10:3008096
* 20:20863877
* 30:43018147
*
* D Powers 
* 5 :4757420
* 10:24347830
* 20:41357540
* 30:48372514
*
* E Powers 
* 5 :7686185
* 10:38342465
* 20:177369660
* 30:195505789
*
* F Powers 
* 5 :1311618
* 10:5348571
* 20:33845983
* 30:71909721
*
* G Powers 
* 5 :30779591
* 10:73351605
* 20:293855977
* 30:543024010
*
* H Powers 
* 5 :13249815
* 10:76881096
* 20:407297285
* 30:436865989
*
* I Powers 
* 5 :115134481
* 10:461640635
* 20:1912001260
* 30:3870442644
*
* Test Case #5 : Compute the following
* J :69075
* K :9522
* L :171670
* M :147604
* N :26483
* O :14038
* P :26366
* Q :25674
* R :21019
* S :26576
* T :11407
* U :106906
* V :59171
* W :171335
* X :5656273
* Y :138268
* Z :1485038
*/

public class LIntMain {

	public static void main(String[] args) {

		System.out.println("");
		System.out.println("Test Case #1 : Initialize Long Integers A-I");
		System.out.println("************");
		
		// TODO Auto-generated method stub
		String A = "2222";
		String B = "99999999";
		String C = "-246813575732";
		String D = "180270361023456789";
		String E = "1423550000000010056810000054593452907711568359";
		String F = "-350003274594847454317890";
		String G = "29302390234702973402973420937420973420937420937234872349872934872893472893749287423847";
		String H = "-98534342983742987342987339234098230498203894209928374662342342342356723423423";
		String I = "8436413168438618351351684694835434894364351846843435168484351684684315384684313846813153843135138413513843813513813138438435153454154515151513141592654543515316848613242587561516511233246174561276521672162416274123076527612";

		LongInteger lA = new LongInteger(A);
		LongInteger lB = new LongInteger(B);
		LongInteger lC = new LongInteger(C);
		LongInteger lD = new LongInteger(D);
		LongInteger lE = new LongInteger(E);
		LongInteger lF = new LongInteger(F);
		LongInteger lG = new LongInteger(G);
		LongInteger lH = new LongInteger(H);
		LongInteger lI = new LongInteger(I);

		
		
		int compareIndex = 0;
		String variableLst [] = {"A","B","C","D","E","F","G","H","I"};
		LongInteger _lstLI[] = new LongInteger[9];
		_lstLI[0] = lA;
		_lstLI[1] = lB;
		_lstLI[2] = lC;
		_lstLI[3] = lD;
		_lstLI[4] = lE;
		_lstLI[5] = lF;
		_lstLI[6] = lG;
		_lstLI[7] = lH;
		_lstLI[8] = lI;
		
		
		LongInteger _lstTempLI[] = new LongInteger[9];
		_lstTempLI[0] = lA;
		_lstTempLI[1] = lB;
		_lstTempLI[2] = lC;
		_lstTempLI[3] = lD;
		_lstTempLI[4] = lE;
		_lstTempLI[5] = lF;
		_lstTempLI[6] = lG;
		_lstTempLI[7] = lH;
		_lstTempLI[8] = lI;
		
		/* Running Time :
		 * SLL Implementation   = 4645184.0 ns
		 * Array Implementation = 4302876.0 ns
		 */

		System.out.println("");
		System.out.println("Test Case #2 : Traverse and print the value Stored in each position");
		System.out.println("************");

		System.out.println("A : ");
		lA.nodeDisplay();
		System.out.println("");
		System.out.println("B : ");
		lB.nodeDisplay();
		System.out.println("");
		System.out.println("C : ");
		lC.nodeDisplay();
		System.out.println("");
		System.out.println("D : ");
		lD.nodeDisplay();
		System.out.println("");
		System.out.println("E : ");
		lE.nodeDisplay();
		System.out.println("");
		System.out.println("F : ");
		lF.nodeDisplay();
		System.out.println("");
		System.out.println("G : ");
		lG.nodeDisplay();
		System.out.println("");
		System.out.println("H : ");
		lH.nodeDisplay();
		System.out.println("");
		System.out.println("I : ");
		lI.nodeDisplay();

		/* Running Time :
		 * SLL Implementation   = 9090395.0 ns
		 * Array Implementation = 9417043.0 ns
		 */

		System.out.println("");
		System.out.println("Result       : TestCase #2 Executed Successfully");

		System.out.println("");
		System.out.println("Test Case #3 : Print Each Long Integer to standard output using output()");
		System.out.println("************");

		System.out.println("");
		System.out.print("A : ");
		lA.output();
		System.out.println("");
		System.out.print("B : ");
		lB.output();
		System.out.println("");
		System.out.print("C : ");
		lC.output();
		System.out.println("");
		System.out.print("D : ");
		lD.output();
		System.out.println("");
		System.out.print("E : ");
		lE.output();
		System.out.println("");
		System.out.print("F : ");
		lF.output();
		System.out.println("");
		System.out.print("G : ");
		lG.output();
		System.out.println("");
		System.out.print("H : ");
		lH.output();
		System.out.println("");
		System.out.print("I : ");
		lI.output();

		/* Running Time :
		 * SLL Implementation   = 1811698.0 ns
		 * Array Implementation = 1733666.0 ns
		 */

		System.out.println("");
		System.out.println("Result       : TestCase #3 Executed Successfully");

		System.out.println("");
		System.out.println("Test Case #4 : Print the sign and the number of digits of each Long Integer");
		System.out.println("************");

		System.out.println("");
		System.out.println("LongInt   sign   Number Of Digits");
		System.out.println("-------------------------------");

		String Asign = "+";
		if (!lA.getSign())
			Asign = "-";
		int Acnt = lA.getDigitCount();
		System.out.println("  " + "A  " + "      " + Asign + "\t\t" + Acnt);

		String Bsign = "+";
		if (!lB.getSign())
			Bsign = "-";
		int Bcnt = lB.getDigitCount();
		System.out.println("  " + "B  " + "      " + Bsign + "\t\t" + Bcnt);

		String Csign = "+";
		if (!lC.getSign())
			Csign = "-";
		int Ccnt = lC.getDigitCount();
		System.out.println("  " + "C  " + "      " + Csign + "\t\t" + Ccnt);

		String Dsign = "+";
		if (!lD.getSign())
			Dsign = "-";
		int Dcnt = lD.getDigitCount();
		System.out.println("  " + "D  " + "      " + Dsign + "\t\t" + Dcnt);

		String Esign = "+";
		if (!lE.getSign())
			Esign = "-";
		int Ecnt = lE.getDigitCount();
		System.out.println("  " + "E  " + "      " + Esign + "\t\t" + Ecnt);

		String Fsign = "+";
		if (!lF.getSign())
			Fsign = "-";
		int Fcnt = lF.getDigitCount();
		System.out.println("  " + "F  " + "      " + Fsign + "\t\t" + Fcnt);

		String Gsign = "+";
		if (!lG.getSign())
			Gsign = "-";
		int Gcnt = lG.getDigitCount();
		System.out.println("  " + "G  " + "      " + Gsign + "\t\t" + Gcnt);

		String Hsign = "+";
		if (!lH.getSign())
			Hsign = "-";
		int Hcnt = lH.getDigitCount();
		System.out.println("  " + "H  " + "      " + Hsign + "\t\t" + Hcnt);

		String Isign = "+";
		if (!lI.getSign())
			Isign = "-";
		int Icnt = lI.getDigitCount();
		System.out.println("  " + "I  " + "      " + Isign + "\t\t" + Icnt);

		/* Running Time :
		 * SLL Implementation   = 366358.0 ns
		 * Array Implementation = 279746.0 ns
		 */

		System.out.println("");
		System.out.println("Result       : TestCase #4 Executed Successfully");

		System.out.println("");
		System.out.println("Test Case #5 : Testing the Utility methods");
		System.out.println("************");

		int iA = 2222;
		int iB = 99999999;

		System.out.println("");
		System.out.println("Integer    Overflow   Underflow   Number Of Digits");
		System.out.println("--------------------------------------------------------");

		UtilityOperations objUI = new UtilityOperations();
		String OverFlwA = null;
		if (objUI.overflow(iA) == -1)
			OverFlwA = "NA";
		else
			OverFlwA = Integer.toString(objUI.overflow(iA));

		int UnderFlwA = objUI.underflow(iA);
		int CountA = objUI.digits(iA);

		System.out.println(iA +"         " + OverFlwA + "         " + UnderFlwA + "             " + CountA);

		String OverFlwB = null;
		if (objUI.overflow(iB) == -1)
			OverFlwB = "NA";
		else
			OverFlwB = Integer.toString(objUI.overflow(iB));

		int UnderFlwB = objUI.underflow(iB);
		int CountB = objUI.digits(iB);

		System.out.println(iB + "    " + OverFlwB + "        " + UnderFlwB + "             " + CountB);

		/* Running Time :
		 * SLL Implementation   = 476346.0 ns
		 * Array Implementation = 634828.0 ns
		 */

		System.out.println("");
		System.out.println("Result       : TestCase #5 Executed Successfully");
		
		System.out.println("");
		System.out.println("Test Case #6 : Testing the Comparison methods");
		System.out.println("************");

		for (LongInteger objLI : _lstLI) {
			if (objLI != null) {
				String variableInProcess = variableLst[compareIndex];
				System.out.println();
				System.out.println("--------------------------------");
				System.out.println(variableInProcess+"  Compared with other variables");
				System.out.println("--------------------------------");
				System.out.println();
				
				System.out.println("Variable   IsEqual   IsLessThan  IsGreaterthan");
				System.out.println("----------------------------------------------");
				int insideIndex = 0;
				
				for (LongInteger objTempLI : _lstTempLI) {
					String IsEqual = "";
					String IsLess  = "";
					String isGreat = "";
					
					if (objTempLI != null) {
						String VarInside = variableLst[insideIndex];
						
						if (objLI.equalto(objTempLI))
							IsEqual = "True ";
						else
							IsEqual = "False";
						
						if (objLI.lessthan(objTempLI))
							IsLess = "True ";
						else
							IsLess = "False";
						
						if (objLI.greaterthan(objTempLI))
							isGreat = "True ";
						else
							isGreat = "False";
						
						System.out.println("   "+VarInside+"        "+IsEqual+"     "+IsLess+"         "+isGreat);
					}
					insideIndex++;
				}
			}
			compareIndex++;
		}
		compareIndex = 0;
		
		/* Running Time :
		 * SLL Implementation   = 3124721.0 ns
		 * Array Implementation = 4170313.0 ns
		 */

		System.out.println("");
		System.out.println("Result       : TestCase #6 Executed Successfully");
		System.out.println("");
		System.out.println("\t\t -----------XXXXXX----------");

		
		System.out.println("\t\t ---------------------------");
		System.out.println("\t\t       STEP-2:Testcases");
		System.out.println("\t\t ---------------------------");
		
		System.out.println("");
		System.out.println("Test Case #1 : Testing the Add methods");
		System.out.println("************");
		
		for (LongInteger objLI : _lstLI) {
			if (objLI != null) {
				String variableInProcess = variableLst[compareIndex];
				System.out.println();
				System.out.println("--------------------------------");
				System.out.println(variableInProcess+"  Added with other variables");
				System.out.println("--------------------------------");
				System.out.println();
				int insideIndex = 0;
				for (LongInteger objTempLI : _lstTempLI) {
					if (objTempLI != null) {
						LongInteger sumResult = new LongInteger();
						String VarInside = variableLst[insideIndex];
						System.out.println("******");
						System.out.println(variableInProcess+" + "+VarInside);
						System.out.println("******");
						System.out.println();
						objLI.output();
						System.out.println("(+)");
						objTempLI.output();
						System.out.println();
						sumResult = objLI.add(objTempLI);
						sumResult.output();
						System.out.println();
						insideIndex++;
					}
				}
				compareIndex++;
			}
		}
		compareIndex = 0;
		
		/* Running Time :
		 * SLL Implementation   = 8.0878027E7 ns
		 * Array Implementation = 7.8341601E7 ns
		 */

		System.out.println("Result       : TestCase #1 Executed Successfully");
		
		System.out.println("");
		System.out.println("Test Case #2 : Testing the Sub methods");
		System.out.println("************");
		
		for (LongInteger objLI : _lstLI) {
			if (objLI != null) {
				String variableInProcess = variableLst[compareIndex];
				System.out.println();
				System.out.println("--------------------------------");
				System.out.println(variableInProcess+"  Sub with other variables");
				System.out.println("--------------------------------");
				System.out.println();
				int insideIndex = 0;
				for (LongInteger objTempLI : _lstTempLI) {
					if (objTempLI != null) {
						LongInteger subResult = new LongInteger();
						String VarInside = variableLst[insideIndex];
						System.out.println("******");
						System.out.println(variableInProcess+" - "+VarInside);
						System.out.println("******");
						System.out.println();
						objLI.output();
						System.out.println("(-)");
						objTempLI.output();
						System.out.println();
						subResult = objLI.subtract(objTempLI);
						subResult.output();
						System.out.println();
						insideIndex++;
					}
				}
				compareIndex++;
			}
		}
		compareIndex = 0;

		/* Running Time :
		 * SLL Implementation   = 2.3511405E7 ns
		 * Array Implementation = 2.4209349E7 ns
		 */

		System.out.println("Result       : TestCase #2 Executed Successfully");
		
		System.out.println("");
		System.out.println("Test Case #3 : Testing the Product methods");
		System.out.println("************");
		
		for (LongInteger objLI : _lstLI) {
			if (objLI != null) {
				String variableInProcess = variableLst[compareIndex];
				System.out.println();
				System.out.println("--------------------------------");
				System.out.println(variableInProcess+"  Multiplied with other variables");
				System.out.println("--------------------------------");
				System.out.println();
				int insideIndex = 0;
				for (LongInteger objTempLI : _lstTempLI) {
					if (objTempLI != null) {
						LongInteger mulResult = new LongInteger();
						String VarInside = variableLst[insideIndex];
						System.out.println("******");
						System.out.println(variableInProcess+" x "+VarInside);
						System.out.println("******");
						System.out.println();
						objLI.output();
						System.out.println("(x)");
						objTempLI.output();
						System.out.println();
						mulResult = objLI.multiply(objTempLI);
						mulResult.output();
						System.out.println();
						insideIndex++;
					}
				}
				compareIndex++;
			}
		}
		compareIndex = 0;

		/* Running Time :
		 * SLL Implementation   = 3.30182399E8 ns
		 * Array Implementation = 3.22186963E8 ns
		 */

		System.out.println("Result       : TestCase #3 Executed Successfully");
		
		System.out.println("");
		System.out.println("Test Case #4 : Testing the Power methods");
		System.out.println("************");
		
		int[] powers = {5,10,20,30};
		for (LongInteger objLI : _lstLI) {
			if (objLI != null) {
				String variableInProcess = variableLst[compareIndex];
				System.out.println();
				System.out.println("--------------------------------");
				System.out.println(variableInProcess+"  Powers");
				System.out.println("--------------------------------");
				System.out.println();
				int insideIndex = 0;
				
				for (int objTempLI : powers) {
					LongInteger powResult = new LongInteger();
					System.out.println("******");
					System.out.println(variableInProcess+" ^ "+objTempLI);
					System.out.println("******");	
					System.out.println();
					powResult = objLI.power(objTempLI);
					powResult.output();
					System.out.println();
					insideIndex++;
				}
				compareIndex++;
			}
		}
		
		compareIndex = 0;

		/* Running Time :
		 * SLL Implementation   = 3.3203201739E10 ns
		 * Array Implementation = 8.6867192E9 ns
		 */

		System.out.println("Result       : TestCase #4 Executed Successfully");
		
		System.out.println("");
		System.out.println("Test Case #5 : Compute the following");
		System.out.println("************");
		
		LongInteger lJ = new LongInteger();
		LongInteger lK = new LongInteger();
		LongInteger lL = new LongInteger();
		LongInteger lM = new LongInteger();
		LongInteger lN = new LongInteger();
		LongInteger lO = new LongInteger();
		LongInteger lP = new LongInteger();
		LongInteger lQ = new LongInteger();
		LongInteger lR = new LongInteger();
		LongInteger lS = new LongInteger();
		LongInteger lT = new LongInteger();
		LongInteger lU = new LongInteger();
		LongInteger lV = new LongInteger();
		LongInteger lW = new LongInteger();
		LongInteger lX = new LongInteger();
		LongInteger lY = new LongInteger();
		LongInteger lZ = new LongInteger();
		
		System.out.println();
		System.out.println("J:");
		lJ = lB.add(lC);
		lJ.output();
		
		System.out.println();
		System.out.println("K:");
		lK = lC.add(lD);
		lK.output();
		
		System.out.println();
		System.out.println("L:");
		lL = lI.add(lI);
		lL.output();
		
		System.out.println();
		System.out.println("M:");
		lM = lA.add(lI);
		lM.output();
		
	
		System.out.println();
		System.out.println("N:");
		lN = lB.add(lK);
		lN.output();
		
		System.out.println();
		System.out.println("O:");
		lO = lA.subtract(lD);
		lO.output();
		
		System.out.println();
		System.out.println("P:");
		lP = lC.subtract(lD);
		lP.output();
		
		System.out.println();
		System.out.println("Q:");
		lQ = lD.subtract(lC);
		lQ.output();
		
		System.out.println();
		System.out.println("R:");
		lR = lL.subtract(lL);
		lR.output();
		
		System.out.println();
		System.out.println("S:");
		lS = lP.subtract(lO);
		lS.output();
		
		System.out.println();
		System.out.println("T:");
		lT = lN.subtract(lQ);
		lT.output();
		
		System.out.println();
		System.out.println("U:");
		lU = lA.multiply(lD);
		lU.output();
		
		System.out.println();
		System.out.println("V:");
		lV = lB.multiply(lC);
		lV.output();
		
		System.out.println();
		System.out.println("W:");
		lW = lD.multiply(lD);
		lW.output();
		
		System.out.println();
		System.out.println("X:");
		lX = lO.multiply(lI);
		lX.output();
		
		System.out.println();
		System.out.println("Y:");
		lY = lJ.multiply(lP);
		lY.output();
		
		System.out.println();
		System.out.println("Z:");
		lZ = lM.multiply(lN);
		lZ.output();
		
		/* Running Time :
		 * SLL Implementation   = 7589792.0 ns
		 * Array Implementation = 8123409.0 ns
		 */

		System.out.println("");
		System.out.println("Result       : TestCase #5 Executed Successfully");
		System.out.println("");
		System.out.println("\t\t -----------XXXXXX----------");
	}
}





