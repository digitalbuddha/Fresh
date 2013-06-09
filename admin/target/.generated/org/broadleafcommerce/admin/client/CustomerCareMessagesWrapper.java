package org.broadleafcommerce.admin.client;

public class CustomerCareMessagesWrapper implements org.broadleafcommerce.openadmin.client.i18nConstants {
  private java.util.List<String> supportedLocales = new java.util.ArrayList<String>();
  public CustomerCareMessagesWrapper() {
  supportedLocales.add("default");
}
  
  public void retrievei18nProperties(final org.broadleafcommerce.openadmin.client.i18nPropertiesClient i18nClient) {
  com.google.gwt.i18n.client.LocaleInfo localeInfo = com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale();
  String localeName = localeInfo.getLocaleName();
  if (!supportedLocales.contains(localeName) && localeName.contains("_")){
  localeName = localeName.substring(0, localeName.indexOf("_"));
  if (!supportedLocales.contains(localeName)){
  localeName = null;
  }
  } else {
  localeName = null;
  }
  if (localeName == null){
  i18nClient.onSuccess(new org.broadleafcommerce.admin.client.CustomerCareMessages_default().getAlli18nProperties());
return;
  }
  if (localeName.equals("default")){
  i18nClient.onSuccess(new org.broadleafcommerce.admin.client.CustomerCareMessages_default().getAlli18nProperties());
return;
  }
  i18nClient.onUnavailable(new RuntimeException("Unable to find a localized file for org.broadleafcommerce.admin.client.CustomerCareMessagesWrapper"));
  }
}
