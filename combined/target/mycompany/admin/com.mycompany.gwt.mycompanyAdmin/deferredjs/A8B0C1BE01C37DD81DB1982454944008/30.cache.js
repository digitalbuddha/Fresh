_ = org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$30.prototype;
_.onSuccess__V = function org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$30_onSuccess__V(){
  this.org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$30_val$asyncClient.onSuccess__Ljava_lang_Object_2V(new org_broadleafcommerce_openadmin_client_view_user_RoleManagementView_RoleManagementView__V);
}
;
function org_broadleafcommerce_openadmin_client_view_user_RoleManagementView_RoleManagementView__V(){
  com_smartgwt_client_widgets_BaseWidget_$clinit__V();
  com_smartgwt_client_widgets_layout_HLayout_HLayout__V.call(this);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(this)?com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V(this, $intern_311, $intern_1154):(this.com_smartgwt_client_widgets_BaseWidget_config[$intern_311] = $intern_1154 , undefined);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(this)?com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V(this, $intern_312, $intern_1154):(this.com_smartgwt_client_widgets_BaseWidget_config[$intern_312] = $intern_1154 , undefined);
}

function org_broadleafcommerce_openadmin_client_view_user_RoleManagementView(){
}

_ = org_broadleafcommerce_openadmin_client_view_user_RoleManagementView_RoleManagementView__V.prototype = org_broadleafcommerce_openadmin_client_view_user_RoleManagementView.prototype = new com_smartgwt_client_widgets_layout_HLayout;
_.asCanvas__Lcom_smartgwt_client_widgets_Canvas_2 = function org_broadleafcommerce_openadmin_client_view_user_RoleManagementView_asCanvas__Lcom_smartgwt_client_widgets_Canvas_2(){
  return this;
}
;
_.build__Lcom_smartgwt_client_data_DataSource_2_3Lcom_smartgwt_client_data_DataSource_2V = function org_broadleafcommerce_openadmin_client_view_user_RoleManagementView_build__Lcom_smartgwt_client_data_DataSource_2_3Lcom_smartgwt_client_data_DataSource_2V(entityDataSource, additionalDataSources){
  var leftVerticalLayout;
  leftVerticalLayout = new com_smartgwt_client_widgets_layout_VLayout_VLayout__V;
  com_smartgwt_client_widgets_BaseWidget_$setID__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2V(leftVerticalLayout, 'roleLeftVerticalLayout');
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(leftVerticalLayout)?com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V(leftVerticalLayout, $intern_311, $intern_1154):(leftVerticalLayout.com_smartgwt_client_widgets_BaseWidget_config[$intern_311] = $intern_1154 , undefined);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(leftVerticalLayout)?com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V(leftVerticalLayout, $intern_312, $intern_1417):(leftVerticalLayout.com_smartgwt_client_widgets_BaseWidget_config[$intern_312] = $intern_1417 , undefined);
  com_smartgwt_client_widgets_Canvas_$setShowResizeBar__Lcom_smartgwt_client_widgets_Canvas_2Ljava_lang_Boolean_2V(leftVerticalLayout, (java_lang_Boolean_$clinit__V() , java_lang_Boolean_$clinit__V() , java_lang_Boolean_TRUE));
  this.org_broadleafcommerce_openadmin_client_view_user_RoleManagementView_listDisplay = new org_broadleafcommerce_openadmin_client_view_dynamic_DynamicEntityListView_DynamicEntityListView__Ljava_lang_String_2Lcom_smartgwt_client_data_DataSource_2Ljava_lang_Boolean_2V((org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2((org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V() , org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V() , org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER), $intern_1007) , entityDataSource), java_lang_Boolean_FALSE);
  leftVerticalLayout.addMember__Lcom_smartgwt_client_widgets_Canvas_2V(this.org_broadleafcommerce_openadmin_client_view_user_RoleManagementView_listDisplay);
  this.org_broadleafcommerce_openadmin_client_view_user_RoleManagementView_dynamicFormDisplay = new org_broadleafcommerce_openadmin_client_view_dynamic_form_DynamicFormView_DynamicFormView__Ljava_lang_String_2Lcom_smartgwt_client_data_DataSource_2V((org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2(org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER, $intern_994) , entityDataSource));
  this.org_broadleafcommerce_openadmin_client_view_user_RoleManagementView_permissionsDisplay = new org_broadleafcommerce_openadmin_client_view_dynamic_grid_GridStructureView_GridStructureView__Ljava_lang_String_2Ljava_lang_Boolean_2Ljava_lang_Boolean_2V(org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2(org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER, $intern_979), java_lang_Boolean_FALSE, java_lang_Boolean_FALSE);
  com_smartgwt_client_widgets_layout_Layout_$addMember__Lcom_smartgwt_client_widgets_layout_Layout_2Lcom_smartgwt_client_widgets_Canvas_2V(this.org_broadleafcommerce_openadmin_client_view_user_RoleManagementView_dynamicFormDisplay.org_broadleafcommerce_openadmin_client_view_dynamic_form_DynamicFormView_formOnlyView, this.org_broadleafcommerce_openadmin_client_view_user_RoleManagementView_permissionsDisplay);
  com_smartgwt_client_widgets_BaseWidget_$setAttribute__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Lcom_google_gwt_core_client_JavaScriptObject_2ZV(leftVerticalLayout, $intern_1438, com_smartgwt_client_widgets_BaseWidget_$getOrCreateJsObj__Lcom_smartgwt_client_widgets_BaseWidget_2Lcom_google_gwt_core_client_JavaScriptObject_2(this), false);
  com_smartgwt_client_widgets_layout_Layout_$addMember__Lcom_smartgwt_client_widgets_layout_Layout_2Lcom_smartgwt_client_widgets_Canvas_2V(this, leftVerticalLayout);
  com_smartgwt_client_widgets_layout_Layout_$addMember__Lcom_smartgwt_client_widgets_layout_Layout_2Lcom_smartgwt_client_widgets_Canvas_2V(this, this.org_broadleafcommerce_openadmin_client_view_user_RoleManagementView_dynamicFormDisplay);
}
;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_openadmin_client_view_user_RoleManagementView_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1view_1user_1RoleManagementView_12_1classLit;
}
;
_.getDynamicFormDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_form_DynamicFormDisplay_2 = function org_broadleafcommerce_openadmin_client_view_user_RoleManagementView_getDynamicFormDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_form_DynamicFormDisplay_2(){
  return this.org_broadleafcommerce_openadmin_client_view_user_RoleManagementView_dynamicFormDisplay;
}
;
_.getListDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_DynamicEntityListDisplay_2 = function org_broadleafcommerce_openadmin_client_view_user_RoleManagementView_getListDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_DynamicEntityListDisplay_2(){
  return this.org_broadleafcommerce_openadmin_client_view_user_RoleManagementView_listDisplay;
}
;
_.java_lang_Object_castableTypeMap$ = makeCastMap([Q$com_google_gwt_event_logical_shared_HasAttachHandlers, Q$com_google_gwt_event_shared_HasHandlers, Q$com_google_gwt_user_client_EventListener, Q$com_google_gwt_user_client_ui_HasVisibility, Q$com_google_gwt_user_client_ui_IsWidget, Q$com_google_gwt_user_client_ui_UIObject, Q$com_google_gwt_user_client_ui_Widget, Q$com_smartgwt_client_widgets_BaseWidget, Q$com_smartgwt_client_widgets_Canvas, Q$com_smartgwt_client_widgets_events_HasClickHandlers, Q$com_smartgwt_client_widgets_events_HasDoubleClickHandlers, Q$com_smartgwt_client_widgets_events_HasDragMoveHandlers, Q$com_smartgwt_client_widgets_events_HasDragRepositionMoveHandlers, Q$com_smartgwt_client_widgets_events_HasDragRepositionStartHandlers, Q$com_smartgwt_client_widgets_events_HasDragRepositionStopHandlers, Q$com_smartgwt_client_widgets_events_HasDragResizeMoveHandlers, Q$com_smartgwt_client_widgets_events_HasDragResizeStartHandlers, Q$com_smartgwt_client_widgets_events_HasDragResizeStopHandlers, Q$com_smartgwt_client_widgets_events_HasDragStartHandlers, Q$com_smartgwt_client_widgets_events_HasDragStopHandlers, Q$com_smartgwt_client_widgets_events_HasDropHandlers, Q$com_smartgwt_client_widgets_events_HasDropMoveHandlers, Q$com_smartgwt_client_widgets_events_HasDropOutHandlers, Q$com_smartgwt_client_widgets_events_HasDropOverHandlers, Q$com_smartgwt_client_widgets_events_HasFocusChangedHandlers, Q$com_smartgwt_client_widgets_events_HasHoverHandlers, Q$com_smartgwt_client_widgets_events_HasHoverHiddenHandlers, Q$com_smartgwt_client_widgets_events_HasKeyDownHandlers, Q$com_smartgwt_client_widgets_events_HasKeyPressHandlers, Q$com_smartgwt_client_widgets_events_HasMouseDownHandlers, Q$com_smartgwt_client_widgets_events_HasMouseMoveHandlers, Q$com_smartgwt_client_widgets_events_HasMouseOutHandlers, Q$com_smartgwt_client_widgets_events_HasMouseOverHandlers, Q$com_smartgwt_client_widgets_events_HasMouseStillDownHandlers, Q$com_smartgwt_client_widgets_events_HasMouseUpHandlers, Q$com_smartgwt_client_widgets_events_HasMouseWheelHandlers, Q$com_smartgwt_client_widgets_events_HasMovedHandlers, Q$com_smartgwt_client_widgets_events_HasParentMovedHandlers, Q$com_smartgwt_client_widgets_events_HasResizedHandlers, Q$com_smartgwt_client_widgets_events_HasRightMouseDownHandlers, Q$com_smartgwt_client_widgets_events_HasScrolledHandlers, Q$com_smartgwt_client_widgets_events_HasShowContextMenuHandlers, Q$com_smartgwt_client_widgets_events_HasVisibilityChangedHandlers, Q$com_smartgwt_client_widgets_layout_HLayout, Q$com_smartgwt_client_widgets_layout_Layout, Q$org_broadleafcommerce_openadmin_client_view_Display, Q$org_broadleafcommerce_openadmin_client_view_dynamic_DynamicEditDisplay, Q$org_broadleafcommerce_openadmin_client_view_user_RoleManagementDisplay, Q$org_broadleafcommerce_openadmin_client_view_user_RoleManagementView]);
_.org_broadleafcommerce_openadmin_client_view_user_RoleManagementView_dynamicFormDisplay = null;
_.org_broadleafcommerce_openadmin_client_view_user_RoleManagementView_listDisplay = null;
_.org_broadleafcommerce_openadmin_client_view_user_RoleManagementView_permissionsDisplay = null;
var com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1view_1user_1RoleManagementView_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_1550, 'RoleManagementView', com_google_gwt_lang_ClassLiteralHolder_Lcom_1smartgwt_1client_1widgets_1layout_1HLayout_12_1classLit);
$entry(com_google_gwt_core_client_impl_AsyncFragmentLoader_onLoad__IV)(30);
