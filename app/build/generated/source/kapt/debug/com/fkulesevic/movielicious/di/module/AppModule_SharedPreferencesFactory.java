// Generated by Dagger (https://dagger.dev).
package com.fkulesevic.movielicious.di.module;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_SharedPreferencesFactory implements Factory<SharedPreferences> {
  private final AppModule module;

  private final Provider<Context> contextProvider;

  public AppModule_SharedPreferencesFactory(AppModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public SharedPreferences get() {
    return sharedPreferences(module, contextProvider.get());
  }

  public static AppModule_SharedPreferencesFactory create(AppModule module,
      Provider<Context> contextProvider) {
    return new AppModule_SharedPreferencesFactory(module, contextProvider);
  }

  public static SharedPreferences sharedPreferences(AppModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.sharedPreferences(context));
  }
}