package com.xyz.wechatservice.support.handler;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.xyz.wechatservice.support.config.WxConfig;

import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;

/**
 * 门店审核事件处理
 * 
 * @author 王彬 (Binary Wang)
 */
@Component
public class StoreCheckNotifyHandler extends AbstractHandler {
	private WxConfig wxConfig;

	@Override
	public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage, Map<String, Object> context, WxMpService wxMpService,
			WxSessionManager sessionManager) {
		// TODO 处理门店审核事件
		return null;
	}

	@Override
	protected WxConfig getWxConfig() {
		return wxConfig;
	}

	@Override
	public StoreCheckNotifyHandler setWxConfig(WxConfig wxConfig) {
		this.wxConfig = wxConfig;
		return this;

	}

}
