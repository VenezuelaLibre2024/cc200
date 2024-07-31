.class public final synthetic Lz4/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lz4/q$b;


# direct methods
.method public synthetic constructor <init>(Lz4/q$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/n;->h:Lz4/q$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lz4/n;->h:Lz4/q$b;

    invoke-interface {v0}, Lz4/q$b;->a()V

    return-void
.end method
