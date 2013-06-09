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

public class AdminSecurityService_Proxy extends RemoteServiceProxy implements org.broadleafcommerce.openadmin.client.service.AdminSecurityServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "org.broadleafcommerce.openadmin.client.service.AdminSecurityService";
  private static final String SERIALIZATION_POLICY ="151ED3E556770C6321522749524BBCBE";
  private static final org.broadleafcommerce.openadmin.client.service.AdminSecurityService_TypeSerializer SERIALIZER = new org.broadleafcommerce.openadmin.client.service.AdminSecurityService_TypeSerializer();
  
  public AdminSecurityService_Proxy() {
    super(GWT.getModuleBaseURL(),
      null, 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void getAdminUser(com.google.gwt.user.client.rpc.AsyncCallback cb) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("AdminSecurityService_Proxy", "getAdminUser");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 0);
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
