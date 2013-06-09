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

public class DynamicEntityService_Proxy extends RemoteServiceProxy implements org.broadleafcommerce.openadmin.client.service.DynamicEntityServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "org.broadleafcommerce.openadmin.client.service.DynamicEntityService";
  private static final String SERIALIZATION_POLICY ="F9C7463449883B85D9C5989E35C363E6";
  private static final org.broadleafcommerce.openadmin.client.service.DynamicEntityService_TypeSerializer SERIALIZER = new org.broadleafcommerce.openadmin.client.service.DynamicEntityService_TypeSerializer();
  
  public DynamicEntityService_Proxy() {
    super(GWT.getModuleBaseURL(),
      null, 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void add(org.broadleafcommerce.openadmin.client.dto.PersistencePackage persistencePackage, com.google.gwt.user.client.rpc.AsyncCallback cb) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("DynamicEntityService_Proxy", "add");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("org.broadleafcommerce.openadmin.client.dto.PersistencePackage/1253682042");
      streamWriter.writeObject(persistencePackage);
      helper.finish(cb, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
  
  public void batchInspect(org.broadleafcommerce.openadmin.client.dto.BatchPersistencePackage persistencePackage, com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("DynamicEntityService_Proxy", "batchInspect");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("org.broadleafcommerce.openadmin.client.dto.BatchPersistencePackage/1993539294");
      streamWriter.writeObject(persistencePackage);
      helper.finish(async, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void fetch(org.broadleafcommerce.openadmin.client.dto.PersistencePackage persistencePackage, org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject cto, com.google.gwt.user.client.rpc.AsyncCallback cb) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("DynamicEntityService_Proxy", "fetch");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("org.broadleafcommerce.openadmin.client.dto.PersistencePackage/1253682042");
      streamWriter.writeString("org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject/4064728921");
      streamWriter.writeObject(persistencePackage);
      streamWriter.writeObject(cto);
      helper.finish(cb, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
  
  public void inspect(org.broadleafcommerce.openadmin.client.dto.PersistencePackage persistencePackage, com.google.gwt.user.client.rpc.AsyncCallback cb) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("DynamicEntityService_Proxy", "inspect");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("org.broadleafcommerce.openadmin.client.dto.PersistencePackage/1253682042");
      streamWriter.writeObject(persistencePackage);
      helper.finish(cb, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
  
  public void remove(org.broadleafcommerce.openadmin.client.dto.PersistencePackage persistencePackage, com.google.gwt.user.client.rpc.AsyncCallback cb) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("DynamicEntityService_Proxy", "remove");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("org.broadleafcommerce.openadmin.client.dto.PersistencePackage/1253682042");
      streamWriter.writeObject(persistencePackage);
      helper.finish(cb, ResponseReader.VOID);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
  
  public void update(org.broadleafcommerce.openadmin.client.dto.PersistencePackage persistencePackage, com.google.gwt.user.client.rpc.AsyncCallback cb) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("DynamicEntityService_Proxy", "update");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("org.broadleafcommerce.openadmin.client.dto.PersistencePackage/1253682042");
      streamWriter.writeObject(persistencePackage);
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
