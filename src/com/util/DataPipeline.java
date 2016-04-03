package com.util;

import java.util.UUID;

public interface DataPipeline {

	public void send(Object object, UUID id, Object location, Object source);

}
