.class public final Lv0/s;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lv0/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv0/q<",
            "*>;"
        }
    .end annotation
.end field

.field public static final b:Lv0/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv0/q<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv0/r;

    invoke-direct {v0}, Lv0/r;-><init>()V

    sput-object v0, Lv0/s;->a:Lv0/q;

    invoke-static {}, Lv0/s;->c()Lv0/q;

    move-result-object v0

    sput-object v0, Lv0/s;->b:Lv0/q;

    return-void
.end method

.method public static a()Lv0/q;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv0/q<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lv0/s;->b:Lv0/q;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Protobuf runtime is not correctly loaded."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static b()Lv0/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv0/q<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lv0/s;->a:Lv0/q;

    return-object v0
.end method

.method public static c()Lv0/q;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv0/q<",
            "*>;"
        }
    .end annotation

    :try_start_0
    const-string v0, "androidx.datastore.preferences.protobuf.ExtensionSchemaFull"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/q;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method
