package com.tingtong.server.game.back.cross.data;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.alibaba.fastjson.JSON;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * [游戏服向跨服]请求数据  stm  =游戏服 to 微服务
 * @author Administrator
 *
 * @param <T>
 */
//=====
@Data
@Accessors(chain = true)
public class StcProto<T> {
	
	
	/**
	 * 服务器id
	 */
	@NotNull(message = "serverId 必填")
	protected int serverId;
	/**
	 * 玩家id
	 */
	@NotNull(message = "roleId 必填")
	protected String roleId;
	
	/**
	 * 实际通讯数据
	 */
	protected Object data;
	
	
	/**
	 * 转JSON
	 * @return
	 */
	public String toJson() {
		return JSON.toJSON(this).toString();
	};
	
	
	public static void main(String[] args) {
		
		String v = new StcProto().setData( new Date() ).setRoleId("user1").setServerId(111).toJson();
		System.out.println( v );
	}
	
    
}
