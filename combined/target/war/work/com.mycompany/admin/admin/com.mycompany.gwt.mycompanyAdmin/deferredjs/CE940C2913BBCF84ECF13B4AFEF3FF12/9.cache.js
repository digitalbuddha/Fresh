var $intern_1431 = 'productOptionDetailsTab', $intern_1432 = 'productOptionValueTab';
function org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionView_ProductOptionView__V(){
  com_smartgwt_client_widgets_BaseWidget_$clinit__V();
  com_smartgwt_client_widgets_layout_HLayout_HLayout__V.call(this);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(this)?com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V(this, $intern_301, $intern_1141):(this.com_smartgwt_client_widgets_BaseWidget_config[$intern_301] = $intern_1141 , undefined);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(this)?com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V(this, $intern_302, $intern_1141):(this.com_smartgwt_client_widgets_BaseWidget_config[$intern_302] = $intern_1141 , undefined);
}

function org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionView(){
}

_ = org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionView_ProductOptionView__V.prototype = org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionView.prototype = new com_smartgwt_client_widgets_layout_HLayout;
_.asCanvas__Lcom_smartgwt_client_widgets_Canvas_2 = function org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionView_asCanvas__Lcom_smartgwt_client_widgets_Canvas_2(){
  return this;
}
;
_.build__Lcom_smartgwt_client_data_DataSource_2_3Lcom_smartgwt_client_data_DataSource_2V = function org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionView_build__Lcom_smartgwt_client_data_DataSource_2_3Lcom_smartgwt_client_data_DataSource_2V(entityDataSource, additionalDataSources){
  var detailsTab, leftVerticalLayout, productOptionValueTab, topTabSet;
  leftVerticalLayout = new com_smartgwt_client_widgets_layout_VLayout_VLayout__V;
  com_smartgwt_client_widgets_BaseWidget_$setID__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2V(leftVerticalLayout, 'productOptionLeftVerticalLayout');
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(leftVerticalLayout)?com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V(leftVerticalLayout, $intern_301, $intern_1141):(leftVerticalLayout.com_smartgwt_client_widgets_BaseWidget_config[$intern_301] = $intern_1141 , undefined);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(leftVerticalLayout)?com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V(leftVerticalLayout, $intern_302, $intern_1404):(leftVerticalLayout.com_smartgwt_client_widgets_BaseWidget_config[$intern_302] = $intern_1404 , undefined);
  com_smartgwt_client_widgets_Canvas_$setShowResizeBar__Lcom_smartgwt_client_widgets_Canvas_2Ljava_lang_Boolean_2V(leftVerticalLayout, (java_lang_Boolean_$clinit__V() , java_lang_Boolean_$clinit__V() , java_lang_Boolean_TRUE));
  this.org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionView_listDisplay = new org_broadleafcommerce_openadmin_client_view_dynamic_DynamicEntityListView_DynamicEntityListView__Ljava_lang_String_2Lcom_smartgwt_client_data_DataSource_2V((org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2((org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V() , org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V() , org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER), $intern_624) , entityDataSource));
  leftVerticalLayout.addMember__Lcom_smartgwt_client_widgets_Canvas_2V(this.org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionView_listDisplay);
  topTabSet = new org_broadleafcommerce_openadmin_client_view_TabSet_TabSet__V;
  com_smartgwt_client_widgets_BaseWidget_$setID__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2V(topTabSet, 'productOptionTopTabSet');
  com_smartgwt_client_widgets_BaseWidget_$setAttribute__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2ZV(topTabSet, $intern_1406, (com_smartgwt_client_types_Side_$clinit__V() , com_smartgwt_client_types_Side_TOP).com_smartgwt_client_types_Side_value, false);
  com_smartgwt_client_widgets_BaseWidget_$setAttribute__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2ZV(topTabSet, $intern_1407, (com_smartgwt_client_types_Overflow_$clinit__V() , com_smartgwt_client_types_Overflow_HIDDEN).com_smartgwt_client_types_Overflow_value, true);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(topTabSet)?com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V(topTabSet, $intern_302, $intern_1404):(topTabSet.com_smartgwt_client_widgets_BaseWidget_config[$intern_302] = $intern_1404 , undefined);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(topTabSet)?com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V(topTabSet, $intern_301, $intern_1141):(topTabSet.com_smartgwt_client_widgets_BaseWidget_config[$intern_301] = $intern_1141 , undefined);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(topTabSet)?undefined:(topTabSet.com_smartgwt_client_widgets_BaseWidget_config[$intern_1408] = $intern_252 , undefined);
  detailsTab = new com_smartgwt_client_widgets_tab_Tab_Tab__Ljava_lang_String_2V(org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2(org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER, $intern_630));
  com_smartgwt_client_util_IDManager_isValidID__Ljava_lang_String_2V($intern_1431);
  detailsTab.com_smartgwt_client_core_JsObject_jsObj[$intern_337] = $intern_1431;
  this.org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionView_dynamicFormDisplay = new org_broadleafcommerce_openadmin_client_view_dynamic_form_DynamicFormView_DynamicFormView__Ljava_lang_String_2Lcom_smartgwt_client_data_DataSource_2V((org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2(org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER, $intern_653) , entityDataSource));
  com_smartgwt_client_widgets_tab_Tab_$setPane__Lcom_smartgwt_client_widgets_tab_Tab_2Lcom_smartgwt_client_widgets_Canvas_2V(detailsTab, this.org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionView_dynamicFormDisplay);
  productOptionValueTab = new com_smartgwt_client_widgets_tab_Tab_Tab__Ljava_lang_String_2V(org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2(org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER, $intern_653));
  com_smartgwt_client_util_IDManager_isValidID__Ljava_lang_String_2V($intern_1432);
  productOptionValueTab.com_smartgwt_client_core_JsObject_jsObj[$intern_337] = $intern_1432;
  this.org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionView_productOptionValueDisplay = new org_broadleafcommerce_openadmin_client_view_dynamic_SubItemView_SubItemView__Ljava_lang_String_2Ljava_lang_Boolean_2Ljava_lang_Boolean_2V(org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2(org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER, $intern_646), java_lang_Boolean_TRUE, java_lang_Boolean_TRUE);
  com_smartgwt_client_widgets_BaseWidget_$setID__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2V(this.org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionView_productOptionValueDisplay, 'productOptionValueTabSubView');
  com_smartgwt_client_widgets_tab_Tab_$setPane__Lcom_smartgwt_client_widgets_tab_Tab_2Lcom_smartgwt_client_widgets_Canvas_2V(productOptionValueTab, this.org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionView_productOptionValueDisplay);
  com_smartgwt_client_widgets_tab_TabSet_$addTab__Lcom_smartgwt_client_widgets_tab_TabSet_2Lcom_smartgwt_client_widgets_tab_Tab_2V(topTabSet, detailsTab);
  com_smartgwt_client_widgets_tab_TabSet_$addTab__Lcom_smartgwt_client_widgets_tab_TabSet_2Lcom_smartgwt_client_widgets_tab_Tab_2V(topTabSet, productOptionValueTab);
  com_smartgwt_client_widgets_BaseWidget_$setAttribute__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Lcom_google_gwt_core_client_JavaScriptObject_2ZV(leftVerticalLayout, $intern_1425, com_smartgwt_client_widgets_BaseWidget_$getOrCreateJsObj__Lcom_smartgwt_client_widgets_BaseWidget_2Lcom_google_gwt_core_client_JavaScriptObject_2(this), false);
  com_smartgwt_client_widgets_layout_Layout_$addMember__Lcom_smartgwt_client_widgets_layout_Layout_2Lcom_smartgwt_client_widgets_Canvas_2V(this, leftVerticalLayout);
  com_smartgwt_client_widgets_layout_Layout_$addMember__Lcom_smartgwt_client_widgets_layout_Layout_2Lcom_smartgwt_client_widgets_Canvas_2V(this, topTabSet);
}
;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionView_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1admin_1client_1view_1catalog_1product_1ProductOptionView_12_1classLit;
}
;
_.getDynamicFormDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_form_DynamicFormDisplay_2 = function org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionView_getDynamicFormDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_form_DynamicFormDisplay_2(){
  return this.org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionView_dynamicFormDisplay;
}
;
_.getListDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_DynamicEntityListDisplay_2 = function org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionView_getListDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_DynamicEntityListDisplay_2(){
  return this.org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionView_listDisplay;
}
;
_.java_lang_Object_castableTypeMap$ = makeCastMap([Q$com_google_gwt_event_logical_shared_HasAttachHandlers, Q$com_google_gwt_event_shared_HasHandlers, Q$com_google_gwt_user_client_EventListener, Q$com_google_gwt_user_client_ui_HasVisibility, Q$com_google_gwt_user_client_ui_IsWidget, Q$com_google_gwt_user_client_ui_UIObject, Q$com_google_gwt_user_client_ui_Widget, Q$com_smartgwt_client_widgets_BaseWidget, Q$com_smartgwt_client_widgets_Canvas, Q$com_smartgwt_client_widgets_events_HasClickHandlers, Q$com_smartgwt_client_widgets_events_HasDoubleClickHandlers, Q$com_smartgwt_client_widgets_events_HasDragMoveHandlers, Q$com_smartgwt_client_widgets_events_HasDragRepositionMoveHandlers, Q$com_smartgwt_client_widgets_events_HasDragRepositionStartHandlers, Q$com_smartgwt_client_widgets_events_HasDragRepositionStopHandlers, Q$com_smartgwt_client_widgets_events_HasDragResizeMoveHandlers, Q$com_smartgwt_client_widgets_events_HasDragResizeStartHandlers, Q$com_smartgwt_client_widgets_events_HasDragResizeStopHandlers, Q$com_smartgwt_client_widgets_events_HasDragStartHandlers, Q$com_smartgwt_client_widgets_events_HasDragStopHandlers, Q$com_smartgwt_client_widgets_events_HasDropHandlers, Q$com_smartgwt_client_widgets_events_HasDropMoveHandlers, Q$com_smartgwt_client_widgets_events_HasDropOutHandlers, Q$com_smartgwt_client_widgets_events_HasDropOverHandlers, Q$com_smartgwt_client_widgets_events_HasFocusChangedHandlers, Q$com_smartgwt_client_widgets_events_HasHoverHandlers, Q$com_smartgwt_client_widgets_events_HasHoverHiddenHandlers, Q$com_smartgwt_client_widgets_events_HasKeyDownHandlers, Q$com_smartgwt_client_widgets_events_HasKeyPressHandlers, Q$com_smartgwt_client_widgets_events_HasMouseDownHandlers, Q$com_smartgwt_client_widgets_events_HasMouseMoveHandlers, Q$com_smartgwt_client_widgets_events_HasMouseOutHandlers, Q$com_smartgwt_client_widgets_events_HasMouseOverHandlers, Q$com_smartgwt_client_widgets_events_HasMouseStillDownHandlers, Q$com_smartgwt_client_widgets_events_HasMouseUpHandlers, Q$com_smartgwt_client_widgets_events_HasMouseWheelHandlers, Q$com_smartgwt_client_widgets_events_HasMovedHandlers, Q$com_smartgwt_client_widgets_events_HasParentMovedHandlers, Q$com_smartgwt_client_widgets_events_HasResizedHandlers, Q$com_smartgwt_client_widgets_events_HasRightMouseDownHandlers, Q$com_smartgwt_client_widgets_events_HasScrolledHandlers, Q$com_smartgwt_client_widgets_events_HasShowContextMenuHandlers, Q$com_smartgwt_client_widgets_events_HasVisibilityChangedHandlers, Q$com_smartgwt_client_widgets_layout_HLayout, Q$com_smartgwt_client_widgets_layout_Layout, Q$org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionDisplay, Q$org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionView, Q$org_broadleafcommerce_openadmin_client_view_Display, Q$org_broadleafcommerce_openadmin_client_view_dynamic_DynamicEditDisplay]);
_.org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionView_dynamicFormDisplay = null;
_.org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionView_listDisplay = null;
_.org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionView_productOptionValueDisplay = null;
_ = org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$9.prototype;
_.onSuccess__V = function org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$9_onSuccess__V(){
  this.org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$9_val$asyncClient.onSuccess__Ljava_lang_Object_2V(new org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionView_ProductOptionView__V);
}
;
var com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1admin_1client_1view_1catalog_1product_1ProductOptionView_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_1430, 'ProductOptionView', com_google_gwt_lang_ClassLiteralHolder_Lcom_1smartgwt_1client_1widgets_1layout_1HLayout_12_1classLit);
$entry(com_google_gwt_core_client_impl_AsyncFragmentLoader_onLoad__IV)(9);
