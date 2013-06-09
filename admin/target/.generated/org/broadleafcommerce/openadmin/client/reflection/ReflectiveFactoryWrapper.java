package org.broadleafcommerce.openadmin.client.reflection;

public class ReflectiveFactoryWrapper implements org.broadleafcommerce.openadmin.client.reflection.Factory {
  public java.lang.Object newInstance(String className) {
     if("com.smartgwt.client.widgets.form.validator.ContainsValidator".equals(className)) { return new com.smartgwt.client.widgets.form.validator.ContainsValidator();}
     else if("com.smartgwt.client.widgets.form.validator.DateRangeValidator".equals(className)) { return new com.smartgwt.client.widgets.form.validator.DateRangeValidator();}
     else if("com.smartgwt.client.widgets.form.validator.DoesntContainValidator".equals(className)) { return new com.smartgwt.client.widgets.form.validator.DoesntContainValidator();}
     else if("com.smartgwt.client.widgets.form.validator.FloatPrecisionValidator".equals(className)) { return new com.smartgwt.client.widgets.form.validator.FloatPrecisionValidator();}
     else if("com.smartgwt.client.widgets.form.validator.FloatRangeValidator".equals(className)) { return new com.smartgwt.client.widgets.form.validator.FloatRangeValidator();}
     else if("com.smartgwt.client.widgets.form.validator.IntegerRangeValidator".equals(className)) { return new com.smartgwt.client.widgets.form.validator.IntegerRangeValidator();}
     else if("com.smartgwt.client.widgets.form.validator.IsBooleanValidator".equals(className)) { return new com.smartgwt.client.widgets.form.validator.IsBooleanValidator();}
     else if("com.smartgwt.client.widgets.form.validator.IsFloatValidator".equals(className)) { return new com.smartgwt.client.widgets.form.validator.IsFloatValidator();}
     else if("com.smartgwt.client.widgets.form.validator.IsIntegerValidator".equals(className)) { return new com.smartgwt.client.widgets.form.validator.IsIntegerValidator();}
     else if("com.smartgwt.client.widgets.form.validator.IsOneOfValidator".equals(className)) { return new com.smartgwt.client.widgets.form.validator.IsOneOfValidator();}
     else if("com.smartgwt.client.widgets.form.validator.IsStringValidator".equals(className)) { return new com.smartgwt.client.widgets.form.validator.IsStringValidator();}
     else if("com.smartgwt.client.widgets.form.validator.LengthRangeValidator".equals(className)) { return new com.smartgwt.client.widgets.form.validator.LengthRangeValidator();}
     else if("com.smartgwt.client.widgets.form.validator.MaskValidator".equals(className)) { return new com.smartgwt.client.widgets.form.validator.MaskValidator();}
     else if("com.smartgwt.client.widgets.form.validator.MatchesFieldValidator".equals(className)) { return new com.smartgwt.client.widgets.form.validator.MatchesFieldValidator();}
     else if("com.smartgwt.client.widgets.form.validator.RegExpValidator".equals(className)) { return new com.smartgwt.client.widgets.form.validator.RegExpValidator();}
     else if("com.smartgwt.client.widgets.form.validator.RequiredIfValidator".equals(className)) { return new com.smartgwt.client.widgets.form.validator.RequiredIfValidator();}
     else if("com.smartgwt.client.widgets.form.validator.StringCountValidator".equals(className)) { return new com.smartgwt.client.widgets.form.validator.StringCountValidator();}
     else if("com.smartgwt.client.widgets.form.validator.Validator".equals(className)) { return new com.smartgwt.client.widgets.form.validator.Validator();}
  return null;
  }
  public void createAsync(final String className, final AsyncClient asyncClient) {
     if("org.broadleafcommerce.admin.client.presenter.catalog.category.CategoryPresenter".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.admin.client.presenter.catalog.category.CategoryPresenter());}});}
     else if("org.broadleafcommerce.admin.client.presenter.catalog.product.OneToOneProductSkuPresenter".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.admin.client.presenter.catalog.product.OneToOneProductSkuPresenter());}});}
     else if("org.broadleafcommerce.admin.client.presenter.catalog.product.ProductOptionPresenter".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.admin.client.presenter.catalog.product.ProductOptionPresenter());}});}
     else if("org.broadleafcommerce.admin.client.presenter.customer.CustomerPresenter".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.admin.client.presenter.customer.CustomerPresenter());}});}
     else if("org.broadleafcommerce.admin.client.presenter.order.OrderPresenter".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.admin.client.presenter.order.OrderPresenter());}});}
     else if("org.broadleafcommerce.admin.client.presenter.promotion.OfferPresenter".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.admin.client.presenter.promotion.OfferPresenter());}});}
     else if("org.broadleafcommerce.admin.client.view.catalog.category.CategoryView".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.admin.client.view.catalog.category.CategoryView());}});}
     else if("org.broadleafcommerce.admin.client.view.catalog.product.OneToOneProductSkuView".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.admin.client.view.catalog.product.OneToOneProductSkuView());}});}
     else if("org.broadleafcommerce.admin.client.view.catalog.product.ProductOptionView".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.admin.client.view.catalog.product.ProductOptionView());}});}
     else if("org.broadleafcommerce.admin.client.view.customer.CustomerView".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.admin.client.view.customer.CustomerView());}});}
     else if("org.broadleafcommerce.admin.client.view.order.OrderView".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.admin.client.view.order.OrderView());}});}
     else if("org.broadleafcommerce.admin.client.view.promotion.OfferView".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.admin.client.view.promotion.OfferView());}});}
     else if("org.broadleafcommerce.cms.admin.client.presenter.file.StaticAssetsPresenter".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.cms.admin.client.presenter.file.StaticAssetsPresenter());}});}
     else if("org.broadleafcommerce.cms.admin.client.presenter.pages.PagesPresenter".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.cms.admin.client.presenter.pages.PagesPresenter());}});}
     else if("org.broadleafcommerce.cms.admin.client.presenter.sandbox.MySandBoxPresenter".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.cms.admin.client.presenter.sandbox.MySandBoxPresenter());}});}
     else if("org.broadleafcommerce.cms.admin.client.presenter.sandbox.SandBoxPresenter".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.cms.admin.client.presenter.sandbox.SandBoxPresenter());}});}
     else if("org.broadleafcommerce.cms.admin.client.presenter.structure.StructuredContentPresenter".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.cms.admin.client.presenter.structure.StructuredContentPresenter());}});}
     else if("org.broadleafcommerce.cms.admin.client.presenter.urlRedirect.UrlRedirectPresenter".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.cms.admin.client.presenter.urlRedirect.UrlRedirectPresenter());}});}
     else if("org.broadleafcommerce.cms.admin.client.view.file.StaticAssetsView".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.cms.admin.client.view.file.StaticAssetsView());}});}
     else if("org.broadleafcommerce.cms.admin.client.view.pages.PagesView".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.cms.admin.client.view.pages.PagesView());}});}
     else if("org.broadleafcommerce.cms.admin.client.view.sandbox.MySandBoxView".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.cms.admin.client.view.sandbox.MySandBoxView());}});}
     else if("org.broadleafcommerce.cms.admin.client.view.sandbox.SandBoxView".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.cms.admin.client.view.sandbox.SandBoxView());}});}
     else if("org.broadleafcommerce.cms.admin.client.view.structure.StructuredContentView".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.cms.admin.client.view.structure.StructuredContentView());}});}
     else if("org.broadleafcommerce.cms.admin.client.view.urlRedirect.UrlRedirectView".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.cms.admin.client.view.urlRedirect.UrlRedirectView());}});}
     else if("org.broadleafcommerce.openadmin.client.presenter.entity.PassthroughEntityPresenter".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.openadmin.client.presenter.entity.PassthroughEntityPresenter());}});}
     else if("org.broadleafcommerce.openadmin.client.presenter.user.PermissionManagementPresenter".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.openadmin.client.presenter.user.PermissionManagementPresenter());}});}
     else if("org.broadleafcommerce.openadmin.client.presenter.user.RoleManagementPresenter".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.openadmin.client.presenter.user.RoleManagementPresenter());}});}
     else if("org.broadleafcommerce.openadmin.client.presenter.user.UserManagementPresenter".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.openadmin.client.presenter.user.UserManagementPresenter());}});}
     else if("org.broadleafcommerce.openadmin.client.view.user.PermissionManagementView".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.openadmin.client.view.user.PermissionManagementView());}});}
     else if("org.broadleafcommerce.openadmin.client.view.user.RoleManagementView".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.openadmin.client.view.user.RoleManagementView());}});}
     else if("org.broadleafcommerce.openadmin.client.view.user.UserManagementView".equals(className)) {com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {public void onFailure(Throwable err) {asyncClient.onUnavailable();}public void onSuccess() {asyncClient.onSuccess(new org.broadleafcommerce.openadmin.client.view.user.UserManagementView());}});}
  }
}
