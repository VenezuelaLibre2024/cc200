.class public Lcom/google/android/datatransport/cct/CctBackendFactory;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh3/d;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Lh3/h;)Lh3/m;
    .locals 3

    new-instance v0, Le3/d;

    invoke-virtual {p1}, Lh3/h;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lh3/h;->e()Lq3/a;

    move-result-object v2

    invoke-virtual {p1}, Lh3/h;->d()Lq3/a;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Le3/d;-><init>(Landroid/content/Context;Lq3/a;Lq3/a;)V

    return-object v0
.end method
