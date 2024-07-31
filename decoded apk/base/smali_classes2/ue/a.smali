.class public final Lue/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lre/w;


# instance fields
.field public final a:Lre/y;


# direct methods
.method public constructor <init>(Lre/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lue/a;->a:Lre/y;

    return-void
.end method


# virtual methods
.method public a(Lre/w$a;)Lre/d0;
    .locals 5

    move-object v0, p1

    check-cast v0, Lve/g;

    invoke-virtual {v0}, Lve/g;->e()Lre/b0;

    move-result-object v1

    invoke-virtual {v0}, Lve/g;->h()Lue/k;

    move-result-object v2

    invoke-virtual {v1}, Lre/b0;->f()Ljava/lang/String;

    move-result-object v3

    const-string v4, "GET"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    invoke-virtual {v2, p1, v3}, Lue/k;->k(Lre/w$a;Z)Lue/c;

    move-result-object p1

    invoke-virtual {v0, v1, v2, p1}, Lve/g;->g(Lre/b0;Lue/k;Lue/c;)Lre/d0;

    move-result-object p1

    return-object p1
.end method
