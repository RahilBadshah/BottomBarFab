# BottomBarFab
Bottom Bar with FloatingActionButton also with smooth animation.

### Preview
<img src="https://github.com/RahilBadshah/BottomBarFab/blob/master/preview/fab_preview.gif?raw=true"/>

## Including In Your Project

#### Gradle
```groovy
dependencies {
   implementation 'com.infideap.drawerbehavior:drawer-behavior:1.0.3'
}
```
#### XML
``` xml
<com.google.android.material.bottomappbar.BottomAppBar
            android:id="@+id/bottomAppBar"
            android:layout_width="match_parent"
            style="@style/Widget.MaterialComponents.BottomAppBar"
            app:fabCradleRoundedCornerRadius="16dp"
            android:layout_height="wrap_content"
            app:fabCradleMargin="10dp"
            app:navigationIcon="@drawable/ic_round_menu"
            android:backgroundTint="@color/white"
            app:menu="@menu/bottom_bar_menu"
            android:layout_gravity="bottom"
            app:fabAnimationMode="slide"
            android:theme="@style/Theme.BottomBarFab"
            tools:ignore="BottomAppBar" />

        <com.google.android.material.floatingactionbutton.FloatingActionButton
            android:id="@+id/bottom_bar_fab"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:backgroundTint="@color/teal_200"
            android:src="@drawable/ic_round_add"
            app:borderWidth="0dp"
            app:fabSize="auto"
            app:layout_anchor="@id/bottomAppBar"
            app:layout_anchorGravity="center" />
```
#### menu
``` xml
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto">

    <item
        android:id="@+id/bar_search"
        android:icon="@drawable/ic_round_search"
        android:title="Search"
        app:showAsAction="ifRoom" />

    <item
        android:id="@+id/bar_favorite"
        android:icon="@drawable/ic_round_favorite_border"
        android:title="Favorite"
        app:showAsAction="ifRoom" />

    <item
        android:id="@+id/bar_more"
        android:icon="@drawable/ic_round_more_vert"
        android:title="More"
        app:showAsAction="ifRoom" />

</menu>
```
