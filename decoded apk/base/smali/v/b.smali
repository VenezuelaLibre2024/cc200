.class public final Lv/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv/b$b;,
        Lv/b$a;,
        Lv/b$d;,
        Lv/b$c;
    }
.end annotation


# direct methods
.method public static a(Lv/b$c;)Ll7/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lv/b$c<",
            "TT;>;)",
            "Ll7/f<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lv/b$a;

    invoke-direct {v0}, Lv/b$a;-><init>()V

    new-instance v1, Lv/b$d;

    invoke-direct {v1, v0}, Lv/b$d;-><init>(Lv/b$a;)V

    iput-object v1, v0, Lv/b$a;->b:Lv/b$d;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    iput-object v2, v0, Lv/b$a;->a:Ljava/lang/Object;

    :try_start_0
    invoke-interface {p0, v0}, Lv/b$c;->a(Lv/b$a;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    iput-object p0, v0, Lv/b$a;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {v1, p0}, Lv/b$d;->d(Ljava/lang/Throwable;)Z

    :cond_0
    :goto_0
    return-object v1
.end method
