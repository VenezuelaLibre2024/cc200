.class public Ltd/x;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ltd/y;

.field public static final b:[Lyd/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltd/y;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    :catch_0
    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ltd/y;

    invoke-direct {v0}, Ltd/y;-><init>()V

    :goto_0
    sput-object v0, Ltd/x;->a:Ltd/y;

    const/4 v0, 0x0

    new-array v0, v0, [Lyd/c;

    sput-object v0, Ltd/x;->b:[Lyd/c;

    return-void
.end method

.method public static a(Ltd/j;)Lyd/e;
    .locals 1

    sget-object v0, Ltd/x;->a:Ltd/y;

    invoke-virtual {v0, p0}, Ltd/y;->a(Ltd/j;)Lyd/e;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/Class;)Lyd/c;
    .locals 1

    sget-object v0, Ltd/x;->a:Ltd/y;

    invoke-virtual {v0, p0}, Ltd/y;->b(Ljava/lang/Class;)Lyd/c;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/Class;)Lyd/d;
    .locals 2

    sget-object v0, Ltd/x;->a:Ltd/y;

    const-string v1, ""

    invoke-virtual {v0, p0, v1}, Ltd/y;->c(Ljava/lang/Class;Ljava/lang/String;)Lyd/d;

    move-result-object p0

    return-object p0
.end method

.method public static d(Ltd/p;)Lyd/f;
    .locals 1

    sget-object v0, Ltd/x;->a:Ltd/y;

    invoke-virtual {v0, p0}, Ltd/y;->d(Ltd/p;)Lyd/f;

    move-result-object p0

    return-object p0
.end method

.method public static e(Ltd/r;)Lyd/g;
    .locals 1

    sget-object v0, Ltd/x;->a:Ltd/y;

    invoke-virtual {v0, p0}, Ltd/y;->e(Ltd/r;)Lyd/g;

    move-result-object p0

    return-object p0
.end method

.method public static f(Ltd/i;)Ljava/lang/String;
    .locals 1

    sget-object v0, Ltd/x;->a:Ltd/y;

    invoke-virtual {v0, p0}, Ltd/y;->f(Ltd/i;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ltd/n;)Ljava/lang/String;
    .locals 1

    sget-object v0, Ltd/x;->a:Ltd/y;

    invoke-virtual {v0, p0}, Ltd/y;->g(Ltd/n;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
