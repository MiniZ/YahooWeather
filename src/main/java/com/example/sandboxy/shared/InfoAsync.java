package com.example.sandboxy.shared;

import com.example.sandboxy.server.Weather;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface InfoAsync {

	void start(String zip, AsyncCallback<Weather> async);
}
