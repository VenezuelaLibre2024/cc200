.class public final synthetic Led/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Led/c;


# direct methods
.method public synthetic constructor <init>(Led/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Led/b;->h:Led/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Led/b;->h:Led/c;

    invoke-static {v0}, Led/c;->a(Led/c;)V

    return-void
.end method
