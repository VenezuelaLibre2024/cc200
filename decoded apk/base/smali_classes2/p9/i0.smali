.class public final synthetic Lp9/i0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lp9/l0;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lp9/l0;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp9/i0;->h:Lp9/l0;

    iput-object p2, p0, Lp9/i0;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp9/i0;->h:Lp9/l0;

    iget-object v1, p0, Lp9/i0;->i:Ljava/lang/Object;

    invoke-static {v0, v1}, Lp9/l0;->a(Lp9/l0;Ljava/lang/Object;)V

    return-void
.end method
