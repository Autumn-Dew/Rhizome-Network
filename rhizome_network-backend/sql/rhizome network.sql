/*
 Navicat Premium Dump SQL

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80043 (8.0.43)
 Source Host           : localhost:3306
 Source Schema         : rhizome network

 Target Server Type    : MySQL
 Target Server Version : 80043 (8.0.43)
 File Encoding         : 65001

 Date: 22/04/2026 19:01:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `comment_id` bigint NOT NULL AUTO_INCREMENT COMMENT '评论ID',
  `songKey` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '歌曲标识',
  `user_id` bigint NOT NULL COMMENT '用户ID',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '评论内容',
  `like_count` int NOT NULL DEFAULT 0 COMMENT '点赞数',
  `parent_id` bigint NOT NULL DEFAULT 0 COMMENT '父评论ID，0为一级',
  `status` tinyint NOT NULL DEFAULT 0 COMMENT '0正常 1删除',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '发布时间',
  PRIMARY KEY (`comment_id`) USING BTREE,
  INDEX `idx_songKey`(`songKey` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '歌曲评论表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of comment
-- ----------------------------

-- ----------------------------
-- Table structure for comment_like
-- ----------------------------
DROP TABLE IF EXISTS `comment_like`;
CREATE TABLE `comment_like`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `comment_id` bigint NOT NULL,
  `user_id` bigint NOT NULL,
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uk_user_comment`(`user_id` ASC, `comment_id` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '评论点赞表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of comment_like
-- ----------------------------
INSERT INTO `comment_like` VALUES (1, 1, 2, '2026-03-31 14:37:38');
INSERT INTO `comment_like` VALUES (2, 3, 1, '2026-03-31 14:37:38');
INSERT INTO `comment_like` VALUES (8, 4, 2, '2026-04-02 07:38:20');
INSERT INTO `comment_like` VALUES (9, 4, 1, '2026-04-02 07:38:35');
INSERT INTO `comment_like` VALUES (10, 7, 2, '2026-04-02 07:44:53');

-- ----------------------------
-- Table structure for favorite
-- ----------------------------
DROP TABLE IF EXISTS `favorite`;
CREATE TABLE `favorite`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `user_id` bigint NOT NULL,
  `type` tinyint NOT NULL COMMENT '1=歌曲 2=歌单 3=论坛帖子',
  `target_key` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '目标ID：songKey / playlist_id / post_id',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uk_user_type_target`(`user_id` ASC, `type` ASC, `target_key` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 42 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '收藏表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of favorite
-- ----------------------------
INSERT INTO `favorite` VALUES (1, 1, 1, 'aliez|泽野弘之mizuki', '2026-03-31 14:37:39');
INSERT INTO `favorite` VALUES (2, 1, 2, '1', '2026-03-31 14:37:39');
INSERT INTO `favorite` VALUES (4, 1, 3, '1', '2026-03-31 14:37:39');
INSERT INTO `favorite` VALUES (5, 2, 3, '2', '2026-03-31 14:37:39');
INSERT INTO `favorite` VALUES (7, 2, 1, 'datura [paroxysm]|crywolf', '2026-04-02 14:53:20');
INSERT INTO `favorite` VALUES (8, 2, 1, 'fallen angel|aimee b ☆taku takahashi', '2026-04-02 14:55:42');
INSERT INTO `favorite` VALUES (30, 2, 2, '5', '2026-04-02 15:25:05');
INSERT INTO `favorite` VALUES (31, 2, 1, '空想樹界決戦：オルト・シバルバー|芳賀敬太', '2026-04-02 15:51:57');
INSERT INTO `favorite` VALUES (32, 2, 1, '黄金樹海紀行：ナウイ・ミクトラン|芳賀敬太', '2026-04-02 15:51:58');
INSERT INTO `favorite` VALUES (33, 2, 1, 'fakeit|sawanohiroyuki[nzk]', '2026-04-02 16:46:43');
INSERT INTO `favorite` VALUES (34, 2, 2, '8', '2026-04-02 18:46:51');
INSERT INTO `favorite` VALUES (35, 2, 1, 'climax|usao', '2026-04-02 19:42:00');
INSERT INTO `favorite` VALUES (36, 2, 1, 'the coil|澤野弘之', '2026-04-02 19:43:32');
INSERT INTO `favorite` VALUES (37, 2, 1, 'provant|sawanohiroyuki[nzk]', '2026-04-02 20:22:26');
INSERT INTO `favorite` VALUES (38, 2, 1, '平面鏡|reol', '2026-04-02 23:42:32');
INSERT INTO `favorite` VALUES (39, 2, 1, 'infected|starset', '2026-04-03 22:57:30');
INSERT INTO `favorite` VALUES (40, 2, 2, '15', '2026-04-03 23:17:23');
INSERT INTO `favorite` VALUES (41, 7, 1, 'fakeit|sawanohiroyuki[nzk]', '2026-04-04 00:14:50');

-- ----------------------------
-- Table structure for follow
-- ----------------------------
DROP TABLE IF EXISTS `follow`;
CREATE TABLE `follow`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `user_id` bigint NOT NULL COMMENT '关注人',
  `followed_uid` bigint NOT NULL COMMENT '被关注人',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uk_follow`(`user_id` ASC, `followed_uid` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '用户关注表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of follow
-- ----------------------------
INSERT INTO `follow` VALUES (1, 1, 2, '2026-03-31 14:37:39');
INSERT INTO `follow` VALUES (2, 2, 1, '2026-03-31 14:37:39');

-- ----------------------------
-- Table structure for forum_category
-- ----------------------------
DROP TABLE IF EXISTS `forum_category`;
CREATE TABLE `forum_category`  (
  `category_id` bigint NOT NULL AUTO_INCREMENT COMMENT '分类ID',
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '分类名称',
  `intro` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '分类介绍',
  `cover_url` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '封面URL',
  `sort` int NOT NULL DEFAULT 0 COMMENT '排序',
  `status` tinyint NOT NULL DEFAULT 0 COMMENT '0正常 1禁用',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`category_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '论坛分类表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of forum_category
-- ----------------------------
INSERT INTO `forum_category` VALUES (1, '综合交流', '音乐闲聊、感想讨论', 'https://picsum.photos/500/200?random=20', 1, 0, '2026-03-31 14:37:39');
INSERT INTO `forum_category` VALUES (2, '乐评赏析', '深度歌曲解析', 'https://picsum.photos/500/200?random=21', 2, 0, '2026-03-31 14:37:39');
INSERT INTO `forum_category` VALUES (3, '动漫原声', 'ACG 音乐专区', 'https://picsum.photos/500/200?random=22', 3, 0, '2026-03-31 14:37:39');
INSERT INTO `forum_category` VALUES (4, '歌单分享', '优质歌单推荐', 'https://picsum.photos/500/200?random=23', 4, 0, '2026-03-31 14:37:39');

-- ----------------------------
-- Table structure for forum_post
-- ----------------------------
DROP TABLE IF EXISTS `forum_post`;
CREATE TABLE `forum_post`  (
  `post_id` bigint NOT NULL AUTO_INCREMENT COMMENT '帖子ID',
  `category_id` bigint NOT NULL COMMENT '所属分类',
  `user_id` bigint NOT NULL COMMENT '发帖人ID',
  `title` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '标题',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '内容',
  `image_url` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '配图URL',
  `view_count` int NOT NULL DEFAULT 0 COMMENT '浏览量',
  `like_count` int NOT NULL DEFAULT 0 COMMENT '点赞数',
  `reply_count` int NOT NULL DEFAULT 0 COMMENT '回复数',
  `status` tinyint NOT NULL DEFAULT 0 COMMENT '0正常 1删除',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`post_id`) USING BTREE,
  INDEX `idx_category_id`(`category_id` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '论坛帖子表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of forum_post
-- ----------------------------

-- ----------------------------
-- Table structure for forum_post_like
-- ----------------------------
DROP TABLE IF EXISTS `forum_post_like`;
CREATE TABLE `forum_post_like`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `post_id` bigint NOT NULL,
  `user_id` bigint NOT NULL,
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uk_user_post`(`user_id` ASC, `post_id` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '帖子点赞表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of forum_post_like
-- ----------------------------
INSERT INTO `forum_post_like` VALUES (2, 2, 1, '2026-03-31 14:37:39');
INSERT INTO `forum_post_like` VALUES (3, 1, 2, '2026-04-03 17:46:08');

-- ----------------------------
-- Table structure for forum_reply
-- ----------------------------
DROP TABLE IF EXISTS `forum_reply`;
CREATE TABLE `forum_reply`  (
  `reply_id` bigint NOT NULL AUTO_INCREMENT COMMENT '回复ID',
  `post_id` bigint NOT NULL COMMENT '帖子ID',
  `user_id` bigint NOT NULL COMMENT '回复人ID',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '回复内容',
  `like_count` int NOT NULL DEFAULT 0 COMMENT '点赞数',
  `parent_id` bigint NOT NULL DEFAULT 0 COMMENT '楼中楼回复',
  `status` tinyint NOT NULL DEFAULT 0 COMMENT '0正常 1删除',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`reply_id`) USING BTREE,
  INDEX `idx_post_id`(`post_id` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '论坛回复表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of forum_reply
-- ----------------------------

-- ----------------------------
-- Table structure for forum_reply_like
-- ----------------------------
DROP TABLE IF EXISTS `forum_reply_like`;
CREATE TABLE `forum_reply_like`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `reply_id` bigint NOT NULL,
  `user_id` bigint NOT NULL,
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uk_user_reply`(`user_id` ASC, `reply_id` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '回复点赞表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of forum_reply_like
-- ----------------------------
INSERT INTO `forum_reply_like` VALUES (1, 1, 1, '2026-03-31 14:37:39');
INSERT INTO `forum_reply_like` VALUES (2, 3, 2, '2026-03-31 14:37:39');
INSERT INTO `forum_reply_like` VALUES (3, 1, 2, '2026-04-03 17:16:07');

-- ----------------------------
-- Table structure for moment
-- ----------------------------
DROP TABLE IF EXISTS `moment`;
CREATE TABLE `moment`  (
  `moment_id` bigint NOT NULL AUTO_INCREMENT,
  `user_id` bigint NOT NULL,
  `action_type` tinyint NOT NULL COMMENT '1播放 2评论 3创建歌单 4收藏',
  `songKey` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `playlist_id` bigint NULL DEFAULT NULL,
  `content` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '动态内容',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`moment_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 46 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '用户动态表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of moment
-- ----------------------------
INSERT INTO `moment` VALUES (4, 1, 1, 'listen!!|放課後ティータイム', NULL, '正在播放 Listen!!', '2026-04-02 18:28:19');
INSERT INTO `moment` VALUES (5, 2, 2, 'listen!!-放課後ティータイム', NULL, '评论了歌曲 Listen!!', '2026-04-02 18:32:38');
INSERT INTO `moment` VALUES (6, 2, 2, 'listen!!-放課後ティータイム', NULL, '回复了歌曲 Listen!! 的评论', '2026-04-02 18:32:47');
INSERT INTO `moment` VALUES (7, 1, 1, 'listen!!|放課後ティータイム', NULL, '正在播放 Listen!!', '2026-04-02 18:36:15');
INSERT INTO `moment` VALUES (8, 2, 3, NULL, NULL, '创建了歌单《123》', '2026-04-02 18:41:34');
INSERT INTO `moment` VALUES (9, 2, 4, NULL, 8, '收藏了歌单《123》', '2026-04-02 18:46:51');
INSERT INTO `moment` VALUES (10, 2, 3, NULL, NULL, '创建了歌单《321》', '2026-04-02 18:58:44');
INSERT INTO `moment` VALUES (11, 2, 3, NULL, 11, '创建了歌单《45》', '2026-04-02 19:01:25');
INSERT INTO `moment` VALUES (12, 1, 1, 'datura [paroxysm]|crywolf', NULL, '正在播放 DATURA [paroxysm]', '2026-04-02 19:26:53');
INSERT INTO `moment` VALUES (13, 1, 1, 'fallen angel|aimee b/☆taku takahashi', NULL, '正在播放 Fallen Angel', '2026-04-02 19:31:51');
INSERT INTO `moment` VALUES (14, 2, 2, 'fakeit-sawanohiroyuki[nzk]', NULL, '评论了歌曲 FAKEit', '2026-04-02 19:42:16');
INSERT INTO `moment` VALUES (15, 2, 2, 'fakeit-sawanohiroyuki[nzk]', NULL, '回复了歌曲 FAKEit 的评论', '2026-04-02 19:42:33');
INSERT INTO `moment` VALUES (16, 2, 3, NULL, 12, '创建了歌单《9876》', '2026-04-02 19:43:08');
INSERT INTO `moment` VALUES (17, 1, 1, 'fakeit|sawanohiroyuki[nzk]', NULL, '正在播放 FAKEit', '2026-04-02 20:04:07');
INSERT INTO `moment` VALUES (18, 1, 1, 'fakeit|sawanohiroyuki[nzk]', NULL, '正在播放 FAKEit', '2026-04-02 21:35:07');
INSERT INTO `moment` VALUES (19, 1, 1, '空想樹界決戦：オルト・シバルバー|芳賀敬太', NULL, '正在播放 空想樹界決戦：オルト・シバルバー', '2026-04-02 23:35:30');
INSERT INTO `moment` VALUES (20, 2, 2, '空想樹界決戦：オルト・シバルバー-芳賀敬太', NULL, '评论了歌曲 空想樹界決戦：オルト・シバルバー', '2026-04-02 23:40:18');
INSERT INTO `moment` VALUES (21, 2, 2, '空想樹界決戦：オルト・シバルバー-芳賀敬太', NULL, '回复了歌曲 空想樹界決戦：オルト・シバルバー 的评论', '2026-04-02 23:40:25');
INSERT INTO `moment` VALUES (22, 2, 3, NULL, 13, '创建了歌单《454》', '2026-04-02 23:41:57');
INSERT INTO `moment` VALUES (23, 2, 3, NULL, 11, '创建了歌单《45》', '2026-04-02 23:44:05');
INSERT INTO `moment` VALUES (24, 1, 1, 'fakeit|sawanohiroyuki[nzk]', NULL, '正在播放 FAKEit', '2026-04-02 23:50:24');
INSERT INTO `moment` VALUES (25, 1, 1, 'fakeit|sawanohiroyuki[nzk]', NULL, '正在播放 FAKEit', '2026-04-02 23:58:08');
INSERT INTO `moment` VALUES (26, 1, 1, '膨張する太陽 ～ort1～|芳賀敬太', NULL, '正在播放 膨張する太陽 ～ORT1～', '2026-04-03 16:54:33');
INSERT INTO `moment` VALUES (27, 1, 1, 'fakeit|sawanohiroyuki[nzk]', NULL, '正在播放 FAKEit', '2026-04-03 17:30:38');
INSERT INTO `moment` VALUES (28, 1, 1, 'fallen angel|aimee b/☆taku takahashi', NULL, '正在播放 Fallen Angel', '2026-04-03 17:35:26');
INSERT INTO `moment` VALUES (29, 1, 1, 'datura [paroxysm]|crywolf', NULL, '正在播放 DATURA [paroxysm]', '2026-04-03 20:01:32');
INSERT INTO `moment` VALUES (30, 1, 1, '黄金樹海紀行：ナウイ・ミクトラン|芳賀敬太', NULL, '正在播放 黄金樹海紀行：ナウイ・ミクトラン', '2026-04-03 20:23:41');
INSERT INTO `moment` VALUES (31, 1, 1, 'fakeit|sawanohiroyuki[nzk]', NULL, '正在播放 FAKEit', '2026-04-03 20:41:42');
INSERT INTO `moment` VALUES (32, 1, 1, 'little devil parade|lisa', NULL, '正在播放 LiTTLE DEViL PARADE', '2026-04-03 21:09:09');
INSERT INTO `moment` VALUES (33, 1, 1, '平面鏡|reol', NULL, '正在播放 平面鏡', '2026-04-03 23:01:18');
INSERT INTO `moment` VALUES (34, 1, 1, 'datura [paroxysm]|crywolf', NULL, '正在播放 DATURA [paroxysm]', '2026-04-03 23:10:04');
INSERT INTO `moment` VALUES (35, 1, 3, NULL, 15, '创建了歌单《1212》', '2026-04-03 23:12:04');
INSERT INTO `moment` VALUES (36, 2, 4, NULL, 15, '收藏了歌单《1212》', '2026-04-03 23:17:23');
INSERT INTO `moment` VALUES (37, 2, 2, 'fakeit-sawanohiroyuki[nzk]', NULL, '评论了歌曲 FAKEit', '2026-04-03 23:43:06');
INSERT INTO `moment` VALUES (38, 7, 3, NULL, 16, '创建了歌单《AutumDew》', '2026-04-04 00:11:41');
INSERT INTO `moment` VALUES (39, 2, 3, NULL, 17, '创建了歌单《测试》', '2026-04-04 00:14:07');
INSERT INTO `moment` VALUES (40, 1, 1, 'fakeit|sawanohiroyuki[nzk]', NULL, '正在播放 FAKEit', '2026-04-04 00:17:43');
INSERT INTO `moment` VALUES (41, 1, 1, 'fakeit|sawanohiroyuki[nzk]', NULL, '正在播放 FAKEit', '2026-04-04 02:23:08');
INSERT INTO `moment` VALUES (42, 1, 1, 'fly away|teddyloid', NULL, '正在播放 Fly Away', '2026-04-04 02:33:06');
INSERT INTO `moment` VALUES (43, 1, 1, 'fakeit|sawanohiroyuki[nzk]', NULL, '正在播放 FAKEit', '2026-04-04 03:30:00');
INSERT INTO `moment` VALUES (44, 1, 1, 'fakeit|sawanohiroyuki[nzk]', NULL, '正在播放 FAKEit', '2026-04-04 03:34:29');
INSERT INTO `moment` VALUES (45, 1, 1, 'fakeit|sawanohiroyuki[nzk]', NULL, '正在播放 FAKEit', '2026-04-04 03:53:11');

-- ----------------------------
-- Table structure for play_record
-- ----------------------------
DROP TABLE IF EXISTS `play_record`;
CREATE TABLE `play_record`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `user_id` bigint NOT NULL,
  `songKey` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `total_count` int NOT NULL DEFAULT 0 COMMENT '总播放次数',
  `month_count` int NOT NULL DEFAULT 0 COMMENT '当月播放次数',
  `week_count` int NOT NULL DEFAULT 0 COMMENT '近7天播放次数',
  `last_play_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后播放时间',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uk_user_song`(`user_id` ASC, `songKey` ASC) USING BTREE,
  INDEX `idx_songKey`(`songKey` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '播放记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of play_record
-- ----------------------------
INSERT INTO `play_record` VALUES (4, 1, 'datura [paroxysm]|crywolf', 34, 34, 34, '2026-04-03 19:48:54', '2026-04-02 09:08:05', '2026-04-03 19:48:54');
INSERT INTO `play_record` VALUES (5, 1, 'fallen angel|aimee b/☆taku takahashi', 11, 11, 11, '2026-04-03 19:57:38', '2026-04-02 10:17:12', '2026-04-03 19:57:38');
INSERT INTO `play_record` VALUES (6, 1, 'listen!!|放課後ティータイム', 9, 9, 9, '2026-04-02 11:02:25', '2026-04-02 10:28:19', '2026-04-02 11:02:25');
INSERT INTO `play_record` VALUES (7, 1, 'おしまい～妖精円卓領域：o・ヴォーティガーン|芳賀敬太', 2, 2, 2, '2026-04-02 11:49:20', '2026-04-02 11:08:43', '2026-04-02 11:49:20');
INSERT INTO `play_record` VALUES (8, 1, 'fly away|teddyloid', 2, 2, 2, '2026-04-03 18:33:06', '2026-04-02 11:31:54', '2026-04-03 18:33:06');
INSERT INTO `play_record` VALUES (9, 1, 'heavenly me|aiyue/理名/塞壬唱片-msr', 1, 1, 1, '2026-04-02 11:31:55', '2026-04-02 11:31:55', '2026-04-02 11:31:55');
INSERT INTO `play_record` VALUES (10, 1, 'the coil|澤野弘之', 1, 1, 1, '2026-04-02 11:38:06', '2026-04-02 11:38:06', '2026-04-02 11:38:06');
INSERT INTO `play_record` VALUES (11, 1, 'fakeit|sawanohiroyuki[nzk]', 40, 40, 40, '2026-04-03 21:17:03', '2026-04-02 12:04:07', '2026-04-03 21:17:03');
INSERT INTO `play_record` VALUES (12, 1, '空想樹界決戦：オルト・シバルバー|芳賀敬太', 8, 8, 8, '2026-04-03 13:01:51', '2026-04-02 15:35:30', '2026-04-03 13:01:51');
INSERT INTO `play_record` VALUES (13, 1, '膨張する太陽 ～ort1～|芳賀敬太', 1, 1, 1, '2026-04-03 08:54:33', '2026-04-03 08:54:33', '2026-04-03 08:54:33');
INSERT INTO `play_record` VALUES (14, 1, '新霊長後継戦：アーキタイプ・インセプション ii|芳賀敬太', 1, 1, 1, '2026-04-03 08:58:39', '2026-04-03 08:58:39', '2026-04-03 08:58:39');
INSERT INTO `play_record` VALUES (15, 1, 'protocol|塞壬唱片-msr/erik castro', 6, 6, 6, '2026-04-03 09:23:01', '2026-04-03 09:09:27', '2026-04-03 09:23:01');
INSERT INTO `play_record` VALUES (16, 1, '黄金樹海紀行：ナウイ・ミクトラン|芳賀敬太', 5, 5, 5, '2026-04-03 12:37:13', '2026-04-03 12:23:41', '2026-04-03 12:37:13');
INSERT INTO `play_record` VALUES (17, 1, 'little devil parade|lisa', 1, 1, 1, '2026-04-03 13:09:09', '2026-04-03 13:09:09', '2026-04-03 13:09:09');
INSERT INTO `play_record` VALUES (18, 1, '舍盘持难题纳婆罗为谛|塞壬唱片-msr/steven grove', 2, 2, 2, '2026-04-03 13:17:33', '2026-04-03 13:14:28', '2026-04-03 13:17:33');
INSERT INTO `play_record` VALUES (19, 1, '平面鏡|reol', 2, 2, 2, '2026-04-03 15:04:41', '2026-04-03 15:01:18', '2026-04-03 15:04:41');

-- ----------------------------
-- Table structure for playlist
-- ----------------------------
DROP TABLE IF EXISTS `playlist`;
CREATE TABLE `playlist`  (
  `playlist_id` bigint NOT NULL AUTO_INCREMENT COMMENT '歌单ID',
  `user_id` bigint NOT NULL COMMENT '创建者ID',
  `title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '歌单名称',
  `intro` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '简介',
  `cover_url` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '封面URL',
  `is_public` tinyint NOT NULL DEFAULT 0 COMMENT '0私密 1公开',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`playlist_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '歌单表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of playlist
-- ----------------------------
INSERT INTO `playlist` VALUES (16, 7, 'AutumDew', 'AutumnDew的歌单', 'https://media.prts.wiki/6/68/%E7%AB%8B%E7%BB%98_%E6%B0%B4%E7%81%AF%E5%BF%83_skin1.png', 1, '2026-04-04 00:11:41', '2026-04-04 00:11:41');
INSERT INTO `playlist` VALUES (17, 2, '测试', '测试', 'https://media.prts.wiki/6/68/%E7%AB%8B%E7%BB%98_%E6%B0%B4%E7%81%AF%E5%BF%83_skin1.png', 1, '2026-04-04 00:14:07', '2026-04-04 00:14:07');

-- ----------------------------
-- Table structure for playlist_song
-- ----------------------------
DROP TABLE IF EXISTS `playlist_song`;
CREATE TABLE `playlist_song`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `playlist_id` bigint NOT NULL,
  `songKey` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `add_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_playlist`(`playlist_id` ASC) USING BTREE,
  INDEX `idx_songKey`(`songKey` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 51 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '歌单歌曲关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of playlist_song
-- ----------------------------
INSERT INTO `playlist_song` VALUES (25, 5, 'awaken-塞壬唱片-msr/adam gubman/holly sedillos', '2026-04-02 13:34:06');
INSERT INTO `playlist_song` VALUES (26, 5, 'datura [paroxysm]-crywolf', '2026-04-02 13:34:06');
INSERT INTO `playlist_song` VALUES (27, 5, 'fairy stage-c-clays', '2026-04-02 13:34:06');
INSERT INTO `playlist_song` VALUES (28, 5, 'fakeit-sawanohiroyuki[nzk]', '2026-04-02 13:34:06');
INSERT INTO `playlist_song` VALUES (29, 5, 'fallen angel-aimee b/☆taku takahashi', '2026-04-02 13:34:06');
INSERT INTO `playlist_song` VALUES (30, 6, 'fairy stage-c-clays', '2026-04-02 13:36:51');
INSERT INTO `playlist_song` VALUES (31, 6, 'heavenly me-aiyue/理名/塞壬唱片-msr', '2026-04-02 13:36:51');
INSERT INTO `playlist_song` VALUES (32, 6, 'offline saga-empty old city/水槽', '2026-04-02 13:36:51');
INSERT INTO `playlist_song` VALUES (33, 6, 'mortal eye-塞壬唱片-msr/adam gubman/bonzie/christine hals', '2026-04-02 13:36:51');
INSERT INTO `playlist_song` VALUES (34, 12, 'fakeit-sawanohiroyuki[nzk]', '2026-04-02 19:43:21');
INSERT INTO `playlist_song` VALUES (35, 12, 'fallen angel-aimee b/☆taku takahashi', '2026-04-02 19:43:21');
INSERT INTO `playlist_song` VALUES (36, 12, 'the coil-澤野弘之', '2026-04-02 19:43:21');
INSERT INTO `playlist_song` VALUES (37, 13, 'datura [paroxysm]-crywolf', '2026-04-02 23:42:02');
INSERT INTO `playlist_song` VALUES (38, 13, 'fallen angel-aimee b/☆taku takahashi', '2026-04-02 23:42:02');
INSERT INTO `playlist_song` VALUES (39, 13, 'heavenly me-aiyue/理名/塞壬唱片-msr', '2026-04-02 23:42:02');
INSERT INTO `playlist_song` VALUES (40, 12, '404 not found-reol', '2026-04-02 23:43:02');
INSERT INTO `playlist_song` VALUES (41, 14, 'fallen angel-aimee b/☆taku takahashi', '2026-04-03 20:40:17');
INSERT INTO `playlist_song` VALUES (42, 14, 'fakeit-sawanohiroyuki[nzk]', '2026-04-03 20:40:32');
INSERT INTO `playlist_song` VALUES (43, 15, 'fakeit-sawanohiroyuki[nzk]', '2026-04-03 23:12:10');
INSERT INTO `playlist_song` VALUES (44, 15, 'fairy stage-c-clays', '2026-04-03 23:12:10');
INSERT INTO `playlist_song` VALUES (45, 15, 'datura [paroxysm]-crywolf', '2026-04-03 23:12:10');
INSERT INTO `playlist_song` VALUES (46, 15, 'awaken-塞壬唱片-msr/adam gubman/holly sedillos', '2026-04-03 23:12:10');
INSERT INTO `playlist_song` VALUES (47, 16, 'datura [paroxysm]-crywolf', '2026-04-04 00:12:05');
INSERT INTO `playlist_song` VALUES (48, 16, 'fakeit-sawanohiroyuki[nzk]', '2026-04-04 00:12:05');
INSERT INTO `playlist_song` VALUES (49, 16, 'fallen angel-aimee b/☆taku takahashi', '2026-04-04 00:12:05');
INSERT INTO `playlist_song` VALUES (50, 17, 'brave shine-aimer', '2026-04-04 00:14:12');

-- ----------------------------
-- Table structure for song
-- ----------------------------
DROP TABLE IF EXISTS `song`;
CREATE TABLE `song`  (
  `song_id` bigint NOT NULL AUTO_INCREMENT COMMENT '歌曲ID',
  `songKey` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '歌曲唯一标识',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '歌曲名',
  `artist` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '艺术家',
  `play_count` bigint NOT NULL DEFAULT 0 COMMENT '总播放数',
  `comment_count` int NOT NULL DEFAULT 0 COMMENT '评论数',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`song_id`) USING BTREE,
  UNIQUE INDEX `uk_songKey`(`songKey` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 252 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '歌曲信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of song
-- ----------------------------
INSERT INTO `song` VALUES (203, 'awaken|塞壬唱片-msr adam gubman holly sedillos', 'Awaken', '塞壬唱片-MSR/Adam Gubman/Holly Sedillos', 0, 0, '2026-04-02 13:30:13');
INSERT INTO `song` VALUES (204, 'datura [paroxysm]|crywolf', 'DATURA [paroxysm]', 'Crywolf', 0, 0, '2026-04-02 13:30:13');
INSERT INTO `song` VALUES (205, 'fairy stage|c-clays', 'fairy stage', 'C-CLAYS', 0, 0, '2026-04-02 13:30:13');
INSERT INTO `song` VALUES (206, 'fakeit|sawanohiroyuki[nzk]', 'FAKEit', 'SawanoHiroyuki[nZk]', 0, 0, '2026-04-02 13:30:14');
INSERT INTO `song` VALUES (207, 'fallen angel|aimee b ☆taku takahashi', 'Fallen Angel', 'Aimee b/☆Taku Takahashi', 0, 0, '2026-04-02 13:30:14');
INSERT INTO `song` VALUES (208, 'fly away|teddyloid', 'Fly Away', 'TeddyLoid', 0, 0, '2026-04-02 13:30:14');
INSERT INTO `song` VALUES (209, 'heavenly me|aiyue 理名 塞壬唱片-msr', 'Heavenly Me', 'AIYUE/理名/塞壬唱片-MSR', 0, 0, '2026-04-02 13:30:15');
INSERT INTO `song` VALUES (210, 'infected|starset', 'INFECTED', 'STARSET', 0, 0, '2026-04-02 13:30:15');
INSERT INTO `song` VALUES (211, 'invade spider～ort2～|newpiano', 'Invade Spider～ORT2～', 'NewPiano', 0, 0, '2026-04-02 13:30:16');
INSERT INTO `song` VALUES (212, 'invade starcell～ort3～|newpiano', 'Invade StarCell～ORT3～', 'NewPiano', 0, 0, '2026-04-02 13:30:16');
INSERT INTO `song` VALUES (213, 'listen|放課後ティータイム', 'Listen!!', '放課後ティータイム', 0, 0, '2026-04-02 13:30:17');
INSERT INTO `song` VALUES (214, 'little devil parade|lisa', 'LiTTLE DEViL PARADE', 'LiSA', 0, 0, '2026-04-02 13:30:17');
INSERT INTO `song` VALUES (215, 'little wish|塞壬唱片-msr sincere ws music', 'Little Wish', '塞壬唱片-MSR/Sincere/Ws Music', 0, 0, '2026-04-02 13:30:18');
INSERT INTO `song` VALUES (216, 'miss you|塞壬唱片-msr erik castro david lin 左乙', 'Miss You', '塞壬唱片-MSR/Erik Castro/David Lin/左乙', 0, 0, '2026-04-02 13:30:19');
INSERT INTO `song` VALUES (217, 'mortal eye|塞壬唱片-msr adam gubman bonzie christine hals', 'Mortal Eye', '塞壬唱片-MSR/Adam Gubman/Bonzie/Christine Hals', 0, 0, '2026-04-02 13:30:20');
INSERT INTO `song` VALUES (218, 'jubilee|絃鳥 cold kiss aki 坂上なち', 'JUBILEE', '絃鳥/cold kiss/aki/坂上なち', 0, 0, '2026-04-02 13:30:21');
INSERT INTO `song` VALUES (219, 'offline saga|empty old city 水槽', 'Offline Saga', 'Empty old City/水槽', 0, 0, '2026-04-02 13:30:22');
INSERT INTO `song` VALUES (220, 'protocol|塞壬唱片-msr erik castro', 'Protocol', '塞壬唱片-MSR/Erik Castro', 0, 0, '2026-04-02 13:30:23');
INSERT INTO `song` VALUES (221, 'provant|sawanohiroyuki[nzk]', 'PROVANT', 'SawanoHiroyuki[nZk]', 0, 0, '2026-04-02 13:30:24');
INSERT INTO `song` VALUES (222, 'telescope|starset', 'Telescope', 'STARSET', 0, 0, '2026-04-02 13:30:25');
INSERT INTO `song` VALUES (223, 'thank you for dears|get in the ring', 'Thank you for dears.', 'GET IN THE RING', 0, 0, '2026-04-02 13:30:26');
INSERT INTO `song` VALUES (224, 'the coil|澤野弘之', 'THE COIL', '澤野弘之', 0, 0, '2026-04-02 13:30:27');
INSERT INTO `song` VALUES (225, 'theoretical simulation|塞壬唱片-msr ska2or', 'Theoretical Simulation', '塞壬唱片-MSR/SKa2or', 0, 0, '2026-04-02 13:30:28');
INSERT INTO `song` VALUES (226, 'アンノウン・マザーグース unknown mother-goose|wowaka 初音未来', 'アンノウン・マザーグース (Unknown Mother-Goose)', 'wowaka/初音未来', 0, 0, '2026-04-02 13:30:30');
INSERT INTO `song` VALUES (227, 'おしまい～妖精円卓領域：o・ヴォーティガーン|芳賀敬太', 'おしまい～妖精円卓領域：O・ヴォーティガーン', '芳賀敬太', 0, 0, '2026-04-02 13:30:31');
INSERT INTO `song` VALUES (228, 'サマータイムラブ 夏日之恋|shiggy jr', 'サマータイムラブ (夏日之恋)', 'Shiggy Jr.', 0, 0, '2026-04-02 13:30:32');
INSERT INTO `song` VALUES (229, 'ツギハギスタッカート|nameless', 'ツギハギスタッカート', 'nameless', 0, 0, '2026-04-02 13:30:33');
INSERT INTO `song` VALUES (230, 'ヨスズメロディハート|あよ', 'ヨスズメロディハート', 'あよ', 0, 0, '2026-04-02 13:30:35');
INSERT INTO `song` VALUES (231, '歯車|幸祜 花譜', '歯車', '幸祜/花譜', 0, 0, '2026-04-02 13:30:36');
INSERT INTO `song` VALUES (232, '春弦|塞壬唱片-msr 横山克', '春弦', '塞壬唱片-MSR/横山克', 0, 0, '2026-04-02 13:30:38');
INSERT INTO `song` VALUES (233, '彁|leaf', '彁', 'LeaF', 0, 0, '2026-04-02 13:30:40');
INSERT INTO `song` VALUES (234, '貴方観測日和|7co', '貴方観測日和', '7co', 0, 0, '2026-04-02 13:30:41');
INSERT INTO `song` VALUES (235, '黄金樹海紀行：ナウイ・ミクトラン|芳賀敬太', '黄金樹海紀行：ナウイ・ミクトラン', '芳賀敬太', 0, 0, '2026-04-02 13:30:43');
INSERT INTO `song` VALUES (236, '空想樹界決戦：オルト・シバルバー|芳賀敬太', '空想樹界決戦：オルト・シバルバー', '芳賀敬太', 0, 0, '2026-04-02 13:30:44');
INSERT INTO `song` VALUES (237, '明鏡肆水 ～光と闇の狭間に～|芳賀敬太', '明鏡肆水 ～光と闇の狭間に～', '芳賀敬太', 0, 0, '2026-04-02 13:30:46');
INSERT INTO `song` VALUES (238, '膨張する太陽 ～ort1～|芳賀敬太', '膨張する太陽 ～ORT1～', '芳賀敬太', 0, 0, '2026-04-02 13:30:47');
INSERT INTO `song` VALUES (239, '新霊長後継戦：アーキタイプ・インセプション ii|芳賀敬太', '新霊長後継戦：アーキタイプ・インセプション II', '芳賀敬太', 0, 0, '2026-04-02 13:30:49');
INSERT INTO `song` VALUES (240, '舍盘持难题纳婆罗为谛|塞壬唱片-msr steven grove', '舍盘持难题纳婆罗为谛', '塞壬唱片-MSR/Steven Grove', 0, 0, '2026-04-02 13:30:50');
INSERT INTO `song` VALUES (241, '五月雨20ラブ 映画「けいおん 」mix|放課後ティータイム', '五月雨20ラブ(映画「けいおん!」Mix)', '放課後ティータイム', 0, 0, '2026-04-02 13:30:52');
INSERT INTO `song` VALUES (242, '異説地球紀行o・x～ort4～|newpiano', '異説地球紀行O・X～ORT4～', 'NewPiano', 0, 0, '2026-04-02 13:30:54');
INSERT INTO `song` VALUES (243, '新霊長後継戦：アーキタイプ・インセプション i|芳賀敬太', '新霊長後継戦：アーキタイプ・インセプション I', '芳賀敬太', 0, 0, '2026-04-02 13:30:55');
INSERT INTO `song` VALUES (244, '新霊長後継戦：アーキタイプ・インセプション iii|芳賀敬太', '新霊長後継戦：アーキタイプ・インセプション III', '芳賀敬太', 0, 0, '2026-04-02 13:30:59');
INSERT INTO `song` VALUES (245, '卒業|芳賀敬太', '卒業', '芳賀敬太', 0, 0, '2026-04-02 13:31:01');
INSERT INTO `song` VALUES (246, '六等星の夜 六等星之夜|aimer', '六等星の夜 (六等星之夜)', 'Aimer', 0, 0, '2026-04-02 19:10:32');
INSERT INTO `song` VALUES (247, 'climax|usao', 'Climax', 'USAO', 0, 0, '2026-04-02 19:41:45');
INSERT INTO `song` VALUES (248, '平面鏡|reol', '平面鏡', 'Reol', 0, 0, '2026-04-02 23:42:28');
INSERT INTO `song` VALUES (249, '404 not found|reol', '404 not found', 'REOL', 0, 0, '2026-04-02 23:42:53');
INSERT INTO `song` VALUES (250, 'brave shine|aimer', 'Brave Shine', 'Aimer', 0, 0, '2026-04-04 00:12:52');
INSERT INTO `song` VALUES (251, '第六感|reol', '第六感', 'Reol', 0, 0, '2026-04-04 01:04:48');

-- ----------------------------
-- Table structure for song_tag
-- ----------------------------
DROP TABLE IF EXISTS `song_tag`;
CREATE TABLE `song_tag`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `songKey` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `tag_id` bigint NOT NULL,
  `user_id` bigint NOT NULL,
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_songKey`(`songKey` ASC) USING BTREE,
  INDEX `idx_tag_id`(`tag_id` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '歌曲标签关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of song_tag
-- ----------------------------
INSERT INTO `song_tag` VALUES (1, 'the coil|泽野弘之benjaminmpi', 1, 1, '2026-03-31 14:37:39');
INSERT INTO `song_tag` VALUES (2, 'the coil|泽野弘之benjaminmpi', 2, 1, '2026-03-31 14:37:39');
INSERT INTO `song_tag` VALUES (3, 'aliez|泽野弘之mizuki', 1, 2, '2026-03-31 14:37:39');
INSERT INTO `song_tag` VALUES (4, 'aliez|泽野弘之mizuki', 2, 2, '2026-03-31 14:37:39');

-- ----------------------------
-- Table structure for tag
-- ----------------------------
DROP TABLE IF EXISTS `tag`;
CREATE TABLE `tag`  (
  `tag_id` bigint NOT NULL AUTO_INCREMENT,
  `tag_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '标签名',
  `use_count` int NOT NULL DEFAULT 0 COMMENT '使用次数',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`tag_id`) USING BTREE,
  UNIQUE INDEX `uk_tag_name`(`tag_name` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '歌曲标签表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tag
-- ----------------------------
INSERT INTO `tag` VALUES (1, '燃系', 10, '2026-03-31 14:37:39');
INSERT INTO `tag` VALUES (2, '动漫', 15, '2026-03-31 14:37:39');
INSERT INTO `tag` VALUES (3, '游戏', 5, '2026-03-31 14:37:39');
INSERT INTO `tag` VALUES (4, '治愈', 2, '2026-03-31 14:37:39');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` bigint NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `account` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '登录账号',
  `password` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '密码密文',
  `nick_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '显示昵称',
  `avatar_url` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '头像URL',
  `signature` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '个性签名',
  `role` tinyint NOT NULL COMMENT '0普通 1管理员',
  `status` tinyint NOT NULL DEFAULT 0 COMMENT '0正常 1禁用',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`user_id`) USING BTREE,
  UNIQUE INDEX `uk_account`(`account` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (2, 'admin', 'ea252f2a4e4c5ff2bc31b37bcce5f696', 'Rhizome管理员', 'https://media.prts.wiki/f/ff/%E7%AB%8B%E7%BB%98_%E8%BF%B7%E8%BF%AD%E9%A6%99_skin2.png', '', 1, 0, '2026-03-31 14:37:38', '2026-04-22 19:00:36');
INSERT INTO `user` VALUES (7, 'AutumnDew', '52876409ab8e857967add46928f1b704', 'AutumnDew', 'https://media.prts.wiki/6/68/%E7%AB%8B%E7%BB%98_%E6%B0%B4%E7%81%AF%E5%BF%83_skin1.png', '', 1, 0, '2026-04-03 23:48:33', '2026-04-04 00:11:48');

SET FOREIGN_KEY_CHECKS = 1;
