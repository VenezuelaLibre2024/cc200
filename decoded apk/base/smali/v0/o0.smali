.class public final Lv0/o0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lv0/m0;

.field public static final b:Lv0/m0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lv0/o0;->c()Lv0/m0;

    move-result-object v0

    sput-object v0, Lv0/o0;->a:Lv0/m0;

    new-instance v0, Lv0/n0;

    invoke-direct {v0}, Lv0/n0;-><init>()V

    sput-object v0, Lv0/o0;->b:Lv0/m0;

    return-void
.end method

.method public static a()Lv0/m0;
    .locals 1

    sget-object v0, Lv0/o0;->a:Lv0/m0;

    return-object v0
.end method

.method public static b()Lv0/m0;
    .locals 1

    sget-object v0, Lv0/o0;->b:Lv0/m0;

    return-object v0
.end method

.method public static c()Lv0/m0;
    .locals 3

    :try_start_0
    const-string v0, "androidx.datastore.preferences.protobuf.MapFieldSchemaFull"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/m0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method
