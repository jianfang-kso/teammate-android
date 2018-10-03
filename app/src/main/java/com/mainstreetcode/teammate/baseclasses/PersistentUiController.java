package com.mainstreetcode.teammate.baseclasses;


import android.support.annotation.DrawableRes;
import android.support.annotation.MenuRes;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.design.widget.Snackbar;
import android.view.View;

import com.mainstreetcode.teammate.adapters.viewholders.ChoiceBar;
import com.mainstreetcode.teammate.util.ModelUtils;

public interface PersistentUiController {
    void toggleToolbar(boolean show);

    void toggleAltToolbar(boolean show);

    void toggleBottombar(boolean show);

    void toggleFab(boolean show);

    void toggleProgress(boolean show);

    void toggleSystemUI(boolean show);

    void setFabIcon(@DrawableRes int icon, @StringRes int textRes);

    void setFabExtended(boolean expanded);

    void showSnackBar(CharSequence message);

    void setToolbarTitle(CharSequence title);

    void setAltToolbarTitle(CharSequence title);

    void setAltToolbarMenu(@MenuRes int menu);

    void showSnackBar(ModelUtils.Consumer<Snackbar> consumer);

    void showChoices(ModelUtils.Consumer<ChoiceBar> consumer);

    void setFabClickListener(@Nullable View.OnClickListener clickListener);
}
