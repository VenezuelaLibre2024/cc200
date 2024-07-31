.class public final synthetic Lz4/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lz4/q;


# direct methods
.method public synthetic constructor <init>(Lz4/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/p;->h:Lz4/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lz4/p;->h:Lz4/q;

    invoke-static {v0}, Lz4/q;->v(Lz4/q;)V

    return-void
.end method
