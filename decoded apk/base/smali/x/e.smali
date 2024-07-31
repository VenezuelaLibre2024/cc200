.class public final Lx/e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx/e$b;,
        Lx/e$c;,
        Lx/e$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/app/AlarmManager;JLandroid/app/PendingIntent;Landroid/app/PendingIntent;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {p1, p2, p3}, Lx/e$b;->a(JLandroid/app/PendingIntent;)Landroid/app/AlarmManager$AlarmClockInfo;

    move-result-object p1

    invoke-static {p0, p1, p4}, Lx/e$b;->b(Landroid/app/AlarmManager;Ljava/lang/Object;Landroid/app/PendingIntent;)V

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    invoke-static {p0, p3, p1, p2, p4}, Lx/e;->c(Landroid/app/AlarmManager;IJLandroid/app/PendingIntent;)V

    :goto_0
    return-void
.end method

.method public static b(Landroid/app/AlarmManager;IJLandroid/app/PendingIntent;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1, p2, p3, p4}, Lx/e$c;->a(Landroid/app/AlarmManager;IJLandroid/app/PendingIntent;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    :goto_0
    return-void
.end method

.method public static c(Landroid/app/AlarmManager;IJLandroid/app/PendingIntent;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1, p2, p3, p4}, Lx/e$a;->a(Landroid/app/AlarmManager;IJLandroid/app/PendingIntent;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    :goto_0
    return-void
.end method

.method public static d(Landroid/app/AlarmManager;IJLandroid/app/PendingIntent;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1, p2, p3, p4}, Lx/e$c;->b(Landroid/app/AlarmManager;IJLandroid/app/PendingIntent;)V

    goto :goto_0

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lx/e;->c(Landroid/app/AlarmManager;IJLandroid/app/PendingIntent;)V

    :goto_0
    return-void
.end method
