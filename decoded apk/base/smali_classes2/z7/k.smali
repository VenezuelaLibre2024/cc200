.class public final synthetic Lz7/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lz7/o;

.field public final synthetic i:Ljava/lang/Runnable;

.field public final synthetic j:Lz7/p$b;


# direct methods
.method public synthetic constructor <init>(Lz7/o;Ljava/lang/Runnable;Lz7/p$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz7/k;->h:Lz7/o;

    iput-object p2, p0, Lz7/k;->i:Ljava/lang/Runnable;

    iput-object p3, p0, Lz7/k;->j:Lz7/p$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lz7/k;->h:Lz7/o;

    iget-object v1, p0, Lz7/k;->i:Ljava/lang/Runnable;

    iget-object v2, p0, Lz7/k;->j:Lz7/p$b;

    invoke-static {v0, v1, v2}, Lz7/o;->l(Lz7/o;Ljava/lang/Runnable;Lz7/p$b;)V

    return-void
.end method
