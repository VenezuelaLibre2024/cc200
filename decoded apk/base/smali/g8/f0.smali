.class public abstract Lg8/f0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg8/f0$b;,
        Lg8/f0$a;,
        Lg8/f0$e;,
        Lg8/f0$c;,
        Lg8/f0$d;
    }
.end annotation


# static fields
.field public static final a:Ljava/nio/charset/Charset;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lg8/f0;->a:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Ljava/nio/charset/Charset;
    .locals 1

    sget-object v0, Lg8/f0;->a:Ljava/nio/charset/Charset;

    return-object v0
.end method

.method public static b()Lg8/f0$b;
    .locals 1

    new-instance v0, Lg8/b$b;

    invoke-direct {v0}, Lg8/b$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract c()Lg8/f0$a;
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public abstract g()Ljava/lang/String;
.end method

.method public abstract h()Ljava/lang/String;
.end method

.method public abstract i()Ljava/lang/String;
.end method

.method public abstract j()Lg8/f0$d;
.end method

.method public abstract k()I
.end method

.method public abstract l()Ljava/lang/String;
.end method

.method public abstract m()Lg8/f0$e;
.end method

.method public abstract n()Lg8/f0$b;
.end method

.method public o(Ljava/lang/String;)Lg8/f0;
    .locals 2

    invoke-virtual {p0}, Lg8/f0;->n()Lg8/f0$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg8/f0$b;->c(Ljava/lang/String;)Lg8/f0$b;

    move-result-object v0

    invoke-virtual {p0}, Lg8/f0;->m()Lg8/f0$e;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lg8/f0;->m()Lg8/f0$e;

    move-result-object v1

    invoke-virtual {v1, p1}, Lg8/f0$e;->p(Ljava/lang/String;)Lg8/f0$e;

    move-result-object p1

    invoke-virtual {v0, p1}, Lg8/f0$b;->l(Lg8/f0$e;)Lg8/f0$b;

    :cond_0
    invoke-virtual {v0}, Lg8/f0$b;->a()Lg8/f0;

    move-result-object p1

    return-object p1
.end method

.method public p(Lg8/f0$a;)Lg8/f0;
    .locals 1

    if-nez p1, :cond_0

    move-object p1, p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lg8/f0;->n()Lg8/f0$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg8/f0$b;->b(Lg8/f0$a;)Lg8/f0$b;

    move-result-object p1

    invoke-virtual {p1}, Lg8/f0$b;->a()Lg8/f0;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public q(Ljava/util/List;)Lg8/f0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lg8/f0$e$d;",
            ">;)",
            "Lg8/f0;"
        }
    .end annotation

    invoke-virtual {p0}, Lg8/f0;->m()Lg8/f0$e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lg8/f0;->n()Lg8/f0$b;

    move-result-object v0

    invoke-virtual {p0}, Lg8/f0;->m()Lg8/f0$e;

    move-result-object v1

    invoke-virtual {v1, p1}, Lg8/f0$e;->q(Ljava/util/List;)Lg8/f0$e;

    move-result-object p1

    invoke-virtual {v0, p1}, Lg8/f0$b;->l(Lg8/f0$e;)Lg8/f0$b;

    move-result-object p1

    invoke-virtual {p1}, Lg8/f0$b;->a()Lg8/f0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Reports without sessions cannot have events added to them."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public r(Ljava/lang/String;)Lg8/f0;
    .locals 1

    invoke-virtual {p0}, Lg8/f0;->n()Lg8/f0$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg8/f0$b;->f(Ljava/lang/String;)Lg8/f0$b;

    move-result-object p1

    invoke-virtual {p1}, Lg8/f0$b;->a()Lg8/f0;

    move-result-object p1

    return-object p1
.end method

.method public s(Lg8/f0$d;)Lg8/f0;
    .locals 2

    invoke-virtual {p0}, Lg8/f0;->n()Lg8/f0$b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lg8/f0$b;->l(Lg8/f0$e;)Lg8/f0$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg8/f0$b;->i(Lg8/f0$d;)Lg8/f0$b;

    move-result-object p1

    invoke-virtual {p1}, Lg8/f0$b;->a()Lg8/f0;

    move-result-object p1

    return-object p1
.end method

.method public t(JZLjava/lang/String;)Lg8/f0;
    .locals 2

    invoke-virtual {p0}, Lg8/f0;->n()Lg8/f0$b;

    move-result-object v0

    invoke-virtual {p0}, Lg8/f0;->m()Lg8/f0$e;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lg8/f0;->m()Lg8/f0$e;

    move-result-object v1

    invoke-virtual {v1, p1, p2, p3, p4}, Lg8/f0$e;->r(JZLjava/lang/String;)Lg8/f0$e;

    move-result-object p1

    invoke-virtual {v0, p1}, Lg8/f0$b;->l(Lg8/f0$e;)Lg8/f0$b;

    :cond_0
    invoke-virtual {v0}, Lg8/f0$b;->a()Lg8/f0;

    move-result-object p1

    return-object p1
.end method
