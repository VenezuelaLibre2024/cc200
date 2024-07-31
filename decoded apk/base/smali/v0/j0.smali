.class public final Lv0/j0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lv0/h1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv0/j0$b;
    }
.end annotation


# static fields
.field public static final b:Lv0/q0;


# instance fields
.field public final a:Lv0/q0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv0/j0$a;

    invoke-direct {v0}, Lv0/j0$a;-><init>()V

    sput-object v0, Lv0/j0;->b:Lv0/q0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lv0/j0;->b()Lv0/q0;

    move-result-object v0

    invoke-direct {p0, v0}, Lv0/j0;-><init>(Lv0/q0;)V

    return-void
.end method

.method public constructor <init>(Lv0/q0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "messageInfoFactory"

    invoke-static {p1, v0}, Lv0/a0;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv0/q0;

    iput-object p1, p0, Lv0/j0;->a:Lv0/q0;

    return-void
.end method

.method public static b()Lv0/q0;
    .locals 4

    new-instance v0, Lv0/j0$b;

    const/4 v1, 0x2

    new-array v1, v1, [Lv0/q0;

    invoke-static {}, Lv0/x;->c()Lv0/x;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Lv0/j0;->c()Lv0/q0;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {v0, v1}, Lv0/j0$b;-><init>([Lv0/q0;)V

    return-object v0
.end method

.method public static c()Lv0/q0;
    .locals 4

    :try_start_0
    const-string v0, "androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getInstance"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/q0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    sget-object v0, Lv0/j0;->b:Lv0/q0;

    return-object v0
.end method

.method public static d(Lv0/p0;)Z
    .locals 1

    invoke-interface {p0}, Lv0/p0;->c()Lv0/b1;

    move-result-object p0

    sget-object v0, Lv0/b1;->h:Lv0/b1;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static e(Ljava/lang/Class;Lv0/p0;)Lv0/g1;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lv0/p0;",
            ")",
            "Lv0/g1<",
            "TT;>;"
        }
    .end annotation

    const-class v0, Lv0/y;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lv0/j0;->d(Lv0/p0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lv0/y0;->b()Lv0/w0;

    move-result-object v3

    invoke-static {}, Lv0/h0;->b()Lv0/h0;

    move-result-object v4

    invoke-static {}, Lv0/i1;->M()Lv0/n1;

    move-result-object v5

    invoke-static {}, Lv0/s;->b()Lv0/q;

    move-result-object v6

    invoke-static {}, Lv0/o0;->b()Lv0/m0;

    move-result-object v7

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lv0/u0;->N(Ljava/lang/Class;Lv0/p0;Lv0/w0;Lv0/h0;Lv0/n1;Lv0/q;Lv0/m0;)Lv0/u0;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {}, Lv0/y0;->b()Lv0/w0;

    move-result-object v2

    invoke-static {}, Lv0/h0;->b()Lv0/h0;

    move-result-object v3

    invoke-static {}, Lv0/i1;->M()Lv0/n1;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {}, Lv0/o0;->b()Lv0/m0;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Lv0/u0;->N(Ljava/lang/Class;Lv0/p0;Lv0/w0;Lv0/h0;Lv0/n1;Lv0/q;Lv0/m0;)Lv0/u0;

    move-result-object p0

    :goto_0
    return-object p0

    :cond_1
    invoke-static {p1}, Lv0/j0;->d(Lv0/p0;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lv0/y0;->a()Lv0/w0;

    move-result-object v3

    invoke-static {}, Lv0/h0;->a()Lv0/h0;

    move-result-object v4

    invoke-static {}, Lv0/i1;->H()Lv0/n1;

    move-result-object v5

    invoke-static {}, Lv0/s;->a()Lv0/q;

    move-result-object v6

    invoke-static {}, Lv0/o0;->a()Lv0/m0;

    move-result-object v7

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lv0/u0;->N(Ljava/lang/Class;Lv0/p0;Lv0/w0;Lv0/h0;Lv0/n1;Lv0/q;Lv0/m0;)Lv0/u0;

    move-result-object p0

    goto :goto_1

    :cond_2
    invoke-static {}, Lv0/y0;->a()Lv0/w0;

    move-result-object v2

    invoke-static {}, Lv0/h0;->a()Lv0/h0;

    move-result-object v3

    invoke-static {}, Lv0/i1;->I()Lv0/n1;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {}, Lv0/o0;->a()Lv0/m0;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Lv0/u0;->N(Ljava/lang/Class;Lv0/p0;Lv0/w0;Lv0/h0;Lv0/n1;Lv0/q;Lv0/m0;)Lv0/u0;

    move-result-object p0

    :goto_1
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lv0/g1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lv0/g1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lv0/i1;->J(Ljava/lang/Class;)V

    iget-object v0, p0, Lv0/j0;->a:Lv0/q0;

    invoke-interface {v0, p1}, Lv0/q0;->a(Ljava/lang/Class;)Lv0/p0;

    move-result-object v0

    invoke-interface {v0}, Lv0/p0;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    const-class v1, Lv0/y;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lv0/i1;->M()Lv0/n1;

    move-result-object p1

    invoke-static {}, Lv0/s;->b()Lv0/q;

    move-result-object v1

    :goto_0
    invoke-interface {v0}, Lv0/p0;->b()Lv0/r0;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lv0/v0;->l(Lv0/n1;Lv0/q;Lv0/r0;)Lv0/v0;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lv0/i1;->H()Lv0/n1;

    move-result-object p1

    invoke-static {}, Lv0/s;->a()Lv0/q;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-static {p1, v0}, Lv0/j0;->e(Ljava/lang/Class;Lv0/p0;)Lv0/g1;

    move-result-object p1

    return-object p1
.end method
