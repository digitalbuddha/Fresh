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

public class AdminExporterService_Proxy extends RemoteServiceProxy implements org.broadleafcommerce.openadmin.client.service.AdminExporterServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "org.broadleafcommerce.openadmin.client.service.AdminExporterService";
  private static final String SERIALIZATION_POLICY ="9E56C145212F836D6D9C2C95E193866A";
  private static final org.broadleafcommerce.openadmin.client.service.AdminExporterService_TypeSerializer SERIALIZER = new org.broadleafcommerce.openadmin.client.service.AdminExporterService_TypeSerializer();
  
  public AdminExporterService_Proxy() {
    super(GWT.getModuleBaseURL(),
      null, 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void getExporters(java.lang.String type, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("AdminExporterService_Proxy", "getExporters");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(type);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
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
