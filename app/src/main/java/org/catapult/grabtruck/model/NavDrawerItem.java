package org.catapult.grabtruck.model;

/**
 * Created by LamDo on 12/26/15.
 */
public class NavDrawerItem {
    private boolean showNotify;
    private String title;
    private int icon;

    public NavDrawerItem() {

    }

    public NavDrawerItem(boolean showNotify, String title, int icon) {
        this.showNotify = showNotify;
        this.title = title;
        this.icon = icon;
    }

    public boolean isShowNotify() {
        return showNotify;
    }

    public void setShowNotify(boolean showNotify) {

        this.showNotify = showNotify;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title.toUpperCase();
    }
}
