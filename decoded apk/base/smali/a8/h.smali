.class public final La8/h;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Ljava/lang/Throwable;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "VisibleForTests"
        }
    .end annotation

    if-nez p0, :cond_0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p0

    const-string v0, "A null value was passed to recordFatalException. Ignoring."

    invoke-virtual {p0, v0}, Lb8/g;->k(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {}, La8/g;->d()La8/g;

    move-result-object v0

    iget-object v0, v0, La8/g;->a:Le8/r;

    invoke-virtual {v0, p0}, Le8/r;->p(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static b(Ljava/lang/String;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "VisibleForTests"
        }
    .end annotation

    invoke-static {}, La8/g;->d()La8/g;

    move-result-object v0

    iget-object v0, v0, La8/g;->a:Le8/r;

    const-string v1, "com.crashlytics.flutter.build-id.0"

    invoke-virtual {v0, v1, p0}, Le8/r;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
