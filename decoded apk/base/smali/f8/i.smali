.class public abstract Lf8/i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# static fields
.field public static final a:Lq8/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls8/d;

    invoke-direct {v0}, Ls8/d;-><init>()V

    sget-object v1, Lf8/a;->a:Lr8/a;

    invoke-virtual {v0, v1}, Ls8/d;->j(Lr8/a;)Ls8/d;

    move-result-object v0

    invoke-virtual {v0}, Ls8/d;->i()Lq8/a;

    move-result-object v0

    sput-object v0, Lf8/i;->a:Lq8/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lf8/i;
    .locals 7

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p0, "rolloutId"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string p0, "parameterKey"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string p0, "parameterValue"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string p0, "variantId"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string p0, "templateVersion"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v5

    invoke-static/range {v1 .. v6}, Lf8/i;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lf8/i;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lf8/i;
    .locals 7

    invoke-static {p2}, Lf8/i;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance p2, Lf8/b;

    move-object v0, p2

    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    move-wide v5, p4

    invoke-direct/range {v0 .. v6}, Lf8/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    return-object p2
.end method

.method public static i(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x100

    if-le v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()J
.end method

.method public abstract g()Ljava/lang/String;
.end method

.method public h()Lg8/f0$e$d$e;
    .locals 3

    invoke-static {}, Lg8/f0$e$d$e;->a()Lg8/f0$e$d$e$a;

    move-result-object v0

    invoke-static {}, Lg8/f0$e$d$e$b;->a()Lg8/f0$e$d$e$b$a;

    move-result-object v1

    invoke-virtual {p0}, Lf8/i;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lg8/f0$e$d$e$b$a;->c(Ljava/lang/String;)Lg8/f0$e$d$e$b$a;

    move-result-object v1

    invoke-virtual {p0}, Lf8/i;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lg8/f0$e$d$e$b$a;->b(Ljava/lang/String;)Lg8/f0$e$d$e$b$a;

    move-result-object v1

    invoke-virtual {v1}, Lg8/f0$e$d$e$b$a;->a()Lg8/f0$e$d$e$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg8/f0$e$d$e$a;->d(Lg8/f0$e$d$e$b;)Lg8/f0$e$d$e$a;

    move-result-object v0

    invoke-virtual {p0}, Lf8/i;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg8/f0$e$d$e$a;->b(Ljava/lang/String;)Lg8/f0$e$d$e$a;

    move-result-object v0

    invoke-virtual {p0}, Lf8/i;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg8/f0$e$d$e$a;->c(Ljava/lang/String;)Lg8/f0$e$d$e$a;

    move-result-object v0

    invoke-virtual {p0}, Lf8/i;->f()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lg8/f0$e$d$e$a;->e(J)Lg8/f0$e$d$e$a;

    move-result-object v0

    invoke-virtual {v0}, Lg8/f0$e$d$e$a;->a()Lg8/f0$e$d$e;

    move-result-object v0

    return-object v0
.end method
