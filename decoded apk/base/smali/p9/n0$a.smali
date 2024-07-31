.class public Lp9/n0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp9/n0;->U()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Lr9/e;

.field public final synthetic i:Lp9/n0;


# direct methods
.method public constructor <init>(Lp9/n0;Lr9/e;)V
    .locals 0

    iput-object p1, p0, Lp9/n0$a;->i:Lp9/n0;

    iput-object p2, p0, Lp9/n0$a;->h:Lr9/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lp9/n0$a;->h:Lr9/e;

    iget-object v1, p0, Lp9/n0$a;->i:Lp9/n0;

    invoke-static {v1}, Lp9/n0;->l0(Lp9/n0;)Lx7/b;

    move-result-object v1

    invoke-static {v1}, Lq9/i;->c(Lx7/b;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lp9/n0$a;->i:Lp9/n0;

    invoke-static {v2}, Lp9/n0;->m0(Lp9/n0;)Lv7/b;

    move-result-object v2

    invoke-static {v2}, Lq9/i;->b(Lv7/b;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lp9/n0$a;->i:Lp9/n0;

    invoke-static {v3}, Lp9/n0;->n0(Lp9/n0;)Lp9/p;

    move-result-object v3

    invoke-virtual {v3}, Lp9/p;->i()Ln7/g;

    move-result-object v3

    invoke-virtual {v3}, Ln7/g;->m()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lr9/e;->B(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    return-void
.end method
