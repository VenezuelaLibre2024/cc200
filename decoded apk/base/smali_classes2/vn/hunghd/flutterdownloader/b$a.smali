.class public final Lvn/hunghd/flutterdownloader/b$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvn/hunghd/flutterdownloader/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ltd/g;)V
    .locals 0

    invoke-direct {p0}, Lvn/hunghd/flutterdownloader/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Lvn/hunghd/flutterdownloader/b;
    .locals 2

    invoke-static {}, Lvn/hunghd/flutterdownloader/b;->a()Lvn/hunghd/flutterdownloader/b;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lvn/hunghd/flutterdownloader/b;

    invoke-static {p1}, Ltd/m;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "ctx!!.applicationContext"

    invoke-static {p1, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lvn/hunghd/flutterdownloader/b;-><init>(Landroid/content/Context;Ltd/g;)V

    invoke-static {v0}, Lvn/hunghd/flutterdownloader/b;->d(Lvn/hunghd/flutterdownloader/b;)V

    :cond_0
    invoke-static {}, Lvn/hunghd/flutterdownloader/b;->a()Lvn/hunghd/flutterdownloader/b;

    move-result-object p1

    invoke-static {p1}, Ltd/m;->c(Ljava/lang/Object;)V

    return-object p1
.end method
