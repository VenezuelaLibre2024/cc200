.class public final synthetic Lz7/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ljava/lang/Runnable;

.field public final synthetic i:Lz7/p$b;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;Lz7/p$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz7/g;->h:Ljava/lang/Runnable;

    iput-object p2, p0, Lz7/g;->i:Lz7/p$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz7/g;->h:Ljava/lang/Runnable;

    iget-object v1, p0, Lz7/g;->i:Lz7/p$b;

    invoke-static {v0, v1}, Lz7/o;->k(Ljava/lang/Runnable;Lz7/p$b;)V

    return-void
.end method