import java.util.ArrayList;
import java.util.List;
class RouteSegmentDB {
	public static final RouteSegment[] segments = {
		new RouteSegment(new Point[] {
        	new Point(14, 395),
        	new Point(15, 390),
        	new Point(16, 387),
        	new Point(18, 382),
        	new Point(19, 379),
        	new Point(21, 376),
        	new Point(22, 373),
        	new Point(25, 370),
        	new Point(28, 367),
        	new Point(33, 364),
        	new Point(37, 362),
        	new Point(41, 359),
        	new Point(45, 357),
        	new Point(49, 355),
        	new Point(56, 353),
        	new Point(64, 350),
        	new Point(72, 347),
        	new Point(77, 345),
        	new Point(82, 345),
        	new Point(88, 343),
        	new Point(95, 343),
        	new Point(102, 342),
        	new Point(107, 342),
        	new Point(113, 342),
        	new Point(121, 341),
        	new Point(129, 340),
        	new Point(136, 340),
        	new Point(143, 340),
        	new Point(152, 339),
        	new Point(158, 338),
        	new Point(162, 338),
        	new Point(166, 338),
        	new Point(171, 338),
        	new Point(177, 337),
        	new Point(186, 337),
        	new Point(193, 336),
        	new Point(198, 336),
        	new Point(202, 336),
        	new Point(208, 335),
        	new Point(214, 335),
        	new Point(220, 335),
        	new Point(225, 335),
        	new Point(228, 334)}),
        new RouteSegment(new Point[] {
        	new Point(230, 336),
        	new Point(234, 336),
        	new Point(240, 336),
        	new Point(244, 338),
        	new Point(248, 339),
        	new Point(252, 341),
        	new Point(256, 343),
        	new Point(258, 345),
        	new Point(261, 348),
        	new Point(264, 350),
        	new Point(267, 352),
        	new Point(269, 355),
        	new Point(271, 357),
        	new Point(274, 360),
        	new Point(276, 363),
        	new Point(278, 365),
        	new Point(280, 369),
        	new Point(283, 371),
        	new Point(286, 374),
        	new Point(288, 376),
        	new Point(292, 378),
        	new Point(296, 381),
        	new Point(299, 382),
        	new Point(304, 384),
        	new Point(307, 385),
        	new Point(310, 387),
        	new Point(314, 387),
        	new Point(319, 388),
        	new Point(323, 388),
        	new Point(326, 389),
        	new Point(330, 389),
        	new Point(336, 390),
        	new Point(342, 390),
        	new Point(346, 390),
        	new Point(352, 390),
        	new Point(358, 389),
        	new Point(362, 388),
        	new Point(366, 388),
        	new Point(374, 387),
        	new Point(379, 386),
        	new Point(383, 385),
        	new Point(387, 383),
        	new Point(393, 381),
        	new Point(397, 379),
        	new Point(399, 377),
        	new Point(402, 376),
        	new Point(404, 373),
        	new Point(407, 371),
        	new Point(411, 368),
        	new Point(414, 366),
        	new Point(416, 363),
        	new Point(419, 358),
        	new Point(422, 354),
        	new Point(424, 351),
        	new Point(426, 347),
        	new Point(429, 343),
        	new Point(430, 339),
        	new Point(431, 336),
        	new Point(433, 333),
        	new Point(434, 330),
        	new Point(436, 327)}),
        new RouteSegment(new Point[] {
        	new Point(229, 335),
        	new Point(234, 334),
        	new Point(237, 332),
        	new Point(239, 330),
        	new Point(242, 328),
        	new Point(246, 325),
        	new Point(248, 322),
        	new Point(250, 320),
        	new Point(252, 317),
        	new Point(253, 314),
        	new Point(255, 309),
        	new Point(256, 306),
        	new Point(257, 300),
        	new Point(258, 295),
        	new Point(258, 291),
        	new Point(258, 286),
        	new Point(258, 282),
        	new Point(258, 277),
        	new Point(257, 273),
        	new Point(255, 269),
        	new Point(254, 266),
        	new Point(252, 263),
        	new Point(251, 260),
        	new Point(249, 257),
        	new Point(247, 255),
        	new Point(244, 252),
        	new Point(241, 249),
        	new Point(238, 246),
        	new Point(235, 244),
        	new Point(232, 241),
        	new Point(230, 239),
        	new Point(228, 237),
        	new Point(226, 235),
        	new Point(223, 233),
        	new Point(220, 231),
        	new Point(218, 229),
        	new Point(215, 228),
        	new Point(213, 226),
        	new Point(209, 224),
        	new Point(206, 223),
        	new Point(204, 221),
        	new Point(201, 219),
        	new Point(197, 217),
        	new Point(194, 215),
        	new Point(191, 212),
        	new Point(188, 210),
        	new Point(185, 208),
        	new Point(182, 206),
        	new Point(180, 204),
        	new Point(176, 203),
        	new Point(173, 201),
        	new Point(168, 198),
        	new Point(166, 196),
        	new Point(163, 195),
        	new Point(160, 192),
        	new Point(156, 188),
        	new Point(153, 186),
        	new Point(149, 182),
        	new Point(146, 180),
        	new Point(144, 178),
        	new Point(142, 176),
        	new Point(140, 173),
        	new Point(138, 169),
        	new Point(137, 166)}),
        new RouteSegment(new Point[] {
        	new Point(139, 166),
        	new Point(140, 159),
        	new Point(142, 156),
        	new Point(143, 152),
        	new Point(145, 149),
        	new Point(147, 145),
        	new Point(148, 142),
        	new Point(151, 139),
        	new Point(153, 136),
        	new Point(156, 133),
        	new Point(158, 130),
        	new Point(161, 128),
        	new Point(163, 125),
        	new Point(166, 123),
        	new Point(169, 122),
        	new Point(174, 119),
        	new Point(181, 118),
        	new Point(186, 116),
        	new Point(191, 116),
        	new Point(195, 115),
        	new Point(200, 114),
        	new Point(204, 113),
        	new Point(210, 113),
        	new Point(215, 112),
        	new Point(222, 111),
        	new Point(227, 110),
        	new Point(235, 110),
        	new Point(241, 110),
        	new Point(246, 110),
        	new Point(250, 110),
        	new Point(255, 111),
        	new Point(258, 112),
        	new Point(262, 113),
        	new Point(265, 115)}),
        new RouteSegment(new Point[] {
        	new Point(139, 165),
        	new Point(139, 160),
        	new Point(139, 153),
        	new Point(139, 149),
        	new Point(138, 146),
        	new Point(136, 141),
        	new Point(135, 137),
        	new Point(134, 133),
        	new Point(133, 130),
        	new Point(131, 126),
        	new Point(130, 123),
        	new Point(127, 119),
        	new Point(125, 116),
        	new Point(123, 112),
        	new Point(121, 109),
        	new Point(119, 107),
        	new Point(118, 104),
        	new Point(115, 101),
        	new Point(112, 97),
        	new Point(110, 95),
        	new Point(107, 92),
        	new Point(105, 90),
        	new Point(103, 87),
        	new Point(101, 85),
        	new Point(98, 83),
        	new Point(94, 83),
        	new Point(90, 83),
        	new Point(85, 83),
        	new Point(79, 83),
        	new Point(75, 83),
        	new Point(71, 85),
        	new Point(67, 86),
        	new Point(63, 88),
        	new Point(60, 91),
        	new Point(56, 93),
        	new Point(55, 96),
        	new Point(52, 98),
        	new Point(49, 102),
        	new Point(47, 104),
        	new Point(46, 107),
        	new Point(45, 110),
        	new Point(43, 113),
        	new Point(42, 117),
        	new Point(41, 121),
        	new Point(41, 127),
        	new Point(41, 131),
        	new Point(41, 137),
        	new Point(41, 143),
        	new Point(41, 150),
        	new Point(41, 154),
        	new Point(42, 159),
        	new Point(43, 164),
        	new Point(43, 169),
        	new Point(44, 172),
        	new Point(44, 176),
        	new Point(44, 180),
        	new Point(45, 183),
        	new Point(46, 187),
        	new Point(47, 190),
        	new Point(48, 193),
        	new Point(48, 198),
        	new Point(50, 201),
        	new Point(50, 205),
        	new Point(52, 208),
        	new Point(53, 211),
        	new Point(55, 213),
        	new Point(56, 216),
        	new Point(58, 218),
        	new Point(61, 222),
        	new Point(63, 224),
        	new Point(65, 226),
        	new Point(68, 229),
        	new Point(71, 231),
        	new Point(74, 234),
        	new Point(77, 236),
        	new Point(81, 238),
        	new Point(83, 240),
        	new Point(86, 241),
        	new Point(88, 243),
        	new Point(90, 245),
        	new Point(93, 247),
        	new Point(96, 248),
        	new Point(99, 249),
        	new Point(103, 251),
        	new Point(106, 253),
        	new Point(110, 254),
        	new Point(113, 255),
        	new Point(115, 257),
        	new Point(118, 258),
        	new Point(122, 260),
        	new Point(127, 262),
        	new Point(130, 264),
        	new Point(134, 264),
        	new Point(137, 265),
        	new Point(139, 267),
        	new Point(143, 268),
        	new Point(146, 269),
        	new Point(148, 271),
        	new Point(152, 272),
        	new Point(156, 273),
        	new Point(159, 274),
        	new Point(163, 275),
        	new Point(166, 276),
        	new Point(169, 278),
        	new Point(174, 279),
        	new Point(177, 281),
        	new Point(182, 281),
        	new Point(185, 282),
        	new Point(188, 283),
        	new Point(191, 284),
        	new Point(194, 285)}),
        new RouteSegment(new Point[] {
        	new Point(266, 117),
        	new Point(269, 118),
        	new Point(271, 120),
        	new Point(272, 123),
        	new Point(274, 126),
        	new Point(274, 130),
        	new Point(275, 134),
        	new Point(276, 138),
        	new Point(277, 142),
        	new Point(278, 145),
        	new Point(278, 151),
        	new Point(278, 156),
        	new Point(278, 162),
        	new Point(278, 166),
        	new Point(278, 170),
        	new Point(278, 176),
        	new Point(279, 182),
        	new Point(279, 186),
        	new Point(279, 190),
        	new Point(280, 195),
        	new Point(281, 199),
        	new Point(283, 203),
        	new Point(284, 207),
        	new Point(286, 211),
        	new Point(288, 214),
        	new Point(289, 217),
        	new Point(290, 220),
        	new Point(293, 222),
        	new Point(295, 224),
        	new Point(297, 226),
        	new Point(300, 230),
        	new Point(303, 233),
        	new Point(305, 235),
        	new Point(308, 238),
        	new Point(311, 241),
        	new Point(314, 244),
        	new Point(316, 246),
        	new Point(319, 248),
        	new Point(322, 250),
        	new Point(325, 252),
        	new Point(329, 253),
        	new Point(331, 251)}),
        new RouteSegment(new Point[] {
        	new Point(269, 119),
        	new Point(273, 118),
        	new Point(277, 118),
        	new Point(281, 118),
        	new Point(285, 118),
        	new Point(289, 117),
        	new Point(293, 115),
        	new Point(296, 114),
        	new Point(300, 112),
        	new Point(304, 109),
        	new Point(307, 108),
        	new Point(310, 106),
        	new Point(313, 105),
        	new Point(316, 103),
        	new Point(319, 102),
        	new Point(322, 100),
        	new Point(330, 98),
        	new Point(334, 97),
        	new Point(338, 97),
        	new Point(344, 98),
        	new Point(349, 98),
        	new Point(359, 99),
        	new Point(369, 99),
        	new Point(373, 100),
        	new Point(376, 101),
        	new Point(378, 103)}),
        new RouteSegment(new Point[] {
        	new Point(438, 327),
        	new Point(441, 323),
        	new Point(442, 320),
        	new Point(444, 318),
        	new Point(446, 315),
        	new Point(449, 313),
        	new Point(451, 309),
        	new Point(453, 307),
        	new Point(456, 305),
        	new Point(458, 302),
        	new Point(462, 296),
        	new Point(465, 294),
        	new Point(468, 291),
        	new Point(472, 288),
        	new Point(475, 285),
        	new Point(477, 283),
        	new Point(480, 281),
        	new Point(484, 278),
        	new Point(488, 275),
        	new Point(492, 273),
        	new Point(495, 270),
        	new Point(498, 267),
        	new Point(501, 265),
        	new Point(503, 263),
        	new Point(506, 261),
        	new Point(509, 259),
        	new Point(510, 256),
        	new Point(513, 254),
        	new Point(515, 251),
        	new Point(517, 247),
        	new Point(519, 243),
        	new Point(520, 240),
        	new Point(521, 236),
        	new Point(522, 233),
        	new Point(522, 227),
        	new Point(524, 224),
        	new Point(524, 220),
        	new Point(524, 214),
        	new Point(523, 209),
        	new Point(522, 204),
        	new Point(522, 199),
        	new Point(521, 196),
        	new Point(520, 193),
        	new Point(520, 188),
        	new Point(519, 185),
        	new Point(518, 179),
        	new Point(518, 174),
        	new Point(516, 170),
        	new Point(516, 166),
        	new Point(515, 163),
        	new Point(514, 160)}),
        new RouteSegment(new Point[] {
        	new Point(435, 327),
        	new Point(435, 322),
        	new Point(435, 318),
        	new Point(434, 312),
        	new Point(431, 309),
        	new Point(430, 306),
        	new Point(428, 304),
        	new Point(426, 302),
        	new Point(424, 300),
        	new Point(421, 296),
        	new Point(417, 293),
        	new Point(415, 291),
        	new Point(411, 288),
        	new Point(407, 286),
        	new Point(401, 283),
        	new Point(396, 281),
        	new Point(393, 280),
        	new Point(389, 278),
        	new Point(385, 275),
        	new Point(382, 274),
        	new Point(380, 271),
        	new Point(377, 267),
        	new Point(376, 264),
        	new Point(374, 260),
        	new Point(372, 257),
        	new Point(370, 253),
        	new Point(367, 250),
        	new Point(366, 246),
        	new Point(365, 243),
        	new Point(364, 240),
        	new Point(363, 236),
        	new Point(363, 232),
        	new Point(363, 228),
        	new Point(363, 224),
        	new Point(363, 219),
        	new Point(363, 215),
        	new Point(363, 210),
        	new Point(364, 207),
        	new Point(365, 204),
        	new Point(366, 200),
        	new Point(366, 196),
        	new Point(367, 193),
        	new Point(368, 189),
        	new Point(370, 184),
        	new Point(371, 181),
        	new Point(372, 178),
        	new Point(373, 175)}),
        new RouteSegment(new Point[] {
        	new Point(331, 254),
        	new Point(333, 258),
        	new Point(334, 263),
        	new Point(336, 267),
        	new Point(337, 270),
        	new Point(338, 275),
        	new Point(338, 281),
        	new Point(339, 285),
        	new Point(339, 291),
        	new Point(339, 295),
        	new Point(339, 300),
        	new Point(337, 305),
        	new Point(336, 310),
        	new Point(335, 315),
        	new Point(335, 319),
        	new Point(335, 324),
        	new Point(336, 329),
        	new Point(337, 333),
        	new Point(339, 336),
        	new Point(341, 340),
        	new Point(343, 342),
        	new Point(345, 346),
        	new Point(347, 348),
        	new Point(350, 349),
        	new Point(352, 351)}),
        new RouteSegment(new Point[] {
        	new Point(331, 253),
        	new Point(334, 252),
        	new Point(336, 250),
        	new Point(337, 247),
        	new Point(338, 243),
        	new Point(340, 241),
        	new Point(340, 236),
        	new Point(341, 233),
        	new Point(343, 229),
        	new Point(344, 226),
        	new Point(345, 222),
        	new Point(346, 219),
        	new Point(347, 215),
        	new Point(347, 211),
        	new Point(349, 207),
        	new Point(350, 203),
        	new Point(351, 200),
        	new Point(351, 196),
        	new Point(353, 194),
        	new Point(353, 190),
        	new Point(354, 187),
        	new Point(357, 183),
        	new Point(360, 181),
        	new Point(362, 178),
        	new Point(366, 177),
        	new Point(369, 176),
        	new Point(372, 175)}),
        new RouteSegment(new Point[] {
        	new Point(374, 175),
        	new Point(378, 172),
        	new Point(380, 170),
        	new Point(383, 168),
        	new Point(385, 166),
        	new Point(387, 164),
        	new Point(388, 161),
        	new Point(391, 159),
        	new Point(392, 156),
        	new Point(393, 153),
        	new Point(395, 150),
        	new Point(397, 146),
        	new Point(398, 143),
        	new Point(399, 140),
        	new Point(402, 136),
        	new Point(403, 133),
        	new Point(406, 129),
        	new Point(409, 125),
        	new Point(412, 121),
        	new Point(415, 117),
        	new Point(417, 115),
        	new Point(421, 112),
        	new Point(424, 110),
        	new Point(427, 108),
        	new Point(431, 106),
        	new Point(434, 105),
        	new Point(438, 105),
        	new Point(441, 104),
        	new Point(443, 102),
        	new Point(447, 101),
        	new Point(451, 101)}),
        new RouteSegment(new Point[] {
        	new Point(380, 103),
        	new Point(384, 103),
        	new Point(388, 104),
        	new Point(392, 104),
        	new Point(395, 103),
        	new Point(397, 101),
        	new Point(400, 98),
        	new Point(404, 96),
        	new Point(406, 93),
        	new Point(409, 92),
        	new Point(411, 89),
        	new Point(412, 86),
        	new Point(412, 82),
        	new Point(412, 77),
        	new Point(410, 74),
        	new Point(409, 71),
        	new Point(407, 69),
        	new Point(405, 65),
        	new Point(403, 62),
        	new Point(401, 60),
        	new Point(399, 58),
        	new Point(396, 55),
        	new Point(395, 52),
        	new Point(392, 51),
        	new Point(389, 50),
        	new Point(385, 50),
        	new Point(382, 49),
        	new Point(379, 47),
        	new Point(375, 47),
        	new Point(371, 47),
        	new Point(367, 46),
        	new Point(364, 45),
        	new Point(360, 45),
        	new Point(357, 44),
        	new Point(354, 43),
        	new Point(348, 43),
        	new Point(344, 41),
        	new Point(340, 41),
        	new Point(337, 40),
        	new Point(333, 39),
        	new Point(330, 38),
        	new Point(325, 38),
        	new Point(320, 37),
        	new Point(315, 37),
        	new Point(312, 36),
        	new Point(308, 36),
        	new Point(304, 35),
        	new Point(300, 35),
        	new Point(295, 34),
        	new Point(292, 33),
        	new Point(286, 32),
        	new Point(281, 31),
        	new Point(278, 30),
        	new Point(273, 29),
        	new Point(269, 27),
        	new Point(263, 26),
        	new Point(259, 26)}),
        new RouteSegment(new Point[] {
        	new Point(381, 103),
        	new Point(385, 103),
        	new Point(389, 104),
        	new Point(392, 105),
        	new Point(396, 105),
        	new Point(400, 105),
        	new Point(404, 105),
        	new Point(409, 105),
        	new Point(413, 105),
        	new Point(417, 104),
        	new Point(421, 104),
        	new Point(424, 103),
        	new Point(427, 102),
        	new Point(430, 101),
        	new Point(433, 100),
        	new Point(436, 99),
        	new Point(440, 99),
        	new Point(443, 98),
        	new Point(447, 98),
        	new Point(451, 98),
        	new Point(454, 99)}),
        new RouteSegment(new Point[] {
        	new Point(455, 99),
        	new Point(455, 103),
        	new Point(456, 106),
        	new Point(458, 109),
        	new Point(460, 111),
        	new Point(461, 114),
        	new Point(470, 116),
        	new Point(475, 117),
        	new Point(478, 118),
        	new Point(480, 120),
        	new Point(485, 120),
        	new Point(491, 120),
        	new Point(496, 119),
        	new Point(499, 118),
        	new Point(503, 115),
        	new Point(506, 114),
        	new Point(509, 110),
        	new Point(512, 108),
        	new Point(514, 106),
        	new Point(517, 104),
        	new Point(519, 100),
        	new Point(520, 97),
        	new Point(522, 94),
        	new Point(524, 92),
        	new Point(526, 89),
        	new Point(527, 85),
        	new Point(529, 83),
        	new Point(530, 79),
        	new Point(531, 76),
        	new Point(533, 74),
        	new Point(534, 69),
        	new Point(536, 67),
        	new Point(537, 62),
        	new Point(539, 59),
        	new Point(542, 55),
        	new Point(544, 52),
        	new Point(545, 48)}),
        new RouteSegment(new Point[] {
        	new Point(515, 159),
        	new Point(515, 155),
        	new Point(516, 152),
        	new Point(518, 147),
        	new Point(519, 144),
        	new Point(520, 139),
        	new Point(521, 135),
        	new Point(523, 131),
        	new Point(525, 127),
        	new Point(526, 124),
        	new Point(527, 121),
        	new Point(528, 116),
        	new Point(528, 112),
        	new Point(530, 108),
        	new Point(530, 103),
        	new Point(530, 98),
        	new Point(531, 95),
        	new Point(531, 91),
        	new Point(533, 88),
        	new Point(534, 84),
        	new Point(535, 80),
        	new Point(536, 76),
        	new Point(538, 72),
        	new Point(540, 69),
        	new Point(541, 65),
        	new Point(542, 62),
        	new Point(544, 60),
        	new Point(545, 56),
        	new Point(545, 52),
        	new Point(545, 48),
        	new Point(546, 45)})
	};
	
	static {
	    for(RouteSegment rs : segments) {
	        for(RouteSegment rs2 : segments) {
	            Point p1 = rs.getPoint(rs.getNumPoints() - 1);
	            Point p2 = rs2.getPoint(0);
	            int xDiff = Math.abs(p2.getX() - p1.getX());
	            int yDiff = Math.abs(p2.getY() - p1.getY());
	            int totalDiff = xDiff + yDiff;
	            if(totalDiff < 10) {
	                rs.addNextRoute(rs2);
	            }
	        }
	    }
	}
}