package org.broadleafcommerce.openadmin.client.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.RpcToken;
import com.google.gwt.user.client.rpc.RpcTokenException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class AppConfigurationService_Proxy extends RemoteServiceProxy implements org.broadleafcommerce.openadmin.client.service.AppConfigurationServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "org.broadleafcommerce.openadmin.client.service.AppConfigurationService";
  private static final String SERIALIZATION_POLICY ="EBA964B5F6B0B6110AFAA646AE291DDC";
  private static final org.broadleafcommerce.openadmin.client.service.AppConfigurationService_TypeSerializer SERIALIZER = new org.broadleafcommerce.openadmin.client.service.AppConfigurationService_TypeSerializer();
  
  public AppConfigurationService_Proxy() {
    super(GWT.getModuleBaseURL(),
      null, 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void getBooleanPropertyValue(java.lang.String propertyName, com.google.gwt.user.client.rpc.AsyncCallback cb) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("AppConfigurationService_Proxy", "getBooleanPropertyValue");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(propertyName);
      helper.finish(cb, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
  @Override
  public SerializationStreamWriter createStreamWriter() {
    ClientSerializationStreamWriter toReturn =
      (ClientSerializationStreamWriter) super.createStreamWriter();
    if (getRpcToken() != null) {
      toReturn.addFlags(ClientSerializationStreamWriter.FLAG_RPC_TOKEN_INCLUDED);
    }
    return toReturn;
  }
  @Override
  protected void checkRpcTokenType(RpcToken token) {
    if (!(token instanceof com.google.gwt.user.client.rpc.XsrfToken)) {
      throw new RpcTokenException("Invalid RpcToken type: expected 'com.google.gwt.user.client.rpc.XsrfToken' but got '" + token.getClass() + "'");
    }
  }
}
