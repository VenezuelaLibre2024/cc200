.class public final Lce/w0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Z

.field public static final b:Lce/z0;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "kotlinx.coroutines.main.delay"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lhe/m0;->f(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Lce/w0;->a:Z

    invoke-static {}, Lce/w0;->b()Lce/z0;

    move-result-object v0

    sput-object v0, Lce/w0;->b:Lce/z0;

    return-void
.end method

.method public static final a()Lce/z0;
    .locals 1

    sget-object v0, Lce/w0;->b:Lce/z0;

    return-object v0
.end method

.method public static final b()Lce/z0;
    .locals 2

    sget-boolean v0, Lce/w0;->a:Z

    if-nez v0, :cond_0

    sget-object v0, Lce/v0;->p:Lce/v0;

    return-object v0

    :cond_0
    invoke-static {}, Lce/g1;->c()Lce/n2;

    move-result-object v0

    invoke-static {v0}, Lhe/b0;->c(Lce/n2;)Z

    move-result v1

    if-nez v1, :cond_2

    instance-of v1, v0, Lce/z0;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast v0, Lce/z0;

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Lce/v0;->p:Lce/v0;

    :goto_1
    return-object v0
.end method
