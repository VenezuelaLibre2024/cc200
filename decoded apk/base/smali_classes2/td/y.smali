.class public Ltd/y;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltd/j;)Lyd/e;
    .locals 0

    return-object p1
.end method

.method public b(Ljava/lang/Class;)Lyd/c;
    .locals 1

    new-instance v0, Ltd/e;

    invoke-direct {v0, p1}, Ltd/e;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method public c(Ljava/lang/Class;Ljava/lang/String;)Lyd/d;
    .locals 1

    new-instance v0, Ltd/o;

    invoke-direct {v0, p1, p2}, Ltd/o;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-object v0
.end method

.method public d(Ltd/p;)Lyd/f;
    .locals 0

    return-object p1
.end method

.method public e(Ltd/r;)Lyd/g;
    .locals 0

    return-object p1
.end method

.method public f(Ltd/i;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    move-result-object p1

    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "kotlin.jvm.functions."

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x15

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public g(Ltd/n;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Ltd/y;->f(Ltd/i;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
