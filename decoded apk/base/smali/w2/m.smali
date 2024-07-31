.class public Lw2/m;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lv2/a;)Lw2/n;
    .locals 1

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {p1, v0}, Ly/a;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lw2/n;->i:Lw2/n;

    return-object p1

    :cond_0
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {p1, v0}, Ly/a;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_1

    sget-object p1, Lw2/n;->h:Lw2/n;

    return-object p1

    :cond_1
    sget-object p1, Lv2/b;->l:Lv2/b;

    invoke-interface {p2, p1}, Lv2/a;->a(Lv2/b;)V

    const/4 p1, 0x0

    return-object p1
.end method
