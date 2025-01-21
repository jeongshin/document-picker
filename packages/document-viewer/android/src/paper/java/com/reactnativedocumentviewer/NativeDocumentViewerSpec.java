/**
 * This code was generated by [react-native-codegen](https://www.npmjs.com/package/react-native-codegen).
 *
 * Then it was commited. It is here to support the old architecture.
 * If you use the new architecture, this file won't be included and instead will be generated by the codegen.
 *
 * @generated by codegen project: GenerateModuleJavaSpec.js
 *
 * @nolint
 */

package com.reactnativedocumentviewer;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class NativeDocumentViewerSpec extends ReactContextBaseJavaModule implements TurboModule {
  public static final String NAME = "RNDocumentViewer";

  public NativeDocumentViewerSpec(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public @Nonnull String getName() {
    return NAME;
  }

  @ReactMethod
  @DoNotStrip
  public abstract void viewDocument(String bookmarkOrUri, String permissions, @Nullable String mimeType, @Nullable String title, @Nullable String presentationStyle, Promise promise);
}
