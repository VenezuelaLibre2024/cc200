.class public final synthetic Lq5/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lq5/w$a;

.field public final synthetic i:Ls3/m1;

.field public final synthetic j:Lv3/i;


# direct methods
.method public synthetic constructor <init>(Lq5/w$a;Ls3/m1;Lv3/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq5/t;->h:Lq5/w$a;

    iput-object p2, p0, Lq5/t;->i:Ls3/m1;

    iput-object p3, p0, Lq5/t;->j:Lv3/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lq5/t;->h:Lq5/w$a;

    iget-object v1, p0, Lq5/t;->i:Ls3/m1;

    iget-object v2, p0, Lq5/t;->j:Lv3/i;

    invoke-static {v0, v1, v2}, Lq5/w$a;->i(Lq5/w$a;Ls3/m1;Lv3/i;)V

    return-void
.end method
