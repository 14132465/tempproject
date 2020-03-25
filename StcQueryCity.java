package com.tingtong.server.game.back.cross.data;

import lombok.Data;

import java.util.List;

/**
 * 城池查找 【跨服返回】
 */
@Data
public class StcQueryCity {


	/**
	 * 城池状态数据
	 */
	List<CityStatusData> list;
	/**
	 * 玩家战斗数据[List<json>]
	 */
	List<String> roleList;

}
