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

public class UtilityService_Proxy extends RemoteServiceProxy implements org.broadleafcommerce.openadmin.client.service.UtilityServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "org.broadleafcommerce.openadmin.client.service.UtilityService";
  private static final String SERIALIZATION_POLICY ="CF4EF8B8B6898A69FF072CF9FCB5E644";
  private static final org.broadleafcommerce.openadmin.client.service.UtilityService_TypeSerializer SERIALIZER = new org.broadleafcommerce.openadmin.client.service.UtilityService_TypeSerializer();
  
  public UtilityService_Proxy() {
    super(GWT.getModuleBaseURL(),
      null, 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void getAllItems(com.google.gwt.user.client.rpc.AsyncCallback cb) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("UtilityService_Proxy", "getAllItems");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 0);
      helper.finish(cb, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
  
  public void getAssetServerUrlPrefix(com.google.gwt.user.client.rpc.AsyncCallback cb) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("UtilityService_Proxy", "getAssetServerUrlPrefix");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 0);
      helper.finish(cb, ResponseReader.STRING);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
  
  public void getStoreFrontWebAppPrefix(com.google.gwt.user.client.rpc.AsyncCallback cb) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("UtilityService_Proxy", "getStoreFrontWebAppPrefix");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 0);
      helper.finish(cb, ResponseReader.STRING);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
  
  public void getWebAppContext(com.google.gwt.user.client.rpc.AsyncCallback cb) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("UtilityService_Proxy", "getWebAppContext");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 0);
      helper.finish(cb, ResponseReader.STRING);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
  
  public void getWorkflowEnabled(java.lang.String[] qualifiers, com.google.gwt.user.client.rpc.AsyncCallback cb) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("UtilityService_Proxy", "getWorkflowEnabled");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("[Ljava.lang.String;/2600011424");
      streamWriter.writeObject(qualifiers);
      helper.finish(cb, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
  
  public void initializeEJB3Configuration(com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("UtilityService_Proxy", "initializeEJB3Configuration");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 0);
      helper.finish(async, ResponseReader.VOID);
    } catch (SerializationException ex) {
      async.onFailure(ex);
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
